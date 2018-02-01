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
public class BuscarEstudiante extends javax.swing.JDialog {

    private Acciones app;


    
    public BuscarEstudiante(java.awt.Frame parent, boolean modal,Acciones app) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.app = app;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonRegresarBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonBuscarEst = new javax.swing.JButton();
        BuscarCarnet = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        BotonRegresarBuscar.setBackground(new java.awt.Color(255, 0, 0));
        BotonRegresarBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegresarBuscar.setText("Regresar");
        BotonRegresarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" Ingrese el Numero de carnet del estudiante que desea buscar ");

        BotonBuscarEst.setText("Buscar");
        BotonBuscarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarEstActionPerformed(evt);
            }
        });

        BuscarCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCarnetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(BotonRegresarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(BotonBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(BuscarCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegresarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarBuscarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarBuscarActionPerformed

    private void BotonBuscarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarEstActionPerformed
        Integer Carnet = Integer.parseInt(BuscarCarnet.getText());
        if(app.Comprobar(Carnet))
        JOptionPane.showMessageDialog(null,"El carnet del estudiante es:"+app.Buscar(Carnet).getCarnet()+"\nEl nombre del estudiante es: "+app.Buscar(Carnet).getNombre()+"\nEl apellido del estudiante es: "+app.Buscar(Carnet).getApellido(),"ESTUDIANTE ENCONTRADO", JOptionPane.PLAIN_MESSAGE);
        
        else 
        JOptionPane.showMessageDialog(null,"El numero de carnet ingresado no existe","AVISO", JOptionPane.PLAIN_MESSAGE);
        
        
        this.setVisible(false);
    }//GEN-LAST:event_BotonBuscarEstActionPerformed

    private void BuscarCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCarnetActionPerformed

    }//GEN-LAST:event_BuscarCarnetActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarEst;
    private javax.swing.JButton BotonRegresarBuscar;
    public static javax.swing.JTextField BuscarCarnet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
