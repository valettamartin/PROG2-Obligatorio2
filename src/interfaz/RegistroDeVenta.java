/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import gestiondelibrerias.Libreria;
import gestiondelibrerias.Libro;
import gestiondelibrerias.Venta;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class RegistroDeVenta extends javax.swing.JFrame {

    private Libreria sistema;
    
    public RegistroDeVenta() {
        initComponents();
    }

    public RegistroDeVenta(Libreria sistema) {
        initComponents();
        this.sistema = sistema;

        DefaultListModel<String> modeloVenta = new DefaultListModel<>();
        lstVenta.setModel(modeloVenta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLibros = new javax.swing.JLabel();
        scrLibros = new javax.swing.JScrollPane();
        lstLibros = new javax.swing.JList<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblVenta = new javax.swing.JLabel();
        scrVenta = new javax.swing.JScrollPane();
        lstVenta = new javax.swing.JList<>();
        lblNroFactura = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venta de Libros");

        lblLibros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLibros.setText("Libros");

        lstLibros.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lstLibros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrLibros.setViewportView(lstLibros);

        btnAgregar.setText("->");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("<-");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVenta.setText("Venta");

        lstVenta.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        scrVenta.setViewportView(lstVenta);

        lblNroFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNroFactura.setText("Factura: ---");

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFecha.setText("Fecha:");

        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFecha.setText("--/--/----");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCliente.setText("Cliente:");

        txtCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotal.setText("Total: $ 0");

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNroFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLibros)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFecha)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 112, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnRegistrar))
                                    .addComponent(scrLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblVenta))
                            .addComponent(btnCancelar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNroFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLibros)
                    .addComponent(lblVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrLibros)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(scrVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblTotal)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String libroSeleccionado = this.lstLibros.getSelectedValue();
        if (libroSeleccionado == null) {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, seleccione un libro para agregar al carrito.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        if (this.txtCliente.getText().contains("|") || this.txtFecha.getText().contains("|")) {
            JOptionPane.showMessageDialog(
                this,
                "No se puede utilizar el caracter '|'.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String[] separado = libroSeleccionado.split(" - ");
        String isbnSeleccionado = separado[0];

        // Buscar el libro en sistema.getListaLibros()
        Libro libroUtilizado = null;
        for (Libro libro : sistema.getListaLibros()) {
            if (isbnSeleccionado.equals(libro.getIsbn())) {
                libroUtilizado = libro;
                break;
            }
        }

        if (libroUtilizado == null) {
            JOptionPane.showMessageDialog(
                this,
                "Error: No se encontró el libro en la lista del sistema.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Verificar si ya existe en la lista de ventas y calcular el total de unidades actuales
        DefaultListModel<String> modeloVenta = (DefaultListModel<String>) lstVenta.getModel();
        int cantidadActualEnCarrito = 0;
        boolean existe = false;

        for (int i = 0; i < modeloVenta.getSize(); i++) {
            String elemento = modeloVenta.getElementAt(i);
            if (elemento.contains(libroUtilizado.getIsbn())) {
                String[] partes = elemento.split(" - ");
                cantidadActualEnCarrito = Integer.parseInt(partes[0]);
                existe = true;
                break;
            }
        }

        // Verificar que el total no supere el stock
        if (cantidadActualEnCarrito + 1 > libroUtilizado.getStock()) {
            JOptionPane.showMessageDialog(
                this,
                "No se puede agregar más unidades. Stock disponible: " + libroUtilizado.getStock(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Crear el string para la lista de ventas
        String nuevoElemento = " - " + libroUtilizado.getTitulo() + " - " + libroUtilizado.getPrecioVenta() + " - " + libroUtilizado.getIsbn();

        if (existe) {
            // Actualizamos el elemento si ya existe
            for (int i = 0; i < modeloVenta.getSize(); i++) {
                String elemento = modeloVenta.getElementAt(i);
                if (elemento.contains(libroUtilizado.getIsbn())) {
                    String[] partes = elemento.split(" - ");
                    int nuevaCantidad = Integer.parseInt(partes[0]) + 1;
                    String nuevoString = nuevaCantidad + " - " + partes[1] + " - " + partes[2] + " - " + partes[3];
                    modeloVenta.setElementAt(nuevoString, i);
                    break;
                }
            }
        } else {
            // Si no existe en el carrito, lo agregamos
            modeloVenta.addElement("1" + nuevoElemento);
        }

        // Actualizamos el total acumulado
        actualizarTotal(libroUtilizado.getPrecioVenta());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Obtenemos el modelo de lstVenta
        DefaultListModel<String> modeloVenta = (DefaultListModel<String>) lstVenta.getModel();

        // Limpiar lstVenta, txtFecha, txtCliente y lblTotal
        modeloVenta.clear();
        txtFecha.setText("--/--/----");
        txtCliente.setText("");
        lblTotal.setText("Total: $ 0");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String libroSeleccionado = this.lstVenta.getSelectedValue();

        if (libroSeleccionado == null) {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, seleccione un libro para eliminar del carrito.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String[] separado = libroSeleccionado.split(" - ");
        int cantidad = Integer.parseInt(separado[0]); // La cantidad es el primer valor
        double precioVenta = Double.parseDouble(separado[2]); // El precio está en la tercera posición

        DefaultListModel<String> modeloVenta = (DefaultListModel<String>) lstVenta.getModel();

        if (cantidad > 1) {
            // Si hay más de 1, actualizamos el elemento restando 1
            cantidad--;
            String nuevoElemento = cantidad + " - " + separado[1] + " - " + separado[2] + " - " + separado[3];
            int index = lstVenta.getSelectedIndex();
            modeloVenta.setElementAt(nuevoElemento, index);
        } else {
            // Si solo hay 1, eliminamos el elemento de la lista
            modeloVenta.removeElementAt(lstVenta.getSelectedIndex());
        }

        // Actualizamos el total acumulado restando el precio del libro eliminado
        actualizarTotal(-precioVenta);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String fecha = txtFecha.getText().trim();
        String cliente = txtCliente.getText().trim();

        if (fecha.isEmpty()) fecha = "";
        if (cliente.isEmpty()) cliente = "";

        int factura = leerNumeroFactura(); // Obtener el número de factura desde el archivo
        HashMap<Libro, Integer> librosVendidos = new HashMap<>();
        double precioCompra = 0; // Variable para acumular el total de la venta

        DefaultListModel<String> modeloVenta = (DefaultListModel<String>) lstVenta.getModel();

        for (int i = 0; i < modeloVenta.getSize(); i++) {
            String elementoVenta = modeloVenta.getElementAt(i);
            String[] separado = elementoVenta.split(" - ");
            int cantidad = Integer.parseInt(separado[0]);
            double precioVenta = Double.parseDouble(separado[2]); // El precio de venta
            String isbn = separado[3];

            for (Libro libro : sistema.getListaLibros()) {
                if (libro.getIsbn().equals(isbn)) {
                    if (libro.getStock() < cantidad) {
                        JOptionPane.showMessageDialog(
                            this,
                            "Error: No hay suficiente stock para el libro con ISBN: " + isbn,
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                        );
                        return;
                    }

                    libro.setStock(libro.getStock() - cantidad);
                    librosVendidos.put(libro, cantidad);
                    precioCompra += precioVenta * cantidad; // Sumar el precio total de este libro
                    break;
                }
            }
        }

        // Crear el objeto Venta con el precio de compra incluido
        Venta nuevaVenta = new Venta(fecha, cliente, factura, librosVendidos, (int) precioCompra);

        // Agregar la venta al sistema (solo aquí)
        sistema.agregarVenta(nuevaVenta);

        // Guardar la nueva venta en el archivo (sin agregar nuevamente al sistema)
        guardarVentaEnArchivo();

        // Actualizar el stock en el archivo libros.txt
        actualizarStockEnArchivoLibros(librosVendidos);

        // Incrementar el número de factura y guardar en el archivo
        guardarNumeroFactura(factura + 1);

        // Limpieza: vaciar el modelo de la lista de ventas
        modeloVenta.clear();
        txtCliente.setText("");
        txtFecha.setText("--/--/----");

        // Reiniciar el total acumulado
        lblTotal.setText("Total: $ 0");

        JOptionPane.showMessageDialog(
            this,
            "Venta registrada exitosamente con factura #" + factura,
            "Éxito",
            JOptionPane.INFORMATION_MESSAGE
        );

        this.actualizarNroFactura(); 
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    public void actualizarLibros() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Libro libro : sistema.getListaLibros()) {
            String textoGenero = libro.getIsbn() + " - " + libro.getTitulo();
            modelo.addElement(textoGenero);
        }
        lstLibros.setModel(modelo);
    }
    
    public void actualizarNroFactura() {
        int factura = leerNumeroFactura(); // Leer el número de factura desde el archivo
        this.lblNroFactura.setText("Factura: " + factura);
    }

    // Método para obtener la ruta relativa base del proyecto
    private String obtenerRutaBase() {
        return System.getProperty("user.dir") + File.separator + "datos";
    }
    
    // Método para asegurar que la carpeta base exista
    private void verificarOCrearCarpetaBase() {
        File carpetaBase = new File(obtenerRutaBase());
        if (!carpetaBase.exists()) {
            carpetaBase.mkdirs();
        }
    }
    
    private int leerNumeroFactura() {
        verificarOCrearCarpetaBase(); // Verificar la existencia de la carpeta base

        String rutaArchivo = obtenerRutaBase() + File.separator + "nrofactura.txt";
        File archivo = new File(rutaArchivo);

        try {
            if (!archivo.exists()) {
                // Si no existe el archivo, lo creamos con el valor inicial 1
                FileWriter writer = new FileWriter(archivo);
                writer.write("1");
                writer.close();
                return 1;
            }

            // Leer el contenido del archivo
            java.util.Scanner scanner = new java.util.Scanner(archivo);
            int factura = scanner.nextInt(); // Leer el número
            scanner.close();
            return factura;

        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al leer el número de factura: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return 1;
        }
    }
    
    private void guardarNumeroFactura(int factura) {
        verificarOCrearCarpetaBase(); // Verificar la existencia de la carpeta base

        String rutaArchivo = obtenerRutaBase() + File.separator + "nrofactura.txt";
        File archivo = new File(rutaArchivo);

        try {
            // Escribir el número en el archivo
            FileWriter writer = new FileWriter(archivo);
            writer.write(String.valueOf(factura));
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al guardar el número de factura: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void actualizarTotal(double monto) {
        String textoActual = lblTotal.getText(); // Ejemplo: "Total: $ 1500"
        String[] partes = textoActual.split("\\$");
        double totalActual = Double.parseDouble(partes[1].trim());

        // Ajustamos el total acumulado
        double nuevoTotal = totalActual + monto;

        // Actualizamos el texto de lblTotal
        lblTotal.setText("Total: $ " + String.format("%.2f", nuevoTotal));
    }
    
    private void guardarVentaEnArchivo() {
        verificarOCrearCarpetaBase(); // Verificar la existencia de la carpeta base

        String rutaArchivo = obtenerRutaBase() + File.separator + "ventas.txt";
        File archivo = new File(rutaArchivo);

        try {
            // Ordenar las ventas en orden descendente por número de factura
            sistema.getListaVentas().sort(Comparator.comparingInt(Venta::getFactura).reversed());

            // Sobrescribir el archivo con todas las ventas ordenadas
            FileWriter writer = new FileWriter(archivo, false); // Modo sobrescribir

            for (Venta venta : sistema.getListaVentas()) {
                // Crear una línea que represente la venta
                StringBuilder lineaVenta = new StringBuilder();
                lineaVenta.append(venta.getFecha()).append("|");
                lineaVenta.append(venta.getCliente()).append("|");
                lineaVenta.append(venta.getFactura()).append("|");
                lineaVenta.append(venta.getPrecioCompra()).append("|");

                // Iterar sobre los libros vendidos y añadirlos a la línea
                for (Libro libro : venta.getLibros().keySet()) {
                    int cantidad = venta.getLibros().get(libro);
                    lineaVenta.append(libro.getIsbn()).append(":").append(cantidad).append(",");
                }

                // Eliminar la última coma
                if (lineaVenta.charAt(lineaVenta.length() - 1) == ',') {
                    lineaVenta.deleteCharAt(lineaVenta.length() - 1);
                }

                lineaVenta.append("\n");

                // Escribir la línea en el archivo
                writer.write(lineaVenta.toString());
            }

            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al guardar la venta en el archivo: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void actualizarStockEnArchivoLibros(HashMap<Libro, Integer> librosVendidos) {
        verificarOCrearCarpetaBase(); // Verificar la existencia de la carpeta base

        String rutaArchivo = obtenerRutaBase() + File.separator + "libros.txt";
        File archivo = new File(rutaArchivo);
        File archivoTemporal = new File(rutaArchivo + ".tmp");

        try {
            // Leer el archivo original y escribir uno nuevo con el stock actualizado
            java.util.Scanner scanner = new java.util.Scanner(archivo);
            FileWriter writer = new FileWriter(archivoTemporal);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] partes = linea.split("\\|");
                String isbn = partes[0];

                boolean actualizado = false;
                for (Libro libro : librosVendidos.keySet()) {
                    if (libro.getIsbn().equals(isbn)) {
                        // Restar el stock vendido
                        int stockActual = Integer.parseInt(partes[8]); // El stock está en la posición 8
                        int stockVendido = librosVendidos.get(libro);
                        partes[8] = String.valueOf(stockActual - stockVendido);
                        actualizado = true;
                        break;
                    }
                }

                if (actualizado) {
                    writer.write(String.join("|", partes) + System.lineSeparator());
                } else {
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
            java.util.logging.Logger.getLogger(RegistroDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLibros;
    private javax.swing.JLabel lblNroFactura;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVenta;
    private javax.swing.JList<String> lstLibros;
    private javax.swing.JList<String> lstVenta;
    private javax.swing.JScrollPane scrLibros;
    private javax.swing.JScrollPane scrVenta;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
