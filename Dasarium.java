package program;

import java.util.Scanner;

public class Dasarium {
    int num;
    int size;
    Dasarium(int nn){
        num=nn;
        size = 0;
    }
    void countDigit(){
        int len=(""+num).length();
        /*int temp = num;
        while (temp!=0){
            temp=temp/10;*/
            size = len;

        }
        int sumOfDigit(int n,int p){
        if(n==0){
            return 0;

        }else return (int) (Math.pow((n%10),p) + sumOfDigit((n/10),p-1));

    }
    void check(){
        if (num == sumOfDigit(num, size)) {
            System.out.println("the number is disarium");
        }
        else{
            System.out.println("not a disarium number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        Dasarium obj = new Dasarium(n);
        obj.countDigit();
        obj.check();

    }
    }

