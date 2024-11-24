/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author marti
 */

import gestiondelibrerias.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class RegistrarAutor extends javax.swing.JFrame {
    
    private Libreria sistema;
    
    public RegistrarAutor() {
        initComponents();
    }
    
    public RegistrarAutor(Libreria sistema) {
        initComponents();
        
        this.sistema = sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblGeneros = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        scrGeneros = new javax.swing.JScrollPane();
        lstGeneros = new javax.swing.JList<>();
        btnAgregar = new javax.swing.JButton();
        sepRegistroDatos = new javax.swing.JSeparator();
        scrDatos = new javax.swing.JScrollPane();
        lstDatos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Autor");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre:");

        lblNacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNacionalidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNacionalidad.setText("Nacionalidad:");

        lblGeneros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGeneros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGeneros.setText("Generos que escribe:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtNacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        lstGeneros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        scrGeneros.setViewportView(lstGeneros);

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lstDatos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        scrDatos.setViewportView(lstDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrDatos)
                    .addComponent(sepRegistroDatos)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNacionalidad)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGeneros)
                    .addComponent(scrGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sepRegistroDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (this.txtNombre.getText().contains("|") || this.txtNacionalidad.getText().contains("|")) {
            JOptionPane.showMessageDialog(
                this,
                "No se puede utilizar el carácter '|'.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return; // Salimos del método para evitar el registro
        }

        if (this.txtNombre.getText().length() > 0 && this.txtNacionalidad.getText().length() > 0 && this.lstGeneros.getSelectedIndex() != -1) {
            // Aqui sabemos que todas las opciones han sindo ingresadas        
            if (sistema.autorRepetido(this.txtNombre.getText())) {
                // Que hacemos si el autor esta repetido
                JOptionPane.showMessageDialog(
                    this,
                    "Ya se ha ingresado a este autor.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                // Creamos un nuevo autor y lo añadimos a sistema
                String nombre = this.txtNombre.getText().trim();
                String nacionalidad = this.txtNacionalidad.getText().trim();
                List<String> generosSeleccionados = this.lstGeneros.getSelectedValuesList();
                ArrayList<String> generos = new ArrayList<>(generosSeleccionados);
                
                Autor nuevoAutor = new Autor(nombre, nacionalidad, generos);
                this.sistema.agregarAutor(nuevoAutor);
                
                this.guardarAutorEnArchivo(nuevoAutor);
                
                this.actualizarLista();
                
                this.txtNombre.setText("");
                this.txtNacionalidad.setText("");
                this.lstGeneros.clearSelection();
            }
        // Que hacer cuando faltan datos
        } else {
            if (!(this.txtNombre.getText().length() > 0)) {
                // No se ha ingresado un nombre
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha ingresado un nombre.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (!(this.txtNacionalidad.getText().length() > 0)) {
                // No se ha ingresado una nacionalidad
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha ingresado una nacionalidad.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                // No se ha ingresado un genero
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha seleccionado ningun genero.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void actualizarLista() {
        DefaultListModel<String> modelo = new DefaultListModel<>();

        for (Autor autor : this.sistema.getListaAutores()) {
            String textoAutor = autor.getNombre() + " - " + autor.getNacionalidad() + " - Generos: ";
            
            for (int i = 0 ; i<autor.getGeneros().size() ; i++) {
                if (i == (autor.getGeneros().size() - 1)) {
                    // El ultimo genero
                    textoAutor = textoAutor + autor.getGeneros().get(i);
                } else {
                    textoAutor = textoAutor + autor.getGeneros().get(i) + ", ";
                }
            }
            
            modelo.addElement(textoAutor);
        }

        lstDatos.setModel(modelo);
    }
    
    public void cargarGeneros() {
        DefaultListModel<String> modelo = new DefaultListModel<>();

        for (Genero genero : this.sistema.getListaGeneros()) {      
            modelo.addElement(genero.getNombre());
        }

        lstGeneros.setModel(modelo);
    }
   
    private void guardarAutorEnArchivo(Autor autor) {
        // Ruta base para la carpeta datos
        String carpetaDatos = System.getProperty("user.dir") + File.separator + "datos";
        String rutaArchivoAutores = carpetaDatos + File.separator + "autores.txt";
        File archivo = new File(rutaArchivoAutores);

        try {
            // Crear carpeta "datos" si no existe
            File carpeta = new File(carpetaDatos);
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            // Abrir el archivo en modo de anexado
            FileWriter writer = new FileWriter(archivo, true);
            String generos = String.join(",", autor.getGeneros());
            writer.write(autor.getNombre() + "|" + autor.getNacionalidad() + "|" + generos + "\n");
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al guardar el autor en el archivo: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
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
            java.util.logging.Logger.getLogger(RegistrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel lblGeneros;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> lstDatos;
    private javax.swing.JList<String> lstGeneros;
    private javax.swing.JScrollPane scrDatos;
    private javax.swing.JScrollPane scrGeneros;
    private javax.swing.JSeparator sepRegistroDatos;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
