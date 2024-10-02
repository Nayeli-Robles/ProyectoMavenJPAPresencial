package interfaces;

import java.util.List;

import model.TblCliente;
import model.TblProducto;

public interface Icliente {
	void RegistrarCliente(TblCliente cli);
	void ActualizarCliente(TblCliente cli);
	;
}
