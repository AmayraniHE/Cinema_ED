package frontend;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import backend.AplicacionTaquilla;

public class Ticket extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel cant1;
    private javax.swing.JLabel cant2;
    private javax.swing.JLabel cant3;
    private javax.swing.JLabel cant4;
    private javax.swing.JLabel cant5;
    private javax.swing.JLabel cant6;
    private javax.swing.JLabel cant7;
    private javax.swing.JLabel cant8;
    private javax.swing.JLabel etiquetaCant;
    private javax.swing.JLabel etiquetaCine;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaFinalTotal;
    private javax.swing.JLabel etiquetaNumTick;
    private javax.swing.JLabel etiquetaPrecio;
    private javax.swing.JLabel etiquetaProducto;
    private javax.swing.JLabel etiquetaTicket;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nomProduc1;
    private javax.swing.JLabel nomProduc2;
    private javax.swing.JLabel nomProduc3;
    private javax.swing.JLabel nomProduc4;
    private javax.swing.JLabel nomProduc5;
    private javax.swing.JLabel nomProduc6;
    private javax.swing.JLabel nomProduc7;
    private javax.swing.JLabel nomProduc8;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel precio5;
    private javax.swing.JLabel precio6;
    private javax.swing.JLabel precio7;
    private javax.swing.JLabel precio8;
    private javax.swing.JLabel total1;
    private javax.swing.JLabel total2;
    private javax.swing.JLabel total3;
    private javax.swing.JLabel total4;
    private javax.swing.JLabel total5;
    private javax.swing.JLabel total6;
    private javax.swing.JLabel total7;
    private javax.swing.JLabel total8;
    private int numTick;
    SimpleDateFormat formateador;
    Date fechaDate;
    private static String cantidad1;
    private static String cantidad2;
    private static String cantidad3;
    private static String cantidad4;
    private static String cantidad5;
    private static String cantidad6;
    private static String cantidad7;
    private static String cantidad8;
    
    private static String fecha;
    
    private static String nom1;
    private static String nom2;
    private static String nom3;
    private static String nom4;
    private static String nom5;
    private static String nom6;
    private static String nom7;
    private static String nom8;
    
    private static String pre1;
    private static String pre2;
    private static String pre3;
    private static String pre4;
    private static String pre5;
    private static String pre6;
    private static String pre7;
    private static String pre8;
    
    private static String tot1;
    private static String tot2;
    private static String tot3;
    private static String tot4;
    private static String tot5;
    private static String tot6;
    private static String tot7;
    private static String tot8;
    private static String totalF;
    // End of variables declaration
    
    BoletoImpreso boletito;
    
    public Ticket(BoletoImpreso boletito) 
    {
    	this.boletito=boletito;
    	numTick=AplicacionTaquilla.getNumeroTick().obtenerNumTick();
    	formateador= new SimpleDateFormat("dd 'de' MMMM", new Locale("es_ES"));
    	fechaDate = new Date();
    	Calendar c = Calendar.getInstance();
    	c.setTime(fechaDate);
    	fechaDate=c.getTime();
    	this.boletito.setFecha(formateador.format(fechaDate));
    	llenar();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Ticket(int cont1,int cont2,int cont3,int cont4,int cont5,int cont6,
    		int cont7,int cont8,int t1,int t2,int t3,int t4,int t5,int t6,int t7,int t8,int total) 
    {
    	numTick=AplicacionTaquilla.getNumeroTick().obtenerNumTick();
    	formateador= new SimpleDateFormat("dd 'de' MMMM", new Locale("es_ES"));
    	fechaDate = new Date();
    	Calendar c = Calendar.getInstance();
    	c.setTime(fechaDate);
    	fechaDate=c.getTime();
    	fecha=formateador.format(fechaDate);
    	totalF=""+total;
    	
    	cantidad1=cont1>0? ""+cont1:"";
        cantidad2=cont2>0? ""+cont2:"";
        cantidad3=cont3>0? ""+cont3:"";
        cantidad4=cont4>0? ""+cont4:"";
        cantidad5=cont5>0? ""+cont5:"";
        cantidad6=cont6>0? ""+cont6:"";
        cantidad7=cont7>0? ""+cont7:"";
        cantidad8=cont8>0? ""+cont8:"";
        
        nom1=cont1>0? "Palomitas":"";
        nom2=cont2>0? "Refresco":"";
        nom3=cont3>0? "ICEE":"";
        nom4=cont4>0? "Hot-Dog":"";
        nom5=cont5>0? "Nachos":"";
        nom6=cont6>0? "Panditas":"";
        nom7=cont7>0? "Helado":"";
        nom8=cont8>0? "Agua":"";
        
        pre1=cont1>0? ""+DulceriaGeneral.getProduct1():"";
        pre2=cont2>0? ""+DulceriaGeneral.getProduct2():"";
        pre3=cont3>0? ""+DulceriaGeneral.getProduct3():"";
        pre4=cont4>0? ""+DulceriaGeneral.getProduct4():"";
        pre5=cont5>0? ""+DulceriaGeneral.getProduct5():"";
        pre6=cont6>0? ""+DulceriaGeneral.getProduct6():"";
        pre7=cont7>0? ""+DulceriaGeneral.getProduct7():"";
        pre8=cont8>0? ""+DulceriaGeneral.getProduct8():"";
        
        tot1=cont1>0? ""+t1:"";
        tot2=cont2>0? ""+t2:"";
        tot3=cont3>0? ""+t3:"";
        tot4=cont4>0? ""+t4:"";
        tot5=cont5>0? ""+t5:"";
        tot6=cont6>0? ""+t6:"";
        tot7=cont7>0? ""+t7:"";
        tot8=cont8>0? ""+t8:"";
        
    	
    	
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Ticket(int cont1,int cont2,int cont3,int cont4,int cont5,int t1,int t2,
    		int t3,int t4,int t5,int total,BoletoImpreso boletito,String nomb2,String nomb3, String nomb4,String nomb5) 
    {
    	this.boletito=boletito;
    	numTick=AplicacionTaquilla.getNumeroTick().obtenerNumTick();
    	formateador= new SimpleDateFormat("dd 'de' MMMM", new Locale("es_ES"));
    	fechaDate = new Date();
    	Calendar c = Calendar.getInstance();
    	c.setTime(fechaDate);
    	fechaDate=c.getTime();
    	this.boletito.setFecha(formateador.format(fechaDate));
    	
    	totalF=""+(total+boletito.getTotalBoCargo());
    	
    	cantidad4=cont1>0? ""+cont1:"";
        cantidad5=cont2>0? ""+cont2:"";
        cantidad6=cont3>0? ""+cont3:"";
        cantidad7=cont4>0? ""+cont4:"";
        cantidad8=cont5>0? ""+cont5:"";
        
        nom4=cont1>0? "Palomitas":"";
        nom5=cont2>0? ""+nomb2:"";
        nom6=cont3>0? ""+nomb3:"";
        nom7=cont4>0? ""+nomb4:"";
        nom8=cont5>0? ""+nomb5:"";
        
        pre4=cont1>0? ""+DulceriaCase.getPrecio1():"";
        pre5=cont2>0? ""+DulceriaCase.getPrecio2():"";
        pre6=cont3>0? ""+DulceriaCase.getPrecio3():"";
        pre7=cont4>0? ""+DulceriaCase.getPrecio4():"";
        pre8=cont5>0? ""+DulceriaCase.getPrecio5():"";
        
        tot4=cont1>0? ""+t1:"";
        tot5=cont2>0? ""+t2:"";
        tot6=cont3>0? ""+t3:"";
        tot7=cont4>0? ""+t4:"";
        tot8=cont5>0? ""+t5:"";
        
        String arreglo[]=null;
        String nom="";
    	String p="";
        
        if(boletito.getTipoBoleto().contains(" "))
    	{
    		arreglo=boletito.getTipoBoleto().split(" ");
    		nom=arreglo[0];
    		p=arreglo[1];
    	}
    	fecha=""+boletito.getFecha();
    	
    	cantidad1=""+boletito.getCantidad();
    	cantidad2="";
    	cantidad3="";
    	
    	nom1=""+nom;
    	nom2="Cargo Servicio";
    	nom3="";
    	
    	tot1=""+boletito.getTotal();
        tot2="10";
        tot3="";
        
        pre1=""+p;
        pre2="10";
        pre3="";
    	
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Ticket() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

                       
    private void initComponents() {

        etiquetaTicket = new javax.swing.JLabel();
        etiquetaCine = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etiquetaNumTick = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        etiquetaCant = new javax.swing.JLabel();
        etiquetaProducto = new javax.swing.JLabel();
        etiquetaPrecio = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        cant1 = new javax.swing.JLabel();
        nomProduc1 = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        cant2 = new javax.swing.JLabel();
        nomProduc2 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        total4 = new javax.swing.JLabel();
        cant3 = new javax.swing.JLabel();
        nomProduc3 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        total3 = new javax.swing.JLabel();
        cant4 = new javax.swing.JLabel();
        nomProduc4 = new javax.swing.JLabel();
        cant5 = new javax.swing.JLabel();
        nomProduc5 = new javax.swing.JLabel();
        precio5 = new javax.swing.JLabel();
        total5 = new javax.swing.JLabel();
        cant6 = new javax.swing.JLabel();
        nomProduc6 = new javax.swing.JLabel();
        precio6 = new javax.swing.JLabel();
        total6 = new javax.swing.JLabel();
        precio8 = new javax.swing.JLabel();
        total8 = new javax.swing.JLabel();
        cant7 = new javax.swing.JLabel();
        nomProduc7 = new javax.swing.JLabel();
        precio7 = new javax.swing.JLabel();
        total7 = new javax.swing.JLabel();
        cant8 = new javax.swing.JLabel();
        nomProduc8 = new javax.swing.JLabel();
        etiquetaFinalTotal = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTicket.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaTicket.setText("TICKET");

        etiquetaCine.setText("Cine Acatlán");

        etiquetaFecha.setText("Fecha expedición:");

        jLabel4.setText(""+fecha);

        etiquetaNumTick.setText("No. de Ticket:");

        jLabel6.setText(""+numTick);

        jLabel7.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        etiquetaCant.setText("Cant.");

        etiquetaProducto.setText("Producto");

        etiquetaPrecio.setText("Precio");

        etiquetaTotal.setText("Total");

        cant1.setText(""+cantidad1);

        nomProduc1.setText(""+nom1);

        precio1.setText(""+pre1);

        total1.setText(""+tot1);

        cant2.setText(""+cantidad2);

        nomProduc2.setText(""+nom2);

        precio2.setText(""+pre2);

        total2.setText(""+tot2);

        precio4.setText(""+pre4);

        total4.setText(""+tot4);

        cant3.setText(""+cantidad3);

        nomProduc3.setText(""+nom3);

        precio3.setText(""+pre3);

        total3.setText(""+tot3);

        cant4.setText(""+cantidad4);

        nomProduc4.setText(""+nom4);

        cant5.setText(""+cantidad5);

        nomProduc5.setText(""+nom5);

        precio5.setText(""+pre5);

        total5.setText(""+tot5);

        cant6.setText(""+cantidad6);

        nomProduc6.setText(""+nom6);

        precio6.setText(""+pre6);

        total6.setText(""+tot6);

        precio8.setText(""+pre8);

        total8.setText(""+tot8);

        cant7.setText(""+cantidad7);

        nomProduc7.setText(""+nom7);

        precio7.setText(""+pre7);

        total7.setText(""+tot7);

        cant8.setText(""+cantidad8);

        nomProduc8.setText(""+nom8);

        etiquetaFinalTotal.setText("TOTAL (IVA incluido):");

        jLabel45.setText("$"+totalF);

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaCine)
                            .addComponent(etiquetaTicket)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaNumTick)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFecha)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cant3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nomProduc3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cant4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nomProduc4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(etiquetaCant)
                                                .addGap(55, 55, 55)
                                                .addComponent(etiquetaProducto))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(nomProduc1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(etiquetaPrecio)
                                                .addGap(33, 33, 33)
                                                .addComponent(etiquetaTotal))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(precio1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(total1))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(precio4)
                                                            .addComponent(precio3)
                                                            .addComponent(precio2)
                                                            .addComponent(precio8)
                                                            .addComponent(precio7)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(precio6)
                                                                    .addComponent(precio5))
                                                                .addGap(27, 27, 27)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(total5)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(total3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(total4))
                                                            .addComponent(total6)
                                                            .addComponent(total7)
                                                            .addComponent(total8)))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cant2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nomProduc2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(total2)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cant7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nomProduc7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cant5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nomProduc5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cant6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nomProduc6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cant8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nomProduc8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFinalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnTerminar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(etiquetaTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaCine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaFecha)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumTick)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCant)
                    .addComponent(etiquetaProducto)
                    .addComponent(etiquetaPrecio)
                    .addComponent(etiquetaTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant1)
                    .addComponent(nomProduc1)
                    .addComponent(precio1)
                    .addComponent(total1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant2)
                    .addComponent(nomProduc2)
                    .addComponent(precio2)
                    .addComponent(total2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant3)
                    .addComponent(nomProduc3)
                    .addComponent(precio3)
                    .addComponent(total3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant4)
                    .addComponent(nomProduc4)
                    .addComponent(precio4)
                    .addComponent(total4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant5)
                    .addComponent(nomProduc5)
                    .addComponent(precio5)
                    .addComponent(total5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant6)
                    .addComponent(nomProduc6)
                    .addComponent(precio6)
                    .addComponent(total6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant7)
                    .addComponent(nomProduc7)
                    .addComponent(precio7)
                    .addComponent(total7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant8)
                    .addComponent(nomProduc8)
                    .addComponent(precio8)
                    .addComponent(total8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaFinalTotal)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addComponent(btnTerminar)
                .addGap(27, 27, 27))
        );

        pack();
    }                       

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	InterfazAplicaciónTaquilla a=new InterfazAplicaciónTaquilla();
    	this.setVisible(false);
    	a.setVisible(true);
    }                                           

    public void llenar()
    {
    	String arreglo[]=null;
    	String nom="";
    	String p="";
    	
    	if(boletito.getTipoBoleto().contains(" "))
    	{
    		arreglo=boletito.getTipoBoleto().split(" ");
    		nom=arreglo[0];
    		p=arreglo[1];
    	}
    	fecha=""+boletito.getFecha();
    	
    	cantidad1=""+boletito.getCantidad();
    	cantidad2="";
    	cantidad3="";
    	cantidad4="";
    	cantidad5="";
    	cantidad6="";
    	cantidad7="";
    	cantidad8="";
    	
    	nom1=""+nom;
    	nom2="Cargo Servicio";
    	nom3="";
    	nom4="";
    	nom5="";
    	nom6="";
    	nom7="";
    	nom8="";
    	
    	pre1=""+p;
        pre2="10";
        pre3="";
        pre4="";
        pre5="";
        pre6="";
        pre7="";
        pre8="";
        
        tot1=""+boletito.getTotal();
        tot2="10";
        tot3="";
        tot4="";
        tot5="";
        tot6="";
        tot7="";
        tot8=""; 	
        
        totalF=""+boletito.getTotalBoCargo();
    	
    }
    

    ///////////////////////////////////////////////////////////////////////////////////////////////////
	public javax.swing.JButton getBtnTerminar() {
		return btnTerminar;
	}

	public void setBtnTerminar(javax.swing.JButton btnTerminar) {
		this.btnTerminar = btnTerminar;
	}

	public javax.swing.JLabel getCant1() {
		return cant1;
	}

	public void setCant1(javax.swing.JLabel cant1) {
		this.cant1 = cant1;
	}

	public javax.swing.JLabel getCant2() {
		return cant2;
	}

	public void setCant2(javax.swing.JLabel cant2) {
		this.cant2 = cant2;
	}

	public javax.swing.JLabel getCant3() {
		return cant3;
	}

	public void setCant3(javax.swing.JLabel cant3) {
		this.cant3 = cant3;
	}

	public javax.swing.JLabel getCant4() {
		return cant4;
	}

	public void setCant4(javax.swing.JLabel cant4) {
		this.cant4 = cant4;
	}

	public javax.swing.JLabel getCant5() {
		return cant5;
	}

	public void setCant5(javax.swing.JLabel cant5) {
		this.cant5 = cant5;
	}

	public javax.swing.JLabel getCant6() {
		return cant6;
	}

	public void setCant6(javax.swing.JLabel cant6) {
		this.cant6 = cant6;
	}

	public javax.swing.JLabel getCant7() {
		return cant7;
	}

	public void setCant7(javax.swing.JLabel cant7) {
		this.cant7 = cant7;
	}

	public javax.swing.JLabel getCant8() {
		return cant8;
	}

	public void setCant8(javax.swing.JLabel cant8) {
		this.cant8 = cant8;
	}

	public javax.swing.JLabel getEtiquetaCant() {
		return etiquetaCant;
	}

	public void setEtiquetaCant(javax.swing.JLabel etiquetaCant) {
		this.etiquetaCant = etiquetaCant;
	}

	public javax.swing.JLabel getEtiquetaCine() {
		return etiquetaCine;
	}

	public void setEtiquetaCine(javax.swing.JLabel etiquetaCine) {
		this.etiquetaCine = etiquetaCine;
	}

	public javax.swing.JLabel getEtiquetaFecha() {
		return etiquetaFecha;
	}

	public void setEtiquetaFecha(javax.swing.JLabel etiquetaFecha) {
		this.etiquetaFecha = etiquetaFecha;
	}

	public javax.swing.JLabel getEtiquetaFinalTotal() {
		return etiquetaFinalTotal;
	}

	public void setEtiquetaFinalTotal(javax.swing.JLabel etiquetaFinalTotal) {
		this.etiquetaFinalTotal = etiquetaFinalTotal;
	}

	public javax.swing.JLabel getEtiquetaNumTick() {
		return etiquetaNumTick;
	}

	public void setEtiquetaNumTick(javax.swing.JLabel etiquetaNumTick) {
		this.etiquetaNumTick = etiquetaNumTick;
	}

	public javax.swing.JLabel getEtiquetaPrecio() {
		return etiquetaPrecio;
	}

	public void setEtiquetaPrecio(javax.swing.JLabel etiquetaPrecio) {
		this.etiquetaPrecio = etiquetaPrecio;
	}

	public javax.swing.JLabel getEtiquetaProducto() {
		return etiquetaProducto;
	}

	public void setEtiquetaProducto(javax.swing.JLabel etiquetaProducto) {
		this.etiquetaProducto = etiquetaProducto;
	}

	public javax.swing.JLabel getEtiquetaTicket() {
		return etiquetaTicket;
	}

	public void setEtiquetaTicket(javax.swing.JLabel etiquetaTicket) {
		this.etiquetaTicket = etiquetaTicket;
	}

	public javax.swing.JLabel getEtiquetaTotal() {
		return etiquetaTotal;
	}

	public void setEtiquetaTotal(javax.swing.JLabel etiquetaTotal) {
		this.etiquetaTotal = etiquetaTotal;
	}

	public javax.swing.JLabel getjLabel4() {
		return jLabel4;
	}

	public void setjLabel4(javax.swing.JLabel jLabel4) {
		this.jLabel4 = jLabel4;
	}

	public javax.swing.JLabel getjLabel45() {
		return jLabel45;
	}

	public void setjLabel45(javax.swing.JLabel jLabel45) {
		this.jLabel45 = jLabel45;
	}

	public javax.swing.JLabel getjLabel6() {
		return jLabel6;
	}

	public void setjLabel6(javax.swing.JLabel jLabel6) {
		this.jLabel6 = jLabel6;
	}

	public javax.swing.JLabel getjLabel7() {
		return jLabel7;
	}

	public void setjLabel7(javax.swing.JLabel jLabel7) {
		this.jLabel7 = jLabel7;
	}

	public javax.swing.JLabel getNomProduc1() {
		return nomProduc1;
	}

	public void setNomProduc1(javax.swing.JLabel nomProduc1) {
		this.nomProduc1 = nomProduc1;
	}

	public javax.swing.JLabel getNomProduc2() {
		return nomProduc2;
	}

	public void setNomProduc2(javax.swing.JLabel nomProduc2) {
		this.nomProduc2 = nomProduc2;
	}

	public javax.swing.JLabel getNomProduc3() {
		return nomProduc3;
	}

	public void setNomProduc3(javax.swing.JLabel nomProduc3) {
		this.nomProduc3 = nomProduc3;
	}

	public javax.swing.JLabel getNomProduc4() {
		return nomProduc4;
	}

	public void setNomProduc4(javax.swing.JLabel nomProduc4) {
		this.nomProduc4 = nomProduc4;
	}

	public javax.swing.JLabel getNomProduc5() {
		return nomProduc5;
	}

	public void setNomProduc5(javax.swing.JLabel nomProduc5) {
		this.nomProduc5 = nomProduc5;
	}

	public javax.swing.JLabel getNomProduc6() {
		return nomProduc6;
	}

	public void setNomProduc6(javax.swing.JLabel nomProduc6) {
		this.nomProduc6 = nomProduc6;
	}

	public javax.swing.JLabel getNomProduc7() {
		return nomProduc7;
	}

	public void setNomProduc7(javax.swing.JLabel nomProduc7) {
		this.nomProduc7 = nomProduc7;
	}

	public javax.swing.JLabel getNomProduc8() {
		return nomProduc8;
	}

	public void setNomProduc8(javax.swing.JLabel nomProduc8) {
		this.nomProduc8 = nomProduc8;
	}

	public javax.swing.JLabel getPrecio1() {
		return precio1;
	}

	public void setPrecio1(javax.swing.JLabel precio1) {
		this.precio1 = precio1;
	}

	public javax.swing.JLabel getPrecio2() {
		return precio2;
	}

	public void setPrecio2(javax.swing.JLabel precio2) {
		this.precio2 = precio2;
	}

	public javax.swing.JLabel getPrecio3() {
		return precio3;
	}

	public void setPrecio3(javax.swing.JLabel precio3) {
		this.precio3 = precio3;
	}

	public javax.swing.JLabel getPrecio4() {
		return precio4;
	}

	public void setPrecio4(javax.swing.JLabel precio4) {
		this.precio4 = precio4;
	}

	public javax.swing.JLabel getPrecio5() {
		return precio5;
	}

	public void setPrecio5(javax.swing.JLabel precio5) {
		this.precio5 = precio5;
	}

	public javax.swing.JLabel getPrecio6() {
		return precio6;
	}

	public void setPrecio6(javax.swing.JLabel precio6) {
		this.precio6 = precio6;
	}

	public javax.swing.JLabel getPrecio7() {
		return precio7;
	}

	public void setPrecio7(javax.swing.JLabel precio7) {
		this.precio7 = precio7;
	}

	public javax.swing.JLabel getPrecio8() {
		return precio8;
	}

	public void setPrecio8(javax.swing.JLabel precio8) {
		this.precio8 = precio8;
	}

	public javax.swing.JLabel getTotal1() {
		return total1;
	}

	public void setTotal1(javax.swing.JLabel total1) {
		this.total1 = total1;
	}

	public javax.swing.JLabel getTotal2() {
		return total2;
	}

	public void setTotal2(javax.swing.JLabel total2) {
		this.total2 = total2;
	}

	public javax.swing.JLabel getTotal3() {
		return total3;
	}

	public void setTotal3(javax.swing.JLabel total3) {
		this.total3 = total3;
	}

	public javax.swing.JLabel getTotal4() {
		return total4;
	}

	public void setTotal4(javax.swing.JLabel total4) {
		this.total4 = total4;
	}

	public javax.swing.JLabel getTotal5() {
		return total5;
	}

	public void setTotal5(javax.swing.JLabel total5) {
		this.total5 = total5;
	}

	public javax.swing.JLabel getTotal6() {
		return total6;
	}

	public void setTotal6(javax.swing.JLabel total6) {
		this.total6 = total6;
	}

	public javax.swing.JLabel getTotal7() {
		return total7;
	}

	public void setTotal7(javax.swing.JLabel total7) {
		this.total7 = total7;
	}

	public javax.swing.JLabel getTotal8() {
		return total8;
	}

	public void setTotal8(javax.swing.JLabel total8) {
		this.total8 = total8;
	}

	public int getNumTick() {
		return numTick;
	}

	public void setNumTick(int numTick) {
		this.numTick = numTick;
	}

	public SimpleDateFormat getFormateador() {
		return formateador;
	}

	public void setFormateador(SimpleDateFormat formateador) {
		this.formateador = formateador;
	}

	public Date getFechaDate() {
		return fechaDate;
	}

	public void setFechaDate(Date fechaDate) {
		this.fechaDate = fechaDate;
	}

	public BoletoImpreso getBoletito() {
		return boletito;
	}

	public void setBoletito(BoletoImpreso boletito) {
		this.boletito = boletito;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getCantidad1() {
		return cantidad1;
	}

	public static void setCantidad1(String cantidad1) {
		Ticket.cantidad1 = cantidad1;
	}

	public static String getCantidad2() {
		return cantidad2;
	}

	public static void setCantidad2(String cantidad2) {
		Ticket.cantidad2 = cantidad2;
	}

	public static String getCantidad3() {
		return cantidad3;
	}

	public static void setCantidad3(String cantidad3) {
		Ticket.cantidad3 = cantidad3;
	}

	public static String getCantidad4() {
		return cantidad4;
	}

	public static void setCantidad4(String cantidad4) {
		Ticket.cantidad4 = cantidad4;
	}

	public static String getCantidad5() {
		return cantidad5;
	}

	public static void setCantidad5(String cantidad15) {
		Ticket.cantidad5 = cantidad15;
	}

	public static String getCantidad6() {
		return cantidad6;
	}

	public static void setCantidad6(String cantidad6) {
		Ticket.cantidad6 = cantidad6;
	}

	public static String getCantidad7() {
		return cantidad7;
	}

	public static void setCantidad7(String cantidad7) {
		Ticket.cantidad7 = cantidad7;
	}

	public static String getCantidad8() {
		return cantidad8;
	}

	public static void setCantidad8(String cantidad8) {
		Ticket.cantidad8 = cantidad8;
	}

}
