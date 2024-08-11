package PackageInicio;

import PackageAdministracion.Administracion_Controlador;
import PackageEmpleados.Empleados_Controlador;
import PackageEmpresas.Empresas_Controlador;
import PackageProductos.Productos_Controlador;
import PackageSeguros.*;


public class Inicio_Vista extends javax.swing.JPanel {

    //OBJETO DEL CONTROLADOR DE SEGUROS , EMPRESA , EMPLEADO , PRODUCTO y ADMINISTRADOR
    private final Seguros_Controlador controladorSeguro = new Seguros_Controlador();
    private final Empresas_Controlador controladorEmpresa = new Empresas_Controlador();
    private final Empleados_Controlador controladorEmpleado = new Empleados_Controlador();
    private final Productos_Controlador controladorProducto = new Productos_Controlador();
    private final Administracion_Controlador controladorAdmin = new Administracion_Controlador();


    //CONSTRUCTOR
    public Inicio_Vista() {
        initComponents();
        //LLAMAMOS AL METODO PARA CARGAR LOS DATOS
        cargarDatosTabla();
    }

    //COMPONENTES DE LA INTERFAZ
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblSeguros = new javax.swing.JLabel();
        lblEmpresas = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--- ESTADISTICAS ---");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(338, 338, 338))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblSeguros.setBackground(new java.awt.Color(255, 255, 255));
        lblSeguros.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblSeguros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeguros.setText("jLabel4");
        lblSeguros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblEmpresas.setBackground(new java.awt.Color(255, 255, 255));
        lblEmpresas.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblEmpresas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresas.setText("jLabel4");
        lblEmpresas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        lblEmpleados.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpleados.setText("jLabel4");
        lblEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblProductos.setBackground(new java.awt.Color(255, 255, 255));
        lblProductos.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductos.setText("jLabel4");
        lblProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblAdmin.setBackground(new java.awt.Color(255, 255, 255));
        lblAdmin.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setText("jLabel4");
        lblAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSeguros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblSeguros, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    //METODO PARA CARGAR LOS DATOS
    public void cargarDatosTabla() {
        
        //APLICAMOS EL TOTAL DE SEGUROS, EMPRESA , EMPLEADO , PRODUCTO y ADMINISTRADORES
        this.lblSeguros.setText("TOTAL DE SEGUROS : " + this.controladorSeguro.obtenerTodosSeguros_C().size());
        this.lblEmpresas.setText("TOTAL DE EMPRESAS : " + this.controladorEmpresa.obtenerTodasEmpresas_C().size());
        this.lblEmpleados.setText("TOTAL DE EMPLEADOS : " + this.controladorEmpleado.obtenerTodosEmpleados_C().size());
        this.lblProductos.setText("TOTAL DE PRODUCTOS : " + this.controladorProducto.obtenerTodosProductos_C().size());
        this.lblAdmin.setText("TOTAL DE ADMINISTRADORES : " + this.controladorAdmin.obtenerTodosLogin_C().size());

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblEmpresas;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblSeguros;
    // End of variables declaration//GEN-END:variables
}
