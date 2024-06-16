package backend;

public class Boleto
{
	final static int PRECIO_T=55;
	final static int PRECIO_3D=75;
	final static int PRECIO_P=95;
	
	private String tipo;
	private int cantidad;
	private int total;
	private String asientos;
	
	
	public void CalcularTotal()
	{
		switch(this.tipo)
		{
		case "TRADICIONAL":
			this.total=this.cantidad*PRECIO_T;
			break;
		case "TRES_D":
			this.total=this.cantidad*PRECIO_3D;
			break;
		case "PREMIUM":
			this.total=this.cantidad*PRECIO_P;
			break;
		}
	}
	
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getAsientos() {
		return asientos;
	}
	public void setAsientos(String asientos) {
		this.asientos = asientos;
	}
}
