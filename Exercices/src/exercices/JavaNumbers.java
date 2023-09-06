package Exercices;

public class JavaNumbers{
    public static void main(String[] args){
        byte myByte = 127;//from -128 to 127;
        short myShort = 32767;//from -32768 ti 32767
        int myInt = -2147483648;//from -2147483648 to -2147483647
        long myLong = 9000000000000000000L;//from 9223372036854775807 to 9223372036854775808
        float myFloat = 5.75f; //from 6 to 7 digits after the comma
        double myDouble = 5.75d; //15 digits after the comma
        float d1 = 35e3f;
        double f1 = 12E4d;

        System.out.println(d1);//Scientific number where e represents the power of 10
        System.out.println(f1);//Scientific number where e represents the power of 10
    }
}
