package backend;

import java.util.ArrayList;
import java.util.List;

public class AplicacionTaquilla
{
	private static List<Funcion> pelicula1;
	private static List<Funcion> pelicula2;
	private static List<Funcion> pelicula3;
	private static List<Funcion> pelicula4;
	private static List<Funcion> pelicula5;
	private static List<Funcion> pelicula6;
	
	private static Colas qr;
	private static PilaNumTick numeroTick;

		
	public AplicacionTaquilla()
	{
		pelicula1 = new ArrayList<Funcion>();
		pelicula2 = new ArrayList<Funcion>();
		pelicula3 = new ArrayList<Funcion>();
		pelicula4 = new ArrayList<Funcion>();
		pelicula5 = new ArrayList<Funcion>();
		pelicula6 = new ArrayList<Funcion>();
		
		qr=new Colas();
		qr.creaLista();
		
		numeroTick=new PilaNumTick();
		numeroTick.crearLista();
		
		Funcion funtmp = new Funcion(14,2);
		pelicula1.add(funtmp);
		
		funtmp = new Funcion(13,5);
		pelicula1.add(funtmp);
		
		funtmp = new Funcion(17,9);
		pelicula1.add(funtmp);
		
		
		funtmp = new Funcion(14,1);
		pelicula2.add(funtmp);
		
		funtmp = new Funcion(16,3);
		pelicula2.add(funtmp);
		
		funtmp = new Funcion(17,1);
		pelicula2.add(funtmp);
		
		
		funtmp = new Funcion(16,2);
		pelicula3.add(funtmp);
		
		funtmp = new Funcion(11,5);
		pelicula3.add(funtmp);
		
		funtmp = new Funcion(17,5);
		pelicula3.add(funtmp);
		
		
		funtmp = new Funcion(12,1);
		pelicula4.add(funtmp);
		
		funtmp = new Funcion(13,3);
		pelicula4.add(funtmp);
		
		funtmp = new Funcion(17,2);
		pelicula4.add(funtmp);
		
		
		funtmp = new Funcion(20,2);
		pelicula5.add(funtmp);
		
		funtmp = new Funcion(15,5);
		pelicula5.add(funtmp);
		
		funtmp = new Funcion(17,4);
		pelicula5.add(funtmp);
		
		
		funtmp = new Funcion(16,1);
		pelicula6.add(funtmp);
		
		funtmp = new Funcion(20,3);
		pelicula6.add(funtmp);
		
		funtmp = new Funcion(17,1);
		pelicula6.add(funtmp);
		
	}

	public static List<Funcion> getPelicula1() {
		return pelicula1;
	}

	public static void setPelicula1(List<Funcion> pelicula1) {
		AplicacionTaquilla.pelicula1 = pelicula1;
	}

	public static List<Funcion> getPelicula2() {
		return pelicula2;
	}

	public static void setPelicula2(List<Funcion> pelicula2) {
		AplicacionTaquilla.pelicula2 = pelicula2;
	}

	public static List<Funcion> getPelicula3() {
		return pelicula3;
	}

	public static void setPelicula3(List<Funcion> pelicula3) {
		AplicacionTaquilla.pelicula3 = pelicula3;
	}

	public static List<Funcion> getPelicula4() {
		return pelicula4;
	}

	public static void setPelicula4(List<Funcion> pelicula4) {
		AplicacionTaquilla.pelicula4 = pelicula4;
	}

	public static List<Funcion> getPelicula5() {
		return pelicula5;
	}

	public static void setPelicula5(List<Funcion> pelicula5) {
		AplicacionTaquilla.pelicula5 = pelicula5;
	}

	public static List<Funcion> getPelicula6() {
		return pelicula6;
	}

	public static void setPelicula6(List<Funcion> pelicula6) {
		AplicacionTaquilla.pelicula6 = pelicula6;
	}

	public static Colas getQr() {
		return qr;
	}

	public void setQr(Colas qr) {
		AplicacionTaquilla.qr = qr;
	}

	public static PilaNumTick getNumeroTick() {
		return numeroTick;
	}

	public static void setNumeroTick(PilaNumTick numeroTick) {
		AplicacionTaquilla.numeroTick = numeroTick;
	}
	
}
