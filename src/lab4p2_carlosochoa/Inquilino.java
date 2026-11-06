/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_carlosochoa;

/**
 *
 * @author Carlos Antonio
 */
public class Inquilino {
    String nombre;
    Apartamento asignado;
    boolean contrato;

    public Inquilino(String nombre, Apartamento asignado, boolean contrato) {
        this.nombre = nombre;
        this.asignado = asignado;
        this.contrato = contrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Apartamento getAsignado() {
        return asignado;
    }

    public void setAsignado(Apartamento asignado) {
        this.asignado = asignado;
    }

    public boolean isContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }
    
    
    
}
