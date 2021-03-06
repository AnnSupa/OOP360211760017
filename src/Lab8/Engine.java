package Lab8;
//1. engine size
//2. horse power
public class Engine {
    private int engSize;
    private int horsePower;
    private int horsepower;

    //constructor
    public  Engine(){}

    public Engine(int engSize, int horsePower) {
        this.engSize = engSize;
        this.horsePower = horsePower;
    }
    //toString

    @Override
    public String toString() {
        return "Engine{" +
                "engSize=" + engSize +
                ", horsePower=" + horsePower +
                '}';
    }

    //getter and setter

    public int getEngSize() {
        return engSize;
    }

    public void setEngSize(int engSize) {
        this.engSize = engSize;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }
}//class