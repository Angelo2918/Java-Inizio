package Sesion_15_CollectionsFramework;

public class Munte implements Comparable<Munte> {
    private String nume;
    private int inaltime;


    public Munte(String n, int i) {
        this.nume = n;
        this.inaltime = i;
    }

    public String getInaltime() {
        return nume;

    }

    public String getNume() {
        return getNume();
    }

    @Override
    public int compareTo(Munte o) {
        return Integer.compare(this.inaltime, o.inaltime);
    }

    @Override
    public String toString() {
        return nume + " (" + inaltime + "m)";
    }
}
