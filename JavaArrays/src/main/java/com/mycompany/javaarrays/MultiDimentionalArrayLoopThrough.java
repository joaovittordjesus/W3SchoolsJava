/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaarrays;

/**
 *
 * @author DevTarde
 */
public class MultiDimentionalArrayLoopThrough {
    public static void main(String[] args){
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        for(int i = 0; i < myNumbers.length; ++i){
            for( int j = 0; j < myNumbers.length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
