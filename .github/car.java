public class Car extends Vehicle {

    private int numberOfSeats;
    private int numberOfDoors;
    private boolean storageSpace;

    public Car(int id, String brand, String model, String color, String engineType, boolean status,
               int numberOfSeats, int numberOfDoors, boolean storageSpace) {
        super(id, brand, model, color, engineType, status);
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.storageSpace = storageSpace;
    }

    @Override
    public void rent(){
        System.out.println("The car has been rented");
    }
    public void returned(){
        System.out.println("The car has been returned");
    }
}