
package vista;

/**
 *
 * @author javiera y Maximiliano
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jmi_agregarDueño = new javax.swing.JMenuItem();
        jmi_actDueño = new javax.swing.JMenuItem();
        jmi_eliminarDueño = new javax.swing.JMenuItem();
        jmi_listarDueño = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jmi_agregarPaciente = new javax.swing.JMenuItem();
        jmi_actPaciente = new javax.swing.JMenuItem();
        jmi_eliminarPac = new javax.swing.JMenuItem();
        jmi_listarPaciente = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jmi_agregarpago = new javax.swing.JMenuItem();
        jmi_actualizarPago = new javax.swing.JMenuItem();
        jmi_eliminarPago = new javax.swing.JMenuItem();
        jmi_listarPago = new javax.swing.JMenuItem();
        jmi = new javax.swing.JMenu();
        jmi_salir = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem3.setText("jMenuItem3");

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - Clínica Veterinaria J&M");

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenidos!");

        jLabel3.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CLINICA VETERINARIA J&M");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/gatito.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/pata.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/huella.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/huella.png"))); // NOI18N

        jLabel7.setText("Términos y condiciones | todos los derechos reservados j&M 2021");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(jLabel7)
                .addGap(39, 39, 39))
        );

        jMenu2.setText("Dueño");

        jMenu6.setText("Opciones");

        jmi_agregarDueño.setText("Agregar");
        jmi_agregarDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarDueñoActionPerformed(evt);
            }
        });
        jMenu6.add(jmi_agregarDueño);

        jmi_actDueño.setText("Actualizar");
        jmi_actDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actDueñoActionPerformed(evt);
            }
        });
        jMenu6.add(jmi_actDueño);

        jmi_eliminarDueño.setText("Eliminar");
        jmi_eliminarDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarDueñoActionPerformed(evt);
            }
        });
        jMenu6.add(jmi_eliminarDueño);

        jMenu2.add(jMenu6);

        jmi_listarDueño.setText("Buscar");
        jmi_listarDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarDueñoActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_listarDueño);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Paciente");

        jMenu5.setText("Opciones");

        jmi_agregarPaciente.setText("Agregar");
        jmi_agregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarPacienteActionPerformed(evt);
            }
        });
        jMenu5.add(jmi_agregarPaciente);

        jmi_actPaciente.setText("Actualizar");
        jmi_actPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actPacienteActionPerformed(evt);
            }
        });
        jMenu5.add(jmi_actPaciente);

        jmi_eliminarPac.setText("Eliminar");
        jmi_eliminarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarPacActionPerformed(evt);
            }
        });
        jMenu5.add(jmi_eliminarPac);

        jMenu1.add(jMenu5);

        jmi_listarPaciente.setText("Buscar");
        jmi_listarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_listarPaciente);

        jMenuBar1.add(jMenu1);

        jMenu9.setText("Pago");

        jMenu10.setText("Opciones");

        jmi_agregarpago.setText("Agregar");
        jmi_agregarpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarpagoActionPerformed(evt);
            }
        });
        jMenu10.add(jmi_agregarpago);

        jmi_actualizarPago.setText("Actualizar");
        jmi_actualizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actualizarPagoActionPerformed(evt);
            }
        });
        jMenu10.add(jmi_actualizarPago);

        jmi_eliminarPago.setText("Eliminar");
        jmi_eliminarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarPagoActionPerformed(evt);
            }
        });
        jMenu10.add(jmi_eliminarPago);

        jMenu9.add(jMenu10);

        jmi_listarPago.setText("Buscar");
        jmi_listarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarPagoActionPerformed(evt);
            }
        });
        jMenu9.add(jmi_listarPago);

        jMenuBar1.add(jMenu9);

        jmi.setText("Salir");

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jmi.add(jmi_salir);

        jMenuBar1.add(jmi);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_agregarDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarDueñoActionPerformed
        new AgregarDueño().setVisible(true);
    }//GEN-LAST:event_jmi_agregarDueñoActionPerformed

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jmi_salirActionPerformed

    private void jmi_listarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarPacienteActionPerformed
        new ListarPaciente().setVisible(true);

    }//GEN-LAST:event_jmi_listarPacienteActionPerformed

    private void jmi_agregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarPacienteActionPerformed
        new AgregarPaciente().setVisible(true);
    }//GEN-LAST:event_jmi_agregarPacienteActionPerformed

    private void jmi_actualizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actualizarPagoActionPerformed
        new ActualizarPago().setVisible(true);
        
    }//GEN-LAST:event_jmi_actualizarPagoActionPerformed

    private void jmi_actPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actPacienteActionPerformed
        new ActualizarPaciente().setVisible(true);
    }//GEN-LAST:event_jmi_actPacienteActionPerformed

    private void jmi_listarDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarDueñoActionPerformed
        new ListarDueño().setVisible(true);
        
    }//GEN-LAST:event_jmi_listarDueñoActionPerformed

    private void jmi_listarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarPagoActionPerformed
        new ListarPago().setVisible(true);
    }//GEN-LAST:event_jmi_listarPagoActionPerformed

    private void jmi_agregarpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarpagoActionPerformed
        new AgregarPago().setVisible(true);
    }//GEN-LAST:event_jmi_agregarpagoActionPerformed

    private void jmi_actDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actDueñoActionPerformed
       new ActualizarDueño().setVisible(true);
    }//GEN-LAST:event_jmi_actDueñoActionPerformed

    private void jmi_eliminarDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarDueñoActionPerformed
        new EliminarDueño().setVisible(true);
    }//GEN-LAST:event_jmi_eliminarDueñoActionPerformed

    private void jmi_eliminarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarPacActionPerformed
        new EliminarPaciente().setVisible(true);
    }//GEN-LAST:event_jmi_eliminarPacActionPerformed

    private void jmi_eliminarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarPagoActionPerformed
        new EliminarPago().setVisible(true);
    }//GEN-LAST:event_jmi_eliminarPagoActionPerformed

    /**
     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmi;
    private javax.swing.JMenuItem jmi_actDueño;
    private javax.swing.JMenuItem jmi_actPaciente;
    private javax.swing.JMenuItem jmi_actualizarPago;
    private javax.swing.JMenuItem jmi_agregarDueño;
    private javax.swing.JMenuItem jmi_agregarPaciente;
    private javax.swing.JMenuItem jmi_agregarpago;
    private javax.swing.JMenuItem jmi_eliminarDueño;
    private javax.swing.JMenuItem jmi_eliminarPac;
    private javax.swing.JMenuItem jmi_eliminarPago;
    private javax.swing.JMenuItem jmi_listarDueño;
    private javax.swing.JMenuItem jmi_listarPaciente;
    private javax.swing.JMenuItem jmi_listarPago;
    private javax.swing.JMenuItem jmi_salir;
    // End of variables declaration//GEN-END:variables
}
