/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almundo.model;

/**
 *
 * @author USUARIO
 */
public abstract class abstractEmpleado {
    
    protected int prioridad;
    protected TipoEmpleado tipoEmpleado;
    
    public abstractEmpleado(int prioridad, TipoEmpleado tipoEmpleado){
        this.prioridad = prioridad;
        this.tipoEmpleado = tipoEmpleado;
    }
}
