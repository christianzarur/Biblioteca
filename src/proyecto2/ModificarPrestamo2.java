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
public class ModificarPrestamo2 extends javax.swing.JDialog {

    private Acciones app;
    Integer Clave;

    public ModificarPrestamo2(java.awt.Frame parent, boolean modal, Acciones app, Integer Clave) {
        super(parent, modal);
        initComponents();
        this.app = app;
        this.setLocationRelativeTo(null);
        this.Clave=Clave;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AñadirTituloLibro = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JButton();
        AñadirCotaLibro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BotonAñadirPrestamo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AñadirFechaPrestamo = new javax.swing.JTextField();
        AñadirFechaDevolucion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        AñadirTituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirTituloLibroActionPerformed(evt);
            }
        });

        BotonRegresar.setBackground(new java.awt.Color(255, 0, 0));
        BotonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        AñadirCotaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirCotaLibroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Por favor Ingrese los siguientes datos del prestamo");

        BotonAñadirPrestamo.setText("Modificar");
        BotonAñadirPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirPrestamoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Fecha del préstamo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Fecha de devolucion:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Título del libro prestado:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Cota del libro prestado:");

        AñadirFechaPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirFechaPrestamoActionPerformed(evt);
            }
        });

        AñadirFechaDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirFechaDevolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AñadirFechaPrestamo)
                                    .addComponent(AñadirFechaDevolucion)
                                    .addComponent(AñadirTituloLibro)
                                    .addComponent(AñadirCotaLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(BotonAñadirPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñadirFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñadirFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñadirTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(AñadirCotaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAñadirPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirTituloLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AñadirTituloLibroActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void AñadirCotaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirCotaLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AñadirCotaLibroActionPerformed

    private void BotonAñadirPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirPrestamoActionPerformed
        try{
        String FechaPrestamo= AñadirFechaPrestamo.getText();
        String FechaDevolucion= AñadirFechaDevolucion.getText();
        String TituloLibro = AñadirTituloLibro.getText();
        String CotaLibro = AñadirCotaLibro.getText();
            if(!FechaPrestamo.isEmpty()){
                if(!FechaDevolucion.isEmpty()){
                    if(!TituloLibro.isEmpty()){
                        if(!CotaLibro.isEmpty()){
                            Integer Carnet=app.BuscarPres(Clave).getCarnet();
                            app.Buscar(Carnet).setFechaPrestamo(FechaPrestamo);
                            app.Buscar(Carnet).setFechaDevolucion(FechaDevolucion);
                            app.Buscar(Carnet).setTituloLibro(TituloLibro);
                            app.Buscar(Carnet).setCotaLibro(CotaLibro);
                            JOptionPane.showMessageDialog(null,"El número de prestamo es: "+Clave+"\nLa fecha de prestamo es: "+FechaPrestamo+"\nLa fecha de devolucion es: "+FechaDevolucion+"\nEl título del libro es: "+TituloLibro+"\nLa cota del libro es: "+CotaLibro,"PRESTAMO MODIFICADO", JOptionPane.PLAIN_MESSAGE);
                            this.setVisible(false); 
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Por favor introduzca la cota del libro","AVISO", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Por favor introduzca el titulo del libro","AVISO", JOptionPane.PLAIN_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Por favor introduzca la fecha de devolución","AVISO", JOptionPane.PLAIN_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Por favor introduzca la fecha del prestamo","AVISO", JOptionPane.PLAIN_MESSAGE);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Datos invalidos","AVISO", JOptionPane.PLAIN_MESSAGE);

        }

    }//GEN-LAST:event_BotonAñadirPrestamoActionPerformed

    private void AñadirFechaPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirFechaPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AñadirFechaPrestamoActionPerformed

    private void AñadirFechaDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirFechaDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AñadirFechaDevolucionActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AñadirCotaLibro;
    private javax.swing.JTextField AñadirFechaDevolucion;
    private javax.swing.JTextField AñadirFechaPrestamo;
    private javax.swing.JTextField AñadirTituloLibro;
    private javax.swing.JButton BotonAñadirPrestamo;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
