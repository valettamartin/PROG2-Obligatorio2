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
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class ConsultaDeVentas extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaDeVentas
     */
    
    private Libreria sistema;
    private javax.swing.JInternalFrame buscarIsbnFrame;
    
    public ConsultaDeVentas() {
        initComponents();
    }
    
    public ConsultaDeVentas(Libreria sistema) {
        initComponents();
        
        this.sistema = sistema;
        
        // Añadir un WindowListener para manejar el cierre de la ventana principal
        this.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            if (buscarIsbnFrame != null && buscarIsbnFrame.isVisible()) {
                buscarIsbnFrame.dispose(); // Cerrar el JInternalFrame
            }
        }
    });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIsbn = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        btnIsbn = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        lblTituloLibro = new javax.swing.JLabel();
        scrDatos = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblEjemplaresVendidos = new javax.swing.JLabel();
        lblTotalGanancia = new javax.swing.JLabel();
        lblTotalRecaudado = new javax.swing.JLabel();
        lblNumEjemplaresVendidos = new javax.swing.JLabel();
        lblNumTotalGanancia = new javax.swing.JLabel();
        lblNumTotalRecaudado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Ventas");

        lblIsbn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblIsbn.setText("Isbn");

        txtIsbn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtIsbn.setText("---");

        btnIsbn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnIsbn.setText("...");
        btnIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsbnActionPerformed(evt);
            }
        });

        btnExportar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblTituloLibro.setBackground(new java.awt.Color(0, 0, 153));
        lblTituloLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloLibro.setText("---");

        tblDatos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Cliente", "Factura", "Cantidad", "Precio", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDatos.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tblDatos.setName(""); // NOI18N
        tblDatos.setPreferredSize(new java.awt.Dimension(450, 400));
        scrDatos.setViewportView(tblDatos);

        lblEjemplaresVendidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEjemplaresVendidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEjemplaresVendidos.setText("Ejemplares vendidos:");
        lblEjemplaresVendidos.setMaximumSize(new java.awt.Dimension(130, 20));
        lblEjemplaresVendidos.setMinimumSize(new java.awt.Dimension(130, 20));
        lblEjemplaresVendidos.setPreferredSize(new java.awt.Dimension(130, 20));

        lblTotalGanancia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalGanancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalGanancia.setText("Total ganancia:");
        lblTotalGanancia.setMaximumSize(new java.awt.Dimension(130, 20));
        lblTotalGanancia.setMinimumSize(new java.awt.Dimension(130, 20));
        lblTotalGanancia.setPreferredSize(new java.awt.Dimension(130, 20));

        lblTotalRecaudado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalRecaudado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalRecaudado.setText("Total Recaudado:");

        lblNumEjemplaresVendidos.setBackground(new java.awt.Color(0, 0, 153));
        lblNumEjemplaresVendidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumEjemplaresVendidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumEjemplaresVendidos.setText("-");

        lblNumTotalGanancia.setBackground(new java.awt.Color(0, 0, 153));
        lblNumTotalGanancia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumTotalGanancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumTotalGanancia.setText("-");

        lblNumTotalRecaudado.setBackground(new java.awt.Color(0, 0, 153));
        lblNumTotalRecaudado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumTotalRecaudado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumTotalRecaudado.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrDatos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIsbn)
                        .addGap(18, 18, 18)
                        .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIsbn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExportar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloLibro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumEjemplaresVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEjemplaresVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumTotalRecaudado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalRecaudado, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNumTotalGanancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalGanancia, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIsbn)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIsbn)
                    .addComponent(btnExportar)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addComponent(lblTituloLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEjemplaresVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalRecaudado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumEjemplaresVendidos)
                    .addComponent(lblNumTotalRecaudado)
                    .addComponent(lblNumTotalGanancia))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
            String isbnBuscado = txtIsbn.getText().trim();

            if (isbnBuscado.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this,
                    "Por favor, ingrese un ISBN para consultar.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            Libro libroBuscado = null;

            // Buscar el libro en la lista del sistema
            for (Libro libro : sistema.getListaLibros()) {
                if (libro.getIsbn().equals(isbnBuscado)) {
                    libroBuscado = libro;
                    break;
                }
            }

            if (libroBuscado == null) {
                JOptionPane.showMessageDialog(
                    this,
                    "No se encontró un libro con el ISBN especificado.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            // Configurar título del libro
            lblTituloLibro.setText(libroBuscado.getTitulo());

            // Variables para acumuladores
            int totalEjemplaresVendidos = 0;
            double totalRecaudado = 0;
            double totalGanancia = 0;

            // Limpiar la tabla
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblDatos.getModel();
            model.setRowCount(0);

            // Procesar las ventas que incluyen el libro
            for (Venta venta : sistema.getListaVentas()) {
                if (venta.getLibros().containsKey(libroBuscado)) {
                    int cantidad = venta.getLibros().get(libroBuscado);
                    double precioIndividual = libroBuscado.getPrecioVenta();
                    double importe = precioIndividual * cantidad;

                    // Añadir datos a la tabla
                    model.addRow(new Object[]{
                        venta.getFecha(),
                        venta.getCliente(),
                        venta.getFactura(),
                        cantidad,
                        String.format("%.2f", precioIndividual),
                        String.format("%.2f", importe)
                    });

                    // Actualizar acumuladores
                    totalEjemplaresVendidos += cantidad;
                    totalRecaudado += importe;
                    totalGanancia += (precioIndividual - libroBuscado.getPrecioCosto()) * cantidad;
                }
            }

            // Actualizar los valores de los labels
            lblNumEjemplaresVendidos.setText(String.valueOf(totalEjemplaresVendidos));
            lblNumTotalRecaudado.setText(String.format("$ %.2f", totalRecaudado));
            lblNumTotalGanancia.setText(String.format("$ %.2f", totalGanancia));
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // Ruta relativa para el archivo
        String rutaCarpeta = System.getProperty("user.dir") + File.separator + "exportados";
        File carpetaExportados = new File(rutaCarpeta);
        if (!carpetaExportados.exists()) {
            carpetaExportados.mkdirs(); // Crear carpeta si no existe
        }
        String rutaArchivo = rutaCarpeta + File.separator + "VENTAS.CSV";

        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            // Escribir los títulos de las columnas
            writer.write("Fecha;Cliente;Factura;Cantidad;Precio;Importe\n");

            // Recorrer las filas de la tabla
            javax.swing.table.TableModel modeloTabla = tblDatos.getModel();
            for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                StringBuilder linea = new StringBuilder();
                for (int j = 0; j < modeloTabla.getColumnCount(); j++) {
                    linea.append(modeloTabla.getValueAt(i, j));
                    if (j < modeloTabla.getColumnCount() - 1) {
                        linea.append(";");
                    }
                }
                linea.append("\n");
                writer.write(linea.toString());
            }

            // Confirmación de éxito
            JOptionPane.showMessageDialog(
                this,
                "Archivo 'VENTAS.CSV' exportado exitosamente en la carpeta 'exportados'.",
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE
            );
        } catch (IOException e) {
            // Manejo de errores
            JOptionPane.showMessageDialog(
                this,
                "Error al exportar el archivo: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsbnActionPerformed
        // Verificar si la ventana ya está abierta
        if (buscarIsbnFrame != null && buscarIsbnFrame.isVisible()) {
            return; // Si ya está abierta, no hacemos nada
        }

        // Crear un JInternalFrame para contener la ventana BuscarIsbn
        buscarIsbnFrame = new javax.swing.JInternalFrame("Buscar ISBN", false, true, false, false);

        // Configurar el tamaño y posición del JInternalFrame
        buscarIsbnFrame.setSize(300, 400);
        buscarIsbnFrame.setLocation(this.getWidth() - 310, 10); // Posicionar al lado derecho de la ventana principal

        // Crear la instancia del componente BuscarIsbn y pasarle el sistema
        BuscarIsbn buscarIsbn = new BuscarIsbn(this.sistema);
        buscarIsbnFrame.add(buscarIsbn.getContentPane());
        buscarIsbn.actualizarLista(); // Actualizar la lista después de inicializar

        // Asegurarse de que el JInternalFrame sea visible
        buscarIsbnFrame.setVisible(true);

        // Obtener el JLayeredPane de la ventana principal
        javax.swing.JLayeredPane layeredPane = this.getLayeredPane();

        // Añadir el JInternalFrame al JLayeredPane con la capa superior
        layeredPane.add(buscarIsbnFrame, javax.swing.JLayeredPane.PALETTE_LAYER);

        // Revalidar y repintar para mostrar correctamente
        layeredPane.moveToFront(buscarIsbnFrame); // Traer al frente
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnIsbnActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaDeVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnIsbn;
    private javax.swing.JLabel lblEjemplaresVendidos;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblNumEjemplaresVendidos;
    private javax.swing.JLabel lblNumTotalGanancia;
    private javax.swing.JLabel lblNumTotalRecaudado;
    private javax.swing.JLabel lblTituloLibro;
    private javax.swing.JLabel lblTotalGanancia;
    private javax.swing.JLabel lblTotalRecaudado;
    private javax.swing.JScrollPane scrDatos;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtIsbn;
    // End of variables declaration//GEN-END:variables
}
