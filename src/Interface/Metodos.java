package Interface;

import Dominio.Cajero;

public interface Metodos {

	public void guardar(Cajero cajero);

	public Cajero mostrar(int numCuenta);

	public Cajero buscarxNumeroCuenta(int numCuenta);

	public void eliminar(Cajero cajero);

	public void editar(int numeroCuenta, Cajero cajero);
}
