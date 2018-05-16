package Lab8;
//1.Color -String
//2.Brand -String
//3.carID -String
//4.Engine (has-a relation)

public class Car {
    private String Color;
    private String Brand;
    private String carID;
    private Engine engine;

    //construcor
    public void Car(){}

    public Car(String color, String brand, String carID, Engine engine) {
        Color = color;
        Brand = brand;
        this.carID = carID;
        this.engine = engine;
    }

    //toString
    @Override
    public String toString() {
        return "Car{" +
                "Color='" + Color + '\'' +
                ", Brand='" + Brand + '\'' +
                ", carID='" + carID + '\'' +
                ", engine=" + engine +
                '}';
    }

    //Getter And Setter
    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}//class
