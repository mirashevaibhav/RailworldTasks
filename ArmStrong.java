package program;

import java.sql.ParameterMetaData;
import java.util.Scanner;

public class ArmStrong {

    int arm = 0;

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int c = n;
    int arm = 0;

        while (n > 0) {
        int rem = n % 10;
        arm = (rem * rem * rem) + arm;
        n = n / 10;
    }

        if (c == arm) {
        System.out.println(c + " is an Armstrong number.");
    } else {
        System.out.println(c + " is not an Armstrong number.");
    }

        sc.close();  // Close the scanner
}
}
