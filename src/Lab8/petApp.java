package Lab8;

public class petApp {
    public  static void  main (String []args){

        dog d1 = new dog();
        d1.setName("Safe");
        d1.setAge(5);


        System.out.println(d1.toString()+""+d1.getClass().getSimpleName());


    }


}
