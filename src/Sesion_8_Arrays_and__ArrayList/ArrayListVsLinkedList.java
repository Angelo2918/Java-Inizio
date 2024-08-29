package Sesion_8_Arrays_and__ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String... args) {
        System.out.println("Array exe");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Sam");
        arrayList.add("Ion");
        arrayList.add("Bob");
        arrayList.add("Iov");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Sam");
        linkedList.add("Ion");
        linkedList.add("Bob");
        linkedList.add("Iov");

        //get element
        System.out.println(arrayList.get(2));//bob
        System.out.println(linkedList.get(2));

        //add value
        arrayList.add(1, "Sara");
        linkedList.add(1, "Sara");

        //{Sam,Ion,Bob,Ion}
        //{Sam,Sara,Ion,Bob,Ion}

        //remove
        arrayList.remove(1);
        linkedList.remove("Sara");

        //stack implementation(Lifo)
        LinkedList<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.pop();

        //offer() / poll()

        System.out.println(stack);


      arrayListVsLinkedList();
        //conversions();


    }
private static void conversions() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

       // String[] arrayFromArrayList = (String[]) arrayList.toArray();
    String[] arrayFromArrayList = arrayList.toArray(new String[0]);
    System.out.println(arrayList);
    System.out.println(Arrays.toString(arrayFromArrayList));

//v1
    List<String> fromArray = Arrays.asList(arrayFromArrayList);//can change the value ,cannot delete/add
    fromArray.set(0, "Z");
    System.out.println(fromArray);
    System.out.println(fromArray);

    //v2
    List<String> fromArray2 = List.of(arrayFromArrayList); //lista imutabila
    // fromArray2.set(1, "ewe");

    //v3
    List<String> fromArray3 = new ArrayList<>(Arrays.asList(arrayFromArrayList));
    System.out.println(fromArray3);
    System.out.println(Arrays.toString(arrayFromArrayList));

    fromArray3.set(1, "T");
    System.out.println(fromArray3);
    System.out.println(Arrays.toString(arrayFromArrayList));



}
    public static void arrayListVsLinkedList() {
        //declareation
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();


        //add ellements

        for (int i = 0; i < 500000; i++) {
            arrayList.add(String.valueOf(i));
            linkedList.add(String.valueOf(i));

        }
        long startArrayTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            //    arrayList.add(0, String.valueOf(i));
            arrayList.get(250000);
        }
        long endArrayTime = System.currentTimeMillis();

        System.out.println("ArrayList time: " + (endArrayTime - startArrayTime));

        long startLinkedListTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            //  linkedList.add(0, String.valueOf(1));
            linkedList.get(250000);
        }
        long endLinkedListTime = System.currentTimeMillis();

        System.out.println("LinkedList time: " + (endLinkedListTime - startLinkedListTime));
    }

}

