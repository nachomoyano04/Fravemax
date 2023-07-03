/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladoras.ProveedorData;
import entidades.Proveedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class ProveedoresVista extends javax.swing.JInternalFrame {
    
    private DefaultTableModel table;
    private ProveedorData pd = new ProveedorData();
    private String estado = "nuevo";
    /**
     * Creates new form ProveedoresVista
     */
    public ProveedoresVista() {
        initComponents();
        llenarTablaProveedores();
        tfRazonSocial.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        labelProveedor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfRazonSocial = new javax.swing.JTextField();
        tfDomicilio = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
        labelSeleccioneFila = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelProveedor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelProveedor.setText("Nuevo Proveedor");

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Proveedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(325, 325, 325))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel1.setText("Razón Social");

        jLabel2.setText("Domicilio");

        jLabel3.setText("Teléfono");

        tfRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRazonSocialKeyTyped(evt);
            }
        });

        tfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoKeyTyped(evt);
            }
        });

        tableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Legajo", "Razón Social", "Domicilio", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProveedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProveedores);
        if (tableProveedores.getColumnModel().getColumnCount() > 0) {
            tableProveedores.getColumnModel().getColumn(0).setMinWidth(50);
            tableProveedores.getColumnModel().getColumn(0).setMaxWidth(50);
            tableProveedores.getColumnModel().getColumn(3).setMinWidth(90);
            tableProveedores.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        labelSeleccioneFila.setForeground(new java.awt.Color(255, 0, 0));
        labelSeleccioneFila.setText("Seleccione la fila del proveedor a modificar");
        labelSeleccioneFila.setVisible(false);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(153, 255, 153));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificarProveedor.setBackground(new java.awt.Color(153, 255, 255));
        btnModificarProveedor.setText("Modificar Proveedor");
        btnModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProveedorActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Lista de Proveedores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(labelProveedor)
                        .addGap(94, 94, 94)
                        .addComponent(labelSeleccioneFila)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addContainerGap(204, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addGap(41, 41, 41)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfDomicilio)
                                    .addComponent(tfTelefono)
                                    .addComponent(tfRazonSocial, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnModificarProveedor)
                                .addGap(64, 64, 64)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelSeleccioneFila)
                    .addComponent(labelProveedor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDomicilio)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyTyped
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;
        if(!num){
            evt.consume();
        }
        if(tfTelefono.getText().trim().length() >= 15){
            evt.consume();
        }
    }//GEN-LAST:event_tfTelefonoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(verificarCampos()){
            Proveedor pro = new Proveedor();
            pro.setRazonSocial(tfRazonSocial.getText());
            pro.setDomicilio(tfDomicilio.getText());
            pro.setTelefono(tfTelefono.getText());
            if(estado.equalsIgnoreCase("nuevo")){
                pd.nuevoProveedor(pro);
                llenarTablaProveedores();
                limpiar();
            }else{
                pro.setIdProveedor(Integer.parseInt(table.getValueAt(tableProveedores.getSelectedRow(), 0)+""));
                pd.modificarProveedor(pro);
                llenarTablaProveedores();
                limpiar();
            }
            tfRazonSocial.requestFocus();
        }else{
            JOptionPane.showMessageDialog(this, "Hay campos sin llenar");
            tfRazonSocial.requestFocus();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProveedorActionPerformed
        labelProveedor.setText("Modificar Proveedor");
        labelSeleccioneFila.setVisible(true);
        btnModificarProveedor.setEnabled(false);
        tableProveedores.clearSelection();
        tfRazonSocial.setEditable(false);
        tfDomicilio.setEditable(false);
        tfTelefono.setEditable(false);
        tfRazonSocial.setText("");
        tfDomicilio.setText("");
        tfTelefono.setText("");
        estado = "modificacion";
    }//GEN-LAST:event_btnModificarProveedorActionPerformed

    private void tableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProveedoresMouseClicked
        if(estado.equalsIgnoreCase("modificacion")){
           int fila = tableProveedores.getSelectedRow();
           tfRazonSocial.setEditable(true);
           tfDomicilio.setEditable(true);
           tfTelefono.setEditable(true);
           tfRazonSocial.setText(table.getValueAt(fila, 1)+"");
           tfDomicilio.setText(table.getValueAt(fila, 2)+"");
           tfTelefono.setText(table.getValueAt(fila, 3)+"");       
           tfRazonSocial.requestFocus();
        }
    }//GEN-LAST:event_tableProveedoresMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        tfRazonSocial.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tfRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRazonSocialKeyTyped
        if(tfRazonSocial.getText().trim().length() > 50){
            evt.consume();
        }
    }//GEN-LAST:event_tfRazonSocialKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarProveedor;
    private javax.swing.JButton btnSalir;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelProveedor;
    private javax.swing.JLabel labelSeleccioneFila;
    private javax.swing.JTable tableProveedores;
    private javax.swing.JTextField tfDomicilio;
    private javax.swing.JTextField tfRazonSocial;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

    private void llenarTablaProveedores() {
        table = (DefaultTableModel) tableProveedores.getModel();
        table.setRowCount(0);
        ArrayList<Proveedor>proveedores = pd.listarProveedores();
        if(!proveedores.isEmpty()){
            for (Proveedor p : proveedores) {
                table.addRow(new Object[]{p.getIdProveedor(), p.getRazonSocial(), p.getDomicilio(), p.getTelefono()});
            }
        }
    }
    
    private boolean verificarCampos(){
        String razonSocial = tfRazonSocial.getText();
        String domicilio = tfDomicilio.getText();
        String telefono = tfTelefono.getText();
        return ((!razonSocial.isEmpty()) && (!domicilio.isEmpty()) && (!telefono.isEmpty()));
    }
    
    private void limpiar(){
        tableProveedores.clearSelection();
        tfRazonSocial.setText("");
        tfDomicilio.setText("");
        tfTelefono.setText("");
        labelProveedor.setText("Nuevo Proveedor");
        estado = "nuevo";
        labelSeleccioneFila.setVisible(false);
        btnModificarProveedor.setEnabled(true);
        tfRazonSocial.setEditable(true);
        tfDomicilio.setEditable(true);
        tfTelefono.setEditable(true);
    }
}
