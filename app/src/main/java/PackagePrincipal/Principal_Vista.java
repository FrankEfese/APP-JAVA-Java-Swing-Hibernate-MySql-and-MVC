package PackagePrincipal;

import PackageAdministracion.Administracion_Vista;
import PackageEmpleados.Empleados_Vista;
import PackageEmpresas.Empresas_Vista;
import PackageInicio.Inicio_Vista;
import PackageLogin.Login_Vista;
import PackageProductos.Productos_Vista;
import PackageSeguros.Seguros_Vista;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingUtilities;

public class Principal_Vista extends javax.swing.JFrame {

    //OBJETO CORREO ADMIN
    public static String correoAdmin = "";

    //OBJETOS DE VISTA
    private Login_Vista vistaLogin;
    private Inicio_Vista vistaInicio;
    private Seguros_Vista vistaSeguro;
    private Empresas_Vista vistaEmpresa;
    private Empleados_Vista vistaEmpleados;
    private Productos_Vista vistaProductos;
    private Administracion_Vista vistaAdmin;

    //CARD DONDE SE COLOCARAN LAS VISTAS DE LAS OPCIONES
    private final CardLayout opciones;

    //CONSTRUCTOR
    public Principal_Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.opciones = (CardLayout) this.pnlVistas.getLayout();

