package backend;

public class Asiento
{
	private int numero;
	private boolean disponible;
	
	public Asiento(int numero)
	{
		this.numero=numero;
		disponible=true;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
