/*
Exercise 6 - Retirement Calculator

Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.
Example Output

What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.

Constraints

    Again, be sure to convert the input to numerical data before doing any math.
    Don’t hard-code the current year into your program. Get it from the system time via your programming language.

Challenge

    Handle situations where the program returns a negative number by stating that the user can already retire.

*/
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 first_name last_name
 */
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);


        System.out.print("What is your current age ");
        String age = cursor.nextLine();
        int ageNum = Integer.parseInt(age);

        System.out.print("At what age would you like to retire? ");
        String retire = cursor.nextLine();
        int retireNum = Integer.parseInt(retire);

        int betweenAge = retireNum - ageNum;

        Date d = new Date();
        int year = d.getYear() + 1900;
        int retireYear = year + betweenAge;
        
        System.out.println("You have " + betweenAge + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " +  retireYear + ".");
    }
}
