package Sesion_15_CollectionsFramework;

import java.util.Comparator;

public class ComparatorMunte implements Comparator<Munte> {

    @Override
    public int compare(Munte o1, Munte o2) {
        return o1.getNume().compareTo(o2.getNume());
    }
}
