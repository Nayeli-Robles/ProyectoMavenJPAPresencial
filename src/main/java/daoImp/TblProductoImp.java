package daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProducto;

public class TblProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProducto pro) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenMartesNoche");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(pro);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
	}

	@Override
	public void ActualizarProducto(TblProducto pro) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenMartesNoche");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(pro);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
	}

	@Override
	public void EliminarProducto(TblProducto pro) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenMartesNoche");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			TblProducto elipro=em.find(TblProducto.class, pro.getIdproducto());
			if(elipro!=null){
				em.remove(elipro);
				em.getTransaction().commit();
			}
		} catch (Exception e) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
	}

	@Override
	public List<TblProducto> ListarProducto() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenMartesNoche");
		EntityManager em=emf.createEntityManager();
		List<TblProducto> listado=null;
		try {
			em.getTransaction().begin();
			listado=em.createQuery("select c from TblProducto c", TblProducto.class).getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		return listado;
	}

	@Override
	public TblProducto BuscarProducto(TblProducto pro) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenMartesNoche");
		EntityManager em=emf.createEntityManager();
		TblProducto produ=null;
		try {
			em.getTransaction().begin();
			produ=em.find(TblProducto.class, pro.getIdproducto());
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		return produ;
	}

}
