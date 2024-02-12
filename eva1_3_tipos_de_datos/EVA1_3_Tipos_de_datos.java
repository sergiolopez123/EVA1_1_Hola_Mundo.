/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_tipos_de_datos;

/**
 *
 * @author jairl
 */
public class EVA1_3_Tipos_de_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte PruebaByte; // 1 Byte = 8 bits -> 256 
        //PruebaByte = 256; // 256 no cabe en la variable
        PruebaByte = -127;
        //PruebaByte = 128; //acepta de -128 y 127
        PruebaByte = -128;
        Short PruebaShort;// dos bytes = 16 bits --> 65536
       // PruebaShort = -32769; no cabe -32769
       PruebaShort = -32768;
       PruebaShort = 32767;
       System.out.println(PruebaShort);//imprime la variable prueba
       PruebaShort++; // ++es un operador, suma uno al contenido de la variable 
       System.out.println(PruebaShort);
 }
}
