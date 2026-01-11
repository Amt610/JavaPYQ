package Conditional;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter num: ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println();

        if(num%2==0){
            System.out.println("Even num: "+num);
        }
        else{
            System.out.println("Odd num: "+num);
        }
    }
}
