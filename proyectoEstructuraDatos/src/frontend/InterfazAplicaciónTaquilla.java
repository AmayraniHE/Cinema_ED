package frontend;

import backend.AplicacionTaquilla;

public class InterfazAplicaciónTaquilla extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1L;
	
	private static AplicacionTaquilla aplicacionTaquilla;//
	private Menu menuPrincipal;
	private Cartelera cartelera;
	private DulceriaGeneral dulceriaGeneral;
	private Boletos boletos;
	private Asientos asientos;
	private PagarBoletos pagarBoletos;
	private BoletoImpreso boletoImpreso;
	
	
	public InterfazAplicaciónTaquilla()
	{
		//aplicacionTaquilla = new AplicacionTaquilla();
		
		menuPrincipal = new Menu(this);
		cartelera = new Cartelera(this);
		dulceriaGeneral = new DulceriaGeneral(this);
		mostrarMenu();
		
	}
	
	
	public static void main(String[] args)
	{
		InterfazAplicaciónTaquilla interfaz = new InterfazAplicaciónTaquilla(); 
		interfaz.mostrarMenu();
	}
	
	public void mostrarMenu()
	{
		menuPrincipal.setVisible(true);
	}
	
	
	public void mostrarCartelera()
	{
		menuPrincipal.setVisible(false);
		cartelera.setVisible(true);
	}
	
	public void mostrarDulceria()
	{
		menuPrincipal.setVisible(false);
		dulceriaGeneral.setVisible(true);
	}
	
	public void mostrarBoletos()
	{
		cartelera.setVisible(false);
		boletos.setVisible(true);
	}
	

	/////////////////////////////////////////////////////////////////////////////////////////////////////7
	public Boletos getBoletos() {
		return boletos;
	}


	public void setBoletos(Boletos boletos) {
		this.boletos = boletos;
	}


	public static AplicacionTaquilla getAplicacionTaquilla() {
		return aplicacionTaquilla;
	}

	public static void setAplicacionTaquilla(AplicacionTaquilla aplicacionTaquilla) {
		InterfazAplicaciónTaquilla.aplicacionTaquilla = aplicacionTaquilla;
	}


	public PagarBoletos getPagarBoletos() {
		return pagarBoletos;
	}


	public void setPagarBoletos(PagarBoletos pagarBoletos) {
		this.pagarBoletos = pagarBoletos;
	}


	public BoletoImpreso getBoletoImpreso() {
		return boletoImpreso;
	}


	public void setBoletoImpreso(BoletoImpreso boletoImpreso) {
		this.boletoImpreso = boletoImpreso;
	}


	public Menu getMenuPrincipal() {
		return menuPrincipal;
	}


	public void setMenuPrincipal(Menu menuPrincipal) {
		this.menuPrincipal = menuPrincipal;
	}


	public Cartelera getCartelera() {
		return cartelera;
	}


	public void setCartelera(Cartelera cartelera) {
		this.cartelera = cartelera;
	}


	public DulceriaGeneral getDulceriaGeneral() {
		return dulceriaGeneral;
	}


	public void setDulceriaGeneral(DulceriaGeneral dulceriaGeneral) {
		this.dulceriaGeneral = dulceriaGeneral;
	}


	public Asientos getAsientos() {
		return asientos;
	}


	public void setAsientos(Asientos asientos) {
		this.asientos = asientos;
	}

	public void setAsientos(String nombrePeli,String direccion,String fecha,
    		String horarios,String tipoBo,String cantidad,InterfazAplicaciónTaquilla ventanaPrincipal) 
	{
		/*asientos.setNombrePelicula(nombrePeli);
		asientos.setDireccionFoto(direccion);
		asientos.setFecha(fecha);
		asientos.setHorario(horarios);
		asientos.setTipoBoleto(tipoBo);
		asientos.setCantidad(cantidad);
		asientos.setVentanaPrincipal(this);*/
		asientos=new Asientos(nombrePeli, direccion, fecha, horarios, tipoBo, cantidad, this);
	}
	
}
