// Program to print numbers that are divisible by 3, 5 and both.

import java.util.*;
class A11{
    public static void main(String args[])
    {
        int i;
        System.out.print("The numbers which are divisible by 3,4 and both.");
        System.out.print("\nThe numbers which are divisible by 3 are: ");
        for (i = 1 ;i< 101;i++)
        {
            if(i%3==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.print("\nThe numbers which are divisible by 5 are: ");
        for (i = 1 ;i< 101;i++)
        {
            if(i%5==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.print("\nThe numbers which are divisible by 3 & 5 are: ");
        for (i = 1 ;i< 101;i++)
        {
            if(i%5==0 && i%3==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}