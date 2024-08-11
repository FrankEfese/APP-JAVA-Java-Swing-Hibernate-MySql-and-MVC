package PackageAdministracion;

import PackageLogin.Login_Object;
import Proyecto_Java.HibernateUtil;
import java.util.List;

public class Administracion_Controlador {

    //OBJETO MODELO DE ADMINISTRACION
    private final Administracion_Modelo modeloAdmin = new Administracion_Modelo(HibernateUtil.getSessionFactory());

    //CONSTRUCTOR
    public Administracion_Controlador() {
    }
    
    
    //METODO PARA OBTENER TODOS LOS ADMIN (CONTROLADOR)
    public List<Login_Object> obtenerTodosLogin_C() {
        return modeloAdmin.obtenerTodosLogin_M();
    }
    
    
    //METODO PARA OBTENER UN ADMIN (CONTROLADOR)
    public Login_Object obtenerAdmin_C(int idAdmin){
        return modeloAdmin.obtenerAdmin_M(idAdmin);
    }
    
    
    //METODO PARA GUARDAR EL ADMIN (CONTROLADOR)
    public void guardarAdmin_C(Login_Object admin){
        modeloAdmin.guardarAdmin_M(admin);
    }
    
    
    //METODO PARA ACTUALIZAR EL ADMIN (CONTROLADOR)
    public void actualizarAdmin_C(Login_Object admin){
        modeloAdmin.actualizarAdmin_M(admin);
    }
    
    
    //METODO PARA ELIMINAR UN ADMIN (CONTROLADOR)
    public void eliminarAdmin_C(int idAdmin){
        modeloAdmin.eliminarAdmin_M(idAdmin);
    }

    //METODO PARA COMPROBAR LA EXISTENCIA DEL CORREO DEL ADMIN
    public boolean correoExistente(String correo) {
        boolean existe = false;
        for (Login_Object aux : obtenerTodosLogin_C()) {
            if (aux.getCorreo().equals(correo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    //METODO PARA COMPROBAR LOS CAMPOS DEL CORREO Y CONTRASEÑA 
    public boolean comprobarCamposAdmin_C(String correo, String contra) {
        return (!correo.isEmpty() && correo.length() < 26) && (!contra.isEmpty() && correo.length() < 26);
    }

}
