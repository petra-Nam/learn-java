public class vehicle {
    private int Id;
    private String Brand;
    private String Model;
    private String Color;
    private String EngineType;
    private boolean Status;

    public vehicle(int id, String brand, String model, String color, String engineType, boolean status){
        this.Id = id;
        this.Brand = brand;
        this.Model = model;
        this.Color = color;
        this.EngineType = engineType;
        this.Status = status;
    }

    public int getId(){
        return Id;
    }

    public String getBrand(){
        return Brand;
    }

    public String getModel(){
        return Model;
    }

    public String getColor(){
        return Color;
    }

    public String getEngineType(){
        return EngineType;
    }

    public boolean getStatus(){
        return Status;
    }

    public void rent(){
        System.out.println("The vehicle has been rented");
    }

    public void returned(){
        System.out.println("This vehicle has been returned");
    }

    @Override
    public String toString(){
        return Brand + " " + Model + " " + Color + " " + EngineType + " " + Status;
    }
}
