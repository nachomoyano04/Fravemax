/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladoras.ClienteData;
import controladoras.DetalleVentaData;
import controladoras.ProductoData;
import controladoras.VentaData;
import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class VentasVista extends javax.swing.JInternalFrame {
    private DefaultTableModel tableC;
    private DefaultTableModel tableP;
    private ClienteData cd = new ClienteData();
    private ProductoData pd = new ProductoData();
    private VentaData vd = new VentaData();
    private DetalleVentaData dvd = new DetalleVentaData();
    /**
     * Creates new form VentasVista
     */
    public VentasVista() {
        initComponents();
        llenarTablaClientes();
        llenarTablaProductos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        spinnerCantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        tfProducto = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarVenta = new javax.swing.JButton();
        tfBuscarClientes = new javax.swing.JTextField();
        tfBuscarProductos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        tfFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Cliente");

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Legajo", "Apellido", "Nombre", "Domicilio", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClientes);
        if (tableClientes.getColumnModel().getColumnCount() > 0) {
            tableClientes.getColumnModel().getColumn(0).setMinWidth(50);
            tableClientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tableClientes.getColumnModel().getColumn(4).setMinWidth(80);
            tableClientes.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Descripcion", "Precio", "Stock", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProductos);
        if (tableProductos.getColumnModel().getColumnCount() > 0) {
            tableProductos.getColumnModel().getColumn(0).setMinWidth(50);
            tableProductos.getColumnModel().getColumn(0).setMaxWidth(50);
            tableProductos.getColumnModel().getColumn(2).setMinWidth(80);
            tableProductos.getColumnModel().getColumn(2).setMaxWidth(80);
            tableProductos.getColumnModel().getColumn(3).setMinWidth(50);
            tableProductos.getColumnModel().getColumn(3).setMaxWidth(50);
            tableProductos.getColumnModel().getColumn(4).setMinWidth(70);
            tableProductos.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        spinnerCantidad.setToolTipText("");
        SpinnerNumberModel snm = new SpinnerNumberModel(0,0,50,1);
        spinnerCantidad.setModel(snm);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerCantidad.getEditor()).getTextField();
        tf.setEditable(false);

        jLabel4.setText("Cantidad");

        jLabel5.setText("Precio");

        tfPrecio.setEditable(false);

        jLabel6.setText("Fecha");

        jLabel7.setText("Cliente");

        jLabel8.setText("Producto");

        tfCliente.setEditable(false);
        tfCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        tfProducto.setEditable(false);
        tfProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardarVenta.setText("Guardar Venta");
        btnGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVentaActionPerformed(evt);
            }
        });

        tfBuscarClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarClientesKeyReleased(evt);
            }
        });

        tfBuscarProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarProductosKeyReleased(evt);
            }
        });

        jLabel9.setText("Filtrar por apellido");

        jLabel10.setText("Filtrar por descripcion");

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tfFecha.setEditable(false);
        tfFecha.setText(LocalDate.now()+"");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("ÁREA DE VENTAS");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Seleccione filas de las tablas ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(spinnerCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                    .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGuardarVenta)))
                                .addGap(55, 55, 55))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2)
                                .addGap(147, 147, 147)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarVenta)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        int fila = tableClientes.getSelectedRow();
        if(fila > -1){
            String nombreYApellido = tableC.getValueAt(fila, 1)+", "+tableC.getValueAt(fila, 2);
            tfCliente.setText(nombreYApellido);
        }
    }//GEN-LAST:event_tableClientesMouseClicked

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
        int fila = tableProductos.getSelectedRow();
        if(fila > -1){
            String descripcion = tableP.getValueAt(fila, 1)+"";
            tfProducto.setText(descripcion);
            BigDecimal precio = BigDecimal.valueOf(Double.parseDouble(tableP.getValueAt(fila, 2)+""));
            precio = precio.add(precio.multiply(new BigDecimal("15.00")).divide(new BigDecimal("100.00"))); //Le agregamos el 15% al valor del producto...
            tfPrecio.setText("$"+precio);
        }
    }//GEN-LAST:event_tableProductosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVentaActionPerformed
        if(verificarCampos()){
            //Creamos la venta nueva. 4to parámetro de DetalleVenta
            int filaC = tableClientes.getSelectedRow();
            int idCliente = Integer.parseInt(tableC.getValueAt(filaC, 0)+"");
            Venta venta = new Venta(cd.buscarClienteXId(idCliente), LocalDate.now());
            int idGenerado = vd.nuevaVenta(venta);
            Venta veu = vd.buscarVentaXID(idGenerado);
            
            //Tomamos datos para el producto. 5to parámetro de DetalleVenta
            int filaP = tableProductos.getSelectedRow();
            int idProducto = Integer.parseInt(tableP.getValueAt(filaP, 0)+"");
            Producto producto = pd.buscarProductoXId(idProducto);
            
            //Tomamos la cantidad de productos que se va a llevar. 2do parámetro
            int cantidad = Integer.parseInt(spinnerCantidad.getValue()+"");
            
            //Tomamos el precio de la venta con el valor agregado. 3er parámetro
            String price = tfPrecio.getText().substring(1);
            BigDecimal precio = new BigDecimal(price);
            
            //Creamos el detalle venta
            DetalleVenta dv = new DetalleVenta(cantidad, precio, veu, producto);
            dvd.nuevoDetalleVenta(dv);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un Cliente, un Producto y cantidad");
        }
    }//GEN-LAST:event_btnGuardarVentaActionPerformed

    private void tfBuscarClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarClientesKeyReleased
        String apellido = tfBuscarClientes.getText();
        tableC = (DefaultTableModel) tableClientes.getModel();
        tableC.setRowCount(0);
        for (Cliente c : cd.filtrarClientesPorApellido(apellido)) {
            tableC.addRow(new Object[]{c.getIdCliente(), c.getApellido(), c.getNombre(), c.getDomicilio(), c.getTelefono()});
        }
    }//GEN-LAST:event_tfBuscarClientesKeyReleased

    private void tfBuscarProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarProductosKeyReleased
        String descripcion = tfBuscarProductos.getText();
        tableP = (DefaultTableModel) tableProductos.getModel();
        tableP.setRowCount(0);
        for (Producto p : pd.filtrarProductosPorDescripcion(descripcion)) {
            String estado;
            if(p.getEstado() == 1){
                estado = "Activo";
            }else{
                estado = "Inactivo";
            }
            tableP.addRow(new Object[]{p.getIdProducto(), p.getDescripcion(), p.getPrecioActual(), p.getStock(), estado});
        }
    }//GEN-LAST:event_tfBuscarProductosKeyReleased

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField tfBuscarClientes;
    private javax.swing.JTextField tfBuscarProductos;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfPrecio;
    private javax.swing.JTextField tfProducto;
    // End of variables declaration//GEN-END:variables

    private void llenarTablaClientes() {
        tableC = (DefaultTableModel) tableClientes.getModel();
        tableC.setRowCount(0);
        ArrayList<Cliente>clientes = cd.listarClientes();
        if(!clientes.isEmpty()){
            for (Cliente c : clientes) {
                tableC.addRow(new Object[]{c.getIdCliente(), c.getApellido(), c.getNombre(), c.getDomicilio(), c.getTelefono()});
            }
        }
    }

    private void llenarTablaProductos() {
        tableP = (DefaultTableModel) tableProductos.getModel();
        tableP.setRowCount(0);
        ArrayList<Producto>productos = pd.listarProductos();
        if(!productos.isEmpty()){
            for (Producto p : productos) {
                String estado;
                if(p.getEstado() == 1){
                    estado = "Activo";
                }else{
                    estado = "Inactivo";
                }
                tableP.addRow(new Object[]{p.getIdProducto(), p.getDescripcion(), p.getPrecioActual(), p.getStock(), estado});
            }
        }
    }

    private void limpiar() {
        tfCliente.setText("");
        tfProducto.setText("");
        tfPrecio.setText("");
        spinnerCantidad.setValue(0);
        tableClientes.clearSelection();
        tableProductos.clearSelection();
    }

    private boolean verificarCampos() {
        String cliente = tfCliente.getText();
        String producto = tfProducto.getText();
        return (!cliente.isEmpty()) && (!producto.isEmpty()) && (Integer.parseInt(spinnerCantidad.getValue()+"") > 0);
    }
}
