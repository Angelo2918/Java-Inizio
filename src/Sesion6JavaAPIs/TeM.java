package Sesion6JavaAPIs;

import java.util.HashSet;

public class TeM {
    public static void main(String[] args) {
        ReverseString();//Ex.1beglev
        ConcatenateStrings();//Ex.3Beglevel
         remVowel();//Ex.4Beglev
        CapitalizeWordsExample();//Ex.5Beglev
        toggledString();//Ex.6Explev
        ReplaceLineBreaks();//Ex.4Explev
        removeDuplicates();//Ex.2 Mediumlevel
    }
//EX:1/Begginer Level
    public static void ReverseString() {
        //Write a program to reverse an input string using StringBuilder
        // Create a StringBuilder object with the input string
        StringBuilder str = new StringBuilder("Salutare, lume!");

        // Reverse the string
        StringBuilder reversedStr = str.reverse();

        // Print the reversed string
        System.out.println("Reversed String: " + reversedStr.toString());
    }
//Ex:3/Begginer Level
    public static void ConcatenateStrings() {
        //Efficiently concatenate multiple strings into one using StringBuilder.
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("In aceasta");
        stringBuilder.append("zi mare");
        stringBuilder.append(" este sarbatoare!");
        String result = stringBuilder.toString();
        System.out.println(stringBuilder);
    }
//Ex:4/Begginer Level
    public static void remVowel() {
        // Remove all vowels from a string using StringBuilder.
        String s = "Prepinsta";
        String s1 = "";
        s1 = s.replace("[aeiou]", "");
        System.out.println("String after removing vowel: " + s1);

    }
//Ex:5/Begginer Level
    public static void CapitalizeWordsExample() {
//Capitalize the first letter of every word in a sentence using StringBuilder.
        // input string
        String input = "welcome to las vegas!";

        // call the capitalizeWords function and store the result
        String result = capitalizeWords(input);

        // print the original and modified strings
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    // function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        // split the input string into an array of words
        String[] words = input.split("\\s");

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // iterate through each word
        for (String word : words) {

            // capitalize the first letter, append the rest of the word, and add a space

            result.append(Character.toTitleCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        // convert StringBuilder to String and trim leading/trailing spaces
        return result.toString().trim();
    }
//Ex:6/ExpertLevel
    public static void toggledString() {
        // Toggle the case of every character in a string using StringBuilder.
        StringBuilder string = new StringBuilder("VIVA LA PATATA!");
        int ln = string.length();

        for (int i = 0; i < ln; i++) {
            Character ch = string.charAt(i);
            if (Character.isLowerCase(ch))

                string.replace(i, i + 1, Character.toUpperCase(ch) + "");

            else
                string.replace(i, i + 1, Character.toLowerCase(ch) + "");

            System.out.println(string);
        }
    }
    //Replace line breaks from string.//Ex4ExpLevel
    public static void ReplaceLineBreaks() {
        String a = "Replace\n"
                + " all\n"
                + " line\n"
                + " breaks\n"
                + " from\n"
                + " strings!";
        System.out.println("Original String line breaks! - " + a);


        a = a.replace("\n", "");
        System.out.println("String after replacing line breaks - " + a);
    }
//Remove duplicate characters from a string using StringBuilder.//Ex:2/Medium
    public static void removeDuplicates() {

        String inputString = "Programming";
        System.out.println("Original String: " + inputString);


        HashSet<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : inputString.toCharArray()) {
            if (uniqueChars.add(ch)) {
                result.append(ch);
            }
            System.out.println("String after removing duplicates: " + result);
        }
    }

}





