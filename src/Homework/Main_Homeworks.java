package Homework;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main_Homeworks {
    public static void main(String[] args){
//Homework UtilityClasses

        //Date();
        //DateDecomposition();
        //SpecificDateReturns();
        //CurentTime();
    }
    //Write a method named displayCurrentTime that prints the current time to the console.
    //Expected Output: The current time in the format HH:MM:SS.
    public static void CurentTime(){

        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
        SimpleDateFormat parsedDateTime;
      //  System.out.println("New format date time: " + parsedDateTime.format(newFormat));

    }
        //Write a method named createSpecificDate that returns a date object representing 19th August 2025.
    //Expected Output: A date object for 2025-8-19.
    public static void SpecificDateReturns(){


    }

    //Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
    //Input: A date in the format YYYY-MM-DD.
    //Expected Output:
    //makefile
    //Copy code
    //Year: YYYY
    //Month: MM
    //Day: DD
    public static void DateDecomposition(){
        Date date1 = new Date("YYYY-MM-dd");
        SimpleDateFormat formatNowYear = new SimpleDateFormat("YYYY");
        SimpleDateFormat formatNowMonth = new SimpleDateFormat("MM");
        SimpleDateFormat formatNowDay = new SimpleDateFormat("dd");

        String currentDay = formatNowDay.format(date1);
        String currentMonth = formatNowMonth.format(date1);
        String currentYear = formatNowYear.format(date1);
        System.out.println("Dte:" + date1);
        //inca in incercari
    }
    //Write a method named displayTodaysDate that, when called, prints the current date to the console.
    //Expected Output: Today's date in the format YYYY-MM-DD.
    public static void Date(){


        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date();
        System.out.println(formatter.format(date));


    }



}
