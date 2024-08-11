package PackageEmpresas;

import PackageEmpleados.Empleados_Object;
import PackageProductos.Productos_Object;
import Proyecto_Java.HibernateUtil;
import java.util.List;

public class Empresas_Controlador {

    //OBJETO DEL MODELO DE LA EMPRESA
    private final Empresas_Modelo modeloEmpresas = new Empresas_Modelo(HibernateUtil.getSessionFactory());

    //CONSTRUCTOR
    public Empresas_Controlador() {
    }

    //METODO PARA OBTENER TODOS LAS EMPRESAS (CONTROLADOR)
    public List<Empresas_Object> obtenerTodasEmpresas_C() {
        return modeloEmpresas.obtenerTodasEmpresas_M();
    }

    //METODO PARA GUARDAR LA EMPRESA (CONTROLADOR)
    public void guardarEmpresa_C(Empresas_Object empresa) {
        modeloEmpresas.guardarEmpresa_M(empresa);
    }

    //METODO PARA ELIMINAR UNA EMPRESA (CONTROLADOR)
    public void eliminarEmpresa_C(int idEmpresa) {
        modeloEmpresas.eliminarEmpresa_M(idEmpresa);
    }

    //METODO PARA OBTENER UNA EMPRESA (CONTROLADOR)
    public Empresas_Object obtenerEmpresa_C(int idEmpresa) {
        return modeloEmpresas.obtenerEmpresa_M(idEmpresa);
    }

    //METODO PARA ACTUALIZAR LA EMPRESA (CONTROLADOR)
    public void actualizarEmpresa_C(Empresas_Object empresa) {
        modeloEmpresas.actualizarEmpresa_M(empresa);
    }
    
    //METODO PARA OBTENER LOS EMPLEADOS (CONTROLADOR)
    public List<Empleados_Object> obtenerEmpleadosDeEmpresa_C(int idEmpresa){
       return modeloEmpresas.obtenerEmpleadosDeEmpresa_M(idEmpresa);
    }
    
    //METODO PARA OBTENER LOS PRODUCTOS (CONTROLADOR)
    public List<Productos_Object> obtenerProductosDeEmpresa_C(int idEmpresa){
        return modeloEmpresas.obtenerProductosDeEmpresa_M(idEmpresa);
    }

    //METODO PARA COMPROBAR LOS CAMPOS DEL NOMBRE Y CIUDAD 
    public boolean comprobarCamposEmpresas_C(String idEmp, String nombre, String ciudad) {
        return (!nombre.isEmpty() && nombre.length() < 26) && (!ciudad.isEmpty() && ciudad.length() < 26)
                && (!idEmp.isEmpty() && idEmp.length() < 26);
    }

    //METODO PARA COMPROBAR LA EXISTENCIA DEL ID-EMPRESARIAL
    public boolean idEmpresarialExistente(String idEmp) {
        boolean existe = false;
        for (Empresas_Object aux : obtenerTodasEmpresas_C()) {
            if (aux.getId_empresarial().equals(idEmp)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    //METODO PARA OBTENER FILA SELECCIONADA DE LA TABLA
    public int obtenerFilaTabla(Empresas_Object empresa) {
        int indice = -1;
        if (empresa != null) {
            List<Empresas_Object> lista = obtenerTodasEmpresas_C();
            for (Empresas_Object aux : lista) {
                if (aux.getId_empresa() == empresa.getId_empresa()) {
                    indice = lista.indexOf(aux);
                    break;
                }
            }
            return indice;
        } else {
            return indice;
        }

    }

}
