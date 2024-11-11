package HomeworkSesion15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Array List
        colors();
        iterate();
        insertElement();
        retriveElement();
        giveElement();
        removeThird();
        searchElement();
        sortArray();
        copyArrayList();
        shuffleElements();
        reversElements();
        extractPortion();
        compareArray();
        swapElements();
        joinElements();
        cloneArray();
        emptyArray();
        testEmpty();
        trimToSize();
        increaseArrayList();
    }

    public static void colors() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
    }

    public static void iterate() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        for (String color : colors) {
            System.out.println(color);
        }
    }

    public static void insertElement() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add(0, "Yellow");
        System.out.println(colors);
    }

    public static void retriveElement() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        String color = colors.get(2);
        System.out.println("Element at index 2: " + color);
    }

    public static void giveElement() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.set(1, "White");
        System.out.println(colors);
    }

    public static void removeThird() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.remove(2);
        System.out.println(colors);
    }

    public static void searchElement() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        boolean containsWhite = colors.contains("White");
        System.out.println("Contains 'White': " + containsWhite);
    }

    public static void sortArray() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        Collections.sort(colors);
        System.out.println(colors);
    }

    public static void copyArrayList() {
        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("White");
        colors1.add("Black");
        List<String> colors2 = new ArrayList<>(colors1);
        System.out.println(colors2);
    }

    public static void shuffleElements() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        Collections.shuffle(colors);
        System.out.println(colors);
    }

    public static void reversElements() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        Collections.reverse(colors);
        System.out.println(colors);
    }

    public static void extractPortion() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        List<String> subList = colors.subList(0, 2);
        System.out.println(subList);
    }

    public static void compareArray() {
        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Blue");
        colors1.add("Black");
        List<String> colors2 = new ArrayList<>();
        colors2.add("Black");
        colors2.add("White");
        colors2.add("Sage");
        colors2.add("Orange");
        boolean areEqual = colors1.equals(colors2);
        System.out.println("Are the two list equal ? " + areEqual);
    }

    public static void swapElements() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Sage");
        colors.add("Orange");
        Collections.swap(colors, 1, 3);
        System.out.println(colors);
    }

    public static void joinElements() {
        List<String> colors1 = new ArrayList<>();
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Sage");
        colors1.add("Orange");

        List<String> colors2 = new ArrayList<>();
        colors2.add("Red");
        colors2.add("Blue");
        List<String> joinedList = new ArrayList<>(colors1);
        joinedList.addAll(colors2);
        System.out.println(joinedList);
    }

    public static void cloneArray() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Sage");
        colors.add("Orange");
        List<String> clonedList = new ArrayList<>(colors);
        System.out.println(clonedList);
    }

    public static void emptyArray() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Sage");
        colors.clear();
        System.out.println(colors);
    }

    public static void testEmpty() {
        List<String> colors = new ArrayList<>();
        boolean isEmpty = colors.isEmpty();
        System.out.println("The list is empty?" + isEmpty);
    }

    public static void trimToSize() {
        ArrayList<String> colors = new ArrayList<>(10);
        colors.add("Red");
        colors.add("White");
        colors.add("Sage");
        colors.trimToSize();
        System.out.println(colors);
    }

    public static void increaseArrayList() {
        ArrayList<String> colors = new ArrayList<>(5);
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.ensureCapacity(10);
        System.out.println(colors);
    }

}
