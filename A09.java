// Program to swap two integers.

import java.util.*;
class A09{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int temp=0;
        System.out.print("\nThe initial values are: "+a+" & "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.print("\nThe values after swap is: "+a+" & "+b);
    }
}