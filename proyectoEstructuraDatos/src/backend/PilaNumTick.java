package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PilaNumTick 
{
	private final static int TAM=10;
	private static List<Integer> numeroTicket;
	private static int cima;
	
	public PilaNumTick()
	{
		numeroTicket=new ArrayList<Integer>();
	}
	
	public void crearLista()
	{
		Random num=new Random();
		int n=0;
		for(int x=0;x<TAM;++x)
		{
			n=num.nextInt(1000000000)+128000;
			numeroTicket.add(n);
			cima=x;
		}
	}
	
	public int obtenerNumTick()
	{
		int num;
		if(cima>=0)
		{
			num=numeroTicket.get(cima);
			eliminar();
		}
		else
		{
			num=0;
		}
		return num;
	}
	
	public void eliminar()
	{
		numeroTicket.remove(cima);
		cima--;
	}
}
