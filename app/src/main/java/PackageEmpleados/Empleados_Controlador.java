package PackageEmpleados;

import Proyecto_Java.HibernateUtil;
import java.util.List;

public class Empleados_Controlador {

    //OBJETO MODELO DE EMPLEADOS
    private final Empleados_Modelo modeloEmpleados = new Empleados_Modelo(HibernateUtil.getSessionFactory());

    //CONSTRUCTOR
    public Empleados_Controlador() {
    }

    //METODO PARA OBTENER TODOS LOS EMPLEADOS (CONTROLADOR)
    public List<Empleados_Object> obtenerTodosEmpleados_C() {
        return modeloEmpleados.obtenerTodosEmpleados_M();
    }
    
    //METODO PARA OBTENER UN EMPLEADO (CONTROLADOR)
    public Empleados_Object obtenerEmpleado_C(int idEmpleado){
        return modeloEmpleados.obtenerEmpleado_M(idEmpleado);
    }
    
    //METODO PARA GUARDAR EL EMPLEADO (CONTROLADOR)
    public void guardarEmpleado_C(Empleados_Object empleado){
        modeloEmpleados.guardarEmpleado_M(empleado);
    }

    //METODO PARA ELIMINAR UN EMPLEADO (CONTROLADOR)
    public void eliminarEmpleado_C(int idEmpleado) {
        modeloEmpleados.eliminarEmpleado_M(idEmpleado);
    }
    
    //METODO PARA ACTUALIZAR AL EMPLEADO (CONTROLADOR)
    public void actualizarEmpleado_C(Empleados_Object empleado){
        modeloEmpleados.actualizarEmpleado_M(empleado);
    }

    //METODO PARA COMPROBAR LA EXISTENCIA DEL DNI
    public boolean dniExistente(String dni) {
        boolean existe = false;
        for (Empleados_Object aux : obtenerTodosEmpleados_C()) {
            if (aux.getDni().equals(dni)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    
    //METODO PARA COMPROBAR LA EXISTENCIA DEL TELEFONO
    public boolean telefonoExistente(String telefono) {
        boolean existe = false;
        for (Empleados_Object aux : obtenerTodosEmpleados_C()) {
            if (aux.getTelefono() == Integer.parseInt(telefono)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    //METODO PARA COMPROBAR LOS CAMPOS DEL DNI , NOMBRE , TELEFONO 
    public boolean comprobarCamposEmpleado_C(String dni, String nombre, String telefono) {
        return (!nombre.isEmpty() && nombre.length() < 26) && (comprobarDNI(dni))
                && (comprobarTelefono(telefono));
    }

    
    //METODO PARA COMPROBAR EL TELEFONO
    public boolean comprobarTelefono(String telefono) {
        if (telefono.isEmpty() || telefono.length() != 9) {
            return false;
        }
        for (int x = 0; x < telefono.length(); x++) {
            char c = telefono.charAt(x);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    
    //METODO PARA COMPROBAR EL DNI
    public boolean comprobarDNI(String dni) {
        if (dni == null || dni.length() != 9) {
            return false;
        }
        for (int i = 0; i < 8; i++) {
            char c = dni.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        char letra = dni.charAt(8);
        return Character.isLetter(letra);
    }

    
}
