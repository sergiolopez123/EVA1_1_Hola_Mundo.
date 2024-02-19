/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva1_5_Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declarar las variables
        String Nombre;
        int Edad;
        System.out.println("introdce tu nombre:");
        //Crear nuestro scanner
        Scanner Captura = new Scanner(System.in);
        //captura
        Nombre = Captura.nextLine();
        System.out.println("Introduce tu edad");
        Edad = Captura.nextInt();
        System.out.println("Tu nombre es: " + Nombre);
        System.out.println("tu edad es: "+ Edad);
        
    }
    
}
