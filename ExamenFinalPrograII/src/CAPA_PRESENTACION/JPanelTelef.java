/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_PRESENTACION;

import CAPA_LOGICA.ControladorTelefono;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JPanelTelef extends javax.swing.JFrame {
ControladorTelefono controladorPrograma;
    
    public JPanelTelef() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelRegistro = new javax.swing.JPanel();
        jLabelRegistar = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLNivel = new javax.swing.JLabel();
        jLNumCreditos = new javax.swing.JLabel();
        txtidTel = new javax.swing.JTextField();
        txtIMEI = new javax.swing.JTextField();
        txtMod = new javax.swing.JTextField();
        txtMac = new javax.swing.JTextField();
        jButtonLimpiarR = new javax.swing.JButton();
        jButtonRegistar = new javax.swing.JButton();
        jLNumCreditos2 = new javax.swing.JLabel();
        txtMar = new javax.swing.JTextField();
        jPanelConsulta = new javax.swing.JPanel();
        jLabelRegistar1 = new javax.swing.JLabel();
        jLCodigo1 = new javax.swing.JLabel();
        jLCurso = new javax.swing.JLabel();
        jLNivel1 = new javax.swing.JLabel();
        jLNumCreditos1 = new javax.swing.JLabel();
        txtidTel1 = new javax.swing.JTextField();
        txtIMEI1 = new javax.swing.JTextField();
        txtMod1 = new javax.swing.JTextField();
        txtMac1 = new javax.swing.JTextField();
        jButtonLimpiarC = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTel = new javax.swing.JTable();
        jLabelNotaEditar = new javax.swing.JLabel();
        jLNumCreditos4 = new javax.swing.JLabel();
        txtMar1 = new javax.swing.JTextField();
        jPanelEditar = new javax.swing.JPanel();
        jLabelRegistar3 = new javax.swing.JLabel();
        jLCodigo3 = new javax.swing.JLabel();
        jLNombre3 = new javax.swing.JLabel();
        jLNivel3 = new javax.swing.JLabel();
        jLNumCreditos3 = new javax.swing.JLabel();
        txtidTel2 = new javax.swing.JTextField();
        txtIMEI2 = new javax.swing.JTextField();
        txtMod2 = new javax.swing.JTextField();
        txtMac2 = new javax.swing.JTextField();
        jButtonLimpiarE = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLNumCreditos5 = new javax.swing.JLabel();
        txtMar2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Gestion Programa Academico");
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 10, 580, 40);

        jPanelRegistro.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Programa Academico");
        jPanelRegistro.add(jLabelRegistar);
        jLabelRegistar.setBounds(0, 10, 580, 40);

        jLCodigo.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo.setText("idTelefono");
        jPanelRegistro.add(jLCodigo);
        jLCodigo.setBounds(50, 70, 200, 30);

        jLNombre.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre.setText("IMEI");
        jPanelRegistro.add(jLNombre);
        jLNombre.setBounds(50, 110, 200, 30);

        jLNivel.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNivel.setText("MODELO");
        jPanelRegistro.add(jLNivel);
        jLNivel.setBounds(50, 150, 200, 30);

        jLNumCreditos.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos.setText("MAC_Adress");
        jPanelRegistro.add(jLNumCreditos);
        jLNumCreditos.setBounds(50, 240, 200, 30);

        txtidTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidTelActionPerformed(evt);
            }
        });
        jPanelRegistro.add(txtidTel);
        txtidTel.setBounds(260, 70, 250, 30);
        jPanelRegistro.add(txtIMEI);
        txtIMEI.setBounds(260, 110, 250, 30);
        jPanelRegistro.add(txtMod);
        txtMod.setBounds(260, 150, 250, 30);
        jPanelRegistro.add(txtMac);
        txtMac.setBounds(260, 240, 250, 30);

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

        jLNumCreditos2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos2.setText("MARCA");
        jPanelRegistro.add(jLNumCreditos2);
        jLNumCreditos2.setBounds(50, 190, 200, 30);
        jPanelRegistro.add(txtMar);
        txtMar.setBounds(260, 190, 250, 30);

        jTabbedPane1.addTab("Registar", jPanelRegistro);

        jPanelConsulta.setLayout(null);

        jLabelRegistar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar1.setText("Consulta Programas Academicos");
        jPanelConsulta.add(jLabelRegistar1);
        jLabelRegistar1.setBounds(0, 10, 580, 40);

        jLCodigo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo1.setText("idTelefono");
        jPanelConsulta.add(jLCodigo1);
        jLCodigo1.setBounds(20, 70, 180, 30);

        jLCurso.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCurso.setText("IMEI");
        jPanelConsulta.add(jLCurso);
        jLCurso.setBounds(20, 110, 180, 30);

        jLNivel1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNivel1.setText("MODELO");
        jPanelConsulta.add(jLNivel1);
        jLNivel1.setBounds(20, 150, 180, 30);

        jLNumCreditos1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos1.setText("MAC_Adress");
        jPanelConsulta.add(jLNumCreditos1);
        jLNumCreditos1.setBounds(20, 230, 180, 30);
        jPanelConsulta.add(txtidTel1);
        txtidTel1.setBounds(200, 70, 200, 30);
        jPanelConsulta.add(txtIMEI1);
        txtIMEI1.setBounds(200, 110, 200, 30);
        jPanelConsulta.add(txtMod1);
        txtMod1.setBounds(200, 150, 200, 30);
        jPanelConsulta.add(txtMac1);
        txtMac1.setBounds(200, 230, 200, 30);

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
                "idTelefono", "IMEI", "Modelo", "Marca", "MAC_Adress"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jLNumCreditos4.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos4.setText("MARCA");
        jPanelConsulta.add(jLNumCreditos4);
        jLNumCreditos4.setBounds(20, 190, 180, 30);
        jPanelConsulta.add(txtMar1);
        txtMar1.setBounds(200, 190, 200, 30);

        jTabbedPane1.addTab("Consultar", jPanelConsulta);

        jPanelEditar.setLayout(null);

        jLabelRegistar3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar3.setText("Edicion Programa Academico");
        jPanelEditar.add(jLabelRegistar3);
        jLabelRegistar3.setBounds(0, 10, 580, 40);

        jLCodigo3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo3.setText("idTelefono");
        jPanelEditar.add(jLCodigo3);
        jLCodigo3.setBounds(50, 70, 200, 30);

        jLNombre3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre3.setText("IMEI");
        jPanelEditar.add(jLNombre3);
        jLNombre3.setBounds(50, 110, 200, 30);

        jLNivel3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNivel3.setText("MODELO");
        jPanelEditar.add(jLNivel3);
        jLNivel3.setBounds(50, 150, 200, 30);

        jLNumCreditos3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos3.setText("MAC_Adress");
        jPanelEditar.add(jLNumCreditos3);
        jLNumCreditos3.setBounds(50, 240, 200, 30);

        txtidTel2.setEnabled(false);
        jPanelEditar.add(txtidTel2);
        txtidTel2.setBounds(260, 70, 250, 30);
        jPanelEditar.add(txtIMEI2);
        txtIMEI2.setBounds(260, 110, 250, 30);
        jPanelEditar.add(txtMod2);
        txtMod2.setBounds(260, 150, 250, 30);
        jPanelEditar.add(txtMac2);
        txtMac2.setBounds(260, 240, 250, 30);

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

        jLNumCreditos5.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos5.setText("MARCA");
        jPanelEditar.add(jLNumCreditos5);
        jLNumCreditos5.setBounds(50, 190, 200, 30);
        jPanelEditar.add(txtMar2);
        txtMar2.setBounds(260, 190, 250, 30);

        jTabbedPane1.addTab("Editar", jPanelEditar);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 580, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 43, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 51, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarRActionPerformed

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonRegistarActionPerformed()">
        String registro;
        registro = controladorPrograma.insertarPrograma(
            txtidTel.getText(),
            txtIMEI.getText(),
            txtMod.getText(),
            txtMar.getText(),
            txtMac.getText());

        if (registro.equals("OK")) {
            txtidTel1.setText(txtidTel.getText());
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
            txtidTel1.getText(),
            txtIMEI1.getText(),
            txtMod1.getText(),
            txtMar1.getText(),
            txtMac1.getText());       

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
            txtidTel2.setText(programa[0]);
            txtIMEI2.setText(programa[1]);
            txtMod2.setText(programa[2]);
              txtMar2.setText(programa[3]);
            txtMac2.setText(programa[4]);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarEActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonLimpiarEActionPerformed()">
        txtIMEI2.setText("");
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
            txtIMEI2.getText(),
            txtMod2.getText(),
            txtMar2.getText(),
            txtMac2.getText());

        if (actualizacion.equals("OK")) {
            txtidTel1.setText(txtidTel2.getText());
            jButtonConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposEdicion();
        } else {
            JOptionPane.showMessageDialog(this, actualizacion);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void txtidTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidTelActionPerformed

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
            java.util.logging.Logger.getLogger(JPanelTelef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPanelTelef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPanelTelef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPanelTelef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPanelTelef().setVisible(true);
            }
        });
    }

    
     public void limpiarCamposRegistro() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposRegistro()">
        txtidTel.setText("");
        txtIMEI.setText("");
         txtMod.setText("");
        txtMar.setText("");
        txtMac.setText("");
        //</editor-fold>
    }

    public void limpiarCamposEdicion() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposEdicion()">
        txtidTel2.setText("");
        txtIMEI2.setText("");
        txtMod2.setText("");
         txtMar2.setText("");
        txtMac2.setText("");
        //</editor-fold>
    }

    public void limpiarCamposConsulta() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposConsulta()">
        txtidTel1.setText("");
        txtIMEI1.setText("");
        txtMod1.setText("");
        txtMar1.setText("");
        txtMac1.setText("");
        
        TableModel myModel = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "idTelefono", "IMEI", "Modelo", "Marca","MAC_Adress"
                });
        
        TablaTel.setModel(myModel);
        TablaTel.setRowSorter(new TableRowSorter(myModel));
        //</editor-fold>
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
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLNivel1;
    private javax.swing.JLabel jLNivel3;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre3;
    private javax.swing.JLabel jLNumCreditos;
    private javax.swing.JLabel jLNumCreditos1;
    private javax.swing.JLabel jLNumCreditos2;
    private javax.swing.JLabel jLNumCreditos3;
    private javax.swing.JLabel jLNumCreditos4;
    private javax.swing.JLabel jLNumCreditos5;
    private javax.swing.JLabel jLabelNotaEditar;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelRegistar1;
    private javax.swing.JLabel jLabelRegistar3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtIMEI;
    private javax.swing.JTextField txtIMEI1;
    private javax.swing.JTextField txtIMEI2;
    private javax.swing.JTextField txtMac;
    private javax.swing.JTextField txtMac1;
    private javax.swing.JTextField txtMac2;
    private javax.swing.JTextField txtMar;
    private javax.swing.JTextField txtMar1;
    private javax.swing.JTextField txtMar2;
    private javax.swing.JTextField txtMod;
    private javax.swing.JTextField txtMod1;
    private javax.swing.JTextField txtMod2;
    private javax.swing.JTextField txtidTel;
    private javax.swing.JTextField txtidTel1;
    private javax.swing.JTextField txtidTel2;
    // End of variables declaration//GEN-END:variables
}
