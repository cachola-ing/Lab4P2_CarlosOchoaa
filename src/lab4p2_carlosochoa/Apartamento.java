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
public class Apartamento {
    String codigo;
    ArrayList<Inquilino> inquilinos = new ArrayList<>();
    int precio;
    int suciedad;
    boolean estado;

    public Apartamento(String codigo, int precio, int suciedad, boolean estado) {
        this.codigo = codigo;
        this.precio = precio;
        this.suciedad = suciedad;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Inquilino> getInquilinos() {
        return inquilinos;
    }

    public void setInquilinos(ArrayList<Inquilino> inquilinos) {
        this.inquilinos = inquilinos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSuciedad() {
        return suciedad;
    }

    public void setSuciedad(int suciedad) {
        this.suciedad = suciedad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
