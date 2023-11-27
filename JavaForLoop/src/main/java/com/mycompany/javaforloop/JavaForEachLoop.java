/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaforloop;

/**
 *
 * @author joaovittordjesus
 */
public class JavaForEachLoop {
    public static void main(String[] args){
        /*for(type variableName : arrayName){
            code block to be executed
        }*/
        
        String[] cars = {"Volvo", "BMW", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }
    }
    
}
