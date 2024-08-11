package PackageProductos;

import PackageEmpresas.Empresas_Object;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "productos")
public class Productos_Object implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto")
    private int id_producto;
    
    @Column(name = "identificador", nullable = false , unique = true)
    private String identificador;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "precio", nullable = false)
    private double precio;
    
    @Column(name = "categoria", nullable = false)
    private String categoria;
    
    @Column(name = "stock", nullable = false)
    private int stock;
    
    @Column(name = "f_alta", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date f_alta;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "empresas_id_empresa_p", nullable = true)
    private Empresas_Object empresas_id_empresa_p;

    
    //CONSTRUCTOR
    public Productos_Object() {
    }

    //CONSTRUCTOR
    public Productos_Object(int id_producto, String identificador, String nombre, double precio, String categoria, int stock, Date f_alta, Empresas_Object empresas_id_empresa_p) {
        this.id_producto = id_producto;
        this.identificador = identificador;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.f_alta = f_alta;
        this.empresas_id_empresa_p = empresas_id_empresa_p;
    }

    //CONSTRUCTOR
    public Productos_Object(String identificador, String nombre, double precio, String categoria, int stock, Date f_alta, Empresas_Object empresas_id_empresa_p) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.f_alta = f_alta;
        this.empresas_id_empresa_p = empresas_id_empresa_p;
    }

    
    //GETTERS AND SETTERS
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getF_alta() {
        return f_alta;
    }

    public void setF_alta(Date f_alta) {
        this.f_alta = f_alta;
    }

    public Empresas_Object getEmpresas_id_empresa_p() {
        return empresas_id_empresa_p;
    }

    public void setEmpresas_id_empresa_p(Empresas_Object empresas_id_empresa_p) {
        this.empresas_id_empresa_p = empresas_id_empresa_p;
    }

    
    //TO STRING
    @Override
    public String toString() {
        return "Productos_Object{" + "id_producto=" + id_producto + ", identificador=" + identificador + ", nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + ", stock=" + stock + ", f_alta=" + f_alta + ", empresas_id_empresa_p=" + empresas_id_empresa_p + '}';
    }
    
    
    
    
    
    
}
