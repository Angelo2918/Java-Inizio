package Sesion_8_Arrays_and__ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args){
        System.out.println("===Arrays vs ArrayList and Wrapper Classes===");


    //declare
        String[] friendArray = {"Sam", "Dan","Ion", "Bob"};

        List<String> friendArrayList = new ArrayList<>(Arrays.asList("Sam", "Dan" ,"Ion", "Bob"));
        //[0][1][2][3]
        //get value
        System.out.println(friendArray[1]);
        System.out.println(friendArrayList.get(1));

        //size
        System.out.println(friendArray.length);//campul lenght
        System.out.println(friendArrayList.size());//metoda size

        //add value
        friendArrayList.add("Pavel");
        System.out.println(friendArrayList.get(4));

        //set value
        friendArray[1] = "Maia";
        System.out.println(friendArray[1]);
        friendArrayList.set(1,"Maia");
        System.out.println(friendArrayList.get(1));

        //remove
        friendArrayList.remove("Maia");
        System.out.println(friendArrayList.get(1));

        //print all
        System.out.println(Arrays.toString(friendArray));
        System.out.println(friendArrayList);




    }
}
