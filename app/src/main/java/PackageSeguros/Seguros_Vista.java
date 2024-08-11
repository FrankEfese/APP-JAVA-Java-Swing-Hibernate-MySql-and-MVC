package PackageSeguros;

import PackageSeguros.PackageOpciones.Seguros_Actualizar_Vista;
import PackageSeguros.PackageOpciones.Seguros_Agregar_Vista;
import PackageSeguros.PackageOpciones.Seguros_VerSeguro_Vista;
import java.awt.Color;
import java.awt.Cursor;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Seguros_Vista extends javax.swing.JPanel {

    //OBJETO DEL CONTROLADOR DEL SEGUROS
    private final Seguros_Controlador controladorSeguro = new Seguros_Controlador();

    //MODELO DE LA TABLA
    private DefaultTableModel modelo;

    //VISTAS DE OPCIONES
    private Seguros_VerSeguro_Vista verSeguroVista;
    private Seguros_Agregar_Vista agregarSeguroVista;
    private Seguros_Actualizar_Vista actualizarSeguroVista;

    //CONSTRUCTOR
    public Seguros_Vista() {
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
        btnVerSeguro = new javax.swing.JButton();
        btnAgregarSeguro = new javax.swing.JButton();
        btnActualizarSeguro = new javax.swing.JButton();
        btnEliminarSeguro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnReinicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSeguros = new javax.swing.JTable();
        txtTotalSeguros = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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
                .addGap(350, 350, 350)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(350, 350, 350))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnVerSeguro.setBackground(new java.awt.Color(0, 0, 0));
        btnVerSeguro.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnVerSeguro.setForeground(new java.awt.Color(255, 255, 255));
        btnVerSeguro.setText("VER SEGURO");
        btnVerSeguro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnVerSeguro.setFocusable(false);
        btnVerSeguro.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnVerSeguro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerSeguroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerSeguroMouseExited(evt);
            }
        });
        btnVerSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSeguroActionPerformed(evt);
            }
        });

        btnAgregarSeguro.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarSeguro.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnAgregarSeguro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarSeguro.setText("AGREGAR SEGURO");
        btnAgregarSeguro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnAgregarSeguro.setFocusable(false);
        btnAgregarSeguro.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnAgregarSeguro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarSeguroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarSeguroMouseExited(evt);
            }
        });
        btnAgregarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSeguroActionPerformed(evt);
            }
        });

        btnActualizarSeguro.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarSeguro.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnActualizarSeguro.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarSeguro.setText("ACTUALIZAR SEGURO");
        btnActualizarSeguro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnActualizarSeguro.setFocusable(false);
        btnActualizarSeguro.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnActualizarSeguro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarSeguroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarSeguroMouseExited(evt);
            }
        });
        btnActualizarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarSeguroActionPerformed(evt);
            }
        });

        btnEliminarSeguro.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarSeguro.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnEliminarSeguro.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarSeguro.setText("ELIMINAR SEGURO");
        btnEliminarSeguro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnEliminarSeguro.setFocusable(false);
        btnEliminarSeguro.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnEliminarSeguro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarSeguroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarSeguroMouseExited(evt);
            }
        });
        btnEliminarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSeguroActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("* Busqueda por nombre del Seguro :");

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
        jLabel3.setText("--- SEGUROS ---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(350, 350, 350))
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

        tablaSeguros.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tablaSeguros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSeguros.setFocusable(false);
        tablaSeguros.setRowHeight(40);
        tablaSeguros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaSeguros);
        if (tablaSeguros.getColumnModel().getColumnCount() > 0) {
            tablaSeguros.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        txtTotalSeguros.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalSeguros.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        txtTotalSeguros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotalSeguros.setText(" * Total de Seguros :");

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
                        .addComponent(btnVerSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //METODO PARA CARGAR LOS DATOS DE LOS SEGUROS EN LA TABLA
    public void cargarDatosTabla(String texto) {

        //SE APLICA LAS COLUMNAS
        String columnas[] = {"ID", "NOMBRE", "PRECIO", "FECHA ALTA"};
        this.modelo = new DefaultTableModel(columnas, 0);

        //FORMATO FECHA
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        //OBTENEMOS LOS SEGUROS
        List<Seguros_Object> listaSeguros = this.controladorSeguro.obtenerTodosSeguros_C();

        //APLICAMOS EL TOTAL DE SEGUROS
        this.txtTotalSeguros.setText("* Total de Seguros : " + listaSeguros.size());

        if (texto.isEmpty()) {

            //CARGAMOS TODOS LOS DATOS           
            Object arrayObjetos[] = new Object[4];
            for (Seguros_Object aux : listaSeguros) {
                arrayObjetos[0] = aux.getId_seguro();
                arrayObjetos[1] = aux.getNombre();
                arrayObjetos[2] = String.valueOf(aux.getPrecio() + " €");
                arrayObjetos[3] = dateFormat.format(aux.getF_alta());
                this.modelo.addRow(arrayObjetos);
            }

            this.tablaSeguros.setModel(this.modelo);

        } else {

            //CARGAMOS LOS DATOS QUE CONTENGAN EL TEXTO INTRODUCIDO EN EL FILTRO           
            Object arrayObjetos[] = new Object[4];
            for (Seguros_Object aux : listaSeguros) {
                if (aux.getNombre().contains(texto.toUpperCase())) {
                    arrayObjetos[0] = aux.getId_seguro();
                    arrayObjetos[1] = aux.getNombre();
                    arrayObjetos[2] = aux.getPrecio();
                    arrayObjetos[3] = dateFormat.format(aux.getF_alta());
                    this.modelo.addRow(arrayObjetos);
                }
            }

            this.tablaSeguros.setModel(this.modelo);
        }
    }

    // --- METODOS PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---
    private void btnVerSeguroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerSeguroMouseEntered
        this.btnVerSeguro.setBackground(Color.GRAY);
        this.btnVerSeguro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnVerSeguroMouseEntered

    private void btnVerSeguroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerSeguroMouseExited
        this.btnVerSeguro.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnVerSeguroMouseExited

    private void btnAgregarSeguroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarSeguroMouseEntered
        this.btnAgregarSeguro.setBackground(Color.GRAY);
        this.btnAgregarSeguro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAgregarSeguroMouseEntered

    private void btnAgregarSeguroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarSeguroMouseExited
        this.btnAgregarSeguro.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnAgregarSeguroMouseExited

    private void btnActualizarSeguroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarSeguroMouseEntered
        this.btnActualizarSeguro.setBackground(Color.GRAY);
        this.btnActualizarSeguro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnActualizarSeguroMouseEntered

    private void btnActualizarSeguroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarSeguroMouseExited
        this.btnActualizarSeguro.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnActualizarSeguroMouseExited

    private void btnEliminarSeguroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSeguroMouseEntered
        this.btnEliminarSeguro.setBackground(Color.GRAY);
        this.btnEliminarSeguro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEliminarSeguroMouseEntered

    private void btnEliminarSeguroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSeguroMouseExited
        this.btnEliminarSeguro.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnEliminarSeguroMouseExited

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

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE AGREGAR LOS SEGUROS
    private void btnAgregarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSeguroActionPerformed
        if (this.agregarSeguroVista == null) {
            this.agregarSeguroVista = new Seguros_Agregar_Vista(this);
            this.agregarSeguroVista.setVisible(true);
        } else {
            this.agregarSeguroVista.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarSeguroActionPerformed

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE ACTUALIZAR LOS SEGUROS
    private void btnActualizarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSeguroActionPerformed

        if (this.tablaSeguros.getSelectedRow() != -1) {
            int idSeguro = (int) this.tablaSeguros.getValueAt(this.tablaSeguros.getSelectedRow(), 0);
            Seguros_Object seguro = this.controladorSeguro.obtenerSeguro_C(idSeguro);

            if (seguro != null) {
                if (this.actualizarSeguroVista == null) {
                    this.actualizarSeguroVista = new Seguros_Actualizar_Vista(this, seguro);
                    this.actualizarSeguroVista.setVisible(true);
                } else {
                    this.actualizarSeguroVista.cargarDatos(seguro);
                    this.actualizarSeguroVista.setVisible(true);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarSeguroActionPerformed

    //METODO PARA ELIMINAR UN SEGURO
    private void btnEliminarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSeguroActionPerformed
        if (this.tablaSeguros.getSelectedRow() != -1) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿DESEAS ELIMINAR EL SEGURO SELECCIONADO?", "INFORMACION", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                int idSeguro = (int) this.tablaSeguros.getValueAt(this.tablaSeguros.getSelectedRow(), 0);
                this.controladorSeguro.eliminarSeguro_C(idSeguro);
                cargarDatosTabla("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarSeguroActionPerformed

    //METODO PARA VER LOS DATOS DEL SEGURO
    private void btnVerSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSeguroActionPerformed
        if (this.tablaSeguros.getSelectedRow() != -1) {
            Seguros_Object seguro = this.controladorSeguro.obtenerSeguro_C((int) this.tablaSeguros.getValueAt(this.tablaSeguros.getSelectedRow(), 0));
            if (seguro != null) {

                if (this.verSeguroVista == null) {
                    this.verSeguroVista = new Seguros_VerSeguro_Vista(seguro);
                    this.verSeguroVista.setVisible(true);
                } else {
                    this.verSeguroVista.cargarDatos(seguro);
                    this.verSeguroVista.setVisible(true);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVerSeguroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarSeguro;
    private javax.swing.JButton btnAgregarSeguro;
    private javax.swing.JButton btnEliminarSeguro;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JButton btnVerSeguro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSeguros;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtTotalSeguros;
    // End of variables declaration//GEN-END:variables
}
