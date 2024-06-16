package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;

public class DulceriaCase extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnPagar;
    private javax.swing.JSpinner contPd2;
    private javax.swing.JSpinner contPd3;
    private javax.swing.JSpinner contPd4;
    private javax.swing.JSpinner contPd5;
    private javax.swing.JSpinner contPdt1;
    private javax.swing.JLabel etiquetaDulceria;
    private javax.swing.JLabel producto1;
    private javax.swing.JLabel producto2;
    private javax.swing.JLabel producto3;
    private javax.swing.JLabel producto4;
    private javax.swing.JLabel producto5;
    private static String d1;
    private static String d2;
    private static String d3;
    private static String d4;
    private static String d5;
    private static int precio1;
    private static int precio2;
    private static int precio3;
    private static int precio4;
    private static int precio5;
    private static String nom2;
    private static String nom3;
    private static String nom4;
    private static String nom5;
    
    private BoletoImpreso boleto;
    
    // End of variables declaration 
    
    public DulceriaCase(String tipo,BoletoImpreso b) 
    {
    	boleto=b;
    	if(tipo.contains("Tra"))
    	{
    		llenar1();
    	}
    	else if(tipo.contains("3"))
    	{
    		llenar2();
    	}
    	else if(tipo.contains("Pre"))
    	{
    		llenar3();
    	}
    	precio1=50;
    	
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public DulceriaCase() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

           
    private void initComponents() {

        etiquetaDulceria = new javax.swing.JLabel();
        contPd2 = new javax.swing.JSpinner();
        producto3 = new javax.swing.JLabel();
        producto1 = new javax.swing.JLabel();
        contPd3 = new javax.swing.JSpinner();
        contPdt1 = new javax.swing.JSpinner();
        producto4 = new javax.swing.JLabel();
        contPd4 = new javax.swing.JSpinner();
        producto2 = new javax.swing.JLabel();
        producto5 = new javax.swing.JLabel();
        contPd5 = new javax.swing.JSpinner();
        btnPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(153, 255, 204));

        etiquetaDulceria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaDulceria.setForeground(new java.awt.Color(255, 0, 51));
        etiquetaDulceria.setText("Dulcería");

        producto1.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal = new ImageIcon(""+d1);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto1.setIcon(new ImageIcon (imagenAjustada));
        

        producto2.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal1 = new ImageIcon(""+d2);
        Image imagenAjustada1 = imagenOriginal1.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto2.setIcon(new ImageIcon (imagenAjustada1));
        
        producto3.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal2 = new ImageIcon(""+d3);
        Image imagenAjustada2 = imagenOriginal2.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto3.setIcon(new ImageIcon (imagenAjustada2));
        
        producto4.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal3 = new ImageIcon(""+d4);
        Image imagenAjustada3 = imagenOriginal3.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto4.setIcon(new ImageIcon (imagenAjustada3));
        
        producto5.setBackground(new java.awt.Color(102, 102, 255));
        ImageIcon imagenOriginal4 = new ImageIcon(""+d5);
        Image imagenAjustada4 = imagenOriginal4.getImage().getScaledInstance(90,120, Image.SCALE_SMOOTH);
        producto5.setIcon(new ImageIcon (imagenAjustada4));
        
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contPdt1)
                    .addComponent(producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contPd3)
                    .addComponent(producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 153, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contPd4)
                    .addComponent(producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contPd5)
                    .addComponent(producto5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPagar)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contPd2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaDulceria))
                        .addGap(325, 325, 325))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(etiquetaDulceria)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(contPd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(contPdt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contPd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(producto5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contPd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contPd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(btnPagar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	int cont1=Integer.parseInt(contPdt1.getValue().toString());
    	int cont2=Integer.parseInt(contPd2.getValue().toString());
    	int cont3=Integer.parseInt(contPd3.getValue().toString());
    	int cont4=Integer.parseInt(contPd4.getValue().toString());
    	int cont5=Integer.parseInt(contPd5.getValue().toString());
    	
    	int t1=cont1*precio1;
    	int t2=cont2*precio2;
    	int t3=cont3*precio3;
    	int t4=cont4*precio4;
    	int t5=cont5*precio5;
    	
    	int total=t1+t2+t3+t4+t5;
    	
    	Ticket a=new Ticket(cont1,cont2,cont3,cont4,cont5,t1,t2,t3,t4,t5,total,boleto,nom2,nom3,nom4,nom5);
    	this.setVisible(false);
    	a.setVisible(true);
    	
    	
    }                
    
    public void llenar1()
    {
    	d1="comida/producto1.png";
    	d2="comida/producto2.png";
    	d3="comida/producto8.png";
    	d4="comida/producto11.png";
    	d5="comida/producto12.png";
    	
    	precio2=20;
    	precio3=20;
    	precio4=35;
    	precio5=25;
    	
    	nom2="Refresco";
    	nom3="Helado";
    	nom4="Papas";
    	nom5="Chocolate";
    }
    
    public void llenar2()
    {
    	d1="comida/producto1.png";
    	d2="comida/producto2.png";
    	d3="comida/producto4.png";
    	d4="comida/producto5.png";
    	d5="comida/producto6.png";
    	
    	precio2=20;
    	precio3=25;
    	precio4=30;
    	precio5=15;
    	
    	nom2="Refresco";
    	nom3="Hot-Dog";
    	nom4="Nachos";
    	nom5="Panditas";
    }
    
    public void llenar3()
    {
    	d1="comida/producto1.png";
    	d2="comida/producto3.png";
    	d3="comida/producto9.png";
    	d4="comida/producto10.png";
    	d5="comida/producto11.png";
    	
    	precio2=70;
    	precio3=50;
    	precio4=40;
    	precio5=35;
    	
    	nom2="ICEE";
    	nom3="Crepa";
    	nom4="Frape";
    	nom5="Papas";
    }

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

	public static String getD1() {
		return d1;
	}

	public static void setD1(String d1) {
		DulceriaCase.d1 = d1;
	}

	public static String getD2() {
		return d2;
	}

	public static void setD2(String d2) {
		DulceriaCase.d2 = d2;
	}

	public static String getD3() {
		return d3;
	}

	public static void setD3(String d3) {
		DulceriaCase.d3 = d3;
	}

	public static String getD4() {
		return d4;
	}

	public static void setD4(String d4) {
		DulceriaCase.d4 = d4;
	}

	public static String getD5() {
		return d5;
	}

	public static void setD5(String d5) {
		DulceriaCase.d5 = d5;
	}

	public static int getPrecio1() {
		return precio1;
	}

	public static void setPrecio1(int precio1) {
		DulceriaCase.precio1 = precio1;
	}

	public static int getPrecio2() {
		return precio2;
	}

	public static void setPrecio2(int precio2) {
		DulceriaCase.precio2 = precio2;
	}

	public static int getPrecio3() {
		return precio3;
	}

	public static void setPrecio3(int precio3) {
		DulceriaCase.precio3 = precio3;
	}

	public static int getPrecio4() {
		return precio4;
	}

	public static void setPrecio4(int precio4) {
		DulceriaCase.precio4 = precio4;
	}

	public static int getPrecio5() {
		return precio5;
	}

	public static void setPrecio5(int precio5) {
		DulceriaCase.precio5 = precio5;
	}

	public static String getNom2() {
		return nom2;
	}

	public static void setNom2(String nom2) {
		DulceriaCase.nom2 = nom2;
	}

	public static String getNom3() {
		return nom3;
	}

	public static void setNom3(String nom3) {
		DulceriaCase.nom3 = nom3;
	}

	public static String getNom4() {
		return nom4;
	}

	public static void setNom4(String nom4) {
		DulceriaCase.nom4 = nom4;
	}

	public static String getNom5() {
		return nom5;
	}

	public static void setNom5(String nom5) {
		DulceriaCase.nom5 = nom5;
	}

	public BoletoImpreso getBoleto() {
		return boleto;
	}

	public void setBoleto(BoletoImpreso boleto) {
		this.boleto = boleto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
