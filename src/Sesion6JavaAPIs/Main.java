package Sesion6JavaAPIs;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args ){
        //stringPool();
        // productCodeComparison();

        String str = "Hello World!";
        String str1 = "hello world!";
        System.out.println("Using equals: " + str.equals(str1));
        System.out.println("Using equalsIgnoreCase: " + str.equalsIgnoreCase(str1));


        System.out.println("The lenght of str = " + str.length());
        System.out.println("The caracter at index 1 is: " + str.charAt(1));
        System.out.println("The index of 'l' is: " + str.indexOf("l"));
        System.out.println("The substring from index 0 to 5 is: " + str.substring(0,5));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Starts with 'He' ? " + str.startsWith("He"));
        System.out.println("Ends with '!' ? " + str.endsWith("!"));


    }
    public static void stringPool() {
        String str = "Hello world!";
        String str1 = "Hello world!";
        String str2 = new String("Hello world!");
        String str3 = new String("Hello world!");

        System.out.println("str == str1:" + (str == str1));//true
        System.out.println("str.equals(str1): " + str.equals(str1));//true
        System.out.println("str2 == str3 : " + (str2 == str3));//false
        System.out.println("str2.equals(str3) : " + str2.equals(str3));//true

    }
    public static void productCodeComparison(){
        String code = "PROD12345";

        String code1 = new String("PROD12345");
        String code2 = "PROD12345";
        String code3 = "PROD";//+12345
        code3 += "12345";

        System.out.println("code3 = " +code3);
        System.out.println("Using == operator:");
        System.out.println("code == code1: " + (code == code1));//false
        System.out.println("code == code2: " + (code == code2));//true
        System.out.println("code == code3: " + (code == code3));//true


    }
}
