/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastrings;

/**
 *
 * @author DevTardeA
 */
public class MoreStringMethods {
    public static void main(String[] args){
        String txt = "Hello World";
        System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD";
        System.out.println(txt.toLowerCase()); // Outputs "hello world";
        
        //Finding a character in a string
        String texto = "Please locate where 'locate' ocurs!";
        System.out.println(texto.indexOf("locate"));// Outputs
        
        //Java String Concatenation
        
        //+
        /*String firstName = "João";
        String lastName = "Vittor";
        System.out.println(firstName + " " + lastName);
        */
        
        String firstName = "Joao Vittor";
        String lastName = "Domingos de Jesus";
        
        System.out.println(firstName.concat(" " + lastName));
        
        //Java Numbers and Strings
        //Addinf Two numbers
        int x = 10;
        int y = 11;
        int z = x + y;
        
        System.out.println(z);
        
        //Adding two Strings
        String a = "5";
        String b = "10";
        String c = a + b;
        
        System.out.println(c);
        
        //Adding a string and a number
        String xa = "7";
        int yb = 1;
        String zc = xa + yb;
        
        System.out.println(zc);
        
        //Special Characters
        
    }
}
