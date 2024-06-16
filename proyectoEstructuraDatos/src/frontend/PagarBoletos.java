package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;

public class PagarBoletos extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton btnDulces;
    private javax.swing.JButton btnEfectivo;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnTarjeta;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaAsientos;
    private javax.swing.JLabel etiquetaBoletos;
    private javax.swing.JLabel etiquetaCantidad;
    private javax.swing.JLabel etiquetaCargo;
    private javax.swing.JLabel etiquetaDatAs;
    private javax.swing.JLabel etiquetaDatosBol;
    private javax.swing.JLabel etiquetaDatosPa;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaFechaDia;
    private javax.swing.JLabel etiquetaFuncion;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaLugar;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPago;
    private javax.swing.JLabel etiquetaPaso1;
    private javax.swing.JLabel etiquetaPaso2;
    private javax.swing.JLabel etiquetaPaso3;
    private javax.swing.JLabel etiquetaPelicula;
    private javax.swing.JLabel etiquetaPeliculaNom;
    private javax.swing.JLabel etiquetaPreServ;
    private javax.swing.JLabel etiquetaPreSub;
    private javax.swing.JLabel etiquetaPreTotal;
    private javax.swing.JLabel etiquetaSubt;
    private javax.swing.JLabel etiquetaTipoBoleto;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel foto;
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
    private static int metodoPago;
    private static boolean ok;
    // End of variables declaration  
    
    public PagarBoletos(String nombrePelicula,String direccionFoto,String fecha,String horario,
    		String tipoBoleto,int cantidad,int total,int sala,String asientos) 
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
    	totalBoCargo=total+10;
    	ok=false;
    	
        initComponents();
        this.setLocationRelativeTo(null);
    }
                     
    public PagarBoletos() 
    {
    	initComponents();
        this.setLocationRelativeTo(null);
    }

	private void initComponents() {

        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaFuncion = new javax.swing.JLabel();
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
        etiquetaCargo = new javax.swing.JLabel();
        etiquetaPreServ = new javax.swing.JLabel();
        etiquetaPreSub = new javax.swing.JLabel();
        etiquetaPreTotal = new javax.swing.JLabel();
        btnDulces = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        etiquetaSubt = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaDatosPa = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellido = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        foto = new javax.swing.JLabel();
        btnEfectivo = new javax.swing.JButton();
        btnTarjeta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        etiquetaPaso2.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        etiquetaPaso3.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(100);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        etiquetaAsientos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        etiquetaPago.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPago.setText("Pago");

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaFuncion.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaFuncion.setText("Función:");

        etiquetaTipoBoleto.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaTipoBoleto.setText("Boletos:");

        etiquetaCantidad.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaCantidad.setText("Asientos:");

        etiquetaPelicula.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaPelicula.setText("Película:");

        etiquetaPeliculaNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaPeliculaNom.setText(""+nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaFechaDia.setText(""+fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaLugar.setText("Compejo:  Cine UwU FES Acatlán");

        etiquetaHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaHora.setText(""+horario);

        etiquetaDatosBol.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaDatosBol.setText(cantidad+" "+tipoBoleto);

        etiquetaDatAs.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
        etiquetaDatAs.setText(""+asientos);

        etiquetaCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        etiquetaCargo.setForeground(new java.awt.Color(51, 0, 153));
        etiquetaCargo.setText("Cargo por servicio:");

        etiquetaPreServ.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        etiquetaPreServ.setForeground(new java.awt.Color(51, 0, 153));
        etiquetaPreServ.setText("$10");

        etiquetaPreSub.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        etiquetaPreSub.setForeground(new java.awt.Color(51, 0, 153));
        etiquetaPreSub.setText("$"+total);

        etiquetaPreTotal.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPreTotal.setForeground(new java.awt.Color(51, 0, 153));
        etiquetaPreTotal.setText("$"+totalBoCargo);

        btnDulces.setBackground(new java.awt.Color(204, 204, 204));
        btnDulces.setForeground(new java.awt.Color(102, 102, 102));
        btnDulces.setText("Ir a Dulcería");
        btnDulces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDulcesActionPerformed(evt);
            }
        });

        btnPagar.setBackground(new java.awt.Color(204, 204, 204));
        btnPagar.setForeground(new java.awt.Color(102, 102, 102));
        btnPagar.setText("PROCEDER AL PAGO");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        etiquetaSubt.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        etiquetaSubt.setForeground(new java.awt.Color(51, 0, 153));
        etiquetaSubt.setText("Subtotal:");

        etiquetaTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        etiquetaTotal.setForeground(new java.awt.Color(51, 0, 153));
        etiquetaTotal.setText("Total (IVA incluido):");

        etiquetaDatosPa.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        etiquetaDatosPa.setForeground(new java.awt.Color(102, 0, 153));
        etiquetaDatosPa.setText("Datos de Pago");

        etiquetaNombre.setText("Nombre:");

        etiquetaApellido.setText("Apellido:");

        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));
        
        
        btnEfectivo.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal1 = new ImageIcon("imagenes/efectivo.png");
        Image imagenAjustada1 = imagenOriginal1.getImage().getScaledInstance(35,35, Image.SCALE_SMOOTH);
        btnEfectivo.setIcon(new ImageIcon (imagenAjustada1)); // NOI18N
        btnEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectivoActionPerformed(evt);
            }
        });

        
        btnTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal2 = new ImageIcon("imagenes/tarjeta.png");
        Image imagenAjustada2 = imagenOriginal2.getImage().getScaledInstance(80,35, Image.SCALE_SMOOTH);
        btnTarjeta.setIcon(new ImageIcon (imagenAjustada2)); // NOI18N
        btnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDulces)
                .addGap(122, 122, 122)
                .addComponent(btnPagar)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaBoletos)
                                    .addComponent(etiquetaPaso1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPaso2)
                                    .addComponent(etiquetaAsientos))
                                .addGap(164, 164, 164)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPaso3)
                                    .addComponent(etiquetaPago))
                                .addGap(67, 67, 67))
                            .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaApellido)
                                .addGap(18, 18, 18)
                                .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaNombre)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaDatosPa)
                                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(btnTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
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
                                                .addComponent(etiquetaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(etiquetaTipoBoleto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(etiquetaDatosBol, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(etiquetaCantidad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(etiquetaDatAs, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(etiquetaPreSub))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(etiquetaTotal)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(etiquetaSubt)
                                                        .addComponent(etiquetaCargo)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(etiquetaPreTotal)
                                                    .addComponent(etiquetaPreServ))))
                                        .addGap(59, 59, 59))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaPelicula)
                                    .addComponent(etiquetaPeliculaNom)
                                    .addComponent(etiquetaDatosPa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaLugar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaFecha)
                                    .addComponent(etiquetaFechaDia))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(etiquetaFuncion)
                                            .addComponent(etiquetaHora))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(etiquetaTipoBoleto)
                                            .addComponent(etiquetaDatosBol))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(etiquetaCantidad)
                                            .addComponent(etiquetaDatAs)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(etiquetaNombre)
                                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(etiquetaApellido)
                                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(etiquetaCargo)
                                            .addComponent(etiquetaPreServ))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(etiquetaPreSub)
                                            .addComponent(etiquetaSubt))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(etiquetaTotal)
                                            .addComponent(etiquetaPreTotal)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar)
                    .addComponent(btnDulces))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }                                                                  

    private void btnDulcesActionPerformed(java.awt.event.ActionEvent evt) 
    {                                          
        if(ok==true)
        {
        	BoletoImpreso b = new BoletoImpreso(nombrePelicula, direccionFoto, fecha, horario, sala,
   	    		 tipoBoleto, cantidad, total, asientos, totalBoCargo);
        	DulceriaCase a=new DulceriaCase(tipoBoleto,b);
        	this.setVisible(false);
        	a.setVisible(true);
        }
    }                                         

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	if(ok==true)
        {
    		BoletoImpreso b = new BoletoImpreso(nombrePelicula, direccionFoto, fecha, horario, sala,
    	    		 tipoBoleto, cantidad, total, asientos, totalBoCargo);
    		this.setVisible(false);
    		b.setVisible(true);
        }
    }                                        

    private void btnEfectivoActionPerformed(java.awt.event.ActionEvent evt) 
    {                                            
    	metodoPago=1;
    	btnEfectivo.setBackground(new java.awt.Color(0, 153, 0));
    	btnTarjeta.setBackground(new java.awt.Color(255, 255, 255));
    	btnPagar.setBackground(new java.awt.Color(153, 153, 0));
    	btnDulces.setBackground(new java.awt.Color(153, 153, 0));
    	ok=true;
    }                                           

    private void btnTarjetaActionPerformed(java.awt.event.ActionEvent evt) 
    {                                           
    	metodoPago=2;
    	btnEfectivo.setBackground(new java.awt.Color(255, 255, 255));
    	btnTarjeta.setBackground(new java.awt.Color(0, 153, 0));
    	btnPagar.setBackground(new java.awt.Color(153, 153, 0));
    	btnDulces.setBackground(new java.awt.Color(153, 153, 0));
    	ok=true;
    }

	public javax.swing.JProgressBar getBarraProgreso() {
		return barraProgreso;
	}

	public void setBarraProgreso(javax.swing.JProgressBar barraProgreso) {
		this.barraProgreso = barraProgreso;
	}

	public javax.swing.JButton getBtnDulces() {
		return btnDulces;
	}

	public void setBtnDulces(javax.swing.JButton btnDulces) {
		this.btnDulces = btnDulces;
	}

	public javax.swing.JButton getBtnEfectivo() {
		return btnEfectivo;
	}

	public void setBtnEfectivo(javax.swing.JButton btnEfectivo) {
		this.btnEfectivo = btnEfectivo;
	}

	public javax.swing.JButton getBtnPagar() {
		return btnPagar;
	}

	public void setBtnPagar(javax.swing.JButton btnPagar) {
		this.btnPagar = btnPagar;
	}

	public javax.swing.JButton getBtnTarjeta() {
		return btnTarjeta;
	}

	public void setBtnTarjeta(javax.swing.JButton btnTarjeta) {
		this.btnTarjeta = btnTarjeta;
	}

	public javax.swing.JTextField getCampoApellido() {
		return campoApellido;
	}

	public void setCampoApellido(javax.swing.JTextField campoApellido) {
		this.campoApellido = campoApellido;
	}

	public javax.swing.JTextField getCampoNombre() {
		return campoNombre;
	}

	public void setCampoNombre(javax.swing.JTextField campoNombre) {
		this.campoNombre = campoNombre;
	}

	public javax.swing.JLabel getEtiquetaApellido() {
		return etiquetaApellido;
	}

	public void setEtiquetaApellido(javax.swing.JLabel etiquetaApellido) {
		this.etiquetaApellido = etiquetaApellido;
	}

	public javax.swing.JLabel getEtiquetaAsientos() {
		return etiquetaAsientos;
	}

	public void setEtiquetaAsientos(javax.swing.JLabel etiquetaAsientos) {
		this.etiquetaAsientos = etiquetaAsientos;
	}

	public javax.swing.JLabel getEtiquetaBoletos() {
		return etiquetaBoletos;
	}

	public void setEtiquetaBoletos(javax.swing.JLabel etiquetaBoletos) {
		this.etiquetaBoletos = etiquetaBoletos;
	}

	public javax.swing.JLabel getEtiquetaCantidad() {
		return etiquetaCantidad;
	}

	public void setEtiquetaCantidad(javax.swing.JLabel etiquetaCantidad) {
		this.etiquetaCantidad = etiquetaCantidad;
	}

	public javax.swing.JLabel getEtiquetaCargo() {
		return etiquetaCargo;
	}

	public void setEtiquetaCargo(javax.swing.JLabel etiquetaCargo) {
		this.etiquetaCargo = etiquetaCargo;
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

	public javax.swing.JLabel getEtiquetaDatosPa() {
		return etiquetaDatosPa;
	}

	public void setEtiquetaDatosPa(javax.swing.JLabel etiquetaDatosPa) {
		this.etiquetaDatosPa = etiquetaDatosPa;
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

	public javax.swing.JLabel getEtiquetaNombre() {
		return etiquetaNombre;
	}

	public void setEtiquetaNombre(javax.swing.JLabel etiquetaNombre) {
		this.etiquetaNombre = etiquetaNombre;
	}

	public javax.swing.JLabel getEtiquetaPago() {
		return etiquetaPago;
	}

	public void setEtiquetaPago(javax.swing.JLabel etiquetaPago) {
		this.etiquetaPago = etiquetaPago;
	}

	public javax.swing.JLabel getEtiquetaPaso1() {
		return etiquetaPaso1;
	}

	public void setEtiquetaPaso1(javax.swing.JLabel etiquetaPaso1) {
		this.etiquetaPaso1 = etiquetaPaso1;
	}

	public javax.swing.JLabel getEtiquetaPaso2() {
		return etiquetaPaso2;
	}

	public void setEtiquetaPaso2(javax.swing.JLabel etiquetaPaso2) {
		this.etiquetaPaso2 = etiquetaPaso2;
	}

	public javax.swing.JLabel getEtiquetaPaso3() {
		return etiquetaPaso3;
	}

	public void setEtiquetaPaso3(javax.swing.JLabel etiquetaPaso3) {
		this.etiquetaPaso3 = etiquetaPaso3;
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

	public javax.swing.JLabel getEtiquetaPreServ() {
		return etiquetaPreServ;
	}

	public void setEtiquetaPreServ(javax.swing.JLabel etiquetaPreServ) {
		this.etiquetaPreServ = etiquetaPreServ;
	}

	public javax.swing.JLabel getEtiquetaPreSub() {
		return etiquetaPreSub;
	}

	public void setEtiquetaPreSub(javax.swing.JLabel etiquetaPreSub) {
		this.etiquetaPreSub = etiquetaPreSub;
	}

	public javax.swing.JLabel getEtiquetaPreTotal() {
		return etiquetaPreTotal;
	}

	public void setEtiquetaPreTotal(javax.swing.JLabel etiquetaPreTotal) {
		this.etiquetaPreTotal = etiquetaPreTotal;
	}

	public javax.swing.JLabel getEtiquetaSubt() {
		return etiquetaSubt;
	}

	public void setEtiquetaSubt(javax.swing.JLabel etiquetaSubt) {
		this.etiquetaSubt = etiquetaSubt;
	}

	public javax.swing.JLabel getEtiquetaTipoBoleto() {
		return etiquetaTipoBoleto;
	}

	public void setEtiquetaTipoBoleto(javax.swing.JLabel etiquetaTipoBoleto) {
		this.etiquetaTipoBoleto = etiquetaTipoBoleto;
	}

	public javax.swing.JLabel getEtiquetaTotal() {
		return etiquetaTotal;
	}

	public void setEtiquetaTotal(javax.swing.JLabel etiquetaTotal) {
		this.etiquetaTotal = etiquetaTotal;
	}

	public javax.swing.JLabel getFoto() {
		return foto;
	}

	public void setFoto(javax.swing.JLabel foto) {
		this.foto = foto;
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

	public static int getMetodoPago() {
		return metodoPago;
	}

	public static void setMetodoPago(int metodoPago) {
		PagarBoletos.metodoPago = metodoPago;
	}

	public static boolean isOk() {
		return ok;
	}

	public static void setOk(boolean ok) {
		PagarBoletos.ok = ok;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}                                          

}

