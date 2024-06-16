package frontend;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;

public class Boletos extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> cantidad;
    private javax.swing.JLabel etiquetaAsientos;
    private javax.swing.JLabel etiquetaBoletos;
    private javax.swing.JLabel etiquetaCantidad;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaFechaDia;
    private javax.swing.JLabel etiquetaFuncion;
    private javax.swing.JLabel etiquetaLugar;
    private javax.swing.JLabel etiquetaPago;
    private javax.swing.JLabel etiquetaPaso1,etiquetaPaso2,etiquetaPaso3;
    private javax.swing.JLabel etiquetaPelicula;
    private javax.swing.JLabel etiquetaPeliculaNom;
    private javax.swing.JLabel etiquetaTipoBoleto;
    private javax.swing.JLabel foto;
    private javax.swing.JComboBox<String> horarios;
    private javax.swing.JComboBox<String> tipoBoleto;
    private String nombrePelicula;
    private String direccionFoto;
    SimpleDateFormat formateador;
    Date fechaDate;
    private String fecha;
    private String tipo;
    private String hora;
    private String cant;
    private Asientos asientos;
    // End of variables declaration
    
    
    public Boletos(String nombre,String direccion) 
    {
    	setNombrePelicula(nombre);
    	setDireccionFoto(direccion);
    	formateador= new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es_ES"));
    	fechaDate = new Date();
    	Calendar c = Calendar.getInstance();
    	c.setTime(fechaDate);
        c.add(Calendar.DATE, 1);
        fechaDate=c.getTime();
    	setFecha(formateador.format(fechaDate));
    	
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Boletos() 
    {
    	initComponents();
    	this.setLocationRelativeTo(null);
	}

	                      
    private void initComponents() {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPelicula = new javax.swing.JLabel();
        etiquetaPeliculaNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFuncion = new javax.swing.JLabel();
        horarios = new javax.swing.JComboBox<>();
        etiquetaTipoBoleto = new javax.swing.JLabel();
        tipoBoleto = new javax.swing.JComboBox<>();
        etiquetaCantidad = new javax.swing.JLabel();
        cantidad = new javax.swing.JComboBox<>();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boletos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(190,250, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada)); // NOI18N

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso1.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaBoletos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso2.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(33);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPelicula.setText("Película:");

        etiquetaPeliculaNom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPeliculaNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFuncion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaFuncion.setText("Función:");

        horarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "13:00 hrs", "16:00 hrs"}));

        etiquetaTipoBoleto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaTipoBoleto.setText("Tipo de boleto:");

        tipoBoleto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tradicional $55", "3D $75", "Premium $95"}));

        etiquetaCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaCantidad.setText("Cantidad:");

        cantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPaso1)
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaPaso2)
                    .addComponent(etiquetaAsientos))
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaPaso3)
                    .addComponent(etiquetaPago))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
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
                                .addComponent(etiquetaFuncion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(horarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaTipoBoleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tipoBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinuar)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPaso1)
                    .addComponent(etiquetaPaso3)
                    .addComponent(etiquetaPaso2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaBoletos)
                        .addComponent(etiquetaAsientos))
                    .addComponent(etiquetaPago, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaPelicula)
                                    .addComponent(etiquetaPeliculaNom))
                                .addGap(18, 18, 18)
                                .addComponent(etiquetaLugar)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaFecha)
                                    .addComponent(etiquetaFechaDia))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaFuncion)
                                    .addComponent(horarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaTipoBoleto)
                                    .addComponent(tipoBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaCantidad)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinuar)
                        .addGap(37, 37, 37))))
        );

        pack();
    }                      

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	setHora((String) horarios.getSelectedItem());
    	setCant((String) cantidad.getSelectedItem());
    	setTipo((String) tipoBoleto.getSelectedItem());
    	Asientos a=new Asientos(nombrePelicula,direccionFoto,fecha,hora,tipo,cant,null);
    	this.setVisible(false);
    	a.setVisible(true);
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCant() {
		return cant;
	}

	public void setCant(String cant) {
		this.cant = cant;
	}

	public Asientos getAsientos() {
		return asientos;
	}

	public void setAsientos(Asientos asientos) {
		this.asientos = asientos;
	}

	public javax.swing.JComboBox<String> getCantidad() {
		return cantidad;
	}

	public void setCantidad(javax.swing.JComboBox<String> cantidad) {
		this.cantidad = cantidad;
	}

	public javax.swing.JComboBox<String> getHorarios() {
		return horarios;
	}

	public void setHorarios(javax.swing.JComboBox<String> horarios) {
		this.horarios = horarios;
	}

	public javax.swing.JComboBox<String> getTipoBoleto() {
		return tipoBoleto;
	}

	public void setTipoBoleto(javax.swing.JComboBox<String> tipoBoleto) {
		this.tipoBoleto = tipoBoleto;
	}
}

