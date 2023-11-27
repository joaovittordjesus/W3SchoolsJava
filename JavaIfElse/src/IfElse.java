/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DevTardeA
 */
public class IfElse {
    public static void main(String[] args){
        /*if(20>18){
            System.out.println("20 is greater than 18");
        }
        
        int x = 20;
        int y = 18;
        if(x > y){
            System.out.println("x is greater tahn y");
        }*/
        
        /*//Else statement
        int time = 17;
        if(time < 18){
            System.out.println("Good day");
        }else{
            System.out.println("Good Evening");
        }*/
        
        //Else If
        /*int time = 22;
        if(time < 10){
            System.out.println("Good morning.");
        }else if(time < 18){
            System.out.println("Good day");
        }else{
            System.out.println("Good evening");
        }*/
        
        //Short Hand If...Else (Ternary Operator)
        int time = 19;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        
    }
}   
