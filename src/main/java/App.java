import models.Car;
import models.Motorcycle;
import models.Vehicle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Guest on 7/31/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your maximum budget for a vehicle?");

        try {
            String stringUserMaxBudget = bufferedReader.readLine();

//
//            Vehicle suv = new Vehicle(2002, "Ford", 100000, 7000);
//            Vehicle sedan = new Vehicle(2015, "Toyota", 50000, 30000);
//            Vehicle truck = new Vehicle(1999, "Ford", 100000, 4000);
//            Vehicle crossover = new Vehicle(1998, "Toyota",200000, 3500);
            Car testCar = new Car(1994, "Subaru", 170000, 4000, "Outback", "compactCar");

//            Vehicle[] allVehicles = {suv, sedan, truck, crossover};

            int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
            System.out.println(testCar.getYear());
            System.out.println(testCar.getMiles());
            System.out.println("Car is worth buying: " + testCar.worthBuying(userMaxBudget));
            testCar.accelerate();
            testCar.accelerate();
            testCar.accelerate();
            testCar.slowDown();
            testCar.slowDown();
            System.out.println("Current speed should be 13: " + testCar.speed);
            System.out.println("making a new Motorocycle");
            Motorcycle newGuy = new Motorcycle(2010, "Suzuki", 1500, 200, "Jet Black");
            System.out.println("Bike is worth Buying" + newGuy.worthBuying(userMaxBudget));
            System.out.println("Starting speed" + newGuy.speed);
            newGuy.accelerate();
            newGuy.accelerate();
            System.out.println("accelerated speed " + newGuy.speed);
            newGuy.slowDown();
            System.out.println("slowed down" + newGuy.speed);


//            System.out.println("Alright, here's what we have in your price range: ");

//            for (Vehicle individualVehicle : allVehicles) {
//
//                if (individualVehicle.worthBuying(userMaxBudget)) {
//                    System.out.println("----------------------");
//                    System.out.println(individualVehicle.year);
//                    System.out.println(individualVehicle.model);
//                    System.out.println(individualVehicle.miles);
//                    System.out.println(individualVehicle.price);
//                }
//            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("we haz error!");
        }
    }

}
