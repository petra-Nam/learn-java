import java.util.ArrayList;
import java.util.Scanner;

public class CarRentalManager {
    private ArrayList<Car> cars;
    private ArrayList<Truck> trucks;
    private ArrayList<Vehicle> vehicles;

    public CarRentalManager(){
        this.cars = new ArrayList<>();
        this.trucks = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }

    public void ViewALlRentedVehicles(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter type of vehicle:");
        System.out.println("1. Cars");
        System.out.println("2. Trucks");
        System.out.println("3. All Vehicles");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                int counter = 1;
                for (Car car : cars){
                    System.out.println(counter + ". " + car.toString());
                    counter++;
                }
                break;
            case 2:
               int counterAttack = 1;
               for (Truck truck : trucks){
                   System.out.println(counterAttack + ". " + truck.toString());
                   counterAttack++;
               }
               break;
            case 3:
                int counterAttacked = 1;
                for (Car car : cars){
                    System.out.println(counterAttacked + ". " + car.toString());
                    counterAttacked++;
                }
                counterAttacked++;
                for (Truck truck : trucks){
                    System.out.println(counterAttacked + ". " + truck.toString());
                    counterAttacked++;
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }



    public ArrayList<Car> getCars() {
        return cars;
    }
    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
    public ArrayList<Truck> getTrucks() {
        return trucks;
    }

} 
    

