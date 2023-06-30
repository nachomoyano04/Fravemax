package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 * @author nacho
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        cambioDeFondo();
        cambiarIcono();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnVentas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentas(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes(evt);
            }
        });

        btnProveedores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedores(evt);
            }
        });

        btnInventario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInventario.setText("INVENTARIO");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventario(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Broadway", 0, 48)); // NOI18N
        jLabel1.setText("FRAVEMAX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(511, 511, 511)
                .addComponent(jLabel1)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnCompras.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCompras.setText("COMPRAS");
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompras(evt);
            }
        });

        Escritorio.setLayer(btnVentas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(btnClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(btnProveedores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(btnInventario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(btnCompras, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProveedores)
                            .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1080, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes
        ClientesVista cv = new ClientesVista();
        cv.setVisible(true);
        Escritorio.add(cv);
        cv.moveToFront();
        cv.setBounds(250, 140, 1000, 500);
    }//GEN-LAST:event_btnClientes

    private void btnInventario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventario
        String opciones[] = {"Nuevo Producto", "Ver Inventario"};
        int elegida = JOptionPane.showOptionDialog(this, "Opciones: ", "Elija una opcion", 0, 1, null, opciones, null);
        if(elegida == 0){
            NuevoProducto iv = new NuevoProducto();
            iv.setVisible(true);
            Escritorio.add(iv);
            iv.moveToFront();
            iv.setBounds(250, 140, 1000, 500);
        }else{
            ConsultarInventario ci = new ConsultarInventario();
            ci.setVisible(true);
            Escritorio.add(ci);
            ci.moveToFront();
            ci.setBounds(250, 140, 1000, 500);
        }
    }//GEN-LAST:event_btnInventario

    private void btnProveedores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedores
        ProveedoresVista pv = new ProveedoresVista();
        pv.setVisible(true);
        Escritorio.add(pv);
        pv.moveToFront();
        pv.setBounds(250, 140, 1000, 500);
    }//GEN-LAST:event_btnProveedores

    private void btnVentas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentas
        String opciones[] = {"NUEVA VENTA", "HISTORIAL DE VENTAS"};
        int elegida = JOptionPane.showOptionDialog(this, "Opciones:", "Menú", 0, 1, null, opciones, null);
        if(elegida == 0){
            VentasVista vv = new VentasVista();
            vv.setVisible(true);
            Escritorio.add(vv);
            vv.moveToFront();
            vv.setBounds(250, 140, 1000, 500);            
        }else{
            HistorialVentasVista hvv = new HistorialVentasVista();
            hvv.setVisible(true);
            Escritorio.add(hvv);
            hvv.moveToFront();
            hvv.setBounds(250, 140, 1000, 500);
        }
    }//GEN-LAST:event_btnVentas

    private void btnCompras(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompras
        String opciones[] = {"NUEVA COMPRA", "HISTORIAL DE COMPRAS"};
        int elegida = JOptionPane.showOptionDialog(this, "Opciones", "Menú", 0, 1, null, opciones, null);
        if(elegida == 0){
            ComprasVista cv = new ComprasVista();
            cv.setVisible(true);
            Escritorio.add(cv);
            cv.moveToFront();
            cv.setBounds(250, 140, 1000, 500);
        }else{
            HistorialComprasVista hcv = new HistorialComprasVista();
            hcv.setVisible(true);
            Escritorio.add(hcv);
            hcv.moveToFront();
            hcv.setBounds(250, 140, 1000, 500);
        }
    }//GEN-LAST:event_btnCompras

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void cambioDeFondo() {
        Escritorio.setEnabled(false);
        setExtendedState(MenuPrincipal.MAXIMIZED_BOTH);
        Dimension dim = getSize();
        Escritorio.setBounds(0,0,(int)dim.getWidth(), (int)dim.getHeight());
        Escritorio.setBackground(Color.black);
    }
    
    private void cambiarIcono() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconoLavarropa.png")));
        setTitle("FRAVEMAX");
    }
}
