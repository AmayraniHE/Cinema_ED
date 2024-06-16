package backend;

public class Funcion 
{
	private int horario;
	private Sala sala;
	
	public Funcion(int horario,int num)
	{
		sala=new Sala(num);
		this.horario=horario;
	}
	
	
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
}
