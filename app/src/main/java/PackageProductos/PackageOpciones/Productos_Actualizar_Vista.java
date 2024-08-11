package PackageProductos.PackageOpciones;


import PackageEmpresas.Empresas_Controlador;
import PackageEmpresas.Empresas_Object;
import PackageProductos.Productos_Controlador;
import PackageProductos.Productos_Object;
import PackageProductos.Productos_Vista;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos_Actualizar_Vista extends javax.swing.JFrame {

    //OBJETOS DEL CONTROLADOR DE PRODUCTO Y EMPRESA
    private final Productos_Controlador controladorProducto = new Productos_Controlador();
    private final Empresas_Controlador controladorEmpresa = new Empresas_Controlador();
    

    //OBJETO DE LA VISTA PRODUCTO PRINCIPAL
    private final Productos_Vista vistaP;

    //OBJETO DE PRODUCTO
    private Productos_Object producto;

    //OBJETO INDICE TABLA
    private int indice;
    
    //OBJETO INDICE CATEGORIA
    private int indiceC;

    //MODELO DE LA TABLA
    private DefaultTableModel modelo;

    //CONSTRUCTOR
    public Productos_Actualizar_Vista(Productos_Vista vistaP, Productos_Object producto, int indice , int indiceC ) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.vistaP = vistaP;
        this.producto = producto;
        this.indice = indice;
        this.indiceC = indiceC;

        //CARGAMOS LAS EMPRESAS Y DATOS DEL PRODUCTO
        cargarDatos(this.producto, this.indice , this.indiceC);
    }

    //METODO PARA CARGAR LAS EMPRESAS EN LA TABLA Y LOS DATOS DEL PRODUCTO
    public void cargarDatos(Productos_Object producto, int indice , int indiceC) {

        this.producto = producto;
        this.indice = indice;
        this.indiceC = indiceC;

        //CARGAMOS LOS DATOS DEL PRODUCTO
        this.txtIdentificador.setText(this.producto.getIdentificador());
        this.txtNombre.setText(this.producto.getNombre());
        this.txtPrecio.setText(String.valueOf(this.producto.getPrecio()));
        this.spnStock.setValue(this.producto.getStock());
        this.cmbCategorias.setSelectedIndex(this.indiceC);

        //SE APLICA LAS COLUMNAS
        String columnas[] = {"ID", "NOMBRE"};
        this.modelo = new DefaultTableModel(columnas, 0);

        //OBTENEMOS LAS EMPRESAS
        List<Empresas_Object> listaEmpresas = this.controladorEmpresa.obtenerTodasEmpresas_C();

        //CARGAMOS TODOS LOS DATOS           
        Object arrayObjetos[] = new Object[2];
        for (Empresas_Object aux : listaEmpresas) {
            arrayObjetos[0] = aux.getId_empresa();
            arrayObjetos[1] = aux.getNombre();
            this.modelo.addRow(arrayObjetos);
        }

        this.tablaEmpresas.setModel(this.modelo);

        //SELECCIONAMOS FILA DE LA TABLA
        if (this.indice != -1) {
            this.tablaEmpresas.setRowSelectionInterval(this.indice, this.indice);
        }

    }

    //COMPONENTES DE LA INTERFAZ
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpresas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        spnStock = new javax.swing.JSpinner();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACTUALIZAR PRODUCTO");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--- ACTUALIZAR PRODUCTO ---");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setText("IDENTIFICADOR :");

        txtIdentificador.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtIdentificador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdentificador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setText("STOCK :");

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnActualizar.setFocusable(false);
        btnActualizar.setIconTextGap(15);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setText("* SELECCIONA UNA EMPRESA :");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N

        tablaEmpresas.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tablaEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOMBRE"
            }
        ));
        tablaEmpresas.setFocusable(false);
        tablaEmpresas.setRowHeight(40);
        tablaEmpresas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaEmpresas);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE :");

        txtNombre.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setText("TELEFONO :");

        spnStock.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        spnStock.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));
        spnStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txtPrecio.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setText("PRECIO :");

        cmbCategorias.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- SELECCIONAR ---", "ALIMENTACION", "ROPA", "DEPORTES", "VIDEOJUEGOS", "COSAS VARIAS" }));
        cmbCategorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cmbCategorias.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(txtIdentificador)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnStock)
                    .addComponent(txtPrecio)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // --- METODO PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---
    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        this.btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.btnActualizar.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        this.btnActualizar.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnActualizarMouseExited
    // --- METODO PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---

    //METODO PARA ACTUALIZAR EL EMPLEADO
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            String identificador = this.txtIdentificador.getText().toUpperCase();
            String nombre = this.txtNombre.getText().toUpperCase();
            double precio = Double.parseDouble(this.txtPrecio.getText());
            int stock = (int)this.spnStock.getValue();
            String categoria = (String)this.cmbCategorias.getSelectedItem();

            if ((this.controladorProducto.comprobarCamposProducto_C(identificador, nombre, categoria)) &&
                    (!this.controladorProducto.identificadorExistente(identificador) || identificador.equals(this.producto.getIdentificador()))){
                    
                if (this.tablaEmpresas.getRowCount() != 0) {

                    if (this.tablaEmpresas.getSelectedRow() != -1) {
                        Empresas_Object empresa = this.controladorEmpresa.obtenerEmpresa_C((int) this.tablaEmpresas.getValueAt(this.tablaEmpresas.getSelectedRow(), 0));
                        this.producto.setIdentificador(identificador);
                        this.producto.setNombre(nombre);
                        this.producto.setPrecio(precio);
                        this.producto.setStock(stock);
                        this.producto.setCategoria(categoria);
                        this.producto.setEmpresas_id_empresa_p(empresa);
                        this.controladorProducto.actualizarProducto_C(this.producto);
                        this.txtIdentificador.setText("");
                        this.txtNombre.setText("");
                        this.txtPrecio.setText("");
                        this.cmbCategorias.setSelectedIndex(0);
                        this.tablaEmpresas.clearSelection();
                        this.dispose();
                        this.vistaP.cargarDatosTabla("" , "");
                    } else {
                        JOptionPane.showMessageDialog(null, "TIENES QUE SELECCIONAR UNA EMPRESA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else {
                    this.producto.setIdentificador(identificador);
                    this.producto.setNombre(nombre);
                    this.producto.setPrecio(precio);
                    this.producto.setStock(stock);
                    this.producto.setCategoria(categoria);
                    this.controladorProducto.actualizarProducto_C(this.producto);
                    this.txtIdentificador.setText("");
                    this.txtNombre.setText("");
                    this.cmbCategorias.setSelectedIndex(0);
                    this.tablaEmpresas.clearSelection();
                    this.dispose();
                    this.vistaP.cargarDatosTabla("" , "");
                }

            } else {
                JOptionPane.showMessageDialog(null, "IDENTIFICADOR YA EXISTENTE O ERROR EN ALGUN CAMPO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN ALGUN CAMPO", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTable tablaEmpresas;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
