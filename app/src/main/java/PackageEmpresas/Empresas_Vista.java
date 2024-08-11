package PackageEmpresas;

import PackageEmpresas.PackageOpciones.Empresas_Actualizar_Vista;
import PackageEmpresas.PackageOpciones.Empresas_Agregar_Vista;
import PackageEmpresas.PackageOpciones.Empresas_VerEmpresa_Vista;
import PackageSeguros.*;
import java.awt.Color;
import java.awt.Cursor;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empresas_Vista extends javax.swing.JPanel {

    //OBJETO DEL CONTROLADOR DE EMPRESAS Y SEGUROS
    private final Empresas_Controlador controladorEmpresas = new Empresas_Controlador();
    private final Seguros_Controlador controladorSeguro = new Seguros_Controlador();

    //MODELO DE LA TABLA
    private DefaultTableModel modelo;

    //VISTAS DE OPCIONES
    private Empresas_VerEmpresa_Vista verEmpresaVista;
    private Empresas_Agregar_Vista agregarEmpresaVista;
    private Empresas_Actualizar_Vista actualizarEmpresasVista;

    //CONSTRUCTOR
    public Empresas_Vista() {
        initComponents();
        //LLAMAMOS AL METODO PARA CARGAR LOS DATOS EN LA TABLA
        cargarDatosTabla("");
    }

    //COMPONENTES DE LA INTERFAZ
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVerEmpresa = new javax.swing.JButton();
        btnAgregarEmpresa = new javax.swing.JButton();
        btnActualizarEmpresa = new javax.swing.JButton();
        btnEliminarEmpresa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnReinicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpresas = new javax.swing.JTable();
        txtTotalEmpresas = new javax.swing.JLabel();

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
                .addGap(313, 313, 313)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(313, 313, 313))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVerEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        btnVerEmpresa.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnVerEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEmpresa.setText("VER EMPRESA");
        btnVerEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnVerEmpresa.setFocusable(false);
        btnVerEmpresa.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnVerEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerEmpresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerEmpresaMouseExited(evt);
            }
        });
        btnVerEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEmpresaActionPerformed(evt);
            }
        });

        btnAgregarEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarEmpresa.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnAgregarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmpresa.setText("AGREGAR EMPRESA");
        btnAgregarEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnAgregarEmpresa.setFocusable(false);
        btnAgregarEmpresa.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnAgregarEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarEmpresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarEmpresaMouseExited(evt);
            }
        });
        btnAgregarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpresaActionPerformed(evt);
            }
        });

        btnActualizarEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarEmpresa.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnActualizarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarEmpresa.setText("ACTUALIZAR EMPRESA");
        btnActualizarEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnActualizarEmpresa.setFocusable(false);
        btnActualizarEmpresa.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnActualizarEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarEmpresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarEmpresaMouseExited(evt);
            }
        });
        btnActualizarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpresaActionPerformed(evt);
            }
        });

        btnEliminarEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarEmpresa.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnEliminarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpresa.setText("ELIMINAR EMPRESA");
        btnEliminarEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnEliminarEmpresa.setFocusable(false);
        btnEliminarEmpresa.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnEliminarEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarEmpresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarEmpresaMouseExited(evt);
            }
        });
        btnEliminarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpresaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("* Busqueda por nombre de la Empresa :");

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
        jLabel3.setText("--- EMPRESAS ---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(307, 307, 307))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tablaEmpresas.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tablaEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID-EMPRESARIAL", "NOMBRE", "CIUDAD", "SEGURO", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpresas.setFocusable(false);
        tablaEmpresas.setRowHeight(40);
        tablaEmpresas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaEmpresas);
        if (tablaEmpresas.getColumnModel().getColumnCount() > 0) {
            tablaEmpresas.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        txtTotalEmpresas.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalEmpresas.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        txtTotalEmpresas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotalEmpresas.setText(" * Total de Empresas :");

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
                        .addComponent(btnVerEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFiltro)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTotalEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //METODO PARA CARGAR LOS DATOS DE LAS EMPRESAS EN LA TABLA
    public void cargarDatosTabla(String texto) {

        //SE APLICA LAS COLUMNAS
        String columnas[] = {"ID", "ID-EMPRESARIAL", "NOMBRE", "CIUDAD", "SEGURO", "FECHA ALTA"};
        this.modelo = new DefaultTableModel(columnas, 0);

        //FORMATO FECHA
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        //OBTENEMOS LAS EMPRESAS
        List<Empresas_Object> listaEmpresas = this.controladorEmpresas.obtenerTodasEmpresas_C();

        //APLICAMOS EL TOTAL DE EMPRESAS
        this.txtTotalEmpresas.setText("* Total de Empresas : " + listaEmpresas.size());

        if (texto.isEmpty()) {

            //CARGAMOS TODOS LOS DATOS           
            Object arrayObjetos[] = new Object[6];
            for (Empresas_Object aux : listaEmpresas) {
                arrayObjetos[0] = aux.getId_empresa();
                arrayObjetos[1] = aux.getId_empresarial();
                arrayObjetos[2] = aux.getNombre();
                arrayObjetos[3] = aux.getCiudad();
                if (aux.getSeguros_id_seguro() == null) {
                    arrayObjetos[4] = "SIN SEGURO";
                } else {
                    arrayObjetos[4] = this.controladorSeguro.obtenerSeguro_C(aux.getSeguros_id_seguro()
                            .getId_seguro()).getNombre();
                }
                arrayObjetos[5] = dateFormat.format(aux.getF_alta());
                this.modelo.addRow(arrayObjetos);
            }

            this.tablaEmpresas.setModel(this.modelo);

        } else {

            //CARGAMOS LOS DATOS QUE CONTENGAN EL TEXTO INTRODUCIDO EN EL FILTRO           
            Object arrayObjetos[] = new Object[6];
            for (Empresas_Object aux : listaEmpresas) {
                if (aux.getNombre().contains(texto.toUpperCase())) {
                    arrayObjetos[0] = aux.getId_empresa();
                    arrayObjetos[1] = aux.getId_empresarial();
                    arrayObjetos[2] = aux.getNombre();
                    arrayObjetos[3] = aux.getCiudad();
                    if (aux.getSeguros_id_seguro() == null) {
                        arrayObjetos[4] = "SIN SEGURO";
                    } else {
                        arrayObjetos[4] = this.controladorSeguro.obtenerSeguro_C(aux.getSeguros_id_seguro()
                                .getId_seguro()).getNombre();
                    }
                    arrayObjetos[5] = dateFormat.format(aux.getF_alta());
                    this.modelo.addRow(arrayObjetos);
                }
            }

            this.tablaEmpresas.setModel(this.modelo);
        }
    }

    // --- METODOS PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---
    private void btnVerEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEmpresaMouseEntered
        this.btnVerEmpresa.setBackground(Color.GRAY);
        this.btnVerEmpresa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnVerEmpresaMouseEntered

    private void btnVerEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEmpresaMouseExited
        this.btnVerEmpresa.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnVerEmpresaMouseExited

    private void btnAgregarEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpresaMouseEntered
        this.btnAgregarEmpresa.setBackground(Color.GRAY);
        this.btnAgregarEmpresa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAgregarEmpresaMouseEntered

    private void btnAgregarEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpresaMouseExited
        this.btnAgregarEmpresa.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnAgregarEmpresaMouseExited

    private void btnActualizarEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarEmpresaMouseEntered
        this.btnActualizarEmpresa.setBackground(Color.GRAY);
        this.btnActualizarEmpresa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnActualizarEmpresaMouseEntered

    private void btnActualizarEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarEmpresaMouseExited
        this.btnActualizarEmpresa.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnActualizarEmpresaMouseExited

    private void btnEliminarEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpresaMouseEntered
        this.btnEliminarEmpresa.setBackground(Color.GRAY);
        this.btnEliminarEmpresa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEliminarEmpresaMouseEntered

    private void btnEliminarEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpresaMouseExited
        this.btnEliminarEmpresa.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnEliminarEmpresaMouseExited

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
        cargarDatosTabla(texto);
    }//GEN-LAST:event_txtFiltroKeyReleased

    //METODO PARA REINICIAR EL FILTRO Y RECARGAR LA TABLA
    private void btnReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinicioActionPerformed
        this.txtFiltro.setText("");
        cargarDatosTabla("");
    }//GEN-LAST:event_btnReinicioActionPerformed

    //METODO PARA ELIMINAR UNA EMPRESA
    private void btnEliminarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpresaActionPerformed
        if (this.tablaEmpresas.getSelectedRow() != -1) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿DESEAS ELIMINAR LA EMPRESA SELECCIONADA?", "INFORMACION", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                int idEmpresa = (int) this.tablaEmpresas.getValueAt(this.tablaEmpresas.getSelectedRow(), 0);
                this.controladorEmpresas.eliminarEmpresa_C(idEmpresa);
                cargarDatosTabla("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarEmpresaActionPerformed

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE AGREGAR LAS EMPRESAS
    private void btnAgregarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpresaActionPerformed

        if (!this.controladorSeguro.obtenerTodosSeguros_C().isEmpty()) {
            if (this.agregarEmpresaVista == null) {
                this.agregarEmpresaVista = new Empresas_Agregar_Vista(this);
                this.agregarEmpresaVista.setVisible(true);
            } else {
                this.agregarEmpresaVista.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "AUN NO HAY SEGUROS DISPONIBLES QUE APLICAR A LA EMPRESA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarEmpresaActionPerformed

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE ACTUALIZAR LAS EMPRESAS
    private void btnActualizarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpresaActionPerformed
        if (this.tablaEmpresas.getSelectedRow() != -1) {
            int idEmpresa = (int) this.tablaEmpresas.getValueAt(this.tablaEmpresas.getSelectedRow(), 0);
            Empresas_Object empresa = this.controladorEmpresas.obtenerEmpresa_C(idEmpresa);

            if (empresa != null) {
                int indice = this.controladorSeguro.obtenerFilaTabla(empresa.getSeguros_id_seguro());
                if (this.actualizarEmpresasVista == null) {
                    this.actualizarEmpresasVista = new Empresas_Actualizar_Vista(this, empresa, indice);
                    this.actualizarEmpresasVista.setVisible(true);
                } else {
                    this.actualizarEmpresasVista.cargarDatos(empresa, indice);
                    this.actualizarEmpresasVista.setVisible(true);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarEmpresaActionPerformed

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE VER LOS DATOS DE LA EMPRESA
    private void btnVerEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEmpresaActionPerformed
        if(this.tablaEmpresas.getSelectedRow() != -1){
            
            Empresas_Object empresa = this.controladorEmpresas.obtenerEmpresa_C((int) this.tablaEmpresas.getValueAt(this.tablaEmpresas.getSelectedRow(), 0));
            if (empresa != null) {

                if (this.verEmpresaVista == null) {
                    this.verEmpresaVista = new Empresas_VerEmpresa_Vista(empresa);
                    this.verEmpresaVista.setVisible(true);
                } else {
                    this.verEmpresaVista.cargarDatos(empresa);
                    this.verEmpresaVista.setVisible(true);
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVerEmpresaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEmpresa;
    private javax.swing.JButton btnAgregarEmpresa;
    private javax.swing.JButton btnEliminarEmpresa;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JButton btnVerEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpresas;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtTotalEmpresas;
    // End of variables declaration//GEN-END:variables
}
