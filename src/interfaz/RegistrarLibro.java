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
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RegistrarLibro extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarLibro
     */
    
    private String pathFoto;
    
    private Libreria sistema;
    
    public RegistrarLibro() {
        initComponents();
    }    
    
    public RegistrarLibro(Libreria sistema) {
        initComponents();
        
        this.sistema = sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEditorial = new javax.swing.JLabel();
        scrEditorial = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList<>();
        lblGenero = new javax.swing.JLabel();
        scrGenero = new javax.swing.JScrollPane();
        lstGenero = new javax.swing.JList<>();
        lblAutor = new javax.swing.JLabel();
        scrAutor = new javax.swing.JScrollPane();
        lstAutor = new javax.swing.JList<>();
        pnlFoto = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        lblIsbn = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblVenta = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        txtVenta = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiarImg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Libro");

        lblEditorial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEditorial.setText("Editorial:");

        lstEditorial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstEditorial.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEditorial.setToolTipText("");
        scrEditorial.setViewportView(lstEditorial);

        lblGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGenero.setText("Genero:");

        lstGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstGenero.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstGenero.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstGeneroValueChanged(evt);
            }
        });
        scrGenero.setViewportView(lstGenero);

        lblAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAutor.setText("Autor:");

        lstAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstAutor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrAutor.setViewportView(lstAutor);

        pnlFoto.setBackground(new java.awt.Color(255, 255, 255));
        pnlFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFoto.setText("No hay foto");

        javax.swing.GroupLayout pnlFotoLayout = new javax.swing.GroupLayout(pnlFoto);
        pnlFoto.setLayout(pnlFotoLayout);
        pnlFotoLayout.setHorizontalGroup(
            pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFotoLayout.createSequentialGroup()
                .addComponent(lblFoto)
                .addGap(0, 149, Short.MAX_VALUE))
        );
        pnlFotoLayout.setVerticalGroup(
            pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFotoLayout.createSequentialGroup()
                .addComponent(lblFoto)
                .addGap(0, 263, Short.MAX_VALUE))
        );

        btnFoto.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnFoto.setText("Cargar foto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        lblIsbn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIsbn.setText("Isbn:");

        txtIsbn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitulo.setText("Titulo:");

        lblCosto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCosto.setText("Costo:");

        lblVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVenta.setText("Venta:");

        lblStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStock.setText("Stock:");

        txtCosto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiarImg.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLimpiarImg.setText("x");
        btnLimpiarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEditorial)
                            .addComponent(lblGenero)
                            .addComponent(lblAutor)
                            .addComponent(lblIsbn)
                            .addComponent(lblTitulo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(scrEditorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIsbn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpiarImg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(189, 189, 189))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtVenta, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIsbn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEditorial)
                            .addComponent(scrEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAutor)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFoto)
                            .addComponent(btnLimpiarImg))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStock)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCosto)
                        .addComponent(lblVenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Imágenes (JPG, JPEG, PNG)", "jpg", "jpeg", "png"));
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            pathFoto = selectedFile.getAbsolutePath(); // Almacena la ruta

            // Limpia el panel
            pnlFoto.removeAll();

            // Cargar la imagen
            ImageIcon icon = new ImageIcon(pathFoto);
            Image scaledImage = icon.getImage().getScaledInstance(
                    pnlFoto.getWidth(), pnlFoto.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            // Crear JLabel para mostrar la imagen
            JLabel lblFoto = new JLabel(icon);
            lblFoto.setHorizontalAlignment(JLabel.CENTER); // Centra horizontalmente
            lblFoto.setVerticalAlignment(JLabel.CENTER);   // Centra verticalmente

            // Agregar JLabel al panel
            pnlFoto.setLayout(new BorderLayout()); // Asegura que el JLabel ocupe todo el espacio del panel
            pnlFoto.add(lblFoto, BorderLayout.CENTER);

            // Actualiza el panel
            pnlFoto.revalidate();
            pnlFoto.repaint();
        }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    // Validamos que no se esten utilizando caracteres prohibidos
    if (this.txtTitulo.getText().contains(" - ") || 
        this.txtIsbn.getText().contains(" - ") ||
        this.txtVenta.getText().contains(" - ") ||
        this.txtIsbn.getText().contains("|") ||
        this.txtVenta.getText().contains("|") ||
        this.txtTitulo.getText().contains("|")) {
        JOptionPane.showMessageDialog(
            this,
            "No se pueden utilizar los siguientes caracteres: ' - ', '|'",
            "Error",
            JOptionPane.ERROR_MESSAGE
        );
        return; // Salimos de la acción si se detectan caracteres prohibidos
    }

    if (this.txtTitulo.getText().length() > 0 && 
        this.txtIsbn.getText().length() > 0 &&
        this.esNumeroEntero(this.txtCosto.getText()) && 
        this.esNumeroEntero(this.txtStock.getText()) &&
        this.esNumeroEntero(this.txtVenta.getText()) &&
        this.lstAutor.getSelectedIndex() != -1 &&
        this.lstEditorial.getSelectedIndex() != -1 &&
        this.lstGenero.getSelectedIndex() != -1) {
            // Chequeamos que el stock sea valido
            if (!(Integer.parseInt(this.txtStock.getText()) >= 0)) {
                // El stock es menor que 0
                JOptionPane.showMessageDialog(
                    this,
                    "El stock no puede ser menor que 0.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (this.sistema.libroRepetido(this.txtIsbn.getText().trim())) {
                // El isbn esta repetido
                JOptionPane.showMessageDialog(
                    this,
                    "Ya se ha registrado un libro con este isbn.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                // Todo es valido, ingresamos el nuevo objeto
                String editorial = this.lstEditorial.getSelectedValue();
                String genero = this.lstGenero.getSelectedValue();
                String autor = this.lstAutor.getSelectedValue();
                String isbn = this.txtIsbn.getText().trim();
                String titulo = this.txtTitulo.getText().trim();
                int precioCosto = Integer.parseInt(this.txtCosto.getText());
                int precioVenta = Integer.parseInt(this.txtVenta.getText());
                int stock = Integer.parseInt(this.txtStock.getText());
                
                                            
                String foto = "";
                
                if (pathFoto != null && !pathFoto.isEmpty()) {
                    // Verificamos si existe la carpeta imagenes, y si no, la creamos
                    String directorioActual = System.getProperty("user.dir");
                    String carpetaImagenesPath = directorioActual + File.separator + "imagenes";
                    File carpetaImagenes = new File(carpetaImagenesPath);
                    if (!carpetaImagenes.exists()) {
                        carpetaImagenes.mkdir();
                    }

                    // Añadimos la imagen seleccionada a la carpeta con un nombre único
                    File archivoOrigen = new File(pathFoto);
                    String nombreArchivo = archivoOrigen.getName();
                    String nombreSinExtension = nombreArchivo.substring(0, nombreArchivo.lastIndexOf("."));
                    String extension = nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
                    File archivoDestino = new File(carpetaImagenesPath + File.separator + nombreArchivo);

                    int contador = 1;
                    while (archivoDestino.exists()) {
                        // Generamos un nuevo nombre único añadiendo un contador
                        String nuevoNombre = nombreSinExtension + "_" + contador + extension;
                        archivoDestino = new File(carpetaImagenesPath + File.separator + nuevoNombre);
                        contador++;
                    }

                    try {
                        // Copiar el archivo
                        Files.copy(archivoOrigen.toPath(), archivoDestino.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        foto = archivoDestino.getAbsolutePath(); // Guardamos la ruta final
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(
                            this,
                            "Error al copiar la imagen.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                }
                
                // Creamos el nuevo libro
                Libro libroNuevo = new Libro(editorial, genero, autor, isbn, titulo, foto, precioCosto, precioVenta, stock);
                this.sistema.agregarLibro(libroNuevo);
                
                this.guardarLibroEnArchivo(libroNuevo);
                
                // Limpiamos las selecciones
                this.txtCosto.setText("");
                this.txtVenta.setText("");
                this.txtIsbn.setText("");
                this.txtStock.setText("");
                this.txtTitulo.setText("");
                this.lstAutor.clearSelection();
                this.lstEditorial.clearSelection();
                this.lstGenero.clearSelection();
                
                this.restaurarPnlFoto();
                this.pathFoto = ""; // Reiniciar el path de la foto
            }
    } else {
            // Catcheamos errores posibles
            if (!(this.txtTitulo.getText().length() > 0)) {
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha ingresado un titulo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (!(this.txtIsbn.getText().length() > 0)) {
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha ingresado un Isbn.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (!(this.esNumeroEntero(this.txtCosto.getText()))) {
                JOptionPane.showMessageDialog(
                    this,
                    "El valor de coste ingresado no es valido.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (!(this.esNumeroEntero(this.txtStock.getText()))) {
                JOptionPane.showMessageDialog(
                    this,
                    "El valor de stock ingresado no es valido.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (!(this.esNumeroEntero(this.txtVenta.getText()))) {
                JOptionPane.showMessageDialog(
                    this,
                    "El valor de venta ingresado no es valido.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (!(this.lstAutor.getSelectedIndex() != -1)) {
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha seleccionado un autor.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (!(this.lstEditorial.getSelectedIndex() != -1)) {
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha seleccionado una editorial.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (!(this.lstGenero.getSelectedIndex() != -1)) {
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha seleccionado un genero.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void lstGeneroValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstGeneroValueChanged
        this.cargarAutores(this.lstGenero.getSelectedValue());
    }//GEN-LAST:event_lstGeneroValueChanged

    private void btnLimpiarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarImgActionPerformed
        this.restaurarPnlFoto();
    }//GEN-LAST:event_btnLimpiarImgActionPerformed

    public boolean esNumeroEntero(String texto) {
        try {
            Integer.parseInt(texto);
            return true; // Es un número entero
        } catch (NumberFormatException e) {
            return false; // No es un número
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    // Metodo para cargar la lista de generos
    public void cargarGeneros() {
        DefaultListModel<String> modelo = new DefaultListModel<>();

        for (Genero genero : this.sistema.getListaGeneros()) {      
            modelo.addElement(genero.getNombre());
        }

        lstGenero.setModel(modelo);
    }

    // Metodo para cargar la lista de editoriales
    public void cargarEditoriales() {
        DefaultListModel<String> modelo = new DefaultListModel<>();

        for (Editorial editorial : this.sistema.getListaEditoriales()) {      
            modelo.addElement(editorial.getNombre());
        }

        lstEditorial.setModel(modelo);
    }
    
    // Metodo para cargar la lista de autores que coincidan con un genero
    public void cargarAutores(String genero) {
        if (genero != null) {
            DefaultListModel<String> modelo = new DefaultListModel<>();

            for (Autor autor : this.sistema.getListaAutores()) { 
                for (String generoActual : autor.getGeneros()) {
                    if (genero.trim().equalsIgnoreCase(generoActual)) {
                        modelo.addElement(autor.getNombre());
                        break; // puede que este break rompa algo, revisar
                    }
                }
            }

            lstAutor.setModel(modelo);
        }
    }
    
    private void restaurarPnlFoto() {
        // Limpiar el panel de cualquier contenido actual
        pnlFoto.removeAll();

        // Restaurar el diseño original
        pnlFoto.setLayout(new javax.swing.GroupLayout(pnlFoto));

        // Crear una nueva etiqueta lblFoto con el texto original
        lblFoto = new javax.swing.JLabel("No hay foto");
        lblFoto.setBounds(0, 0, 149, 263); // Reestablecer las dimensiones originales si es necesario

        // Añadir lblFoto al panel
        javax.swing.GroupLayout pnlFotoLayout = new javax.swing.GroupLayout(pnlFoto);
        pnlFoto.setLayout(pnlFotoLayout);
        pnlFotoLayout.setHorizontalGroup(
            pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFotoLayout.createSequentialGroup()
                    .addComponent(lblFoto)
                    .addGap(0, 149, Short.MAX_VALUE))
        );
        pnlFotoLayout.setVerticalGroup(
            pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFotoLayout.createSequentialGroup()
                    .addComponent(lblFoto)
                    .addGap(0, 263, Short.MAX_VALUE))
        );

        // Actualizar la vista
        pnlFoto.revalidate();
        pnlFoto.repaint();

        // Reiniciar el path de la foto
        pathFoto = "";
    }
    
    private void guardarLibroEnArchivo(Libro libro) {
        String rutaArchivo = System.getProperty("user.dir") + File.separator + "datos" + File.separator + "libros.txt";
        File archivo = new File(rutaArchivo);

        try {
            // Crear la carpeta 'datos' si no existe
            archivo.getParentFile().mkdirs();

            // Abrir el archivo en modo de anexado
            FileWriter writer = new FileWriter(archivo, true);
            writer.write(libro.getIsbn() + "|" + libro.getTitulo() + "|" + libro.getEditorial() + "|" +
                         libro.getGenero() + "|" + libro.getAutor() + "|" + libro.getFoto() + "|" +
                         libro.getPrecioCosto() + "|" + libro.getPrecioVenta() + "|" + libro.getStock() + "\n");
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al guardar el libro en el archivo: " + e.getMessage(),
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
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnLimpiarImg;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVenta;
    private javax.swing.JList<String> lstAutor;
    private javax.swing.JList<String> lstEditorial;
    private javax.swing.JList<String> lstGenero;
    private javax.swing.JPanel pnlFoto;
    private javax.swing.JScrollPane scrAutor;
    private javax.swing.JScrollPane scrEditorial;
    private javax.swing.JScrollPane scrGenero;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtVenta;
    // End of variables declaration//GEN-END:variables
}
