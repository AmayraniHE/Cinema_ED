package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnBoletos;
    private javax.swing.JButton btnDulces;
    private javax.swing.JLabel etiquetaBoletos;
    private javax.swing.JLabel etiquetaCine;
    private javax.swing.JLabel etiquetaDulces;
    private javax.swing.JLabel etiquetaTaquilla;
    // End of variables declaration    
    
    private InterfazAplicaciónTaquilla ventanaPrincipal;
    
    
    //MÉTODO CONSTRUCTOR
    public Menu(InterfazAplicaciónTaquilla ventanaPrincipal) 
    {
    	this.ventanaPrincipal=ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    //COMPONENTES
    private void initComponents() 
    {
    	//CREACIÓN DE MEMORIA DE LAS VARIABLES
        btnBoletos = new javax.swing.JButton();
        etiquetaCine = new javax.swing.JLabel();
        btnDulces = new javax.swing.JButton();
        etiquetaBoletos = new javax.swing.JLabel();
        etiquetaDulces = new javax.swing.JLabel();
        etiquetaTaquilla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(0, 0, 0));//FONDO COLOR NEGRO
        
        
        //TITULO
        etiquetaCine.setFont(new java.awt.Font("Segoe UI", 0, 36));
        etiquetaCine.setForeground(new java.awt.Color(255, 255, 51));
        etiquetaCine.setText("Cine Acatlán");
        
        
        //BOTÓN BOLETOS
        ImageIcon imagenOriginalBoletos = new ImageIcon("imagenes/boletos.png");
        Image imagenAjustadaBoletos = imagenOriginalBoletos.getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);
        btnBoletos.setBackground(new java.awt.Color(153, 0, 76));
        btnBoletos.setIcon(new ImageIcon (imagenAjustadaBoletos));
        btnBoletos.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                btnBoletosActionPerformed(evt);
            }
        });
        

        //BOTÓN DULCES
        ImageIcon imagenOriginalDulces = new ImageIcon("imagenes/dulces.png");
        Image imagenAjustadaDulces = imagenOriginalDulces.getImage().getScaledInstance(120,130, Image.SCALE_SMOOTH);
        btnDulces.setBackground(new java.awt.Color(153, 0, 76));
        btnDulces.setIcon(new ImageIcon (imagenAjustadaDulces));
        btnDulces.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                btnDulcesActionPerformed(evt);
            }
        });

        etiquetaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaBoletos.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaBoletos.setText("Boletos");

        etiquetaDulces.setFont(new java.awt.Font("Segoe UI", 0, 18));
        etiquetaDulces.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDulces.setText("Dulcería");

        etiquetaTaquilla.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTaquilla.setText("Taquilla Automatizada");

        
        //CÓDIGO QUE PONE LOS COMPONENTES EN SU LUGAR
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(etiquetaBoletos)
                        .addGap(45, 45, 45))
                    .addComponent(btnBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnDulces, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaDulces)
                        .addGap(188, 188, 188))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(etiquetaCine))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(etiquetaTaquilla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(etiquetaCine)
                .addGap(37, 37, 37)
                .addComponent(etiquetaTaquilla)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDulces, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaBoletos)
                    .addComponent(etiquetaDulces))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }                     

    
    //ACCIÓN DE LOS BOTONES
    private void btnBoletosActionPerformed(java.awt.event.ActionEvent evt) 
    {                                           
    	ventanaPrincipal.mostrarCartelera();
    }                                          

    private void btnDulcesActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	ventanaPrincipal.mostrarDulceria();
    }                                         

}

