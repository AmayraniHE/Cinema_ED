package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Cartelera extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnPeli1;
    private javax.swing.JButton btnPeli2;
    private javax.swing.JButton btnPeli3;
    private javax.swing.JButton btnPeli4;
    private javax.swing.JButton btnPeli5;
    private javax.swing.JButton btnPeli6;
    private javax.swing.JLabel etiquetaCartelera;
    // End of variables declaration   
    
    InterfazAplicaciónTaquilla ventanaPrincipal;
    
    public Cartelera(InterfazAplicaciónTaquilla ventanaPrincipal) 
    {
    	this.ventanaPrincipal=ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    private void initComponents() 
    {

        etiquetaCartelera = new javax.swing.JLabel();
        btnPeli1 = new javax.swing.JButton();
        btnPeli4 = new javax.swing.JButton();
        btnPeli2 = new javax.swing.JButton();
        btnPeli5 = new javax.swing.JButton();
        btnPeli3 = new javax.swing.JButton();
        btnPeli6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(153, 0, 76));

        etiquetaCartelera.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        etiquetaCartelera.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCartelera.setText("Cartelera");

        ImageIcon imagenOriginal1 = new ImageIcon("fotos/dragon.png");
        Image imagenAjustada1 = imagenOriginal1.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        btnPeli1.setIcon(new ImageIcon (imagenAjustada1));
        btnPeli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeli1ActionPerformed(evt);
            }
        });
        
        ImageIcon imagenOriginal2 = new ImageIcon("fotos/aladin.png");
        Image imagenAjustada2 = imagenOriginal2.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        btnPeli2.setIcon(new ImageIcon (imagenAjustada2)); // NOI18N
        btnPeli2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeli2ActionPerformed(evt);
            }
        });
        
        ImageIcon imagenOriginal3 = new ImageIcon("fotos/pixeles.png");
        Image imagenAjustada3 = imagenOriginal3.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        btnPeli3.setIcon(new ImageIcon (imagenAjustada3)); // NOI18N
        btnPeli3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeli3ActionPerformed(evt);
            }
        });
        
        ImageIcon imagenOriginal4 = new ImageIcon("fotos/pool.png");
        Image imagenAjustada4 = imagenOriginal4.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        btnPeli4.setIcon(new ImageIcon (imagenAjustada4)); // NOI18N
        btnPeli4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeli4ActionPerformed(evt);
            }
        });
        
        ImageIcon imagenOriginal5 = new ImageIcon("fotos/frida.png");
        Image imagenAjustada5 = imagenOriginal5.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        btnPeli5.setIcon(new ImageIcon (imagenAjustada5)); // NOI18N
        btnPeli5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeli5ActionPerformed(evt);
            }
        });

        ImageIcon imagenOriginal6 = new ImageIcon("fotos/joker.png");
        Image imagenAjustada6 = imagenOriginal6.getImage().getScaledInstance(120,160, Image.SCALE_SMOOTH);
        btnPeli6.setIcon(new ImageIcon (imagenAjustada6)); // NOI18N
        btnPeli6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeli6ActionPerformed(evt);
            }
        });
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPeli4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeli1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPeli5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeli2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPeli6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeli3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaCartelera)
                .addGap(296, 296, 296))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaCartelera)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPeli1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnPeli4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPeli2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnPeli5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPeli3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnPeli6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void btnPeli1ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        Boletos b = new Boletos("HTTYD","fotos/dragon.png");
        ventanaPrincipal.setBoletos(b);
        ventanaPrincipal.mostrarBoletos();
    }                                        

    private void btnPeli2ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	Boletos b = new Boletos("Aladín","fotos/aladin.png");
    	ventanaPrincipal.setBoletos(b);
        ventanaPrincipal.mostrarBoletos();
    }   
    
    private void btnPeli3ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	Boletos b = new Boletos("Pixeles","fotos/pixeles.png");
    	ventanaPrincipal.setBoletos(b);
        ventanaPrincipal.mostrarBoletos();
    }   

    private void btnPeli4ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	Boletos b = new Boletos("Deadpool 2","fotos/pool.png");
    	ventanaPrincipal.setBoletos(b);
        ventanaPrincipal.mostrarBoletos();
    }                                        
    
    private void btnPeli5ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	Boletos b = new Boletos("No Manches Frida 2","fotos/frida.png");
    	ventanaPrincipal.setBoletos(b);
        ventanaPrincipal.mostrarBoletos();
    }                                        
                                     

    private void btnPeli6ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	Boletos b = new Boletos("Joker","fotos/joker.png");
    	ventanaPrincipal.setBoletos(b);
        ventanaPrincipal.mostrarBoletos();
    }                                       

}

