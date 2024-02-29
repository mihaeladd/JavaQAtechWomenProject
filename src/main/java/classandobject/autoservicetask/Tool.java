package classandobject.autoservicetask;

public class Tool {
    String name;
    double weight;
    double price;

    public Tool (String name){
        this.name = name;
        System.out.println("Un obiect de tip Tool a fost creat, numele lui este: " + this.name);
    }

    public Tool (){
        System.out.println("O noua unealta a fost creata. Pentru detalii, numele este:" + this.name + " iar greutatea: "
        + this.weight);
    }
}
