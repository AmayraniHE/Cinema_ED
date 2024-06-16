package backend;

import java.util.ArrayList;
import java.util.List;

public class Sala
{
	private final static int ASIENTOS_FILA=5;
	private boolean estado;
	private int numSala;
	private List<Asiento> filaA;
	private List<Asiento> filaB;
	private List<Asiento> filaC;
	
	public Sala(int num)
	{
		estado=true;
		numSala=num;
		
		filaA = new ArrayList<Asiento>();
		filaB = new ArrayList<Asiento>();
		filaC = new ArrayList<Asiento>();
		
		Asiento asientotemp;
		
		for(int i=0;i<ASIENTOS_FILA;++i)
		{
			asientotemp=new Asiento(i+1);
			filaA.add(asientotemp);
		}
		for(int i=0;i<ASIENTOS_FILA;++i)
		{
			asientotemp=new Asiento(i+1);
			filaB.add(asientotemp);
		}
		for(int i=0;i<ASIENTOS_FILA;++i)
		{
			asientotemp=new Asiento(i+1);
			filaC.add(asientotemp);
		}
	}
	
	public void verificarEstado()
	{
		int as=0;
		for(int i=0;i<filaA.size();i++)
		{
			if(filaA.get(i).isDisponible())
			{
				as++;
			}
		}
		for(int i=0;i<filaB.size();i++)
		{
			if(filaB.get(i).isDisponible())
			{
				as++;
			}
		}
		for(int i=0;i<filaC.size();i++)
		{
			if(filaC.get(i).isDisponible())
			{
				as++;
			}
		}
		this.estado = as>0? true:false;
		
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getNumSala() {
		return numSala;
	}
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	public List<Asiento> getFilaA() {
		return filaA;
	}

	public List<Asiento> getFilaB() {
		return filaB;
	}

	public void setFilaB(List<Asiento> filaB) {
		this.filaB = filaB;
	}

	public List<Asiento> getFilaC() {
		return filaC;
	}

	public void setFilaC(List<Asiento> filaC) {
		this.filaC = filaC;
	}

	public static int getAsientosFila() {
		return ASIENTOS_FILA;
	}

	public void setFilaA(List<Asiento> filaA) {
		this.filaA = filaA;
	}
}