        //APLICAMOS LA PESTAÑA INICIO COMO LA PRINCIPAL
        this.vistaInicio = new Inicio_Vista();
        this.pnlVistas.add(this.vistaInicio, "vistaInicio");
        this.opciones.show(this.pnlVistas, "vistaInicio");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }

    //COMPONENTES DE LA INTERFAZ
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicioP = new javax.swing.JButton();
        btnSeguros = new javax.swing.JButton();
        btnEmpresas = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        pnlVistas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTOR HIBERNATE");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1350, 750));
        setPreferredSize(new java.awt.Dimension(1350, 750));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--- GESTOR HIBERNATE ---");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_menu_black.png"))); // NOI18N
        jLabel2.setText("INDICE");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIconTextGap(15);

        btnInicioP.setBackground(new java.awt.Color(0, 0, 0));
        btnInicioP.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnInicioP.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_casa.png"))); // NOI18N
        btnInicioP.setText("INICIO");
        btnInicioP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnInicioP.setFocusable(false);
        btnInicioP.setIconTextGap(15);
        btnInicioP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioPMouseExited(evt);
            }
        });
        btnInicioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioPActionPerformed(evt);
            }
        });

        btnSeguros.setBackground(new java.awt.Color(0, 0, 0));
        btnSeguros.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnSeguros.setForeground(new java.awt.Color(255, 255, 255));
        btnSeguros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_seguro.png"))); // NOI18N
        btnSeguros.setText("SEGUROS");
        btnSeguros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnSeguros.setFocusable(false);
        btnSeguros.setIconTextGap(15);
        btnSeguros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSegurosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSegurosMouseExited(evt);
            }
        });
        btnSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegurosActionPerformed(evt);
            }
        });

        btnEmpresas.setBackground(new java.awt.Color(0, 0, 0));
        btnEmpresas.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnEmpresas.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_empresa.png"))); // NOI18N
        btnEmpresas.setText("EMPRESAS");
        btnEmpresas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnEmpresas.setFocusable(false);
        btnEmpresas.setIconTextGap(15);
        btnEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpresasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpresasMouseExited(evt);
            }
        });
        btnEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresasActionPerformed(evt);
            }
        });

        btnEmpleados.setBackground(new java.awt.Color(0, 0, 0));
        btnEmpleados.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empleados_white.png"))); // NOI18N
        btnEmpleados.setText("EMPLEADOS");
        btnEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnEmpleados.setFocusable(false);
        btnEmpleados.setIconTextGap(15);
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseExited(evt);
            }
        });
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(0, 0, 0));
        btnProductos.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_productos.png"))); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnProductos.setFocusable(false);
        btnProductos.setIconTextGap(15);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_cerrar_sesion_white.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnSalir.setFocusable(false);
        btnSalir.setIconTextGap(15);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnAdmin.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_admin.png"))); // NOI18N
        btnAdmin.setText("ADMINS");
        btnAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnAdmin.setFocusable(false);
        btnAdmin.setIconTextGap(15);
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdminMouseExited(evt);
            }
        });
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicioP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeguros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInicioP, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlVistas.setBackground(new java.awt.Color(255, 255, 255));
        pnlVistas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        pnlVistas.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlVistas, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlVistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(294, 294, 294))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--- METODOS ---
    // --- METODO PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---
    private void btnInicioPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioPMouseEntered
        this.btnInicioP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.btnInicioP.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnInicioPMouseEntered

    private void btnInicioPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioPMouseExited
        this.btnInicioP.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnInicioPMouseExited

    private void btnSegurosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSegurosMouseEntered
        this.btnSeguros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.btnSeguros.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnSegurosMouseEntered

    private void btnSegurosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSegurosMouseExited
        this.btnSeguros.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnSegurosMouseExited

    private void btnEmpresasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpresasMouseEntered
        this.btnEmpresas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.btnEmpresas.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnEmpresasMouseEntered

    private void btnEmpresasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpresasMouseExited
        this.btnEmpresas.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnEmpresasMouseExited

    private void btnEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseEntered
        this.btnEmpleados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.btnEmpleados.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnEmpleadosMouseEntered

    private void btnEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseExited
        this.btnEmpleados.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnEmpleadosMouseExited

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        this.btnProductos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.btnProductos.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        this.btnProductos.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        this.btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.btnSalir.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        this.btnSalir.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnSalirMouseExited
    // --- METODO PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---

    //METODO PARA SALIR DE LA VISTA PRINCIPAL Y VOLVER AL LOGIN
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        vistaLogin = new Login_Vista();
        vistaLogin.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    //METODO PARA SELECCIONAR LA VISTA SEGUROS
    private void btnSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurosActionPerformed
        this.vistaSeguro = new Seguros_Vista();
        this.pnlVistas.add(this.vistaSeguro, "vistaSeguro");
        this.opciones.show(this.pnlVistas, "vistaSeguro");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnSegurosActionPerformed

    //METODO PARA SELECCIONAR LA VISTA EMPRESAS
    private void btnEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresasActionPerformed
        this.vistaEmpresa = new Empresas_Vista();
        this.pnlVistas.add(this.vistaEmpresa, "vistaEmpresa");
        this.opciones.show(this.pnlVistas, "vistaEmpresa");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnEmpresasActionPerformed

    //METODO PARA SELECCIONAR LA VISTA EMPLEADOS
    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        this.vistaEmpleados = new Empleados_Vista();
        this.pnlVistas.add(this.vistaEmpleados, "vistaEmpleados");
        this.opciones.show(this.pnlVistas, "vistaEmpleados");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    //METODO PARA SELECCIONAR LA VISTA PRODUCTOS
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        this.vistaProductos = new Productos_Vista();
        this.pnlVistas.add(this.vistaProductos, "vistaProductos");
        this.opciones.show(this.pnlVistas, "vistaProductos");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnProductosActionPerformed

    //METODO PARA SELECCIONAR LA VISTA INICIO
    private void btnInicioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioPActionPerformed
        this.vistaInicio = new Inicio_Vista();
        this.pnlVistas.add(this.vistaInicio, "vistaInicio");
        this.opciones.show(this.pnlVistas, "vistaInicio");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnInicioPActionPerformed

    // --- METODO PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---
    private void btnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseEntered
        this.btnAdmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.btnAdmin.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnAdminMouseEntered

    private void btnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseExited
        this.btnAdmin.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnAdminMouseExited
    // --- METODO PARA CAMBIAR LA ESTETICA DEL CURSOR Y EL BOTON ---

    //METODO PARA SELECCIONAR LA VISTA ADMINISTRADORES
    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        this.vistaAdmin = new Administracion_Vista();
        this.pnlVistas.add(this.vistaAdmin, "vistaAdmin");
        this.opciones.show(this.pnlVistas, "vistaAdmin");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnEmpresas;
    private javax.swing.JButton btnInicioP;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeguros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlVistas;
    // End of variables declaration//GEN-END:variables
}
