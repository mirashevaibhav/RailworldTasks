package program;

import java.util.Scanner;

//String $2000 using arithmatic operation to make it as $2001
public class Casting {
    public static void main(String[] args) {
        String amountStr = "$2000";
        // Extract the numerical part by removing the dollar sign
        String dollarCut = amountStr.substring(1);
        // Parse the numerical part into an integer
        int amount = Integer.parseInt(dollarCut);
        // Increment the amount
        amount++;
        // Format the incremented amount back into a string with the dollar sign
        String newstrtr = "$" + amount;
        System.out.println("Incremented amount: " + newstrtr);
    }
}
//String originalString = "$2000";
//
//               int amount = Integer.parseInt(originalString.substring(1));
//
//                amount++;
//
//                String updatedString = "$" + amount;
//
//                System.out.println("Original String: " + originalString);
//                System.out.println("Updated String: " + updatedString);
