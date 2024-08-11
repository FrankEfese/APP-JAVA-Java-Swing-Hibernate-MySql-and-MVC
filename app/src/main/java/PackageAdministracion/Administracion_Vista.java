package PackageAdministracion;

import PackageAdministracion.PackageOpciones.Administracion_Actualizar_Vista;
import PackageAdministracion.PackageOpciones.Administracion_Agregar_Vista;
import PackageLogin.Login_Object;
import PackagePrincipal.Principal_Vista;
import java.awt.Color;
import java.awt.Cursor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administracion_Vista extends javax.swing.JPanel {

    //OBJETO DEL CONTROLADOR DE ADMINISTRACION
    private final Administracion_Controlador controladorAdmin = new Administracion_Controlador();

    //MODELO DE LA TABLA
    private DefaultTableModel modelo;

    //VISTAS DE OPCIONES
    private Administracion_Agregar_Vista agregarAdminVista;
    private Administracion_Actualizar_Vista actualizarAdminVista;

    //CONSTRUCTOR
    public Administracion_Vista() {
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
        btnAgregarAdmin = new javax.swing.JButton();
        btnActualizarAdmin = new javax.swing.JButton();
        btnEliminarAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnReinicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdmin = new javax.swing.JTable();
        txtTotalAdmin = new javax.swing.JLabel();

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

        btnAgregarAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarAdmin.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnAgregarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAdmin.setText("AGREGAR ADMINISTRADOR");
        btnAgregarAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnAgregarAdmin.setFocusable(false);
        btnAgregarAdmin.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnAgregarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarAdminMouseExited(evt);
            }
        });
        btnAgregarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdminActionPerformed(evt);
            }
        });

        btnActualizarAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarAdmin.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnActualizarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarAdmin.setText("ACTUALIZAR ADMINISTRADOR");
        btnActualizarAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnActualizarAdmin.setFocusable(false);
        btnActualizarAdmin.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnActualizarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarAdminMouseExited(evt);
            }
        });
        btnActualizarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdminActionPerformed(evt);
            }
        });

        btnEliminarAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarAdmin.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnEliminarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarAdmin.setText("ELIMINAR ADMINISTRADOR");
        btnEliminarAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnEliminarAdmin.setFocusable(false);
        btnEliminarAdmin.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnEliminarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarAdminMouseExited(evt);
            }
        });
        btnEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdminActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("* Busqueda por correo del Administrador :");

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
        jLabel3.setText("--- ADMINISTRADORES ---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(308, 308, 308))
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

        tablaAdmin.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tablaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CORREO", "CONTRASEÑA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAdmin.setFocusable(false);
        tablaAdmin.setRowHeight(40);
        tablaAdmin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaAdmin);
        if (tablaAdmin.getColumnModel().getColumnCount() > 0) {
            tablaAdmin.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        txtTotalAdmin.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalAdmin.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        txtTotalAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotalAdmin.setText(" * Total de Administradores :");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //METODO PARA CARGAR LOS DATOS DE LOS ADMINISTRADORES EN LA TABLA
    public void cargarDatosTabla(String texto) {

        //SE APLICA LAS COLUMNAS
        String columnas[] = {"ID", "CORREO", "CONTRASEÑA"};
        this.modelo = new DefaultTableModel(columnas, 0);

        //OBTENEMOS LOS ADMINISTRADORES
        List<Login_Object> listaAdmins = this.controladorAdmin.obtenerTodosLogin_C();

        //APLICAMOS EL TOTAL DE ADMINISTRADORES
        this.txtTotalAdmin.setText("* Total de Administradores : " + listaAdmins.size());

        if (texto.isEmpty()) {

            //CARGAMOS TODOS LOS DATOS           
            Object arrayObjetos[] = new Object[3];
            for (Login_Object aux : listaAdmins) {
                arrayObjetos[0] = aux.getId_login();
                arrayObjetos[1] = aux.getCorreo();
                arrayObjetos[2] = aux.getContraseña();
                this.modelo.addRow(arrayObjetos);
            }

            this.tablaAdmin.setModel(this.modelo);

        } else {

            //CARGAMOS LOS DATOS QUE CONTENGAN EL TEXTO INTRODUCIDO EN EL FILTRO           
            Object arrayObjetos[] = new Object[3];
            for (Login_Object aux : listaAdmins) {
                if (aux.getCorreo().contains(texto)) {
                    arrayObjetos[0] = aux.getId_login();
                    arrayObjetos[1] = aux.getCorreo();
                    arrayObjetos[2] = aux.getContraseña();
                    this.modelo.addRow(arrayObjetos);
                }
            }

            this.tablaAdmin.setModel(this.modelo);
        }
    }

    // --- METODOS PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---
    private void btnAgregarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAdminMouseEntered
        this.btnAgregarAdmin.setBackground(Color.GRAY);
        this.btnAgregarAdmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAgregarAdminMouseEntered

    private void btnAgregarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAdminMouseExited
        this.btnAgregarAdmin.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnAgregarAdminMouseExited

    private void btnActualizarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAdminMouseEntered
        this.btnActualizarAdmin.setBackground(Color.GRAY);
        this.btnActualizarAdmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnActualizarAdminMouseEntered

    private void btnActualizarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAdminMouseExited
        this.btnActualizarAdmin.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnActualizarAdminMouseExited

    private void btnEliminarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAdminMouseEntered
        this.btnEliminarAdmin.setBackground(Color.GRAY);
        this.btnEliminarAdmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEliminarAdminMouseEntered

    private void btnEliminarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAdminMouseExited
        this.btnEliminarAdmin.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnEliminarAdminMouseExited

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

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE AGREGAR LOS ADMINISTRADORES
    private void btnAgregarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdminActionPerformed
        if (this.agregarAdminVista == null) {
            this.agregarAdminVista = new Administracion_Agregar_Vista(this);
            this.agregarAdminVista.setVisible(true);
        } else {
            this.agregarAdminVista.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarAdminActionPerformed

    //METODO PARA ABRIR LA PESTAÑA QUE PERMITE ACTUALIZAR LOS ADMINISTRADORES
    private void btnActualizarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdminActionPerformed

        if (this.tablaAdmin.getSelectedRow() != -1) {
            int idAdmin = (int) this.tablaAdmin.getValueAt(this.tablaAdmin.getSelectedRow(), 0);
            Login_Object admin = this.controladorAdmin.obtenerAdmin_C(idAdmin);

            if (admin != null) {
                if (this.actualizarAdminVista == null) {
                    this.actualizarAdminVista = new Administracion_Actualizar_Vista(this, admin);
                    this.actualizarAdminVista.setVisible(true);
                } else {
                    this.actualizarAdminVista.cargarDatos(admin);
                    this.actualizarAdminVista.setVisible(true);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarAdminActionPerformed

    //METODO PARA ELIMINAR UN ADMINISTRADOR
    private void btnEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdminActionPerformed
        if (this.tablaAdmin.getSelectedRow() != -1) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿DESEAS ELIMINAR EL ADMIN SELECCIONADO?", "INFORMACION", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                int idAdmin = (int) this.tablaAdmin.getValueAt(this.tablaAdmin.getSelectedRow(), 0);
                String correo = (String) this.tablaAdmin.getValueAt(this.tablaAdmin.getSelectedRow(), 1);

                if (correo.equals(Principal_Vista.correoAdmin)) {
                    JOptionPane.showMessageDialog(null, "NO PUEDES ELIMINARTE A TI MISMO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    this.controladorAdmin.eliminarAdmin_C(idAdmin);
                    cargarDatosTabla("");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA FILA DE LA TABLA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAdmin;
    private javax.swing.JButton btnAgregarAdmin;
    private javax.swing.JButton btnEliminarAdmin;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAdmin;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtTotalAdmin;
    // End of variables declaration//GEN-END:variables
}
