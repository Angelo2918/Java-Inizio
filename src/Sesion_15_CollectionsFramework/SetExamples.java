package Sesion_15_CollectionsFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        addElement(hashSet, " Ion");
        addElement(hashSet, " Sam");
        addElement(hashSet, " Dan");
        addElement(hashSet, " Bob");
        addElement(hashSet, " Ion");


        //=========================================

        addElement(treeSet, " Ion");
        addElement(treeSet, " Sam");
        addElement(treeSet, " Dan");
        addElement(treeSet, " Bob");
        addElement(treeSet, " Ion");


        //display sets
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);

        String nume = "Ion";
        System.out.println("HashMap contains: " + nume + "?" + hashSet.contains(nume));
        System.out.println("Treset contains: " + nume + "?" + treeSet.contains(nume));


        boolean removed = hashSet.remove(nume);
        System.out.println("Removeing: " + nume + " - " + (removed ? " success " : "not fund"));

        boolean removed1 = hashSet.remove(nume);
        System.out.println("Removeing: " + nume + " - " + (removed1 ? " success " : " not fund"));

    }

    private static void addElement(Set<String> set, String element) {
        boolean added = set.add(element);
        System.out.println(set.getClass().getSimpleName() + " : Adding" + element + " " + (added ? "Succes " : " Duplicate"));
    }


}