package classandobject.autoservicetask;

public class ManageAutoservice {
    public static void main(String[] args) {
        Car mercedesBenzEclass = new Car("red", "E class", "Mercedes");
        mercedesBenzEclass.plateNr = "MDA 777";
        mercedesBenzEclass.kmEnteredInTheService = 150489;

        Car volvo = new Car("HCC 458");
        volvo.color = "red";

        Tool ciocan = new Tool("Ciocan");
        ciocan.weight = 1.65;
        System.out.println("Instrumentul " + ciocan.name + " are greutatea " + ciocan.weight + " kg.");
        Tool surubelnita = new Tool();

        Worker Ion = new Worker();
        Garage garageBavaria = new Garage();
    }
}
