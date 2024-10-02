package interfaces;

import java.util.List;

import model.TblProducto;

public interface IProducto {
	void RegistrarProducto(TblProducto pro);
	void ActualizarProducto(TblProducto pro);
	void EliminarProducto(TblProducto pro);
	List<TblProducto> ListarProducto();
	TblProducto BuscarProducto(TblProducto pro);

}
