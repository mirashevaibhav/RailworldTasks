package program;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }  public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the year: ");
        int year = sc.nextInt();
         // Change this to the year you want to check
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
