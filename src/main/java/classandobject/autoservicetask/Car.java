package classandobject.autoservicetask;

public class Car {
    String plateNr;
    int kmEnteredInTheService;
    String color;
    String make;
    String model;

    public Car (String carColor, String carMake, String carModel){
        this.color = carColor;
        this.make = carMake;
        this.model = carModel;
    }

    public Car (String plateNumber){
        this.plateNr = plateNumber;
    }
}
