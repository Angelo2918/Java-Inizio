package HomeworkSesion15;

import java.util.*;

public class HashSets {
    public static void main(String... args) {
        appendToTheEnd();//1
        iterateThroughElements();//2
        getNumberElements();//3
        emptyHashSet();//4
        testEmptyOrNot();//5
        cloneHashSet();//6
        convertHashToArray();//7
        hashSetToTree();//8
        convertHashSetToList();//9
        compareTwoHashSet();//10
        compareTwoSets();//11
        removeAllElementsHashSet();//12
    }

    public static void appendToTheEnd() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("green");
        hashSet.add("blue");
        hashSet.add("yellow");
        System.out.println("The hash set: " + hashSet);
    }

    public static void iterateThroughElements() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("green");
        hashSet.add("blue");
        hashSet.add("yellow");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void getNumberElements() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("green");
        hashSet.add("blue");
        hashSet.add("yellow");
        System.out.println("Number of elements in hash set: " + hashSet.size());
    }

    public static void emptyHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("green");
        hashSet.add("blue");
        hashSet.add("yellow");
        hashSet.clear();
        System.out.println("Hash set after clearing: " + hashSet);
    }

    public static void testEmptyOrNot() {
        HashSet<String> hashSet = new HashSet<>();
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is the hash set empty ? " + isEmpty);

    }

    public static void cloneHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("green");
        hashSet.add("blue");
        hashSet.add("yellow");
        HashSet<String> clonedSet = (HashSet<String>) hashSet.clone();
        System.out.println(" Cloned hash set:" + clonedSet);
    }

    public static void convertHashToArray() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("White");
        hashSet.add("Black");
        hashSet.add("Tangerine");
        String[] array = hashSet.toArray(new String[hashSet.size()]);
        for (String element : array) {

            System.out.println(element);
        }
}
    public static void hashSetToTree(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("green");
        hashSet.add("blue");
        hashSet.add("yellow");
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("Tree set: " + treeSet);
    }
    public static void convertHashSetToList(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("green");
        hashSet.add("blue");
        hashSet.add("yellow");
        List<String> list = new ArrayList<>(hashSet);
        System.out.println("ArrayList: " + list);
    }
    public static void compareTwoHashSet(){
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("green");
        hashSet1.add("blue");
        hashSet1.add("yellow");

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Red");
        hashSet2.add("green");
        hashSet2.add("blue");
        hashSet2.add("yellow");
        boolean areEqual = hashSet1.equals(hashSet2);
        System.out.println("Are the two sets equal ?"+ areEqual);
    }
    public static void compareTwoSets(){
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Blue");
        hashSet1.add("Yellow");

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Red");
        hashSet2.add("Green");
        hashSet2.add("Blue");
        hashSet2.add("Yellow");
        hashSet1.retainAll(hashSet2);
        System.out.println("Coomon elements: " + hashSet1);
    }
    public static void removeAllElementsHashSet(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("green");
        hashSet.add("blue");
        hashSet.add("yellow");
        hashSet.clear();
        System.out.println("Hash set after removing elements: " + hashSet);
    }
}
