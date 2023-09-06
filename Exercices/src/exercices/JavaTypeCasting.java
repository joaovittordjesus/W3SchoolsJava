package Exercices;

public class JavaTypeCasting {
    public static void main(String[] args){
        int myInt = 9;
        double myDouble = myInt;//Automatic Casting int to double;
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;
        System.out.println(myInt);
        System.out.println(myDouble);

    }
}


