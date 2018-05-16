package Lab8;
//1. engine Size
//2. horse power

public class Engine {
    private int engSize;
    private int horsepower;

    //constructor
    private  void =Engine (){}

    public Engine(int engSize, int horsepower) {
        this.engSize = engSize;
        this.horsepower = horsepower;
    }
    //toString

    @Override
    public String toString() {
        return "Engine{" +
                "engSize=" + engSize +
                ", horsepower=" + horsepower +
                '}';
    }

    //Getter And Setter

    public int getEngSize() {
        return engSize;
    }

    public void setEngSize(int engSize) {
        this.engSize = engSize;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}//class
