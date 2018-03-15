/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;
import java.util.Arrays;

/**
 *
 * @author Andre
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Nombre, Apellido, edad, carnet, estado civil...
        String[] strArray = new String[]
        {   
            "Nombre y apellido  : Andre Iglesias",
            "Edad               : 18", 
            "Earnet             : 00084317",
            "Estado civil       : Soltero"
        };
        Arrays.asList(strArray).stream().forEach(x -> System.out.println(x));
    }
    
}
