/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_PRESENTACION;

/**
 *
 * @author erick
 */
public class Modelos extends javax.swing.JFrame {

    /**
     * Creates new form Modelos
     */
    public Modelos() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelRegistro = new javax.swing.JPanel();
        jLabelRegistar = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        txtMod = new javax.swing.JTextField();
        txtNomM = new javax.swing.JTextField();
        jButtonLimpiarR = new javax.swing.JButton();
        jButtonRegistar = new javax.swing.JButton();
        jPanelConsulta = new javax.swing.JPanel();
        jLabelRegistar1 = new javax.swing.JLabel();
        jLCodigo1 = new javax.swing.JLabel();
        jLCurso = new javax.swing.JLabel();
        txtMod1 = new javax.swing.JTextField();
        txtNomM1 = new javax.swing.JTextField();
        jButtonLimpiarC = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTel = new javax.swing.JTable();
        jLabelNotaEditar = new javax.swing.JLabel();
        jPanelEditar = new javax.swing.JPanel();
        jLabelRegistar3 = new javax.swing.JLabel();
        jLCodigo3 = new javax.swing.JLabel();
        jLNombre3 = new javax.swing.JLabel();
        txtMod2 = new javax.swing.JTextField();
        txtNomM2 = new javax.swing.JTextField();
        jButtonLimpiarE = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Gestion Programa Academico");

        jPanelRegistro.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Programa Academico");
        jPanelRegistro.add(jLabelRegistar);
        jLabelRegistar.setBounds(0, 10, 580, 40);

        jLCodigo.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo.setText("idModelos");
        jPanelRegistro.add(jLCodigo);
        jLCodigo.setBounds(50, 70, 200, 30);

        jLNombre.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre.setText("Nombre de Modelos");
        jPanelRegistro.add(jLNombre);
        jLNombre.setBounds(50, 110, 200, 30);

        txtMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModActionPerformed(evt);
            }
        });
        jPanelRegistro.add(txtMod);
        txtMod.setBounds(260, 70, 250, 30);
        jPanelRegistro.add(txtNomM);
        txtNomM.setBounds(260, 110, 250, 30);

        jButtonLimpiarR.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarR.setText("LIMPIAR");
        jButtonLimpiarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarRActionPerformed(evt);
            }
        });
        jPanelRegistro.add(jButtonLimpiarR);
        jButtonLimpiarR.setBounds(290, 340, 100, 35);

        jButtonRegistar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonRegistar.setText("REGISTAR");
        jButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarActionPerformed(evt);
            }
        });
        jPanelRegistro.add(jButtonRegistar);
        jButtonRegistar.setBounds(150, 340, 100, 35);

        jTabbedPane1.addTab("Registar", jPanelRegistro);

        jPanelConsulta.setLayout(null);

        jLabelRegistar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar1.setText("Consulta Programas Academicos");
        jPanelConsulta.add(jLabelRegistar1);
        jLabelRegistar1.setBounds(0, 10, 580, 40);

        jLCodigo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo1.setText("idModelos");
        jPanelConsulta.add(jLCodigo1);
        jLCodigo1.setBounds(20, 70, 180, 30);

        jLCurso.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCurso.setText("Nombre de Modelos");
        jPanelConsulta.add(jLCurso);
        jLCurso.setBounds(20, 110, 180, 30);
        jPanelConsulta.add(txtMod1);
        txtMod1.setBounds(200, 70, 200, 30);
        jPanelConsulta.add(txtNomM1);
        txtNomM1.setBounds(200, 110, 200, 30);

        jButtonLimpiarC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarC.setText("LIMPIAR");
        jButtonLimpiarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonLimpiarC);
        jButtonLimpiarC.setBounds(420, 180, 140, 35);

        jButtonConsultar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonConsultar);
        jButtonConsultar.setBounds(420, 100, 140, 35);

        jButtonEditar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEditar.setText("EDITAR*");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonEditar);
        jButtonEditar.setBounds(420, 140, 140, 35);

        TablaTel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idModelos", "Nombre de Modelos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaTel);

        jPanelConsulta.add(jScrollPane1);
        jScrollPane1.setBounds(20, 270, 540, 140);

        jLabelNotaEditar.setText("* Debe seleccionar solamente una fila dentro de la tabla");
        jPanelConsulta.add(jLabelNotaEditar);
        jLabelNotaEditar.setBounds(20, 392, 540, 14);

        jTabbedPane1.addTab("Consultar", jPanelConsulta);

        jPanelEditar.setLayout(null);

        jLabelRegistar3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar3.setText("Edicion Programa Academico");
        jPanelEditar.add(jLabelRegistar3);
        jLabelRegistar3.setBounds(0, 10, 580, 40);

        jLCodigo3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo3.setText("idModelo");
        jPanelEditar.add(jLCodigo3);
        jLCodigo3.setBounds(50, 70, 200, 30);

        jLNombre3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre3.setText("Nombre de Modelos");
        jPanelEditar.add(jLNombre3);
        jLNombre3.setBounds(50, 110, 200, 30);

        txtMod2.setEnabled(false);
        jPanelEditar.add(txtMod2);
        txtMod2.setBounds(260, 70, 250, 30);
        jPanelEditar.add(txtNomM2);
        txtNomM2.setBounds(260, 110, 250, 30);

        jButtonLimpiarE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarE.setText("LIMPIAR");
        jButtonLimpiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarEActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonLimpiarE);
        jButtonLimpiarE.setBounds(340, 350, 130, 35);

        jButtonEliminar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonEliminar);
        jButtonEliminar.setBounds(200, 350, 130, 35);

        jButtonActualizar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonActualizar);
        jButtonActualizar.setBounds(60, 350, 130, 35);

        jTabbedPane1.addTab("Editar", jPanelEditar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModActionPerformed

    private void jButtonLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarRActionPerformed

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonRegistarActionPerformed()">
        String registro;
        registro = controladorPrograma.insertarPrograma(
            txtidMarca.getText(),
            txtNomM.getText(),
            txtMod.getText(),
            txtMar.getText(),
            txtMac.getText());

        if (registro.equals("OK")) {
            txtMod1.setText(txtMod.getText());
            jButtonConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(this, registro);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jButtonLimpiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCActionPerformed
        limpiarCamposConsulta();
    }//GEN-LAST:event_jButtonLimpiarCActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonConsultarActionPerformed()">
        Object programas[][] = controladorPrograma.consultarProgramas(
            txtMod1.getText(),
            txtNomM1.getText(),

            TableModel myModel = new javax.swing.table.DefaultTableModel(
                programas,
                new String[]{"idTelefono", "IMEI", "modelo", "marca","MAC_Adress"}
            )
            {
                boolean[] canEdit = new boolean[]{false, false, false, false,false};

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };

            TablaTel.setModel(myModel);
            TablaTel.setRowSorter(new TableRowSorter(myModel));
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEditarActionPerformed()">
        int seleccionado = TablaTel.getSelectedRow();
        if (seleccionado >= 0) {
            String programa[] = controladorPrograma.seleccionarPrograma(seleccionado);
            jTabbedPane1.setSelectedIndex(2);
            txtMod2.setText(programa[0]);
            txtNomM2.setText(programa[1]);
            txtMod2.setText(programa[2]);
            txtMar2.setText(programa[3]);
            txtMac2.setText(programa[4]);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarEActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonLimpiarEActionPerformed()">
        txtNomM2.setText("");
        txtMod2.setText("");
        txtMar2.setText("");
        txtMac2.setText("");
        //</editor-fold>
    }//GEN-LAST:event_jButtonLimpiarEActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEliminarActionPerformed()">
        controladorPrograma.eliminarPrograma();
        limpiarCamposConsulta();
        jButtonConsultar.doClick();
        jTabbedPane1.setSelectedIndex(1);
        //</editor-fold>
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonActualizarActionPerformed()">
        String actualizacion;
        actualizacion = controladorPrograma.actualizarPrograma(
            txtNomM2.getText(),
            txtMod2.getText(),
            txtMar2.getText(),
            txtMac2.getText());

        if (actualizacion.equals("OK")) {
            txtMod1.setText(txtMod2.getText());
            jButtonConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposEdicion();
        } else {
            JOptionPane.showMessageDialog(this, actualizacion);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Modelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaTel;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiarC;
    private javax.swing.JButton jButtonLimpiarE;
    private javax.swing.JButton jButtonLimpiarR;
    private javax.swing.JButton jButtonRegistar;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLCodigo3;
    private javax.swing.JLabel jLCurso;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre3;
    private javax.swing.JLabel jLabelNotaEditar;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelRegistar1;
    private javax.swing.JLabel jLabelRegistar3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtMod;
    private javax.swing.JTextField txtMod1;
    private javax.swing.JTextField txtMod2;
    private javax.swing.JTextField txtNomM;
    private javax.swing.JTextField txtNomM1;
    private javax.swing.JTextField txtNomM2;
    // End of variables declaration//GEN-END:variables
}
