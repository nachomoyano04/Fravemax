/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
import controladoras.DetalleCompraData;
import entidades.DetalleCompra;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nacho
 */
public class HistorialComprasVista extends javax.swing.JInternalFrame {
    private DetalleCompraData dcd = new DetalleCompraData();
    private DefaultTableModel table;
    /**
     * Creates new form HistorialComprasVista
     */
    public HistorialComprasVista() {
        initComponents();
        llenarTablaCompras(dcd.listarComprasRealizadas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCompras = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfFiltrarPorProductos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfFiltrarPorProveedores = new javax.swing.JTextField();

        tableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "num", "producto", "cantidad", "precio costo", "fecha", "proveedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCompras);
        tableCompras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        if (tableCompras.getColumnModel().getColumnCount() > 0) {
            tableCompras.getColumnModel().getColumn(0).setMinWidth(50);
            tableCompras.getColumnModel().getColumn(0).setMaxWidth(50);
            tableCompras.getColumnModel().getColumn(2).setMinWidth(60);
            tableCompras.getColumnModel().getColumn(2).setMaxWidth(60);
            tableCompras.getColumnModel().getColumn(3).setMinWidth(90);
            tableCompras.getColumnModel().getColumn(3).setMaxWidth(90);
            tableCompras.getColumnModel().getColumn(4).setMinWidth(80);
            tableCompras.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Historial de Compras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Filtrar por producto:");

        tfFiltrarPorProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltrarPorProductosKeyReleased(evt);
            }
        });

        jLabel3.setText("Filtrar por proveedor:");

        tfFiltrarPorProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltrarPorProveedoresKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFiltrarPorProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFiltrarPorProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfFiltrarPorProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tfFiltrarPorProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfFiltrarPorProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltrarPorProductosKeyReleased
        String descripcion = tfFiltrarPorProductos.getText();
        llenarTablaCompras(dcd.filtrarComprasPorProducto(descripcion));
    }//GEN-LAST:event_tfFiltrarPorProductosKeyReleased

    private void tfFiltrarPorProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltrarPorProveedoresKeyReleased
        String razonSocial = tfFiltrarPorProveedores.getText();
        llenarTablaCompras(dcd.filtrarComprasPorProveedores(razonSocial));
    }//GEN-LAST:event_tfFiltrarPorProveedoresKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCompras;
    private javax.swing.JTextField tfFiltrarPorProductos;
    private javax.swing.JTextField tfFiltrarPorProveedores;
    // End of variables declaration//GEN-END:variables

    private void llenarTablaCompras(ArrayList<DetalleCompra> listarComprasRealizadas) {
        table = (DefaultTableModel) tableCompras.getModel();
        table.setRowCount(0);
        for (DetalleCompra lcr : listarComprasRealizadas) {
            table.addRow(new Object[]{lcr.getIdDetalleCompra(), lcr.getProducto(), lcr.getCantidad(), "$"+lcr.getPrecioCosto(), lcr.getCompra().getFecha(), lcr.getCompra().getProveedor()});
        }
    }
}
