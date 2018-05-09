package Lab7;

public class studertApp {
    public static void main(String[] args) {
        studert s1 = new studert();
        s1.setName("MIT");
        s1.setAge(22);
        s1.setGender("Male");
        s1.setHeight(180);
        System.out.println(s1.toString());

        studert s2 =new studert("Safe",90,"Female",190);
        System.out.println(s2.toString());

    }

}
