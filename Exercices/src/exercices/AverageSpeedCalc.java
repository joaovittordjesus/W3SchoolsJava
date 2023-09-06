package Exercices;
public class AverageSpeedCalc{
    public static void main(String[] args){

        double distanceTravelled = 150;
        System.out.println("The travelled distance was " + distanceTravelled+ "km.");
        double timeSpent = 1.5;
        System.out.println("The time spent  was "+ timeSpent+ "hours.");
        double averageSpeed = distanceTravelled/timeSpent;
        System.out.println("To find the average speed we "+ "divided the distance(" + distanceTravelled+ ") for the time spent on the "+ "route("+ timeSpent+ ").");
        System.out.println("The average speed is "+ averageSpeed+ "km/h.");

    }
}