package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Cajero;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {

	private List<Cajero> lista = new ArrayList<Cajero>();

	@Override
	public void guardar(Cajero cajero) {
		// TODO Auto-generated method stub
		boolean bandera = false;
		for (Cajero c : lista) {
			if (c.getNumCuenta() == cajero.getNumCuenta()) {
				System.out.println("Ya existe el registro");
				bandera = true;
				break;
			}
		}
		if (!bandera) {
			lista.add(cajero);
			System.out.println("Se guardo con exito");
		}

	}

	@Override
	public Cajero mostrar(int numCuenta) {
		// TODO Auto-generated method stub
		for (Cajero c : lista) {
			if (c.getNumCuenta() == numCuenta) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Cajero buscarxNumeroCuenta(int numCuenta) {
		// TODO Auto-generated method stub
		for (Cajero c : lista) {
			if (c.getNumCuenta() == numCuenta) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void editar(int numeroCuenta, Cajero cajero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < lista.size(); i++) {
			if (numeroCuenta == lista.get(i).getNumCuenta()) {
				lista.set(i, cajero);
				break;
			}
		}

	}

	@Override
	public void eliminar(Cajero cajero) {
		// TODO Auto-generated method stub
		lista.remove(cajero);

	}

}
