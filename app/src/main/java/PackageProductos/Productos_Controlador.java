package PackageProductos;

import Proyecto_Java.HibernateUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Productos_Controlador {

    //OBJETO MODELO DE PRODUCTOS
    private final Productos_Modelo modeloProducto = new Productos_Modelo(HibernateUtil.getSessionFactory());

    //CONSTRUCTOR
    public Productos_Controlador() {
    }

    //METODO PARA OBTENER TODOS LOS PRODUCTOS (CONTROLADOR)
    public List<Productos_Object> obtenerTodosProductos_C() {
        return modeloProducto.obtenerTodosProductos_M();
    }

    //METODO PARA GUARDAR EL PRODUCTO (CONTROLADOR)
    public void guardarProducto_C(Productos_Object producto) {
        modeloProducto.guardarProducto_M(producto);
    }

    //METODO PARA ELIMINAR UN PRODUCTO (CONTROLADOR)
    public void eliminarProducto_C(int idProducto) {
        modeloProducto.eliminarProducto_M(idProducto);
    }

    //METODO PARA ACTUALIZAR EL PRODUCTO (CONTROLADOR)
    public void actualizarProducto_C(Productos_Object producto) {
        modeloProducto.actualizarProducto_M(producto);
    }

    //METODO PARA OBTENER UN PRODUCTO (CONTROLADOR)
    public Productos_Object obtenerProducto_C(int idProducto) {
        return modeloProducto.obtenerProducto_M(idProducto);
    }

    //METODO PARA COMPROBAR LOS CAMPOS DEL IDENTIFICADOR , NOMBRE , CATEGORIA 
    public boolean comprobarCamposProducto_C(String identificador, String nombre, String categoria) {
        return (!identificador.isEmpty() && identificador.length() < 26) && (!nombre.isEmpty() && nombre.length() < 26)
                && (!categoria.equals("--- SELECCIONAR ---"));
    }

    //METODO PARA COMPROBAR LA EXISTENCIA DEL IDENTIFICADOR
    public boolean identificadorExistente(String identificador) {
        boolean existe = false;
        for (Productos_Object aux : obtenerTodosProductos_C()) {
            if (aux.getIdentificador().equals(identificador)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    //METODO PARA OBTENER INDICE SELECCIONADO DEL COMBO
    public int obtenerIndiceCombo(String categoria) {
        List<String> categorias = new ArrayList<>(Arrays.asList("-- SELECCIONAR --", "ALIMENTACION", "ROPA", "DEPORTES", "VIDEOJUEGOS" , "COSAS VARIAS"));
        return categorias.indexOf(categoria);
    }

}
