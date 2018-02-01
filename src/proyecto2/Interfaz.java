/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author User
 */
public class Interfaz extends javax.swing.JFrame {
    private Acciones app;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        app = new Acciones();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/UNIVERSIDAD-METROPOLITANA-DE-VENEZUELA.jpg"));
        return retValue;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        BotonSalirEst = new javax.swing.JButton();
        BotonAñadirEst = new javax.swing.JButton();
        BotonBuscarEst = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        BotonEliminarEst = new javax.swing.JButton();
        BotonModificarEst = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonCrearPres = new javax.swing.JButton();
        BotonModificarPres = new javax.swing.JButton();
        BotinConsultarPres = new javax.swing.JButton();
        BotonEntregarPrestamo = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalirEst.setBackground(new java.awt.Color(255, 0, 0));
        BotonSalirEst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonSalirEst.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalirEst.setText("Salir");
        BotonSalirEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirEstActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalirEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 10, 90, 40));

        BotonAñadirEst.setText("Añadir");
        BotonAñadirEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirEstActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAñadirEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 100, 40));

        BotonBuscarEst.setText("Buscar");
        BotonBuscarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarEstActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBuscarEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 100, 40));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image bibio.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 120));

        BotonEliminarEst.setText("Eliminar");
        BotonEliminarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarEstActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminarEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 100, 40));

        BotonModificarEst.setText("Modificar");
        BotonModificarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarEstActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificarEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para los estudiantes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Para los prestamos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 30));

        BotonCrearPres.setText("Crear");
        BotonCrearPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearPresActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCrearPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 100, 40));

        BotonModificarPres.setText("Modificar");
        BotonModificarPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarPresActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificarPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 100, 40));

        BotinConsultarPres.setText("Consultar");
        BotinConsultarPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotinConsultarPresActionPerformed(evt);
            }
        });
        getContentPane().add(BotinConsultarPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 100, 40));

        BotonEntregarPrestamo.setText("Entregar");
        BotonEntregarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEntregarPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEntregarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 100, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo proyecto2.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirEstActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirEstActionPerformed

    private void BotonBuscarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarEstActionPerformed
        BuscarEstudiante dialog = new BuscarEstudiante(new javax.swing.JFrame(), true, app);
        dialog.setVisible(true);
    }//GEN-LAST:event_BotonBuscarEstActionPerformed

    private void BotonAñadirEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirEstActionPerformed
        AñadirEstudiante dialog = new AñadirEstudiante(new javax.swing.JFrame(), true, app);
        dialog.setVisible(true);
    }//GEN-LAST:event_BotonAñadirEstActionPerformed

    private void BotonEliminarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarEstActionPerformed
        EliminarEstudiante dialog = new EliminarEstudiante(new javax.swing.JFrame(), true, app);
        dialog.setVisible(true);
    }//GEN-LAST:event_BotonEliminarEstActionPerformed

    private void BotonModificarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarEstActionPerformed
        ModificarEstudiante dialog = new ModificarEstudiante(new javax.swing.JFrame(), true, app);
        dialog.setVisible(true);

    }//GEN-LAST:event_BotonModificarEstActionPerformed

    private void BotonCrearPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearPresActionPerformed
        CrearPrestamoBusquedaEst dialog = new CrearPrestamoBusquedaEst(new javax.swing.JFrame(), true, app);
        dialog.setVisible(true);
    }//GEN-LAST:event_BotonCrearPresActionPerformed

    private void BotonModificarPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarPresActionPerformed
        ModificarPrestamo dialog = new ModificarPrestamo(new javax.swing.JFrame(), true, app);
        dialog.setVisible(true);
    }//GEN-LAST:event_BotonModificarPresActionPerformed

    private void BotinConsultarPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotinConsultarPresActionPerformed
        ConsultarPrestamo dialog = new ConsultarPrestamo(new javax.swing.JFrame(), true, app);
        dialog.setVisible(true);
    }//GEN-LAST:event_BotinConsultarPresActionPerformed

    private void BotonEntregarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEntregarPrestamoActionPerformed
        Entrega dialog = new Entrega(new javax.swing.JFrame(), true, app);
        dialog.setVisible(true);

    }//GEN-LAST:event_BotonEntregarPrestamoActionPerformed


    
    
 
    
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotinConsultarPres;
    private javax.swing.JButton BotonAñadirEst;
    private javax.swing.JButton BotonBuscarEst;
    private javax.swing.JButton BotonCrearPres;
    private javax.swing.JButton BotonEliminarEst;
    private javax.swing.JButton BotonEntregarPrestamo;
    private javax.swing.JButton BotonModificarEst;
    private javax.swing.JButton BotonModificarPres;
    private javax.swing.JButton BotonSalirEst;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
