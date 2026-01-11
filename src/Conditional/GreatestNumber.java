package Conditional;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        //find the greatest number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num a: ");
        int a= sc.nextInt();

        System.out.print("Enter num b: ");
        int b= sc.nextInt();


        System.out.println();

        if (a>b){
            System.out.println("a is greater than b and value of a is: "+a);
        }else {
            System.out.println("b is greater than a and value of b is: "+b);
        }

    }
}
