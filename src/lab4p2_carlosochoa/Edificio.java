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
public class Edificio {

    Casero dueno;
    int matriz[][] = new int[3][4];
    ArrayList<Limpiador> limpiadores = new ArrayList<>();
    ArrayList<Inquilino> inquilinos = new ArrayList<>();

    public Edificio(Casero dueno) {
        this.dueno = dueno;
    }

    public Casero getDueno() {
        return dueno;
    }

    public void setDueno(Casero dueno) {
        this.dueno = dueno;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public ArrayList<Limpiador> getLimpiadores() {
        return limpiadores;
    }

    public void setLimpiadores(ArrayList<Limpiador> limpiadores) {
        this.limpiadores = limpiadores;
    }

    public ArrayList<Inquilino> getInquilinos() {
        return inquilinos;
    }

    public void setInquilinos(ArrayList<Inquilino> inquilinos) {
        this.inquilinos = inquilinos;
    }
    
    

}
