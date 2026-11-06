/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_carlosochoa;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lab4P2_CarlosOchoa {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        
        do{
            System.out.println("===MENU PRINCIPAL===");
            System.out.println("1.Menu de casero");
            System.out.println("2.Menu de inquilino");
            System.out.println("3.Menu de Limpiador");
            System.out.println("4.Crear Inquilino");
            System.out.println("5.Crear Limpiador");
            System.out.println("6.Salir");
            System.out.println("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1:
                    menuCasero();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    System.out.println("opcion no valida!");
                    break;
            }
        }while(opcion!= 6);
    }//fin del main
    public static void menuCasero(){
        int opcionCasero = 0;
        
        do{
            System.out.println("===MENU CASERO===");
            System.out.println("1.Desalojar departamento");
            System.out.println("2.Despedir Limpiadores");
            System.out.println("3.Ver notificaciones");
            System.out.println("4.Ver mapa del edificio");
            System.out.println("5.Reporte por piso");
            System.out.println("6.Volver al menu principal");
            System.out.println("seleciione una opcion: ");
            
            opcionCasero = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcionCasero){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    System.out.println("Ingrese opcion valida.");
                    break;
            }
            
        }while(opcionCasero!= 6);
    }
    
    public static void menuInquilino(){
        
    }
    
}//fin de la clase
