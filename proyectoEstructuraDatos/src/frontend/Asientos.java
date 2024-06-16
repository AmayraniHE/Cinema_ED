package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;

import backend.AplicacionTaquilla;

public class Asientos extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	
	private static AplicacionTaquilla cine = new AplicacionTaquilla();
	
	private final static int TRADICIONAL = 55;
	private final static int TRES_D = 75;
	private final static int PREMIUM = 95;
	
	// Variables declaration - do not modify                     
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton btnA1,btnA2,btnA3,btnA4,btnA5;
    private javax.swing.JButton btnB1,btnB2,btnB3,btnB4,btnB5;
    private javax.swing.JButton btnC1,btnC2,btnC3,btnC4,btnC5;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel etiquetaAsientos;
    private javax.swing.JLabel etiquetaBolCtn;
    private javax.swing.JLabel etiquetaBoletos;
    private javax.swing.JLabel etiquetaBoletosRes;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaFechaDia;
    private javax.swing.JLabel etiquetaFilaA,etiquetaFilaB,etiquetaFilaC;
    private javax.swing.JLabel etiquetaFun;
    private javax.swing.JLabel etiquetaFunHora;
    private javax.swing.JLabel etiquetaIVA;
    private javax.swing.JLabel etiquetaLugar;
    private javax.swing.JLabel etiquetaPago;
    private javax.swing.JLabel etiquetaPantalla;
    private javax.swing.JLabel etiquetaPaso1,etiquetaPaso2,etiquetaPaso3;
    private javax.swing.JLabel etiquetaPeli;
    private javax.swing.JLabel etiquetaPeliNom;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel foto;
    private String nombrePelicula;
    private String direccionFoto;
    private String fecha;
    private String horario;
    private static String tipoBoleto;
    private static String cantidad;
    private static int c;
    private static int ctn;
    private static int total;
    private static String asientos;
    private static int sala;
    // End of variables declaration
    
    private InterfazAplicaciónTaquilla ventanaPrincipal;
    
    
    public Asientos(String nombrePeli,String direccion,String fecha,
    		String horarios,String tipoBo,String cantidad,InterfazAplicaciónTaquilla ventanaPrincipal)
    {
    	this.ventanaPrincipal= ventanaPrincipal;
    	setNombrePelicula(nombrePeli);
    	setDireccionFoto(direccion);
    	this.setFecha(fecha);
    	setHorario(horarios);
    	setTipoBoleto(tipoBo);
    	this.setCantidad(cantidad);
    	ctn=0;
    	calcTotal();
    	asientos="";
    	
    	
    	switch(nombrePeli)
    	{
    	case "HTTYD":
    		if(tipoBoleto.contains("Tra")) 
        	{
    			initComponentsP1Ft();
    			sala=AplicacionTaquilla.getPelicula1().get(0).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("3"))
        	{
        		initComponentsP1Fd();
        		sala=AplicacionTaquilla.getPelicula1().get(1).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("Pre"))
        	{
        		initComponentsP1Fp();
        		sala=AplicacionTaquilla.getPelicula1().get(2).getSala().getNumSala();
        	}
    		break;
    	case "Aladín":
    		if(tipoBoleto.contains("Tra")) 
        	{
    			initComponentsP2Ft();
    			sala=AplicacionTaquilla.getPelicula2().get(0).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("3"))
        	{
        		initComponentsP2Fd();
        		sala=AplicacionTaquilla.getPelicula2().get(1).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("Pre"))
        	{
        		initComponentsP2Fp();
        		sala=AplicacionTaquilla.getPelicula2().get(2).getSala().getNumSala();
        	}
    		break;
    	case "Pixeles":
    		if(tipoBoleto.contains("Tra")) 
        	{
    			initComponentsP3Ft();
    			sala=AplicacionTaquilla.getPelicula3().get(0).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("3"))
        	{
        		initComponentsP3Fd();
        		sala=AplicacionTaquilla.getPelicula3().get(1).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("Pre"))
        	{
        		initComponentsP3Fp();
        		sala=AplicacionTaquilla.getPelicula3().get(2).getSala().getNumSala();
        	}
    		break;
    	case "Deadpool 2":
    		if(tipoBoleto.contains("Tra")) 
        	{
    			initComponentsP4Ft();
    			sala=AplicacionTaquilla.getPelicula4().get(0).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("3"))
        	{
        		initComponentsP4Fd();
        		sala=AplicacionTaquilla.getPelicula4().get(1).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("Pre"))
        	{
        		initComponentsP4Fp();
        		sala=AplicacionTaquilla.getPelicula4().get(2).getSala().getNumSala();
        	}
    		break;
    	case "No Manches Frida 2":
    		if(tipoBoleto.contains("Tra")) 
        	{
    			initComponentsP5Ft();
    			sala=AplicacionTaquilla.getPelicula5().get(0).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("3"))
        	{
        		initComponentsP5Fd();
        		sala=AplicacionTaquilla.getPelicula5().get(1).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("Pre"))
        	{
        		initComponentsP5Fp();
        		sala=AplicacionTaquilla.getPelicula5().get(2).getSala().getNumSala();
        	}
    		break;
    	case "Joker":
    		if(tipoBoleto.contains("Tra")) 
        	{
    			initComponentsP6Ft();
    			sala=AplicacionTaquilla.getPelicula6().get(0).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("3"))
        	{
        		initComponentsP6Fd();
        		sala=AplicacionTaquilla.getPelicula6().get(1).getSala().getNumSala();
        	}
        	else if(tipoBoleto.contains("Pre"))
        	{
        		initComponentsP6Fp();
        		sala=AplicacionTaquilla.getPelicula6().get(2).getSala().getNumSala();
        	}
    		break;
    	}
    	
        this.setLocationRelativeTo(null);
    }
    
    /*public Asientos(InterfazAplicaciónTaquilla ventanaPrincipal)
    {
    	this.ventanaPrincipal=ventanaPrincipal;
    	initComponents();
    	this.setLocationRelativeTo(null);
    }
    
    public Asientos()
    {
    	initComponents();
    	this.setLocationRelativeTo(null);
    }*/
    
    private static void calcTotal()
    {
    	c=Integer.parseInt(cantidad);
    	if(tipoBoleto.contains("Tra")) 
    	{
    		total = c *TRADICIONAL;
    	}
    	else if(tipoBoleto.contains("3"))
    	{
    		total = c * TRES_D;
    	}
    	else if(tipoBoleto.contains("Pre"))
    	{
    		total = c * PREMIUM;
    	}
    }

                         
    /*private void initComponents() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5ActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }        */
    
    private void initComponentsP1Ft() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(0).isDisponible()==true)
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(1).isDisponible()==true)
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(2).isDisponible()==true)
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(3).isDisponible()==true)
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(0).isDisponible()==true)
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(1).isDisponible()==true)
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(2).isDisponible()==true)
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(3).isDisponible()==true)
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(4).isDisponible()==true)
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(0).isDisponible()==true)
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(1).isDisponible()==true)
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(2).isDisponible()==true)
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(3).isDisponible()==true)
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(4).isDisponible()==true)
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P1FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP1Fd() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(0).isDisponible()==true)
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(1).isDisponible()==true)
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(2).isDisponible()==true)
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(3).isDisponible()==true)
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(4).isDisponible()==true)
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(0).isDisponible()==true)
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(1).isDisponible()==true)
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(2).isDisponible()==true)
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(3).isDisponible()==true)
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(4).isDisponible()==true)
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(0).isDisponible()==true)
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(1).isDisponible()==true)
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(2).isDisponible()==true)
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(3).isDisponible()==true)
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(4).isDisponible()==true)
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P1FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP1Fp() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(0).isDisponible()==true)
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(1).isDisponible()==true)
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(2).isDisponible()==true)
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(3).isDisponible()==true)
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(4).isDisponible()==true)
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(0).isDisponible()==true)
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(1).isDisponible()==true)
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(2).isDisponible()==true)
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(3).isDisponible()==true)
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(4).isDisponible()==true)
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(0).isDisponible()==true)
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(1).isDisponible()==true)
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(2).isDisponible()==true)
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(3).isDisponible()==true)
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(4).isDisponible()==true)
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P1FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP2Ft() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P2FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP2Fd() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P2FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP2Fp() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P2FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }
    
    private void initComponentsP3Ft() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P3FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP3Fd() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P3FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP3Fp() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P3FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }
    
    private void initComponentsP4Ft() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P4FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP4Fd() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P4FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP4Fp() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P4FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }
    
    private void initComponentsP5Ft() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P5FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP5Fd() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P5FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP5Fp() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P5FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }
    
    private void initComponentsP6Ft() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P6FtActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP6Fd() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P6FdActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }

    private void initComponentsP6Fp() 
    {

        foto = new javax.swing.JLabel();
        etiquetaPaso1 = new javax.swing.JLabel();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaPaso2 = new javax.swing.JLabel();
        etiquetaPaso3 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        etiquetaAsientos = new javax.swing.JLabel();
        etiquetaPago = new javax.swing.JLabel();
        etiquetaPeli = new javax.swing.JLabel();
        etiquetaPeliNom = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDia = new javax.swing.JLabel();
        etiquetaLugar = new javax.swing.JLabel();
        etiquetaFun = new javax.swing.JLabel();
        etiquetaBoletosRes = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        etiquetaIVA = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaFunHora = new javax.swing.JLabel();
        etiquetaBolCtn = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        etiquetaPantalla = new javax.swing.JLabel();
        etiquetaFilaA = new javax.swing.JLabel();
        etiquetaFilaB = new javax.swing.JLabel();
        etiquetaFilaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asientos");
        setBackground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+direccionFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso1.setText("Paso 1");

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaBoletos.setText("Boletos");

        etiquetaPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        etiquetaPaso2.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaPaso2.setText("Paso 2");

        etiquetaPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPaso3.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPaso3.setText("Paso 3");

        barraProgreso.setForeground(new java.awt.Color(246, 205, 0));
        barraProgreso.setValue(70);

        etiquetaAsientos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(0, 0, 255));
        etiquetaAsientos.setText("Asientos");

        etiquetaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaPago.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaPago.setText("Pago");

        etiquetaPeli.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeli.setText("Película:");

        etiquetaPeliNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaPeliNom.setText(nombrePelicula);

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        etiquetaFechaDia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFechaDia.setText(fecha);

        etiquetaLugar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaLugar.setText("Complejo:  Cine UwU FES Acatlán");

        etiquetaFun.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFun.setText("Función:");

        etiquetaBoletosRes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBoletosRes.setText("Boletos:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        etiquetaIVA.setText("Total (IVA incluido):");

        etiquetaTotal.setText("$"+total);

        etiquetaFunHora.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaFunHora.setText(horario);

        etiquetaBolCtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etiquetaBolCtn.setText(cantidad+" "+tipoBoleto);

        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("1");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(0).isDisponible())
        {
        	btnA1.setBackground(new java.awt.Color(0, 153, 0));
        	btnA1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA1P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("2");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(1).isDisponible())
        {
        	btnA2.setBackground(new java.awt.Color(0, 153, 0));
        	btnA2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA2P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("3");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(2).isDisponible())
        {
        	btnA3.setBackground(new java.awt.Color(0, 153, 0));
        	btnA3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA3P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("4");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(3).isDisponible())
        {
        	btnA4.setBackground(new java.awt.Color(0, 153, 0));
        	btnA4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA4P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("5");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(4).isDisponible())
        {
        	btnA5.setBackground(new java.awt.Color(0, 153, 0));
        	btnA5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnA5P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnA5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        

        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("1");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(0).isDisponible())
        {
        	btnB1.setBackground(new java.awt.Color(0, 153, 0));
        	btnB1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB1P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("2");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(1).isDisponible())
        {
        	btnB2.setBackground(new java.awt.Color(0, 153, 0));
        	btnB2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB2P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("3");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(2).isDisponible())
        {
        	btnB3.setBackground(new java.awt.Color(0, 153, 0));
        	btnB3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB3P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("4");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(3).isDisponible())
        {
        	btnB4.setBackground(new java.awt.Color(0, 153, 0));
        	btnB4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB4P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("5");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(4).isDisponible())
        {
        	btnB5.setBackground(new java.awt.Color(0, 153, 0));
        	btnB5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnB5P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnB5.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("1");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(0).isDisponible())
        {
        	btnC1.setBackground(new java.awt.Color(0, 153, 0));
        	btnC1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC1P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC1.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("2");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(1).isDisponible())
        {
        	btnC2.setBackground(new java.awt.Color(0, 153, 0));
        	btnC2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC2P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC2.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("3");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(2).isDisponible())
        {
        	btnC3.setBackground(new java.awt.Color(0, 153, 0));
        	btnC3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC3P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC3.setBackground(new java.awt.Color(153, 0, 0));
        }
        

        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("4");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(3).isDisponible())
        {
        	btnC4.setBackground(new java.awt.Color(0, 153, 0));
        	btnC4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC4P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC4.setBackground(new java.awt.Color(153, 0, 0));
        }
        
        
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("5");
        if(AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(4).isDisponible())
        {
        	btnC5.setBackground(new java.awt.Color(0, 153, 0));
        	btnC5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnC5P6FpActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnC5.setBackground(new java.awt.Color(153, 0, 0));
        }

        etiquetaPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaPantalla.setText("Pantalla");

        etiquetaFilaA.setText("A");

        etiquetaFilaB.setText("B");

        etiquetaFilaC.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaPaso1))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFilaA)
                            .addComponent(etiquetaFilaB)
                            .addComponent(etiquetaFilaC))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPantalla)
                                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaLugar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaFunHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaBoletosRes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaBolCtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etiquetaFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPeli)
                            .addComponent(etiquetaPeliNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaFechaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFun)
                            .addComponent(etiquetaFunHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBoletosRes)
                            .addComponent(etiquetaBolCtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaPantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFilaB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFilaC)
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIVA)
                            .addComponent(etiquetaTotal))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }
    
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
    	PagarBoletos p = new PagarBoletos(nombrePelicula,direccionFoto,fecha,horario,
        		tipoBoleto,c,total,sala,asientos);
    	this.setVisible(false);
    	p.setVisible(true);
    }                                            

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /*private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }   */                                  

    
    private void btnA1P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P1FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(0).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P1FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(1).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P1FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula1().get(2).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P2FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(0).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P2FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(1).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P2FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula2().get(2).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    

   private void btnA1P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P3FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(0).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P3FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(1).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P3FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula3().get(2).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    

   private void btnA1P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P4FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(0).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P4FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(1).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P4FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula4().get(2).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    

   private void btnA1P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P5FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(0).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P5FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(1).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P5FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula5().get(2).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    

    private void btnA1P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P6FtActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(0).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P6FdActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(1).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
    
    
    private void btnA1P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {   
    	if(ctn<c)
    	{
    		btnA1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(0).setDisponible(false);
        	ctn++;
        	asientos+="A1 ";
    	}
    }                                     

    private void btnA2P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(1).setDisponible(false);
        	ctn++;
        	asientos+="A2 ";
    	}
    }                                     

    private void btnA3P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(2).setDisponible(false);
        	ctn++;
        	asientos+="A3 ";
    	}
    }                                     

    private void btnA4P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(3).setDisponible(false);
        	ctn++;
        	asientos+="A4 ";
    	}
    }                                     

    private void btnA5P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnA5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaA().get(4).setDisponible(false);
        	ctn++;
        	asientos+="A5 ";
    	}
    }                                     

    private void btnB1P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(0).setDisponible(false);
        	ctn++;
        	asientos+="B1 ";
    	}
    }                                     

    private void btnB2P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(1).setDisponible(false);
        	ctn++;
        	asientos+="B2 ";
    	}
    }                                     

    private void btnB3P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(2).setDisponible(false);
        	ctn++;
        	asientos+="B3 ";
    	}
    }                                     

    private void btnB4P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(3).setDisponible(false);
        	ctn++;
        	asientos+="B4 ";
    	}
    }                                     

    private void btnB5P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnB5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaB().get(4).setDisponible(false);
        	ctn++;
        	asientos+="B5 ";
    	}
    }                                     

    private void btnC1P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC1.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(0).setDisponible(false);
        	ctn++;
        	asientos+="C1 ";
    	}
    }                                     

    private void btnC2P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC2.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(1).setDisponible(false);
        	ctn++;
        	asientos+="C2 ";
    	}
    }                                     

    private void btnC3P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC3.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(2).setDisponible(false);
        	ctn++;
        	asientos+="C3 ";
    	}
    }                                     

    private void btnC4P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC4.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(3).setDisponible(false);
        	ctn++;
        	asientos+="C4 ";
    	}
    }                                     

    private void btnC5P6FpActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	if(ctn<c)
    	{
    		btnC5.setBackground(new java.awt.Color(153, 153, 0));
        	AplicacionTaquilla.getPelicula6().get(2).getSala().getFilaC().get(4).setDisponible(false);
        	ctn++;
        	asientos+="C5 ";
    	}
    }
 
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////

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

	public String getTipoBoleto() {
		return tipoBoleto;
	}

	public void setTipoBoleto(String tipoBoleto) {
		Asientos.tipoBoleto = tipoBoleto;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		Asientos.cantidad = cantidad;
	}

	public AplicacionTaquilla getCine() {
		return cine;
	}

	public void setCine(AplicacionTaquilla cine) {
		Asientos.cine = cine;
	}

	public javax.swing.JProgressBar getBarraProgreso() {
		return barraProgreso;
	}

	public void setBarraProgreso(javax.swing.JProgressBar barraProgreso) {
		this.barraProgreso = barraProgreso;
	}

	public javax.swing.JButton getBtnA1() {
		return btnA1;
	}

	public void setBtnA1(javax.swing.JButton btnA1) {
		this.btnA1 = btnA1;
	}

	public javax.swing.JButton getBtnA2() {
		return btnA2;
	}

	public void setBtnA2(javax.swing.JButton btnA2) {
		this.btnA2 = btnA2;
	}

	public javax.swing.JButton getBtnA3() {
		return btnA3;
	}

	public void setBtnA3(javax.swing.JButton btnA3) {
		this.btnA3 = btnA3;
	}

	public javax.swing.JButton getBtnA4() {
		return btnA4;
	}

	public void setBtnA4(javax.swing.JButton btnA4) {
		this.btnA4 = btnA4;
	}

	public javax.swing.JButton getBtnA5() {
		return btnA5;
	}

	public void setBtnA5(javax.swing.JButton btnA5) {
		this.btnA5 = btnA5;
	}

	public javax.swing.JButton getBtnB1() {
		return btnB1;
	}

	public void setBtnB1(javax.swing.JButton btnB1) {
		this.btnB1 = btnB1;
	}

	public javax.swing.JButton getBtnB2() {
		return btnB2;
	}

	public void setBtnB2(javax.swing.JButton btnB2) {
		this.btnB2 = btnB2;
	}

	public javax.swing.JButton getBtnB3() {
		return btnB3;
	}

	public void setBtnB3(javax.swing.JButton btnB3) {
		this.btnB3 = btnB3;
	}

	public javax.swing.JButton getBtnB4() {
		return btnB4;
	}

	public void setBtnB4(javax.swing.JButton btnB4) {
		this.btnB4 = btnB4;
	}

	public javax.swing.JButton getBtnB5() {
		return btnB5;
	}

	public void setBtnB5(javax.swing.JButton btnB5) {
		this.btnB5 = btnB5;
	}

	public javax.swing.JButton getBtnC1() {
		return btnC1;
	}

	public void setBtnC1(javax.swing.JButton btnC1) {
		this.btnC1 = btnC1;
	}

	public javax.swing.JButton getBtnC2() {
		return btnC2;
	}

	public void setBtnC2(javax.swing.JButton btnC2) {
		this.btnC2 = btnC2;
	}

	public javax.swing.JButton getBtnC3() {
		return btnC3;
	}

	public void setBtnC3(javax.swing.JButton btnC3) {
		this.btnC3 = btnC3;
	}

	public javax.swing.JButton getBtnC4() {
		return btnC4;
	}

	public void setBtnC4(javax.swing.JButton btnC4) {
		this.btnC4 = btnC4;
	}

	public javax.swing.JButton getBtnC5() {
		return btnC5;
	}

	public void setBtnC5(javax.swing.JButton btnC5) {
		this.btnC5 = btnC5;
	}

	public javax.swing.JButton getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(javax.swing.JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}

	public javax.swing.JLabel getEtiquetaAsientos() {
		return etiquetaAsientos;
	}

	public void setEtiquetaAsientos(javax.swing.JLabel etiquetaAsientos) {
		this.etiquetaAsientos = etiquetaAsientos;
	}

	public javax.swing.JLabel getEtiquetaBolCtn() {
		return etiquetaBolCtn;
	}

	public void setEtiquetaBolCtn(javax.swing.JLabel etiquetaBolCtn) {
		this.etiquetaBolCtn = etiquetaBolCtn;
	}

	public javax.swing.JLabel getEtiquetaBoletos() {
		return etiquetaBoletos;
	}

	public void setEtiquetaBoletos(javax.swing.JLabel etiquetaBoletos) {
		this.etiquetaBoletos = etiquetaBoletos;
	}

	public javax.swing.JLabel getEtiquetaBoletosRes() {
		return etiquetaBoletosRes;
	}

	public void setEtiquetaBoletosRes(javax.swing.JLabel etiquetaBoletosRes) {
		this.etiquetaBoletosRes = etiquetaBoletosRes;
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

	public javax.swing.JLabel getEtiquetaFilaA() {
		return etiquetaFilaA;
	}

	public void setEtiquetaFilaA(javax.swing.JLabel etiquetaFilaA) {
		this.etiquetaFilaA = etiquetaFilaA;
	}

	public javax.swing.JLabel getEtiquetaFilaB() {
		return etiquetaFilaB;
	}

	public void setEtiquetaFilaB(javax.swing.JLabel etiquetaFilaB) {
		this.etiquetaFilaB = etiquetaFilaB;
	}

	public javax.swing.JLabel getEtiquetaFilaC() {
		return etiquetaFilaC;
	}

	public void setEtiquetaFilaC(javax.swing.JLabel etiquetaFilaC) {
		this.etiquetaFilaC = etiquetaFilaC;
	}

	public javax.swing.JLabel getEtiquetaFun() {
		return etiquetaFun;
	}

	public void setEtiquetaFun(javax.swing.JLabel etiquetaFun) {
		this.etiquetaFun = etiquetaFun;
	}

	public javax.swing.JLabel getEtiquetaFunHora() {
		return etiquetaFunHora;
	}

	public void setEtiquetaFunHora(javax.swing.JLabel etiquetaFunHora) {
		this.etiquetaFunHora = etiquetaFunHora;
	}

	public javax.swing.JLabel getEtiquetaIVA() {
		return etiquetaIVA;
	}

	public void setEtiquetaIVA(javax.swing.JLabel etiquetaIVA) {
		this.etiquetaIVA = etiquetaIVA;
	}

	public javax.swing.JLabel getEtiquetaLugar() {
		return etiquetaLugar;
	}

	public void setEtiquetaLugar(javax.swing.JLabel etiquetaLugar) {
		this.etiquetaLugar = etiquetaLugar;
	}

	public javax.swing.JLabel getEtiquetaPago() {
		return etiquetaPago;
	}

	public void setEtiquetaPago(javax.swing.JLabel etiquetaPago) {
		this.etiquetaPago = etiquetaPago;
	}

	public javax.swing.JLabel getEtiquetaPantalla() {
		return etiquetaPantalla;
	}

	public void setEtiquetaPantalla(javax.swing.JLabel etiquetaPantalla) {
		this.etiquetaPantalla = etiquetaPantalla;
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

	public javax.swing.JLabel getEtiquetaPeli() {
		return etiquetaPeli;
	}

	public void setEtiquetaPeli(javax.swing.JLabel etiquetaPeli) {
		this.etiquetaPeli = etiquetaPeli;
	}

	public javax.swing.JLabel getEtiquetaPeliNom() {
		return etiquetaPeliNom;
	}

	public void setEtiquetaPeliNom(javax.swing.JLabel etiquetaPeliNom) {
		this.etiquetaPeliNom = etiquetaPeliNom;
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

	public static int getC() {
		return c;
	}

	public static void setC(int c) {
		Asientos.c = c;
	}

	public static int getCtn() {
		return ctn;
	}

	public static void setCtn(int ctn) {
		Asientos.ctn = ctn;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Asientos.total = total;
	}

	public static String getAsientos() {
		return asientos;
	}

	public static void setAsientos(String asientos) {
		Asientos.asientos = asientos;
	}

	public static int getSala() {
		return sala;
	}

	public static void setSala(int sala) {
		Asientos.sala = sala;
	}

	public InterfazAplicaciónTaquilla getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(InterfazAplicaciónTaquilla ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static int getTradicional() {
		return TRADICIONAL;
	}

	public static int getTresD() {
		return TRES_D;
	}

	public static int getPremium() {
		return PREMIUM;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}
}


