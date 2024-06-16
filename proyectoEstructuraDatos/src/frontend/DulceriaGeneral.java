package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;

public class DulceriaGeneral extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;

	private final static int PRODUCT1 = 50;
	private final static int PRODUCT2 = 20;
	private final static int PRODUCT3 = 70;
	private final static int PRODUCT4 = 25;
	private final static int PRODUCT5 = 30;
	private final static int PRODUCT6 = 15;
	private final static int PRODUCT7 = 25;
	private final static int PRODUCT8 = 20;
	
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnPagar;
    private javax.swing.JSpinner contPd2;
    private javax.swing.JSpinner contPd3;
    private javax.swing.JSpinner contPd4;
    private javax.swing.JSpinner contPd5;
    private javax.swing.JSpinner contPd6;
    private javax.swing.JSpinner contPd7;
    private javax.swing.JSpinner contPd8;
    private javax.swing.JSpinner contPdt1;
    private javax.swing.JLabel etiquetaDulceria;
    private javax.swing.JLabel producto1;
    private javax.swing.JLabel producto2;
    private javax.swing.JLabel producto3;
    private javax.swing.JLabel producto4;
    private javax.swing.JLabel producto5;
    private javax.swing.JLabel producto6;
    private javax.swing.JLabel producto7;
    private javax.swing.JLabel producto8;
    private static int cont1;
    private static int cont2;
    private static int cont3;
    private static int cont4;
    private static int cont5;
    private static int cont6;
    private static int cont7;
    private static int cont8;
    
    
    private InterfazAplicaciónTaquilla ventanaPrincipal;
    // End of variables declaration 
    
    public DulceriaGeneral(InterfazAplicaciónTaquilla ventanaPrincipal) 
    {
    	this.ventanaPrincipal=ventanaPrincipal;
        
		initComponents();
        this.setLocationRelativeTo(null);
    }

                            
    private void initComponents() {

        etiquetaDulceria = new javax.swing.JLabel();
        producto1 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        contPdt1 = new javax.swing.JSpinner();
        producto2 = new javax.swing.JLabel();
        contPd2 = new javax.swing.JSpinner();
        producto3 = new javax.swing.JLabel();
        contPd3 = new javax.swing.JSpinner();
        producto4 = new javax.swing.JLabel();
        contPd4 = new javax.swing.JSpinner();
        contPd6 = new javax.swing.JSpinner();
        producto7 = new javax.swing.JLabel();
        producto5 = new javax.swing.JLabel();
        contPd7 = new javax.swing.JSpinner();
        contPd5 = new javax.swing.JSpinner();
        producto8 = new javax.swing.JLabel();
        contPd8 = new javax.swing.JSpinner();
        producto6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(153, 255, 204));

        etiquetaDulceria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaDulceria.setForeground(new java.awt.Color(255,0,127));
        etiquetaDulceria.setText("Dulcería");
        
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        
        producto1.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal = new ImageIcon("comida/producto1.png");
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto1.setIcon(new ImageIcon (imagenAjustada));
        

        producto2.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal1 = new ImageIcon("comida/producto2.png");
        Image imagenAjustada1 = imagenOriginal1.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto2.setIcon(new ImageIcon (imagenAjustada1));
        
        producto3.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal2 = new ImageIcon("comida/producto3.png");
        Image imagenAjustada2 = imagenOriginal2.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto3.setIcon(new ImageIcon (imagenAjustada2));
        
        producto4.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal3 = new ImageIcon("comida/producto4.png");
        Image imagenAjustada3 = imagenOriginal3.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto4.setIcon(new ImageIcon (imagenAjustada3));
        
        producto5.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal4 = new ImageIcon("comida/producto5.png");
        Image imagenAjustada4 = imagenOriginal4.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto5.setIcon(new ImageIcon (imagenAjustada4));
        
        producto6.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal5 = new ImageIcon("comida/producto6.png");
        Image imagenAjustada5 = imagenOriginal5.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto6.setIcon(new ImageIcon (imagenAjustada5));
        
        producto7.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal6 = new ImageIcon("comida/producto7.png");
        Image imagenAjustada6 = imagenOriginal6.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto7.setIcon(new ImageIcon (imagenAjustada6));
        
        producto8.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal7 = new ImageIcon("comida/producto8.png");
        Image imagenAjustada7 = imagenOriginal7.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto8.setIcon(new ImageIcon (imagenAjustada7));
         
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(etiquetaDulceria)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contPd5)
                            .addComponent(producto5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contPd6)
                            .addComponent(producto6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contPd7)
                            .addComponent(producto7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contPd8)
                            .addComponent(producto8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contPdt1)
                            .addComponent(producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPagar)
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contPd2)
                                    .addComponent(producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contPd3)
                                    .addComponent(producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contPd4)
                                    .addComponent(producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(85, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(etiquetaDulceria)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contPd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contPd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(contPd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(contPdt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(producto8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contPd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(producto7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contPd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(producto6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(contPd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(producto5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(contPd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnPagar)
                .addGap(24, 24, 24))
        );

        pack();
    }                       

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	cont1=Integer.parseInt(contPdt1.getValue().toString());
    	cont2=Integer.parseInt(contPd2.getValue().toString());
    	cont3=Integer.parseInt(contPd3.getValue().toString());
    	cont4=Integer.parseInt(contPd4.getValue().toString());
    	cont5=Integer.parseInt(contPd5.getValue().toString());
    	cont6=Integer.parseInt(contPd6.getValue().toString());
    	cont7=Integer.parseInt(contPd7.getValue().toString());
    	cont8=Integer.parseInt(contPd8.getValue().toString());
    	int t1=cont1*PRODUCT1;
    	int t2=cont2*PRODUCT2;
    	int t3=cont3*PRODUCT3;
    	int t4=cont4*PRODUCT4;
    	int t5=cont5*PRODUCT5;
    	int t6=cont6*PRODUCT6;
    	int t7=cont7*PRODUCT7;
    	int t8=cont8*PRODUCT8;
    	int total=t1+t2+t3+t4+t5+t6+t7+t8;
    	
    	//System.out.println(cont1);
    	
    	Ticket a = new Ticket(cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,t1,t2,t3,t4,t5,t6,t7,t8,total);
    	this.setVisible(false);
    	a.setVisible(true);
    	
    }

    //////////////////////////////////////////////////////////////////////////////////////////////7
	public javax.swing.JButton getBtnPagar() {
		return btnPagar;
	}


	public void setBtnPagar(javax.swing.JButton btnPagar) {
		this.btnPagar = btnPagar;
	}


	public javax.swing.JSpinner getContPd2() {
		return contPd2;
	}


	public void setContPd2(javax.swing.JSpinner contPd2) {
		this.contPd2 = contPd2;
	}


	public javax.swing.JSpinner getContPd3() {
		return contPd3;
	}


	public void setContPd3(javax.swing.JSpinner contPd3) {
		this.contPd3 = contPd3;
	}


	public javax.swing.JSpinner getContPd4() {
		return contPd4;
	}


	public void setContPd4(javax.swing.JSpinner contPd4) {
		this.contPd4 = contPd4;
	}


	public javax.swing.JSpinner getContPd5() {
		return contPd5;
	}


	public void setContPd5(javax.swing.JSpinner contPd5) {
		this.contPd5 = contPd5;
	}


	public javax.swing.JSpinner getContPd6() {
		return contPd6;
	}


	public void setContPd6(javax.swing.JSpinner contPd6) {
		this.contPd6 = contPd6;
	}


	public javax.swing.JSpinner getContPd7() {
		return contPd7;
	}


	public void setContPd7(javax.swing.JSpinner contPd7) {
		this.contPd7 = contPd7;
	}


	public javax.swing.JSpinner getContPd8() {
		return contPd8;
	}


	public void setContPd8(javax.swing.JSpinner contPd8) {
		this.contPd8 = contPd8;
	}


	public javax.swing.JSpinner getContPdt1() {
		return contPdt1;
	}


	public void setContPdt1(javax.swing.JSpinner contPdt1) {
		this.contPdt1 = contPdt1;
	}


	public javax.swing.JLabel getEtiquetaDulceria() {
		return etiquetaDulceria;
	}


	public void setEtiquetaDulceria(javax.swing.JLabel etiquetaDulceria) {
		this.etiquetaDulceria = etiquetaDulceria;
	}


	public javax.swing.JLabel getProducto1() {
		return producto1;
	}


	public void setProducto1(javax.swing.JLabel producto1) {
		this.producto1 = producto1;
	}


	public javax.swing.JLabel getProducto2() {
		return producto2;
	}


	public void setProducto2(javax.swing.JLabel producto2) {
		this.producto2 = producto2;
	}


	public javax.swing.JLabel getProducto3() {
		return producto3;
	}


	public void setProducto3(javax.swing.JLabel producto3) {
		this.producto3 = producto3;
	}


	public javax.swing.JLabel getProducto4() {
		return producto4;
	}


	public void setProducto4(javax.swing.JLabel producto4) {
		this.producto4 = producto4;
	}


	public javax.swing.JLabel getProducto5() {
		return producto5;
	}


	public void setProducto5(javax.swing.JLabel producto5) {
		this.producto5 = producto5;
	}


	public javax.swing.JLabel getProducto6() {
		return producto6;
	}


	public void setProducto6(javax.swing.JLabel producto6) {
		this.producto6 = producto6;
	}


	public javax.swing.JLabel getProducto7() {
		return producto7;
	}


	public void setProducto7(javax.swing.JLabel producto7) {
		this.producto7 = producto7;
	}


	public javax.swing.JLabel getProducto8() {
		return producto8;
	}


	public void setProducto8(javax.swing.JLabel producto8) {
		this.producto8 = producto8;
	}


	public static int getCont1() {
		return cont1;
	}


	public static void setCont1(int cont1) {
		DulceriaGeneral.cont1 = cont1;
	}


	public static int getCont2() {
		return cont2;
	}


	public static void setCont2(int cont2) {
		DulceriaGeneral.cont2 = cont2;
	}


	public static int getCont3() {
		return cont3;
	}


	public static void setCont3(int cont3) {
		DulceriaGeneral.cont3 = cont3;
	}


	public static int getCont4() {
		return cont4;
	}


	public static void setCont4(int cont4) {
		DulceriaGeneral.cont4 = cont4;
	}


	public static int getCont5() {
		return cont5;
	}


	public static void setCont5(int cont5) {
		DulceriaGeneral.cont5 = cont5;
	}


	public static int getCont6() {
		return cont6;
	}


	public static void setCont6(int cont6) {
		DulceriaGeneral.cont6 = cont6;
	}


	public static int getCont7() {
		return cont7;
	}


	public static void setCont7(int cont7) {
		DulceriaGeneral.cont7 = cont7;
	}


	public static int getCont8() {
		return cont8;
	}


	public static void setCont8(int cont8) {
		DulceriaGeneral.cont8 = cont8;
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


	public static int getProduct1() {
		return PRODUCT1;
	}


	public static int getProduct2() {
		return PRODUCT2;
	}


	public static int getProduct3() {
		return PRODUCT3;
	}


	public static int getProduct4() {
		return PRODUCT4;
	}


	public static int getProduct5() {
		return PRODUCT5;
	}


	public static int getProduct6() {
		return PRODUCT6;
	}


	public static int getProduct7() {
		return PRODUCT7;
	}


	public static int getProduct8() {
		return PRODUCT8;
	}                                        

    
    
}

