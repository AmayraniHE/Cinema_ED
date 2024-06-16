package backend;

import java.util.ArrayList;
import java.util.List;

public class Colas 
{
	private final static int TAM=10;
	private static List<String> codigos;
	
	public Colas()
	{
		codigos= new ArrayList<String>();
	}
	
	public void creaLista()
	{
		String direccion="";
		for(int x=0;x<TAM;++x)
		{
			direccion="codigos/QR"+(x+1)+".png";
			codigos.add(direccion);
		}
	}
	
	public String obtenerQr()
	{
		String direccion;
		if(codigos.size()>=0)
		{
			direccion=codigos.get(0);
		}
		else
		{
			direccion="";
		}
		eliminar();
		return direccion;
	}
	
	public void eliminar()
	{
		codigos.remove(0);
	}

}
