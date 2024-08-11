package PackageEmpresas.PackageOpciones;

import PackageEmpleados.Empleados_Object;
import PackageEmpresas.Empresas_Controlador;
import PackageEmpresas.Empresas_Object;
import PackageProductos.Productos_Object;
import PackageSeguros.Seguros_Controlador;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Empresas_VerEmpresa_Vista extends javax.swing.JFrame {

    //OBJETOS CONTROLADOR DE EMPRESA Y SEGURO
    private final Empresas_Controlador controladorEmpresa = new Empresas_Controlador();
    private final Seguros_Controlador controladorSeguro = new Seguros_Controlador();

    //OBJETO EMPRESA
    private Empresas_Object empresa;

    //MODELOS DE LA TABLA EMPLEADOS Y PRODUCTOS
    private DefaultTableModel modeloE;
    private DefaultTableModel modeloP;

    //CONSTRUCTOR
    public Empresas_VerEmpresa_Vista(Empresas_Object empresa) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.empresa = empresa;
        //LAMAMOS AL METODO PARA CARGAR LOS DATOS
        cargarDatos(this.empresa);
    }

    //METODO PARA CARGAR LOS DATOS DE LA EMPRESA
    public void cargarDatos(Empresas_Object empresa) {
        
        this.empresa = empresa;
        
        //APLICAMOS LAS COLUMNAS DE LA TABLA EMPLEADOS Y PRODUCTOS
        String columnas[] = {"DNI", "NOMBRE"};
        this.modeloE = new DefaultTableModel(columnas, 0);
        
        String columnas2[] = {"IDENTIFICADOR", "NOMBRE"};
        this.modeloP = new DefaultTableModel(columnas2, 0);

        //APLICAMOS LA INFORMACION PRINCIPAL DE LA EMPRESA
        this.txtIdEmp.setText("ID-EMPRESARIAL : " + this.empresa.getId_empresarial());
        this.txtNombre.setText("NOMBRE : " + this.empresa.getNombre());
        this.txtCiudad.setText("CIUDAD : " + this.empresa.getCiudad());
               
        if(this.empresa.getSeguros_id_seguro() != null){
            this.txtSeguro.setText("SEGURO : " + this.controladorSeguro.obtenerSeguro_C(this.empresa.getSeguros_id_seguro().getId_seguro()).getNombre());
        }else{
           this.txtSeguro.setText("SEGURO : SIN SEGURO"); 
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.txtF_Alta.setText("FECHA ALTA : " + dateFormat.format(this.empresa.getF_alta()));

        //APLICAMOS LOS EMPLEADOS
        List<Empleados_Object> empleados = this.controladorEmpresa.obtenerEmpleadosDeEmpresa_C(this.empresa.getId_empresa());
        this.txtTotalEmpleados.setText("* Total de Empleados : " + empleados.size());
        
        Object datos[] = new Object[2];
        for (Empleados_Object aux : empleados) {
            datos[0] = aux.getDni();
            datos[1] = aux.getNombre();
            this.modeloE.addRow(datos);
        }
        
        this.tablaEmpleados.setModel(this.modeloE);
        
        //APLICAMOS LOS PRODUCTOS
        List<Productos_Object> productos = this.controladorEmpresa.obtenerProductosDeEmpresa_C(this.empresa.getId_empresa());
        this.txtTotalProductos.setText("* Total de Productos : " + productos.size());
        
        Object datos2[] = new Object[2];
        for (Productos_Object aux : productos) {
            datos2[0] = aux.getIdentificador();
            datos2[1] = aux.getNombre();
            this.modeloP.addRow(datos2);
        }
        
        this.tablaProductos.setModel(this.modeloP);
        
    }

    //COMPONENTES DE LA INTERFAZ
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtIdEmp = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JLabel();
        txtF_Alta = new javax.swing.JLabel();
        txtTotalEmpleados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        txtNombre = new javax.swing.JLabel();
        txtTotalProductos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtSeguro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INFORMACION EMPRESA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--- INFORMACION DE EMPRESA ---");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtIdEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtIdEmp.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtIdEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIdEmp.setText("ID-EMPRESARIAL :");

        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCiudad.setText("CIUDAD :");

        txtF_Alta.setBackground(new java.awt.Color(255, 255, 255));
        txtF_Alta.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtF_Alta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtF_Alta.setText("FECHA ALTA :");

        txtTotalEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalEmpleados.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        txtTotalEmpleados.setText("Total Empleados :");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tablaEmpleados.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE"
            }
        ));
        tablaEmpleados.setFocusable(false);
        tablaEmpleados.setRowHeight(40);
        tablaEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaEmpleados);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("NOMBRE :");

        txtTotalProductos.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalProductos.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        txtTotalProductos.setText("Total Productos :");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tablaProductos.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID-PRODUCTO", "NOMBRE"
            }
        ));
        tablaProductos.setFocusable(false);
        tablaProductos.setRowHeight(40);
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tablaProductos);

        txtSeguro.setBackground(new java.awt.Color(255, 255, 255));
        txtSeguro.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtSeguro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSeguro.setText("SEGURO :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtF_Alta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtTotalEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotalProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF_Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotalEmpleados))))
                .addGap(15, 15, 15))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JLabel txtCiudad;
    private javax.swing.JLabel txtF_Alta;
    private javax.swing.JLabel txtIdEmp;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtSeguro;
    private javax.swing.JLabel txtTotalEmpleados;
    private javax.swing.JLabel txtTotalProductos;
    // End of variables declaration//GEN-END:variables
}
