/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import gestiondelibrerias.Libreria;
import gestiondelibrerias.Libro;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConsultaDeLibros extends javax.swing.JFrame {

    private Libreria sistema;
    public ConsultaDeLibros() {
        initComponents();
    }
    
    public ConsultaDeLibros(Libreria sistema){
        initComponents();
        this.sistema = sistema;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        sepBusqueda = new javax.swing.JSeparator();
        scrBusqueda = new javax.swing.JScrollPane();
        pnlFotos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Libros");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitulo.setText("Titulo:");

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAutor.setText("Autor:");

        txtAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGenero.setText("Genero:");

        txtGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFotosLayout = new javax.swing.GroupLayout(pnlFotos);
        pnlFotos.setLayout(pnlFotosLayout);
        pnlFotosLayout.setHorizontalGroup(
            pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        pnlFotosLayout.setVerticalGroup(
            pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        scrBusqueda.setViewportView(pnlFotos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(txtTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblAutor)
                        .addGap(17, 17, 17)
                        .addComponent(txtAutor))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblGenero)
                        .addGap(7, 7, 7)
                        .addComponent(txtGenero))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsultar))
                    .addComponent(sepBusqueda, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sepBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBusqueda)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        this.consultarLibros();
    }//GEN-LAST:event_btnConsultarActionPerformed

    public void consultarLibros(){
        String genero = txtGenero.getText().toLowerCase().trim();
        String titulo = txtTitulo.getText().toLowerCase().trim();
        String autor = txtAutor.getText().toLowerCase().trim();
        ArrayList<Libro> listaResultado = new ArrayList<Libro>();
        
        for (Libro libro : this.sistema.getListaLibros()) {
            boolean coincideGenero = genero.isEmpty() || libro.getGenero().toLowerCase().trim().contains(genero);
            boolean coincideTitulo = titulo.isEmpty() || libro.getTitulo().toLowerCase().trim().contains(titulo);
            boolean coincideAutor = autor.isEmpty() || libro.getAutor().toLowerCase().trim().contains(autor);
            
            if (coincideGenero && coincideTitulo && coincideAutor) {
                listaResultado.add(libro);
            }
        }
        
        // Limpiar datos
        pnlFotos.removeAll();
        txtGenero.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        pnlFotos.revalidate();
        pnlFotos.repaint();
        
        this.generarImagenes(listaResultado);
    }
    
    public void generarImagenes(ArrayList<Libro> listaResultado) {
        // Configurar el layout del panel para mostrar una grilla
        pnlFotos.setLayout(new GridLayout(0, 4, 10, 10)); // 4 columnas, ajustable

        for (Libro libro : listaResultado) {
            // Crear un botón para cada libro
            JButton nuevo = new JButton();
            nuevo.setHorizontalAlignment(JButton.CENTER);
            nuevo.setVerticalAlignment(JButton.CENTER);

            // Agregar la imagen o el ISBN como texto si no hay imagen o la imagen no es válida
            File archivoImagen = new File(libro.getFoto());
            if (libro.getFoto() != null && !libro.getFoto().isEmpty() && archivoImagen.exists()) {
                ImageIcon icon = new ImageIcon(libro.getFoto());
                Image scaledImage = icon.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH); // Ajustar tamaño
                nuevo.setIcon(new ImageIcon(scaledImage));
            } else {
                nuevo.setText(libro.getIsbn());
            }

            // Agregar un action listener al botón para abrir la ventana de detalles
            nuevo.addActionListener(new LibroListener(libro));

            // Añadir el botón al panel
            pnlFotos.add(nuevo);
        }

        // Actualizar el panel
        pnlFotos.revalidate();
        pnlFotos.repaint();
    }

    // Clase interna para manejar eventos de botones
    private class LibroListener implements ActionListener {
        private Libro libro;

        public LibroListener(Libro libro) {
            this.libro = libro;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Al presionar un botón, abrir la ventana de detalles del libro
            DatosLibro ventanaDetalles = new DatosLibro(libro);
            ventanaDetalles.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventanaDetalles.setVisible(true);
        }
    }
    
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
            java.util.logging.Logger.getLogger(ConsultaDeLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaDeLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFotos;
    private javax.swing.JScrollPane scrBusqueda;
    private javax.swing.JSeparator sepBusqueda;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
