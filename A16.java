// Check the number for even and odd.

import java.util.*;
class A16{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter a number to check: ");
        int num = Sc.nextInt();
        if(num%2==0)
            System.out.print("It is an even number:");
        else
            System.out.print("It is an odd number:");
    }  
}