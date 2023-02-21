// Program to print the sum, multiplication, divide, and remainder of two numbers.

import java.util.*;
class A07{
    public static void main (String args[])
    {
        Scanner Sc = new Scanner (System.in);
        {
            System.out.print("Enter the first number: ");
            int a = Sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = Sc.nextInt();
            System.out.print("The sum of the numbers is: "+(a+b));
            System.out.print("\nThe multiplication of the numbers is: "+(a*b));
            System.out.print("\nThe divide of the numbers is: "+(a/b));
            System.out.print("\nThe remainder of the numbers is: "+(a%b));
        }
    }
}