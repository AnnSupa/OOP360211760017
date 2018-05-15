package Lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class studertAppArrayList {
    public static void main (String[]args)throws IOException{
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many data you do have?:");
        int val = Integer.parseInt(reader.readLine());
        ArrayList<studert> myList =new ArrayList<studert>();
        myList = inputData(myList,val);
        showData(myList);
    }//main

    private static void showData(ArrayList<studert> myList) {
        for (int i = 0;i< myList.size();i++){
            System.out.println("Name:"+myList.get(i).getName());
            System.out.println("Age:"+myList.get(i).getAge());
            System.out.println("Gender:"+myList.get(i).getGender());
            System.out.println("Height:"+myList.get(i).getHeight());
        }

    }

    private static ArrayList<studert> inputData(ArrayList<studert> myList, int val) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        studert s = new studert();
        for (int i = 1; i <= val; i++){
            System.out.println("Enter studert info"+i+":");
            System.out.print("Name:");
            s.setName(reader.readLine());
            System.out.print("Age:");
            s.setAge(Integer.parseInt(reader.readLine()));
            System.out.print("Gender:");
            s.setGender(reader.readLine());
            System.out.print("Height:");
            s.setHeight(Double.parseDouble(reader.readLine()));
            myList.add(s);
        }
        return myList;
    }
}
