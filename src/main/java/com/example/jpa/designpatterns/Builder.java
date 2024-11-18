package com.example.jpa.designpatterns;

import java.util.ArrayList;
import java.util.List;

class Pizza {

    private String blat;
    private String sos;
    private List<String> toppings;

    public static class PizzaBuilder {
        private Pizza pizza;

        public PizzaBuilder() {
            pizza = new Pizza();
            pizza.toppings = new ArrayList<>();
        }

        public PizzaBuilder blat(String blat) {
            pizza.blat = blat;
            return this;
        }

        public PizzaBuilder sos(String sos) {
            pizza.sos = sos;
            return this;
        }

        public PizzaBuilder addTopping(String topping) {
            pizza.toppings.add(topping);
            return this;

        }

        public Pizza buid() {
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Pizza cy blat " + blat + ", sos " + sos + " si toppinguri: " + toppings;
    }

}

class PizzaB {
    private String blat;
    private String sos;
    private List<String> toppings;


    public PizzaB withBlat(String blat) {
        this.blat = blat;
        return this;

    }

    public PizzaB withSos(String sos) {
        if (toppings == null) {
            toppings = new ArrayList<>();
        }
        this.sos = sos;
        return this;

    }

    public PizzaB withTopping(String topping) {
        toppings.add(topping);
        return this;
    }


    @Override
    public String toString() {
        return "Pizza cy blat " + blat + ", sos " + sos + " si toppinguri: " + toppings;
    }

}


public class Builder {
    public static void main(String... a) {
        Pizza pizza1 = new Pizza.PizzaBuilder()
                .blat("subtire")
                .sos("rosii")
                .addTopping("mozzarela")
                .addTopping("busuioc")
                .buid();

        PizzaB pizza2 = new PizzaB()
                .withBlat("gros")
                .withSos("rosii")
                .withTopping("sunca")
                .withTopping("mozzarela");


        System.out.println(pizza1);
        System.out.println(pizza2);
    }

}
