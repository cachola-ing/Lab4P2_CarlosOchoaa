/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_carlosochoa;

import java.util.ArrayList;

/**
 *
 * @author Carlos Antonio
 */
public class Limpiador {
    String nombre;
    boolean contratado;
    ArrayList<Inquilino> inquilino = new ArrayList<>();
    ArrayList<Apartamento> solicitudes = new ArrayList<>();

    public Limpiador(String nombre, boolean contratado) {
        this.nombre = nombre;
        this.contratado = contratado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    public ArrayList<Inquilino> getInquilino() {
        return inquilino;
    }

    public void setInquilino(ArrayList<Inquilino> inquilino) {
        this.inquilino = inquilino;
    }

    public ArrayList<Apartamento> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Apartamento> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    
    
}
