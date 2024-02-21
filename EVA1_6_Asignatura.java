/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class EVA1_6_Asignatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //clave, nombre, creditos, HorasT, HorasP, Carrera.
        //True es igual a materia de tronco comun
        //tipoMat
        String Clave, Nombre, Carrera;
        int Creditos, HorasT, HorasP;
        boolean TipoDeMateria;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Introduce tu clave de materia:");
        Clave = Scan.nextLine();
        System.out.println("introduce el nombre de la materia");
        Nombre = Scan.nextLine();
        System.out.println("introduce el nombre de la carrera");
        Carrera = Scan.nextLine();
        System.out.println("introduce todos los creditos de la materia");
        Creditos = Scan.nextInt();
        System.out.println("introduce el total de horas teoricas de la materia");
        HorasT = Scan.nextInt();
        System.out.println("introduce el total de horas practicas de la materia");
        HorasP = Scan.nextInt();
        System.out.println("¿Es una materia generica? true generica - false especial");
        TipoDeMateria = Scan.nextBoolean();
        System.out.println("Datos de la asignatura");
        System.out.println("La clave de tu materia es: " + Clave);
        System.out.println("El nombre de tu materia es: "+ Nombre);
        System.out.println("La materia de es de la carrera: " + Carrera);
        System.out.println("El total de creditos es: " + Creditos);
        System.out.println("el total de horas practicas son: " + HorasP);
        System.out.println("el total de horas teoricas son: " + HorasT);
        System.out.println("Tu materia es de tipo: " + TipoDeMateria);
        
        
        
    }
               
            
    }
    
