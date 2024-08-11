package PackageEmpresas;

import PackageEmpleados.Empleados_Object;
import PackageProductos.Productos_Object;
import PackageSeguros.Seguros_Object;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "empresas")
public class Empresas_Object implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empresa")
    private int id_empresa;

    @Column(name = "id_empresarial", nullable = false , unique = true)
    private String id_empresarial;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "ciudad", nullable = false)
    private String ciudad;

    @Column(name = "f_alta", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date f_alta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seguros_id_seguro", nullable = true)
    private Seguros_Object seguros_id_seguro;
    
    @OneToMany(mappedBy = "empresas_id_empresa", cascade = CascadeType.PERSIST)
    private List<Empleados_Object> empleados;
    
    @OneToMany(mappedBy = "empresas_id_empresa_p", cascade = CascadeType.REMOVE)
    private List<Productos_Object> productos;

    //CONSTRUCTOR
    public Empresas_Object() {
    }

    //CONSTRUCTOR
    public Empresas_Object(int id_empresa, String id_empresarial, String nombre, String ciudad, Date f_alta, Seguros_Object seguros_id_seguro) {
        this.id_empresa = id_empresa;
        this.id_empresarial = id_empresarial;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.f_alta = f_alta;
        this.seguros_id_seguro = seguros_id_seguro;
    }
    

    //CONSTRUCTOR
    public Empresas_Object(String id_empresarial, String nombre, String ciudad, Date f_alta, Seguros_Object seguros_id_seguro) {    
        this.id_empresarial = id_empresarial;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.f_alta = f_alta;
        this.seguros_id_seguro = seguros_id_seguro;
    }

    //GETTERS AND SETTERS
    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getId_empresarial() {
        return id_empresarial;
    }

    public void setId_empresarial(String id_empresarial) {
        this.id_empresarial = id_empresarial;
    }
    

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getF_alta() {
        return f_alta;
    }

    public void setF_alta(Date f_alta) {
        this.f_alta = f_alta;
    }

    public Seguros_Object getSeguros_id_seguro() {
        return seguros_id_seguro;
    }

    public void setSeguros_id_seguro(Seguros_Object seguros_id_seguro) {
        this.seguros_id_seguro = seguros_id_seguro;
    }

    public List<Empleados_Object> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleados_Object> empleados) {
        this.empleados = empleados;
    }

    public List<Productos_Object> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos_Object> productos) {
        this.productos = productos;
    }
      

    //TO STRING
    @Override
    public String toString() {
        return "Empresas_Object{" + "id_empresa=" + id_empresa + ", id_empresarial=" + id_empresarial + ", nombre=" + nombre + ", ciudad=" + ciudad + ", f_alta=" + f_alta + ", seguros_id_seguro=" + seguros_id_seguro + ", empleados=" + empleados + '}';
    }
    

}
