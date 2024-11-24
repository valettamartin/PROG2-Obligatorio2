/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import gestiondelibrerias.Genero;
import gestiondelibrerias.Libreria;
import gestiondelibrerias.Libro;
import gestiondelibrerias.Venta;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AnularVenta extends javax.swing.JFrame {
    
    private int facturaCargada;
    
    private Libreria sistema;
    
    public AnularVenta() {
        initComponents();
    }
    
    public AnularVenta(Libreria sistema) {
        initComponents();
        
        this.sistema = sistema;
        
        this.facturaCargada = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumeroFactura = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JTextField();
        pnlDatosFactura = new javax.swing.JPanel();
        scrLibros = new javax.swing.JScrollPane();
        lstLibros = new javax.swing.JList<>();
        lblLibros = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        btnConfirmarAnulacion = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anular factura");

        lblNumeroFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumeroFactura.setText("Numero de factura:");

        txtNumeroFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnlDatosFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lstLibros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        scrLibros.setViewportView(lstLibros);

        lblLibros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLibros.setText("Libros:");

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFecha.setText("Fecha:");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFecha.setText("--/--/----");
        txtFecha.setEnabled(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCliente.setText("Cliente:");

        txtCliente.setEditable(false);
        txtCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCliente.setEnabled(false);
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValor.setText("Importe:");

        txtValor.setEditable(false);
        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValor.setEnabled(false);
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosFacturaLayout = new javax.swing.GroupLayout(pnlDatosFactura);
        pnlDatosFactura.setLayout(pnlDatosFacturaLayout);
        pnlDatosFacturaLayout.setHorizontalGroup(
            pnlDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrLibros)
                    .addGroup(pnlDatosFacturaLayout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addGap(11, 11, 11)
                        .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
                    .addGroup(pnlDatosFacturaLayout.createSequentialGroup()
                        .addComponent(lblLibros)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDatosFacturaLayout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha)
                        .addGap(18, 18, 18)
                        .addComponent(lblValor)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDatosFacturaLayout.setVerticalGroup(
            pnlDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLibros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVerificar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnConfirmarAnulacion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnConfirmarAnulacion.setText("Confirmar anulación");
        btnConfirmarAnulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarAnulacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatosFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumeroFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmarAnulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroFactura)
                    .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatosFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnConfirmarAnulacion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // Recorremos la lista de ventas buscando una cuyo número coincida con el ingresado
        Venta ventaActual = new Venta();
        boolean found = false;
        try {
            int numeroFactura = Integer.parseInt(this.txtNumeroFactura.getText());

            for (Venta venta : sistema.getListaVentas()) {
                if (venta.getFactura() == numeroFactura) {
                    ventaActual = venta;
                    found = true;
                    break;
                }
            }

            // Si la venta existe, cargamos sus datos
            if (found) {
                this.facturaCargada = Integer.parseInt(this.txtNumeroFactura.getText());
                
                this.txtFecha.setText(ventaActual.getFecha());
                this.txtCliente.setText(ventaActual.getCliente());
                this.txtValor.setText(String.format("%.2f", (double) ventaActual.getPrecioCompra()));

                // Creamos el modelo de la lista de libros comprados
                DefaultListModel<String> modelo = new DefaultListModel<>();
                for (Libro libro : ventaActual.getLibros().keySet()) {
                    int cantidad = ventaActual.getLibros().get(libro);
                    String titulo = libro.getTitulo();
                    String isbn = libro.getIsbn();
                    double precioUnitario = libro.getPrecioVenta();

                    // Formamos el string y lo añadimos al modelo
                    String linea = String.format("%d - %s - %s - %.2f", cantidad, titulo, isbn, precioUnitario);
                    modelo.addElement(linea);
                }
                lstLibros.setModel(modelo);

            } else {
                // Caso contrario, mostramos error
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha encontrado una factura con este número.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, ingrese un número de factura válido.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnConfirmarAnulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarAnulacionActionPerformed
        // Verificamos que exista una factura cargada
        if (this.facturaCargada != 0) {
            // Eliminamos la factura correspondiente del sistema
            boolean removed = false;
            Venta ventaAnulada = null;

            for (Venta venta : sistema.getListaVentas()) {
                if (venta.getFactura() == this.facturaCargada) {
                    ventaAnulada = venta; // Guardamos la venta para restaurar el stock
                    sistema.getListaVentas().remove(venta);
                    removed = true;
                    break;
                }
            }

            if (removed && ventaAnulada != null) {
                // Restauramos el stock de los libros
                for (Libro libro : ventaAnulada.getLibros().keySet()) {
                    int cantidadVendida = ventaAnulada.getLibros().get(libro);
                    libro.setStock(libro.getStock() + cantidadVendida);
                }

                // Eliminar la línea correspondiente del archivo ventas.txt
                eliminarVentaDelArchivo(ventaAnulada.getFactura());

                // Actualizar el stock en el archivo libros.txt
                actualizarStockEnArchivoLibros(ventaAnulada);

                // Damos un aviso por JOptionPane de que se tuvo éxito
                JOptionPane.showMessageDialog(
                    this,
                    "La factura ha sido anulada correctamente, el stock ha sido restaurado y la venta eliminada del archivo.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE
                );

                // Limpiamos los valores en lstLibros, txtValor, txtCliente y txtFecha
                this.lstLibros.setModel(new DefaultListModel<>()); // Limpia la lista de libros
                this.txtValor.setText("");
                this.txtCliente.setText("");
                this.txtFecha.setText("--/--/----");
                this.txtNumeroFactura.setText(""); // Limpia el número de factura ingresado
                this.facturaCargada = 0; // Reinicia el estado de la factura cargada
            } else {
                // Por si acaso, aunque esto no debería ocurrir, mostramos un mensaje de error
                JOptionPane.showMessageDialog(
                    this,
                    "No se pudo encontrar la factura en el sistema para anularla.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } else {
            // Damos un aviso de que no se ha cargado una factura todavía
            JOptionPane.showMessageDialog(
                this,
                "No se ha cargado una factura para anular.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnConfirmarAnulacionActionPerformed

    private void eliminarVentaDelArchivo(int factura) {
        String rutaArchivo = System.getProperty("user.dir") + File.separator + "datos" + File.separator + "ventas.txt";
        File archivo = new File(rutaArchivo);
        File archivoTemporal = new File(rutaArchivo + ".tmp");

        try {
            // Leer el archivo original y escribir uno nuevo sin la venta anulada
            Scanner scanner = new Scanner(archivo);
            FileWriter writer = new FileWriter(archivoTemporal);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] partes = linea.split("\\|");
                int numeroFactura = Integer.parseInt(partes[2]); // La factura está en la tercera posición

                if (numeroFactura != factura) {
                    writer.write(linea + System.lineSeparator());
                }
            }

            scanner.close();
            writer.close();

            // Reemplazar el archivo original con el archivo temporal
            if (archivo.delete()) {
                archivoTemporal.renameTo(archivo);
            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "Error al eliminar la línea del archivo. No se pudo actualizar el archivo ventas.txt.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al acceder al archivo ventas.txt: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al leer el número de factura en el archivo: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void actualizarStockEnArchivoLibros(Venta ventaAnulada) {
        String rutaArchivo = System.getProperty("user.dir") + File.separator + "datos" + File.separator + "libros.txt";
        File archivo = new File(rutaArchivo);
        File archivoTemporal = new File(rutaArchivo + ".tmp");

        try {
            // Leer el archivo original y escribir uno nuevo con el stock actualizado
            Scanner scanner = new Scanner(archivo);
            FileWriter writer = new FileWriter(archivoTemporal);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] partes = linea.split("\\|");
                String isbn = partes[0]; // El ISBN está en la primera posición

                boolean actualizado = false;
                for (Libro libro : ventaAnulada.getLibros().keySet()) {
                    if (libro.getIsbn().equals(isbn)) {
                        // Actualizamos el stock del libro
                        partes[8] = String.valueOf(libro.getStock()); // El stock está en la posición 8
                        actualizado = true;
                        break;
                    }
                }

                if (actualizado) {
                    // Reescribimos la línea actualizada
                    writer.write(String.join("|", partes) + System.lineSeparator());
                } else {
                    // Copiamos la línea tal cual si no se actualizó
                    writer.write(linea + System.lineSeparator());
                }
            }

            scanner.close();
            writer.close();

            // Reemplazar el archivo original con el archivo temporal
            if (archivo.delete()) {
                archivoTemporal.renameTo(archivo);
            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "Error al actualizar el archivo libros.txt.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al acceder al archivo libros.txt: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al leer o procesar el archivo libros.txt: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
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
            java.util.logging.Logger.getLogger(AnularVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnularVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnularVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnularVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnularVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConfirmarAnulacion;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLibros;
    private javax.swing.JLabel lblNumeroFactura;
    private javax.swing.JLabel lblValor;
    private javax.swing.JList<String> lstLibros;
    private javax.swing.JPanel pnlDatosFactura;
    private javax.swing.JScrollPane scrLibros;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNumeroFactura;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
