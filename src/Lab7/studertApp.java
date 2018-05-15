package Lab7;

import java.util.Scanner;

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

        //input data from user
        studert s3= new studert();
        s3 =inputdata(s3);
        System.out.println(s3.toString());
    }

    private static studert inputdata(studert s) {
        Scanner sc =new Scanner(System.in)
        System.out.println("Please enter your information:");
        System.out.print("Name:");
        s.setName(sc.nextLine());
        System.out.print("Age:");
        s.setAge(sc.nextInt());
        System.out.print("Gender:");
        s.setGender(sc.nextLine());
        System.out.print("Height:");
        s.setHeight(sc.nextDouble());

        return s;
    }

}
