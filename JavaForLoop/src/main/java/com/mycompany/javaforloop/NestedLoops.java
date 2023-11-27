/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaforloop;

/**
 *
 * @author joavittordjesus
 */
public class NestedLoops {
    public static void main(String[] args){
        
        //Outer loop
        for(int i = 1; i <= 2; i++){
            System.out.println("Outer: " + i);//Executes 2 times
            
            //Inner loop
            for(int j = 1; j <= 3; j++){
                System.out.println(" Inner: " + j);//Executes 6 times (2 * 3)
            }
        }
    }    
    
}
