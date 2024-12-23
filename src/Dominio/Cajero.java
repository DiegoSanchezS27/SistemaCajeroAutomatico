package Dominio;

public class Cajero {
	private int numCuenta;
	private String cliente;
	private float monto;
	private float saldo;

	public Cajero() {
	}

	public Cajero(int numCuenta, String cliente, float monto, float saldo) {
		this.numCuenta = numCuenta;
		this.cliente = cliente;
		this.monto = monto;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cajero [numCuenta=" + numCuenta + ", cliente=" + cliente + ", monto=" + monto + ", saldo=" + saldo
				+ "]\n";
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
