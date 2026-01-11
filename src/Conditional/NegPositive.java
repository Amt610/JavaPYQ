package Conditional;

import java.util.Scanner;

public class NegPositive {
    public static void main(String[] args) {

        System.out.print("Enter num: ");
        Scanner sc=new Scanner(System.in);


        int num=sc.nextInt();

        if(num>0){
            System.out.println("Positive num: "+num);
        } else if (num==0) {
            System.out.println("Zero num: "+num);
        }
        else {
            System.out.println("Negative number: "+num);
        }
    }
}
