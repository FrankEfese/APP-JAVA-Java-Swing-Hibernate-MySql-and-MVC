package PackageEmpleados;

import PackageEmpleados.PackageOpciones.Empleados_Actualizar_Vista;
import PackageEmpleados.PackageOpciones.Empleados_Agregar_Vista;
import PackageEmpleados.PackageOpciones.Empleados_VerEmpleado_Vista;
import PackageEmpresas.*;
import java.awt.Color;
import java.awt.Cursor;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleados_Vista extends javax.swing.JPanel {

    //OBJETO DEL CONTROLADOR DE EMPLEADOS Y EMPRESAS 
    private final Empleados_Controlador controladorEmpleados = new Empleados_Controlador();
    private final Empresas_Controlador controladorEmpresas = new Empresas_Controlador();

    //MODELO DE LA TABLA
    private DefaultTableModel modelo;

    //VISTAS DE OPCIONES
    private Empleados_Agregar_Vista agregarEmpleadoVista;
    private Empleados_VerEmpleado_Vista verEmpleadoVista;
    private Empleados_Actualizar_Vista actualizarEmpleadoVista;
    
    //CONSTRUCTOR
    public Empleados_Vista() {
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
        btnVerEmpleado = new javax.swing.JButton();
        btnAgregarEmpleado = new javax.swing.JButton();
        btnActualizarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnReinicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        txtTotalEmpleados = new javax.swing.JLabel();

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
                .addGap(357, 357, 357)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(357, 357, 357))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnVerEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnVerEmpleado.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnVerEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEmpleado.setText("VER EMPLEADO");
        btnVerEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnVerEmpleado.setFocusable(false);
        btnVerEmpleado.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnVerEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerEmpleadoMouseExited(evt);
            }
        });
        btnVerEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEmpleadoActionPerformed(evt);
            }
        });

        btnAgregarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarEmpleado.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnAgregarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmpleado.setText("AGREGAR EMPLEADO");
        btnAgregarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnAgregarEmpleado.setFocusable(false);
        btnAgregarEmpleado.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnAgregarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarEmpleadoMouseExited(evt);
            }
        });
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });

        btnActualizarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarEmpleado.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnActualizarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarEmpleado.setText("ACTUALIZAR EMPLEADO");
        btnActualizarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnActualizarEmpleado.setFocusable(false);
        btnActualizarEmpleado.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnActualizarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarEmpleadoMouseExited(evt);
            }
        });
        btnActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarEmpleado.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("ELIMINAR EMPLEADO");
        btnEliminarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnEliminarEmpleado.setFocusable(false);
        btnEliminarEmpleado.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnEliminarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarEmpleadoMouseExited(evt);
            }
        });
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("* Busqueda por nombre del Empleado : ");

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
        jLabel3.setText("--- EMPLEADOS ---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(357, 357, 357))
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

        tablaEmpleados.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "EDAD", "TELEFONO", "EMPRESA", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpleados.setFocusable(false);
        tablaEmpleados.setRowHeight(40);
        tablaEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaEmpleados);
        if (tablaEmpleados.getColumnModel().getColumnCount() > 0) {
            tablaEmpleados.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        txtTotalEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalEmpleados.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        txtTotalEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotalEmpleados.setText(" * Total de Empleados :");

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
                        .addComponent(btnVerEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFiltro)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTotalEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnVerEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //METODO PARA CARGAR LOS DATOS DE LOS EMPLEADOS EN LA TABLA
    public void cargarDatosTabla(String texto) {

        //SE APLICA LAS COLUMNAS
        String columnas[] = {"ID", "DNI", "NOMBRE", "EDAD", "TELEFONO", "EMPRESA", "FECHA ALTA"};
        this.modelo = new DefaultTableModel(columnas, 0);

        //FORMATO FECHA
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        //OBTENEMOS LOS EMPLEADOS
        List<Empleados_Object> listaEmpleados = this.controladorEmpleados.obtenerTodosEmpleados_C();

        //APLICAMOS EL TOTAL DE EMPLEADOS
        this.txtTotalEmpleados.setText("* Total de Empleados : " + listaEmpleados.size());

        if (texto.isEmpty()) {

            //CARGAMOS TODOS LOS DATOS           
            Object arrayObjetos[] = new Object[7];
            for (Empleados_Object aux : listaEmpleados) {
                arrayObjetos[0] = aux.getId_empleado();
                arrayObjetos[1] = aux.getDni();
                arrayObjetos[2] = aux.getNombre();
                arrayObjetos[3] = aux.getEdad();
                arrayObjetos[4] = aux.getTelefono();
                if (aux.getEmpresas_id_empresa() == null) {
                    arrayObjetos[5] = "SIN TRABAJO";
                } else {
                    arrayObjetos[5] = this.controladorEmpresas.obtenerEmpresa_C(aux.getEmpresas_id_empresa().getId_empresa()).getNombre();
                }
                arrayObjetos[6] = dateFormat.format(aux.getF_alta());
                this.modelo.addRow(arrayObjetos);
            }

            this.tablaEmpleados.setModel(this.modelo);

        } else {

            //CARGAMOS LOS DATOS QUE CONTENGAN EL TEXTO INTRODUCIDO EN EL FILTRO           
            Object arrayObjetos[] = new Object[7];
            for (Empleados_Object aux : listaEmpleados) {
                if (aux.getNombre().contains(texto.toUpperCase())) {
                    arrayObjetos[0] = aux.getId_empleado();
                    arrayObjetos[1] = aux.getDni();
                    arrayObjetos[2] = aux.getNombre();
                    arrayObjetos[3] = aux.getEdad();
                    arrayObjetos[4] = aux.getTelefono();
                    if (aux.getEmpresas_id_empresa() == null) {
                        arrayObjetos[5] = "SIN TRABAJO";
                    } else {
                        arrayObjetos[5] = this.controladorEmpresas.obtenerEmpresa_C(aux.getEmpresas_id_empresa().getId_empresa()).getNombre();
                    }
                    arrayObjetos[6] = dateFormat.format(aux.getF_alta());
                    this.modelo.addRow(arrayObjetos);
                }

                this.tablaEmpleados.setModel(this.modelo);
            }
        }
    }

    // --- METODOS PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---
    private void btnVerEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEmpleadoMouseEntered
        this.btnVerEmpleado.setBackground(Color.GRAY);
        this.btnVerEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnVerEmpleadoMouseEntered

    private void btnVerEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEmpleadoMouseExited
        this.btnVerEmpleado.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnVerEmpleadoMouseExited

    private void btnAgregarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoMouseEntered
        this.btnAgregarEmpleado.setBackground(Color.GRAY);
        this.btnAgregarEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAgregarEmpleadoMouseEntered

    private void btnAgregarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoMouseExited
        this.btnAgregarEmpleado.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnAgregarEmpleadoMouseExited

    private void btnActualizarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoMouseEntered
        this.btnActualizarEmpleado.setBackground(Color.GRAY);
        this.btnActualizarEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnActualizarEmpleadoMouseEntered

    private void btnActualizarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoMouseExited
        this.btnActualizarEmpleado.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnActualizarEmpleadoMouseExited

    private void btnEliminarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoMouseEntered
        this.btnEliminarEmpleado.setBackground(Color.GRAY);
        this.btnEliminarEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEliminarEmpleadoMouseEntered

    private void btnEliminarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoMouseExited
        this.btnEliminarEmpleado.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnEliminarEmpleadoMouseExited

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

    
    //METODO PARA ELIMINAR A UN EMPLEADO
    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        if (this.tablaEmpleados.getSelectedRow() != -1) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿DESEAS ELIMINAR EL EMPLEADO SELECCIONADO?", "INFORMACION", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                int idEmpleado = (int) this.tablaEmpleados.getValueAt(this.tablaEmpleados.getSelectedRow(), 0);
                this.controladorEmpleados.eliminarEmpleado_C(idEmpleado);
                cargarDatosTabla("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE AGREGAR LOS EMPLEADOS
    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        if (!this.controladorEmpresas.obtenerTodasEmpresas_C().isEmpty()) {
            if (this.agregarEmpleadoVista == null) {
                this.agregarEmpleadoVista = new Empleados_Agregar_Vista(this);
                this.agregarEmpleadoVista.setVisible(true);
            } else {
                this.agregarEmpleadoVista.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "AUN NO HAY EMPRESAS DISPONIBLES QUE APLICAR AL EMPLEADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE VER LOS DATOS DE LOS EMPLEADOS
    private void btnVerEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEmpleadoActionPerformed
        if(this.tablaEmpleados.getSelectedRow() != -1){
            
            Empleados_Object empleado = this.controladorEmpleados.obtenerEmpleado_C((int) this.tablaEmpleados.getValueAt(this.tablaEmpleados.getSelectedRow(), 0));
            if (empleado != null) {

                if (this.verEmpleadoVista == null) {
                    this.verEmpleadoVista = new Empleados_VerEmpleado_Vista(empleado);
                    this.verEmpleadoVista.setVisible(true);
                } else {
                    this.verEmpleadoVista.cargarDatos(empleado);
                    this.verEmpleadoVista.setVisible(true);
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVerEmpleadoActionPerformed

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE ACTUALIZAR LOS DATOS DEL EMPLEADO
    private void btnActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoActionPerformed
        if (this.tablaEmpleados.getSelectedRow() != -1) {
            int idEmpleado = (int) this.tablaEmpleados.getValueAt(this.tablaEmpleados.getSelectedRow(), 0);
            Empleados_Object empleado = this.controladorEmpleados.obtenerEmpleado_C(idEmpleado);

            if (empleado != null) {
                int indice = this.controladorEmpresas.obtenerFilaTabla(empleado.getEmpresas_id_empresa());
                if (this.actualizarEmpleadoVista == null) {
                    this.actualizarEmpleadoVista = new Empleados_Actualizar_Vista(this, empleado, indice);
                    this.actualizarEmpleadoVista.setVisible(true);
                } else {
                    this.actualizarEmpleadoVista.cargarDatos(empleado, indice);
                    this.actualizarEmpleadoVista.setVisible(true);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEmpleado;
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JButton btnVerEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtTotalEmpleados;
    // End of variables declaration//GEN-END:variables
}
