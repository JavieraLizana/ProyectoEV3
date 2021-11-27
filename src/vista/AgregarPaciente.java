/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.RegistroPaciente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Paciente;

/**
 *
 * @author javie
 */
public class AgregarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form AgregarPaciente
     */
    public AgregarPaciente() {
        initComponents();
        this.jbtn_salir.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxt_fechaDD = new javax.swing.JTextField();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_especie = new javax.swing.JTextField();
        jtxt_raza = new javax.swing.JTextField();
        jtxt_edad = new javax.swing.JTextField();
        jtxt_peso = new javax.swing.JTextField();
        jtxt_procedimiento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxt_fechaYYYY = new javax.swing.JTextField();
        jtxt_fechaMM = new javax.swing.JTextField();
        jcbo_sexo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jbtn_guardar = new javax.swing.JButton();
        jbtn_salir = new javax.swing.JButton();
        jbtn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Paciente");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESAR DATOS DEL PACIENTE");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE PACIENTE");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FECHA ");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ESPECIE");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RAZA");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SEXO");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("PESO");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("EDAD");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PROCEDIMIENTO");

        jtxt_fechaDD.setText("DD");
        jtxt_fechaDD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_fechaDDFocusGained(evt);
            }
        });

        jtxt_nombre.setText("Ingrese nombre del paciente");
        jtxt_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_nombreFocusGained(evt);
            }
        });
        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });

        jtxt_especie.setText("Ingrese especie del paciente");
        jtxt_especie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_especieFocusGained(evt);
            }
        });
        jtxt_especie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_especieActionPerformed(evt);
            }
        });

        jtxt_raza.setText("Ingrese raza del paciente");
        jtxt_raza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_razaFocusGained(evt);
            }
        });
        jtxt_raza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_razaActionPerformed(evt);
            }
        });

        jtxt_edad.setText("Ingresar meses");
        jtxt_edad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_edadFocusGained(evt);
            }
        });

        jtxt_peso.setText("Ingrese peso");
        jtxt_peso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_pesoFocusGained(evt);
            }
        });
        jtxt_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_pesoActionPerformed(evt);
            }
        });

        jtxt_procedimiento.setText("Ingrese tipo de procedimiento");
        jtxt_procedimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_procedimientoFocusGained(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/perro.png"))); // NOI18N

        jtxt_fechaYYYY.setText("YYYY");
        jtxt_fechaYYYY.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_fechaYYYYFocusGained(evt);
            }
        });

        jtxt_fechaMM.setText("MM");
        jtxt_fechaMM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_fechaMMFocusGained(evt);
            }
        });

        jcbo_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...\t", "Hembra\t", "Macho" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxt_procedimiento)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_especie)
                    .addComponent(jtxt_nombre)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxt_fechaDD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxt_fechaMM, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxt_fechaYYYY, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtxt_raza))
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_fechaDD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jtxt_fechaMM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_fechaYYYY, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_especie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbo_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtxt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jbtn_guardar.setBackground(new java.awt.Color(255, 153, 153));
        jbtn_guardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_guardar.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_guardar.setText("GUARDAR");
        jbtn_guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarActionPerformed(evt);
            }
        });

        jbtn_salir.setBackground(new java.awt.Color(255, 153, 153));
        jbtn_salir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_salir.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_salir.setText("SALIR");
        jbtn_salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_salirActionPerformed(evt);
            }
        });

        jbtn_limpiar.setBackground(new java.awt.Color(255, 153, 153));
        jbtn_limpiar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jbtn_limpiar.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_limpiar.setText("LIMPIAR");
        jbtn_limpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jbtn_salirActionPerformed

    private void jbtn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarActionPerformed

        String nombre, especie, raza, procedimiento, dia, mes, año, fechaS, sexo;
        Date fecha = null;
        int peso, edad;
       
                

        nombre = this.jtxt_nombre.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese nombre", "Error de validación", 2);
            this.jtxt_nombre.requestFocus();
            return;

        }

        especie = this.jtxt_especie.getText();
        if (especie.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese especie", "Error de validación", 2);
            this.jtxt_especie.requestFocus();
            return;
        }

        dia = this.jtxt_fechaDD.getText();
        mes = this.jtxt_fechaMM.getText();
        año = this.jtxt_fechaYYYY.getText();

        if (dia.isEmpty() || mes.isEmpty() || año.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha", "Error de validación", 2);
            this.jtxt_fechaDD.requestFocus();
            return;
        }

        fechaS = dia + "/" + mes + "/" + año;
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        try {
            fecha = formato.parse(fechaS);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha con formato dd/mm/yyyy", "Error de validación", 2);
            this.jtxt_fechaDD.requestFocus();
        }

        raza = this.jtxt_raza.getText();
        if (raza.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese raza", "Error de validación", 2);
            this.jtxt_raza.requestFocus();
            return;
        }

        procedimiento = this.jtxt_procedimiento.getText();
        if (procedimiento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese procedimiento", "Error de validación", 2);
            this.jtxt_procedimiento.requestFocus();
            return;
        }

        try {

            edad = Integer.parseInt(this.jtxt_edad.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La edad debe ser númerico", "Error de validación", 2);
            this.jtxt_edad.requestFocus();
            return;
        }

        try {

            peso = Integer.parseInt(this.jtxt_peso.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El peso debe ser númerico", "Error de validación", 2);
            this.jtxt_peso.requestFocus();
            return;
        }
        
        sexo = this.jcbo_sexo.getSelectedItem().toString();
       
   
        Paciente paciente = new Paciente(0, fecha, nombre, especie, raza, sexo, peso, edad, procedimiento);

        RegistroPaciente regPac = new RegistroPaciente();

        if (regPac.agregar(paciente)) {
            JOptionPane.showMessageDialog(this, "Se Agregó paciente con éxito", "Error de validación", 1);

        } else {
            JOptionPane.showMessageDialog(this, "Error al agregar nuevo paciente", "Error de validación", 0);
        }


    }//GEN-LAST:event_jbtn_guardarActionPerformed

    private void jtxt_especieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_especieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_especieActionPerformed

    private void jtxt_razaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_razaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_razaActionPerformed

    private void jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombreActionPerformed

    private void jtxt_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_pesoActionPerformed

    private void jtxt_fechaDDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_fechaDDFocusGained
        this.jtxt_fechaDD.setText("");

    }//GEN-LAST:event_jtxt_fechaDDFocusGained

    private void jtxt_fechaMMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_fechaMMFocusGained
        this.jtxt_fechaMM.setText("");

    }//GEN-LAST:event_jtxt_fechaMMFocusGained

    private void jtxt_fechaYYYYFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_fechaYYYYFocusGained
        this.jtxt_fechaYYYY.setText("");

    }//GEN-LAST:event_jtxt_fechaYYYYFocusGained

    private void jtxt_nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_nombreFocusGained
        this.jtxt_nombre.setText("");

    }//GEN-LAST:event_jtxt_nombreFocusGained

    private void jtxt_especieFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_especieFocusGained
        this.jtxt_especie.setText("");

    }//GEN-LAST:event_jtxt_especieFocusGained

    private void jtxt_razaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_razaFocusGained
        this.jtxt_raza.setText("");

    }//GEN-LAST:event_jtxt_razaFocusGained

    private void jtxt_pesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_pesoFocusGained
        this.jtxt_peso.setText("");

    }//GEN-LAST:event_jtxt_pesoFocusGained

    private void jtxt_edadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_edadFocusGained
        this.jtxt_edad.setText("");

    }//GEN-LAST:event_jtxt_edadFocusGained

    private void jtxt_procedimientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_procedimientoFocusGained
        this.jtxt_procedimiento.setText("");

    }//GEN-LAST:event_jtxt_procedimientoFocusGained

    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed

        this.jtxt_fechaDD.setText("");
        this.jtxt_fechaMM.setText("");
        this.jtxt_fechaYYYY.setText("");
        this.jtxt_nombre.setText("");
        this.jtxt_especie.setText("");
        this.jtxt_raza.setText("");
        this.jtxt_peso.setText("");
        this.jtxt_edad.setText("");
        this.jtxt_procedimiento.setText("");
        this.jbtn_salir.requestFocus();

    }//GEN-LAST:event_jbtn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn_guardar;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JButton jbtn_salir;
    private javax.swing.JComboBox<String> jcbo_sexo;
    private javax.swing.JTextField jtxt_edad;
    private javax.swing.JTextField jtxt_especie;
    private javax.swing.JTextField jtxt_fechaDD;
    private javax.swing.JTextField jtxt_fechaMM;
    private javax.swing.JTextField jtxt_fechaYYYY;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_peso;
    private javax.swing.JTextField jtxt_procedimiento;
    private javax.swing.JTextField jtxt_raza;
    // End of variables declaration//GEN-END:variables
}
