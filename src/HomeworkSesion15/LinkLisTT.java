package HomeworkSesion15;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkLisTT {
    public static void main(String... args) {
        appendElement();//1
        iterateElements();//2
        iterElemIterate();//3
        reverseIterate();//4
        insertAPosition();//5
        insertFirstLastElement();//6
        insertAtFront();//7
        insertAtEnd();//8
        multiplePositionInsert();//9
        occurenceFirstLast();//10
        elementsAndPositions();//11
        elementRemove();//12
        firstLastRemove();//13
        allRemove();//14
        elementsSwap();//15
        elementsShuffle();//16
        linkedListJoin();//17
        linkListClone();//18
        returnAndRemoveFirst();//19
        firstRetrive();//20


    }

    public static void appendElement() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        //Append element
        list.add("D");
        System.out.println(list);
    }

    public static void iterateElements() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String element : list) {
            System.out.println(element);
        }
    }

    public static void iterElemIterate() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        ListIterator<String> iterator = list.listIterator(2); // Start from index 2
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void reverseIterate() {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public static void insertAPosition() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("D");

        // Insert element at position 2
        list.add(2, "C");

        System.out.println(list);

    }

    public static void insertFirstLastElement() {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");

        // Insert at first position
        list.addFirst("A");

        // Insert at last position
        list.addLast("C");

        System.out.println(list);
    }

    public static void insertAtFront() {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");
        list.add("C");

        // Insert at front
        list.addFirst("A");

        System.out.println(list);
    }

    public static void insertAtEnd() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        // Insert at end
        list.addLast("C");

        System.out.println(list);

    }

    public static void multiplePositionInsert() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("D");

        LinkedList<String> newElements = new LinkedList<>();
        newElements.add("B");
        newElements.add("C");

        // Insert elements at position 1
        list.addAll(1, newElements);

        System.out.println(list);
    }

    public static void occurenceFirstLast() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");

        // First occurrence
        int firstIndex = list.indexOf("B");
        // Last occurrence
        int lastIndex = list.lastIndexOf("B");

        System.out.println("First occurrence: " + firstIndex);
        System.out.println("Last occurrence: " + lastIndex);
    }

    public static void elementsAndPositions() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }

    public static void elementRemove() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Remove element
        list.remove("B");

        System.out.println(list);
    }

    public static void firstLastRemove() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Remove first element
        list.removeFirst();

        // Remove last element
        list.removeLast();

        System.out.println(list);
    }

    public static void allRemove() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Remove all elements
        list.clear();

        System.out.println(list);
    }

    public static void elementsSwap() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Swap elements at index 0 and 2
        Collections.swap(list, 0, 2);

        System.out.println(list);
    }

    public static void elementsShuffle() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Shuffle elements
        Collections.shuffle(list);

        System.out.println(list);
    }

    public static void linkedListJoin() {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("C");
        list2.add("D");

        // Join lists
        list1.addAll(list2);

        System.out.println(list1);
    }

    public static void linkListClone() {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");

        // Clone list
        LinkedList<String> list2 = (LinkedList<String>) list1.clone();

        System.out.println(list2);
    }

    public static void returnAndRemoveFirst() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        // Remove and return first element
        String firstElement = list.poll();

        System.out.println("Removed element: " + firstElement);
        System.out.println(list);
    }

    public static void firstRetrive() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Retrieve but do not remove the first element
        String firstElement = list.peekFirst();

        System.out.println("First element: " + firstElement);
        System.out.println("Linked list: " + list);
    }
}
