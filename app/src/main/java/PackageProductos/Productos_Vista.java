package PackageProductos;

import PackageEmpresas.*;
import PackageProductos.PackageOpciones.Productos_Actualizar_Vista;
import PackageProductos.PackageOpciones.Productos_Agregar_Vista;
import PackageProductos.PackageOpciones.Productos_VerProducto_Vista;
import java.awt.Color;
import java.awt.Cursor;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos_Vista extends javax.swing.JPanel {

    //OBJETO DEL CONTROLADOR DE PRODUCTOS Y EMPRESAS 
    private final Productos_Controlador controladorProductos = new Productos_Controlador();
    private final Empresas_Controlador controladorEmpresas = new Empresas_Controlador();

    //MODELO DE LA TABLA
    private DefaultTableModel modelo;

    //VISTAS DE OPCIONES
    private Productos_VerProducto_Vista verProductoVista;
    private Productos_Agregar_Vista agregarProductoVista;
    private Productos_Actualizar_Vista actualizarProductoVista;
    
    
    //CONSTRUCTOR
    public Productos_Vista() {
        initComponents();
        //LLAMAMOS AL METODO PARA CARGAR LOS DATOS EN LA TABLA
        cargarDatosTabla("", "");
    }

    //COMPONENTES DE LA INTERFAZ
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVerProducto = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnReinicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtTotalProductos = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(934, 575));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--- OPCIONES ---");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(356, 356, 356))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnVerProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnVerProducto.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnVerProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnVerProducto.setText("VER PRODUCTO");
        btnVerProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnVerProducto.setFocusable(false);
        btnVerProducto.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnVerProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerProductoMouseExited(evt);
            }
        });
        btnVerProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductoActionPerformed(evt);
            }
        });

        btnAgregarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarProducto.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setText("AGREGAR PRODUCTO");
        btnAgregarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnAgregarProducto.setFocusable(false);
        btnAgregarProducto.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseExited(evt);
            }
        });
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnActualizarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarProducto.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnActualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarProducto.setText("ACTUALIZAR PRODUCTO");
        btnActualizarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnActualizarProducto.setFocusable(false);
        btnActualizarProducto.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnActualizarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarProductoMouseExited(evt);
            }
        });
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("ELIMINAR PRODUCTO");
        btnEliminarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnEliminarProducto.setFocusable(false);
        btnEliminarProducto.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnEliminarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseExited(evt);
            }
        });
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("* Busqueda por nombre del Producto : ");

        txtFiltro.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        txtFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtFiltro.setMargin(new java.awt.Insets(2, 40, 2, 6));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("--- PRODUCTOS ---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(358, 358, 358))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnReinicio.setBackground(new java.awt.Color(0, 0, 0));
        btnReinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_recarga.png"))); // NOI18N
        btnReinicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnReinicio.setFocusable(false);
        btnReinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReinicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReinicioMouseExited(evt);
            }
        });
        btnReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinicioActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tablaProductos.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IDENTIFICADOR", "NOMBRE", "PRECIO", "CATEGORIA", "STOCK", "EMPRESA", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setFocusable(false);
        tablaProductos.setRowHeight(40);
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        txtTotalProductos.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalProductos.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        txtTotalProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotalProductos.setText(" * Total de Productos :");

        cmbCategorias.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- SELECCIONAR ---", "ALIMENTACION", "ROPA", "DEPORTES", "VIDEOJUEGOS", "COSAS VARIAS" }));
        cmbCategorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cmbCategorias.setFocusable(false);
        cmbCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoriasItemStateChanged(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setText("* Categoria del Producto : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVerProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFiltro)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnReinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addComponent(cmbCategorias))
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //METODO PARA CARGAR LOS DATOS DE LOS PRODUCTOS EN LA TABLA
    public void cargarDatosTabla(String texto, String categoria) {

        //SE APLICA LAS COLUMNAS
        String columnas[] = {"ID", "IDENTIFICADOR", "NOMBRE", "PRECIO", "CATEGORIA", "STOCK", "EMPRESA", "FECHA ALTA"};
        this.modelo = new DefaultTableModel(columnas, 0);

        //FORMATO FECHA
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        //OBTENEMOS LOS PRODUCTOS
        List<Productos_Object> listaProductos = this.controladorProductos.obtenerTodosProductos_C();

        //APLICAMOS EL TOTAL DE PRODUCTOS
        this.txtTotalProductos.setText("* Total de Productos : " + listaProductos.size());

        if (texto.isEmpty() && categoria.isEmpty()) {

            //CARGAMOS TODOS LOS DATOS           
            Object arrayObjetos[] = new Object[8];
            for (Productos_Object aux : listaProductos) {
                arrayObjetos[0] = aux.getId_producto();
                arrayObjetos[1] = aux.getIdentificador();
                arrayObjetos[2] = aux.getNombre();
                arrayObjetos[3] = String.valueOf(aux.getPrecio() + " €");
                arrayObjetos[4] = aux.getCategoria();
                arrayObjetos[5] = aux.getStock();
                arrayObjetos[6] = this.controladorEmpresas.obtenerEmpresa_C(aux.getEmpresas_id_empresa_p().getId_empresa()).getNombre();
                arrayObjetos[7] = dateFormat.format(aux.getF_alta());
                this.modelo.addRow(arrayObjetos);
            }

            this.tablaProductos.setModel(this.modelo);

        } else {

            //CARGAMOS LOS DATOS QUE CONTENGAN EL TEXTO INTRODUCIDO EN EL FILTRO Y LA CATEGORIA           
            Object arrayObjetos[] = new Object[8];
            for (Productos_Object aux : listaProductos) {
                if (!categoria.equals("--- SELECCIONAR ---")) {
                    if (aux.getNombre().contains(texto.toUpperCase()) && aux.getCategoria().equals(categoria)) {
                        arrayObjetos[0] = aux.getId_producto();
                        arrayObjetos[1] = aux.getIdentificador();
                        arrayObjetos[2] = aux.getNombre();
                        arrayObjetos[3] = String.valueOf(aux.getPrecio() + " €");
                        arrayObjetos[4] = aux.getCategoria();
                        arrayObjetos[5] = aux.getStock();
                        arrayObjetos[6] = this.controladorEmpresas.obtenerEmpresa_C(aux.getEmpresas_id_empresa_p().getId_empresa()).getNombre();
                        arrayObjetos[7] = dateFormat.format(aux.getF_alta());
                        this.modelo.addRow(arrayObjetos);
                        
                    }

                } else {

                    if (aux.getNombre().contains(texto.toUpperCase())) {
                        arrayObjetos[0] = aux.getId_producto();
                        arrayObjetos[1] = aux.getIdentificador();
                        arrayObjetos[2] = aux.getNombre();
                        arrayObjetos[3] = aux.getPrecio();
                        arrayObjetos[4] = aux.getCategoria();
                        arrayObjetos[5] = aux.getStock();
                        arrayObjetos[6] = this.controladorEmpresas.obtenerEmpresa_C(aux.getEmpresas_id_empresa_p().getId_empresa()).getNombre();
                        arrayObjetos[7] = dateFormat.format(aux.getF_alta());
                        this.modelo.addRow(arrayObjetos);
                        

                    }
                }
            }
            
            this.tablaProductos.setModel(this.modelo);
        }
    }
    
    
    // --- METODOS PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---
    private void btnVerProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerProductoMouseEntered
        this.btnVerProducto.setBackground(Color.GRAY);
        this.btnVerProducto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnVerProductoMouseEntered

    private void btnVerProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerProductoMouseExited
        this.btnVerProducto.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnVerProductoMouseExited

    private void btnAgregarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseEntered
        this.btnAgregarProducto.setBackground(Color.GRAY);
        this.btnAgregarProducto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAgregarProductoMouseEntered

    private void btnAgregarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseExited
        this.btnAgregarProducto.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnAgregarProductoMouseExited

    private void btnActualizarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarProductoMouseEntered
        this.btnActualizarProducto.setBackground(Color.GRAY);
        this.btnActualizarProducto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnActualizarProductoMouseEntered

    private void btnActualizarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarProductoMouseExited
        this.btnActualizarProducto.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnActualizarProductoMouseExited

    private void btnEliminarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseEntered
        this.btnEliminarProducto.setBackground(Color.GRAY);
        this.btnEliminarProducto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEliminarProductoMouseEntered

    private void btnEliminarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseExited
        this.btnEliminarProducto.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnEliminarProductoMouseExited

    private void btnReinicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReinicioMouseEntered
        this.btnReinicio.setBackground(Color.GRAY);
        this.btnReinicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnReinicioMouseEntered

    private void btnReinicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReinicioMouseExited
        this.btnReinicio.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnReinicioMouseExited
    // --- METODOS PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---

    //METODO PARA EL FILTRO DE BUSQUEDA
    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        String texto = this.txtFiltro.getText();
        String categoria = String.valueOf(this.cmbCategorias.getSelectedItem());
        cargarDatosTabla(texto,categoria);
    }//GEN-LAST:event_txtFiltroKeyReleased

    //METODO PARA REINICIAR EL FILTRO , LAS CATEGORIAS Y RECARGAR LA TABLA
    private void btnReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinicioActionPerformed
        this.txtFiltro.setText("");
        this.cmbCategorias.setSelectedIndex(0);
        cargarDatosTabla("" , "");
    }//GEN-LAST:event_btnReinicioActionPerformed

    //METODO PARA EL FILTRO DE CATEGORIA
    private void cmbCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriasItemStateChanged
        String texto = this.txtFiltro.getText();
        String categoria = String.valueOf(this.cmbCategorias.getSelectedItem());
        cargarDatosTabla(texto,categoria);
    }//GEN-LAST:event_cmbCategoriasItemStateChanged

    
    //METODO PARA ELIMINAR UN PRODUCTO
    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if(this.tablaProductos.getSelectedRow() != -1){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿DESEAS ELIMINAR EL PRODUCTO SELECCIONADO?", "INFORMACION", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                int idProducto = (int) this.tablaProductos.getValueAt(this.tablaProductos.getSelectedRow(), 0);
                this.controladorProductos.eliminarProducto_C(idProducto);
                cargarDatosTabla("" , "");
            }
        }else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    
    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE VER LA INFORMACION DEL PRODUCTO
    private void btnVerProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductoActionPerformed
        if(this.tablaProductos.getSelectedRow() != -1){
            
            Productos_Object producto = this.controladorProductos.obtenerProducto_C((int) this.tablaProductos.getValueAt(this.tablaProductos.getSelectedRow(), 0));
            if (producto != null) {

                if (this.verProductoVista == null) {
                    this.verProductoVista = new Productos_VerProducto_Vista(producto);
                    this.verProductoVista.setVisible(true);
                } else {
                    this.verProductoVista.cargarDatos(producto);
                    this.verProductoVista.setVisible(true);
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVerProductoActionPerformed

    
    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE AGREGAR UN PRODUCTO
    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        if (!this.controladorEmpresas.obtenerTodasEmpresas_C().isEmpty()) {
            if (this.agregarProductoVista == null) {
                this.agregarProductoVista = new Productos_Agregar_Vista(this);
                this.agregarProductoVista.setVisible(true);
            } else {
                this.agregarProductoVista.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "AUN NO HAY EMPRESAS DISPONIBLES QUE APLICAR AL PRODUCTO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    
    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE ACTUALIZAR UN PRODUCTO
    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        if (this.tablaProductos.getSelectedRow() != -1) {
            int idProducto = (int) this.tablaProductos.getValueAt(this.tablaProductos.getSelectedRow(), 0);
            Productos_Object producto = this.controladorProductos.obtenerProducto_C(idProducto);

            if (producto != null) {
                int indice = this.controladorEmpresas.obtenerFilaTabla(producto.getEmpresas_id_empresa_p());
                int indiceCat = this.controladorProductos.obtenerIndiceCombo(producto.getCategoria());
                if (this.actualizarProductoVista == null) {
                    this.actualizarProductoVista = new Productos_Actualizar_Vista(this, producto, indice , indiceCat);
                    this.actualizarProductoVista.setVisible(true);
                } else {
                    this.actualizarProductoVista.cargarDatos(producto, indice,indiceCat);
                    this.actualizarProductoVista.setVisible(true);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JButton btnVerProducto;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtTotalProductos;
    // End of variables declaration//GEN-END:variables
}
