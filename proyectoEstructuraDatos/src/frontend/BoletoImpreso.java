package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;

import backend.AplicacionTaquilla;

public class BoletoImpreso extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel etiquetaBoDigital;
    private javax.swing.JLabel etiquetaCantidad;
    private javax.swing.JLabel etiquetaDatAs;
    private javax.swing.JLabel etiquetaDatosBol;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaFechaDia;
    private javax.swing.JLabel etiquetaFuncion;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaLugar;
    private javax.swing.JLabel etiquetaPelicula;
    private javax.swing.JLabel etiquetaPeliculaNom;
    private javax.swing.JLabel etiquetaTipoBoleto;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;//sala
    private javax.swing.JLabel jLabel2;//numero
    private javax.swing.JLabel qr;
    private String nombrePelicula;
    private String direccionFoto;
    private String fecha;
    private String horario;
    private int sala;
    private String tipoBoleto;
    private int cantidad;
    private int total;
    private String asientos;
    private int totalBoCargo;
    private String direccionQr;
    // End of variables declaration  
    
    public BoletoImpreso(String nombrePelicula,String direccionFoto,String fecha,String horario,int sala,
    		String tipoBoleto,int cantidad,int total,String asientos,int totalBoCargo) 
    {
    	this.nombrePelicula=nombrePelicula;
    	this.direccionFoto=direccionFoto;
    	this.fecha=fecha;
    	this.horario=horario;
    	this.sala=sala;
    	this.tipoBoleto=tipoBoleto;
    	this.cantidad=cantidad;
    	this.total=total;
    	this.asientos=asientos;
    	this.totalBoCargo=totalBoCargo;
    	direccionQr=AplicacionTaquilla.getQr().obtenerQr();
    	
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public BoletoImpreso() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

                         
    private void initComponents() {

        etiquetaBoDigital = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        qr = new javax.swing.JLabel();
        etiquetaTipoBoleto = new javax.swing.JLabel();
        etiquetaCantidad = new javax.swing.JLabel();
        etiquetaPelicula = new javax.swing.JLabel();
        etiquetaPeliculaNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        etiquetaDatosBol = new javax.swing.JLabel();
        etiquetaDatAs = new javax.swing.JLabel();
        etiquetaFuncion = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaBoDigital.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaBoDigital.setText("Boleto Digital");

        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));
        
        
        ImageIcon imagenOriginal1 = new ImageIcon(""+direccionQr);
        Image imagenAjustada1 = imagenOriginal1.getImage().getScaledInstance(90,90, Image.SCALE_SMOOTH);
        qr.setIcon(new ImageIcon (imagenAjustada1));
        
        
        etiquetaTipoBoleto.setText("Boletos:");

        etiquetaCantidad.setText("Asientos:");

        etiquetaPelicula.setText("Película:");

        etiquetaPeliculaNom.setText(""+nombrePelicula);

        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setText(""+fecha);

        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaHora.setText(""+horario);

        etiquetaDatosBol.setText(cantidad+" "+tipoBoleto);

        etiquetaDatAs.setText(""+asientos);

        etiquetaFuncion.setText("Función:");

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Sala:");

        jLabel2.setText(""+sala);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaBoDigital)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaPelicula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etiquetaPeliculaNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(etiquetaLugar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaFecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaCantidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etiquetaDatAs, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaTipoBoleto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etiquetaDatosBol, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaFuncion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etiquetaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)))
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qr, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(etiquetaBoDigital))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaPelicula)
                                    .addComponent(etiquetaPeliculaNom))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaLugar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaFecha)
                                    .addComponent(etiquetaFechaDia))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFuncion)
                            .addComponent(etiquetaHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaTipoBoleto)
                            .addComponent(etiquetaDatosBol))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaCantidad)
                            .addComponent(etiquetaDatAs))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnSiguiente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(qr, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        pack();
    }                     

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
        Ticket a=new Ticket(this);
        this.setVisible(false);
        a.setVisible(true);
    }

	public javax.swing.JButton getBtnSiguiente() {
		return btnSiguiente;
	}

	public void setBtnSiguiente(javax.swing.JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}

	public javax.swing.JLabel getEtiquetaBoDigital() {
		return etiquetaBoDigital;
	}

	public void setEtiquetaBoDigital(javax.swing.JLabel etiquetaBoDigital) {
		this.etiquetaBoDigital = etiquetaBoDigital;
	}

	public javax.swing.JLabel getEtiquetaCantidad() {
		return etiquetaCantidad;
	}

	public void setEtiquetaCantidad(javax.swing.JLabel etiquetaCantidad) {
		this.etiquetaCantidad = etiquetaCantidad;
	}

	public javax.swing.JLabel getEtiquetaDatAs() {
		return etiquetaDatAs;
	}

	public void setEtiquetaDatAs(javax.swing.JLabel etiquetaDatAs) {
		this.etiquetaDatAs = etiquetaDatAs;
	}

	public javax.swing.JLabel getEtiquetaDatosBol() {
		return etiquetaDatosBol;
	}

	public void setEtiquetaDatosBol(javax.swing.JLabel etiquetaDatosBol) {
		this.etiquetaDatosBol = etiquetaDatosBol;
	}

	public javax.swing.JLabel getEtiquetaFecha() {
		return etiquetaFecha;
	}

	public void setEtiquetaFecha(javax.swing.JLabel etiquetaFecha) {
		this.etiquetaFecha = etiquetaFecha;
	}

	public javax.swing.JLabel getEtiquetaFechaDia() {
		return etiquetaFechaDia;
	}

	public void setEtiquetaFechaDia(javax.swing.JLabel etiquetaFechaDia) {
		this.etiquetaFechaDia = etiquetaFechaDia;
	}

	public javax.swing.JLabel getEtiquetaFuncion() {
		return etiquetaFuncion;
	}

	public void setEtiquetaFuncion(javax.swing.JLabel etiquetaFuncion) {
		this.etiquetaFuncion = etiquetaFuncion;
	}

	public javax.swing.JLabel getEtiquetaHora() {
		return etiquetaHora;
	}

	public void setEtiquetaHora(javax.swing.JLabel etiquetaHora) {
		this.etiquetaHora = etiquetaHora;
	}

	public javax.swing.JLabel getEtiquetaLugar() {
		return etiquetaLugar;
	}

	public void setEtiquetaLugar(javax.swing.JLabel etiquetaLugar) {
		this.etiquetaLugar = etiquetaLugar;
	}

	public javax.swing.JLabel getEtiquetaPelicula() {
		return etiquetaPelicula;
	}

	public void setEtiquetaPelicula(javax.swing.JLabel etiquetaPelicula) {
		this.etiquetaPelicula = etiquetaPelicula;
	}

	public javax.swing.JLabel getEtiquetaPeliculaNom() {
		return etiquetaPeliculaNom;
	}

	public void setEtiquetaPeliculaNom(javax.swing.JLabel etiquetaPeliculaNom) {
		this.etiquetaPeliculaNom = etiquetaPeliculaNom;
	}

	public javax.swing.JLabel getEtiquetaTipoBoleto() {
		return etiquetaTipoBoleto;
	}

	public void setEtiquetaTipoBoleto(javax.swing.JLabel etiquetaTipoBoleto) {
		this.etiquetaTipoBoleto = etiquetaTipoBoleto;
	}

	public javax.swing.JLabel getFoto() {
		return foto;
	}

	public void setFoto(javax.swing.JLabel foto) {
		this.foto = foto;
	}

	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(javax.swing.JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public javax.swing.JLabel getjLabel2() {
		return jLabel2;
	}

	public void setjLabel2(javax.swing.JLabel jLabel2) {
		this.jLabel2 = jLabel2;
	}

	public javax.swing.JLabel getQr() {
		return qr;
	}

	public void setQr(javax.swing.JLabel qr) {
		this.qr = qr;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public String getDireccionFoto() {
		return direccionFoto;
	}

	public void setDireccionFoto(String direccionFoto) {
		this.direccionFoto = direccionFoto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public String getTipoBoleto() {
		return tipoBoleto;
	}

	public void setTipoBoleto(String tipoBoleto) {
		this.tipoBoleto = tipoBoleto;
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

	public int getTotalBoCargo() {
		return totalBoCargo;
	}

	public void setTotalBoCargo(int totalBoCargo) {
		this.totalBoCargo = totalBoCargo;
	}

	public String getDireccionQr() {
		return direccionQr;
	}

	public void setDireccionQr(String direccionQr) {
		this.direccionQr = direccionQr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}                                            

}
