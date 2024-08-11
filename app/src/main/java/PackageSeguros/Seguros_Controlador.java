package PackageSeguros;

import PackageEmpresas.Empresas_Object;
import Proyecto_Java.HibernateUtil;
import java.util.List;

public class Seguros_Controlador {

    //OBJETO DEL MODELO DEL SEGURO
    Seguros_Modelo modeloSeguro = new Seguros_Modelo(HibernateUtil.getSessionFactory());

    //CONSTRUCTOR
    public Seguros_Controlador() {
    }

    //METODO PARA OBTENER TODOS LOS SEGUROS (CONTROLADOR)
    public List<Seguros_Object> obtenerTodosSeguros_C() {
        return modeloSeguro.obtenerTodosSeguros_M();
    }

    //METODO PARA GUARDAR EL SEGURO (CONTROLADOR)
    public void guardarSeguro_C(Seguros_Object seguro) {
        modeloSeguro.guardarSeguro_M(seguro);
    }

    //METODO PARA OBTENER UN SEGURO (CONTROLADOR)
    public Seguros_Object obtenerSeguro_C(int idSeguro) {
        return modeloSeguro.obtenerSeguro_M(idSeguro);
    }

    //METODO PARA ACTUALIZAR EL SEGURO (CONTROLADOR)
    public void actualizarSeguro_C(Seguros_Object seguro) {
        modeloSeguro.actualizarSeguro_M(seguro);
    }

    //METODO PARA ELIMINAR UN SEGURO (CONTROLADOR)
    public void eliminarSeguro_C(int idSeguro) {
        modeloSeguro.eliminarSeguro_M(idSeguro);
    }

    //METODO PARA OBTENER LAS EMPRESAS ASEGURADAS (CONTROLADOR)
    public List<Empresas_Object> obtenerEmpresasPorSeguro_C(int idSeguro) {
        return modeloSeguro.obtenerEmpresasPorSeguro_M(idSeguro);
    }

    //METODO PARA COMPROBAR LA EXISTENCIA DEL NOMBRE DEL SEGURO
    public boolean nombreExistente(String nombre) {
        boolean existe = false;
        for (Seguros_Object aux : obtenerTodosSeguros_C()) {
            if (aux.getNombre().equals(nombre)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    //METODO PARA COMPROBAR LOS CAMPOS DEL NOMBRE Y PRECIO 
    public boolean comprobarCamposSeguro_C(String nombre, String precio) {
        return (!nombre.isEmpty() && nombre.length() < 26) && (!precio.isEmpty());
    }

    //METODO PARA OBTENER FILA SELECCIONADA DE LA TABLA
    public int obtenerFilaTabla(Seguros_Object seguro) {
        int indice = -1;
        if (seguro != null) {
            List<Seguros_Object> lista = obtenerTodosSeguros_C();
            for (Seguros_Object aux : lista) {
                if (aux.getId_seguro() == seguro.getId_seguro()) {
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
