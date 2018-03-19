/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import com.almundo.model.Empleado;
import com.almundo.model.TipoEmpleado;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;


/**
 *
 * @author USUARIO
 */
public class aplicacion {
    
   private static final Logger log = Logger.getLogger(aplicacion.class);
     
    Empleado operador;
    Empleado Director;
    Empleado Supervisor;
    
        
    public static void main(String[] args) {
        
        Empleado operador = new Empleado(1, TipoEmpleado.Operador);
        Empleado Director = new Empleado(3,TipoEmpleado.Director); 
        Empleado Supervisor = new Empleado(2,TipoEmpleado.Supervisor);
    }   
}
