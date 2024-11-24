/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import gestiondelibrerias.Libreria;

/**
 *
 * @author marti
 */
public class BuscarIsbn extends javax.swing.JFrame {

    /**
     * Creates new form BuscarIsbn
     */
    private Libreria sistema;
    
    public BuscarIsbn() {
        initComponents();
    }
    
    public BuscarIsbn(Libreria sistema) {
        initComponents();
        
        this.sistema = sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BuscarIsbn");

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarIsbn().setVisible(true);
            }
        });
    }
    
    public void actualizarLista() {
        if (sistema == null) {
            return; // Si el sistema no está inicializado, no hacemos nada
        }

        // Crear un modelo de lista para almacenar los datos
        javax.swing.DefaultListModel<String> modelo = new javax.swing.DefaultListModel<>();

        // Recorrer la lista de libros en el sistema
        for (gestiondelibrerias.Libro libro : sistema.getListaLibros()) {
            // Formatear cada línea con el formato requerido
            String linea = libro.getIsbn() + " - " + libro.getTitulo();
            modelo.addElement(linea);
        }

        // Asignar el modelo a la lista (jList1)
        jList1.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
