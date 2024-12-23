package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dominio.Cajero;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables

		Scanner lectura = null;

		int numCuenta;
		int menPrinc;
		String cliente;
		float saldo = 0;
		float monto = 0;

		Cajero cajero = null;
		List<Cajero> lista = new ArrayList<Cajero>();

		// Instancia de la clase
		LogicaMetodos imp = new LogicaMetodos();
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---ALTA CLIENTE");
			System.out.println("2---CONSULTAR SALDO");
			System.out.println("3---DEPOSTIO EN EFECTIVO");
			System.out.println("4---RETIRO EN EFECTIVO");
			System.out.println("5---SALIR");

			lectura = new Scanner(System.in);
			menPrinc = lectura.nextInt();

			switch (menPrinc) {
			case 1:
				try {
					System.out.println("Ingresa el nombre del cliente");
					lectura = new Scanner(System.in);
					cliente = lectura.nextLine();

					System.out.println("Ingresa el numero de cuenta");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					// Declarar el objeto con todos los atributos
					cajero = new Cajero(numCuenta, cliente, monto, saldo);

					// Agregar a la lista
					imp.guardar(cajero);

				} catch (Exception e) {
					// TODO: handle exception1
					System.out.println("Error al gurdar  " + e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("Ingresa el numero de cuenta");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					cajero = imp.buscarxNumeroCuenta(numCuenta);

					if (cajero == null) {
						System.out.println("No existe esa cuenta");
					} else {
						System.out.println("El saldo del cliente es" + cajero.getSaldo());
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Erro al guardar " + e.getMessage());
				}

				break;
			case 3:
				try {
					System.out.println("Ingresa el numero de cuenta");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					cajero = imp.buscarxNumeroCuenta(numCuenta);

					if (cajero == null) {
						System.out.println("No existe ese numero de cuenta");
					} else {
						System.out.println("Cual es el monto a depositar");
						lectura = new Scanner(System.in);
						monto = lectura.nextFloat();
						if (monto <= 0 || monto >= 10000) {
							System.out.println("El monto que estas ingresando es menor a 0 o mayor a 10000");
						} else {
							cajero.setSaldo(cajero.getSaldo() + monto);
							System.out.println("Tu nuevo saldo es de" + cajero.getSaldo());
							imp.editar(numCuenta, cajero);
						}

					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("Ingresa el numero de cuenta");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					cajero = imp.buscarxNumeroCuenta(numCuenta);

					if (cajero == null) {
						System.out.println("No existe ese numero de cuenta");
					} else {
						System.out.println("Cual es el monto a retirar");
						lectura = new Scanner(System.in);
						monto = lectura.nextFloat();
						if (monto <= 0 || monto >= 10000) {
							System.out.println("El monto que estas ingresando es menor a 0 o mayor a 10000");
						} else {
							cajero.setSaldo(cajero.getSaldo() - monto);
							System.out.println("Tu nuevo saldo es de" + cajero.getSaldo());
							imp.editar(numCuenta, cajero);
						}

					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 5:
				break;
			}
		} while (menPrinc < 5);

	}

}
