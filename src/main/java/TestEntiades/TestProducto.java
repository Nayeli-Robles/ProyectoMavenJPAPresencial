package TestEntiades;



import java.util.Date;

import daoImp.TblProductoImp;
import model.TblProducto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblProducto p=new TblProducto();
		TblProductoImp dao= new TblProductoImp();
		
	/*	p.setNomprod("Arroz INTegrall");
		p.setPrecio(3.5);
		p.setCantidad(4);
		p.setTotal(p.getPrecio()*p.getCantidad());
		p.setCodbarras("77789");
		p.setNrolote("lote688");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		dao.RegistrarProducto(p);
		System.out.println("Se registro correctamente");*/
		
		//**********ACTUALIZAR*************************
		p.setIdproducto(1);
		p.setNomprod("Azucar blanca");
		p.setPrecio(1);
		p.setCantidad(2);
		p.setTotal(2);
		p.setCodbarras("");
		p.setNrolote("");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		dao.ActualizarProducto(p);
		System.out.println("Se actualizo correctamente");
		
		
	/*	//**********ACTUALIZAR*************************
				p.setIdproducto(1);
				p.setNomprod("");
				p.setPrecio(1);
				p.setCantidad(2);
				p.setTotal(2);
				p.setCodbarras("");
				p.setNrolote("");
				p.setFechaven(null);
				dao.ActualizarProducto(p);
				System.out.println("Se actualizo correctamente");*/
	}

}
