/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author joel.chavez
 */
public class RoadTrip 
{
        public static void main(String[]args)
        {
            String carMake = "1996 Mazda Protege";
            String carName = "Nedfry";
            int maxPassengers = 5;
            int currentNumberOfPassengers = 1;
            boolean carFull = false;
            double tripOdometer = 0.0;
            double tripBudget = 300.0;
            double distanceToUtah = 1806.0;
            boolean destinationReached = false;
            double legDistance;
            
            System.out.println("***Road Trip Simulator***");
            System.out.println("[Beginning of trip stats]");
            System.out.println("Make of car: "+carMake+" can carry "+maxPassengers+" passengers.");
            System.out.println("The cars name is "+carName);
            System.out.println("Distance to destination: "+distanceToUtah);
            System.out.println("Full Car? "+carFull+" Current Odometer:"+tripOdometer );
            System.out.println("I have $"+tripBudget+" to spend");
            System.out.println("String trip with "+currentNumberOfPassengers+" passenger");
            System.out.println("Am I there yet? "+destinationReached);
            
            legDistance = distanceToUtah/4;
            tripOdometer = legDistance+tripOdometer;
            distanceToUtah = distanceToUtah-legDistance;
            System.out.println("You see a hitchhiker heading west.");
            if(carFull = false)
            {
                System.out.println("You pick up the hitchhiker.");
                carFull = true;
            }
            double legGas = 40.00;
            tripBudget = tripBudget-legGas;
            
                        System.out.println("***Road Trip Simulator***");
            System.out.println("[Beginning of trip stats]");
            System.out.println("Make of car: "+carMake+" can carry "+maxPassengers+" passengers.");
            System.out.println("The cars name is "+carName);
            System.out.println("Distance to destination: "+distanceToUtah);
            System.out.println("Full Car? "+carFull+" Current Odometer:"+tripOdometer );
            System.out.println("I have $"+tripBudget+" to spend");
            System.out.println("String trip with "+currentNumberOfPassengers+" passenger");
            System.out.println("Am I there yet? "+destinationReached);
            
        }
}
