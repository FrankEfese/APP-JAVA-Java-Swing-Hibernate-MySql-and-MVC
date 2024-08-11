package PackageEmpleados;

import PackageEmpresas.Empresas_Object;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleados_Object implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empleado")
    private int id_empleado;

    @Column(name = "dni", nullable = false, unique = true)
    private String dni;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "telefono", nullable = false, unique = true)
    private int telefono;

    @Column(name = "f_alta", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date f_alta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "empresas_id_empresa", nullable = true)
    private Empresas_Object empresas_id_empresa;

    //CONSTRUCTOR
    public Empleados_Object() {
    }

    //CONSTRUCTOR
    public Empleados_Object(int id_empleado, String dni, String nombre, int edad, int telefono, Date f_alta, Empresas_Object empresas_id_empresa) {
        this.id_empleado = id_empleado;
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.f_alta = f_alta;
        this.empresas_id_empresa = empresas_id_empresa;
    }

    //CONSTRUCTOR
    public Empleados_Object(String dni, String nombre, int edad, int telefono, Date f_alta, Empresas_Object empresas_id_empresa) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.f_alta = f_alta;
        this.empresas_id_empresa = empresas_id_empresa;
    }

    //GETTERS AND SETTERS
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getF_alta() {
        return f_alta;
    }

    public void setF_alta(Date f_alta) {
        this.f_alta = f_alta;
    }

    public Empresas_Object getEmpresas_id_empresa() {
        return empresas_id_empresa;
    }

    public void setEmpresas_id_empresa(Empresas_Object empresas_id_empresa) {
        this.empresas_id_empresa = empresas_id_empresa;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Empleados_Object{" + "id_empleado=" + id_empleado + ", dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + ", f_alta=" + f_alta + ", empresas_id_empresa=" + empresas_id_empresa + '}';
    }

}
