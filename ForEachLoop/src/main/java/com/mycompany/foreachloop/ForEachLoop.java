/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foreachloop;

/**
 *
 * @author joaovittordjesus
 */
public class ForEachLoop{
    public static void main(String[] args){
        /*
            for(type variableName: arrayName){
                code block to be executed.
            }
        */
        
        String[] cars = {"Volvo", "BMW", "Mazda"};
        for (String i : cars){
            System.out.println(i);
        }
    }
}
