package springnewpart;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and column of the matrix: ");
        //reading the number of rows and column from the user
        int n=sc.nextInt();
        //creating a matrix of n*n
        int a[][] = new int [n][n];
        //input matrix elements
        System.out.println("Enter the elements of the matrix: ");
        //loop for rows
        for(int i=0; i<n; i++)
        {
            //loop for column
            for(int j=0; j<n; j++)
            {
                //reading matrix elements
                a[i][j]=sc.nextInt();
            }
        }
        //printing the original matrix
        System.out.println("\nOriginal matrix: \n");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println(" ");
        }
        //swapping elements
        for(int i=0; i<n; i++)
        {
            int temp = a[i][i];
            a[i][i] = a[i][n-i-1];
            a[i][n-i-1] = temp;
        }
        //prints the diagonal interchanged matrix
        System.out.println("\nDiagonal Interchanged Matrix: \n");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
