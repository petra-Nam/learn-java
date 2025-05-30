public class Truck extends Vehicle {
    private int capacity;
    private String specialFeatures;

    public Truck (int id, String brand, String model, String color, String engineType, boolean status, int capacity, String specialFeatures){
        super(id, brand, model, color, engineType, status);
        this.capacity = capacity;
        this.specialFeatures = specialFeatures;
    }

    @Override
    public void rent(){
        System.out.println("This Truck is out of bound");
    }
    public void returned(){
        System.out.println("The Truck has been returned");
    }
}