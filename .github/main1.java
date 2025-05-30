import java.util.Scanner;


public class main1 {
    public static void main(String[] args) {
        CarRentalManager carRentalManager = new CarRentalManager();
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n Car Rental Management Systems by Brian and Niki ");
                System.out.println("1. View Vehicles:");
                System.out.println("9999. Exit");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1: {
                        carRentalManager.ViewALlRentedVehicles();
                        break;
                    }
                    case 9999: {
                        System.out.println("Exiting...");
                        return;
                    }
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }

            }
        }


    }
}