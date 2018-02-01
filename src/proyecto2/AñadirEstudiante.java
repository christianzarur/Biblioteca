/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class AñadirEstudiante extends javax.swing.JDialog {

    private Acciones app;
    Integer Carnet=0;
    String Nombre;
    String Apellido;
    
    public AñadirEstudiante(java.awt.Frame parent, boolean modal, Acciones app) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.app = app;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonRegresarAñadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AñadirCarnet = new javax.swing.JTextField();
        AñadirNombre = new javax.swing.JTextField();
        AñadirApellido = new javax.swing.JTextField();
        BotonAñadirEst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        BotonRegresarAñadir.setBackground(new java.awt.Color(255, 0, 0));
        BotonRegresarAñadir.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegresarAñadir.setText("Regresar");
        BotonRegresarAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarAñadirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Por favor ingrese los siguientes datos del estudiante");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("# de carnet:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Apellido:");

        AñadirCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirCarnetActionPerformed(evt);
            }
        });

        AñadirNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirNombreActionPerformed(evt);
            }
        });

        AñadirApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirApellidoActionPerformed(evt);
            }
        });

        BotonAñadirEst.setText("Añadir");
        BotonAñadirEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirEstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonRegresarAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(BotonAñadirEst, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AñadirNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AñadirApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AñadirCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñadirCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AñadirNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AñadirApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegresarAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAñadirEst, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarAñadirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarAñadirActionPerformed

    private void AñadirCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirCarnetActionPerformed
        
    }//GEN-LAST:event_AñadirCarnetActionPerformed

    private void AñadirApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirApellidoActionPerformed
        
    }//GEN-LAST:event_AñadirApellidoActionPerformed

    private void BotonAñadirEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirEstActionPerformed
        try{
            Carnet = Integer.parseInt(AñadirCarnet.getText());
            Nombre=AñadirNombre.getText();
            Apellido=AñadirApellido.getText();
        
        if(Carnet>0){
            if(!Nombre.isEmpty()){
                if(!Apellido.isEmpty()){  
                    app.agregarEstudiante(Carnet,Nombre,Apellido);
                    app.escribirData();
                    JOptionPane.showMessageDialog(null,"El carnet del estudiante es: "+Carnet+"\nEl nombre del estudiante es: "+Nombre+"\nEl apellido del estudiante es: "+Apellido,"ESTUDIANTE AÑADIDO", JOptionPane.PLAIN_MESSAGE);
                    this.setVisible(false); 
                }
                else{
                    JOptionPane.showMessageDialog(null,"Por favor introduzca el apellido","AVISO", JOptionPane.PLAIN_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Por favor introduzca el nombre","AVISO", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero de carnet ingresado es invalido","AVISO", JOptionPane.PLAIN_MESSAGE);
        }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Datos invalidos","AVISO", JOptionPane.PLAIN_MESSAGE);

        }
        
        
    }//GEN-LAST:event_BotonAñadirEstActionPerformed

    private void AñadirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirNombreActionPerformed
        
     }//GEN-LAST:event_AñadirNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField AñadirApellido;
    public static javax.swing.JTextField AñadirCarnet;
    public static javax.swing.JTextField AñadirNombre;
    private javax.swing.JButton BotonAñadirEst;
    private javax.swing.JButton BotonRegresarAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
