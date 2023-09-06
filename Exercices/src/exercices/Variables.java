package Exercices;

public class Variables{
    public static void main(String[] args){
        //Variables are containers for storing data values.
        //Ctreating Variables
        
        String identity = "Joao";
        final int siblings = 2 ;
        float age = 19f;
        char inicialLetter = 'J';
        boolean gender = true; //true for male & false for female

        //Java Print Variables
        System.out.println(identity);
        System.out.println(siblings);
        System.out.println(age);
        System.out.println(inicialLetter);
        System.out.println(gender);

        //Java Declare Multiple Variables
        int x = 5, y = 6, z = 50;

        System.out.println(x+ y+ z);
        
        int x2, y2, z2;
        x2 = y2 = z2 = 50;

        System.out.println(x2+ y2+ z2);
    }
}
