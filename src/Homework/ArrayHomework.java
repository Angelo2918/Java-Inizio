package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        System.out.println("===Homework sesion 8!===");

        //shopList();//EX-1
        //arrayTenOdd();//EX-4
        cityChose();//EX-5
        //movieSearch();//EX-8
        //christmasPresents();//EX-2
    }

    public static void christmasPresents() {
        //5.Create a wishlist for christmas with ArrayList and print the values
        System.out.println("Christmas Wishlist:");
        ArrayList<String> wishlist = new ArrayList<>();
        wishlist.add("MacBook");
        wishlist.add("GoPro");
        wishlist.add("Xbox ONE X");
        wishlist.add("New clothes");
        wishlist.add("New Watch");
        for (String item : wishlist) {
            System.out.println(item);
        }

    }

    public static void movieSearch() {
        //4.In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists.
        // If it does, print out its position in the array.
        System.out.println("Movie Title searching");
        String[] movies = {"Bad Boy", "Titanic", "Byker Boys", "Kung Fu Panda", "Avatar"};
        String movieToFind = "Byker Boys";

        int position = linearSearch(movies, movieToFind);
        if (position != -1) {
            System.out.println("Movie found at position: " + position);
        } else {
            System.out.println("Movie not found.");
        }


    }

    public static void cityChose() {
        //3.Create an ArrayList that stores city names. Add at least five city names initially. Then, prompt the user to add a city name. If the city name is already in the list,
        // display a message saying it's a duplicate; otherwise, add it to the list.
        System.out.println("City List:");
        ArrayList<String> cityNames = new ArrayList<>();
        cityNames.add("Bucuresti");
        cityNames.add("Milano");
        cityNames.add("Madrid");
        cityNames.add("Genova");
        cityNames.add("Padova");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city name: ");
        String cityName = scanner.nextLine();

        if (cityNames.contains(cityName)) {
            System.out.println("This city name is a duplicate.");
        } else {
            cityNames.add(cityName);
            System.out.println("City added: " + cityName);
        }

        System.out.println("Current city names: " + cityNames);
    }

    public static void arrayTenOdd() {
        //2.Given an array of 10 integers, count how many of them are even numbers and how many are odd.
        // Print out both counts.
        System.out.println("Count even and odd");
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int countEven = 0, countOdd = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] % 2) == 0)
                countEven += 1;

            else
                countOdd += 1;
        }
        System.out.println("Even Elements count : " + countEven);
        System.out.println("Odd Elements count : " + countOdd);

    }


    public static void shopList() {
        //1.Create a shopping list with Array and print the values

        System.out.println("Shopping list!");
        String[] shoppingList = {"Faina", "Oua", "Lapte", "Unt", "Zahar", "Ciocolata"};
        for (String item : shoppingList) {
            System.out.println(item);
        }
    }

    private static int linearSearch(String[] movies, String target) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equals(target)) {
                return i; // Return the index where the movie is found
            }
        }
        return -1; // Return -1 if not found
    }

}


