package Lab8;

public class petApp11 {
    public  static void  main (String []args){

        dog d1 = new dog();
        d1.setName("Safe");
        d1.setAge(5);


        System.out.println(d1.toString()+""+d1.getClass().getSimpleName());

        cat d2 = new cat();
        d2.setName("momo");
        d2.setAge(3);


        System.out.println(d2.toString()+""+d2.getClass().getSimpleName());

    }


}