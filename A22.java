// Program to check for prime number

import java.util.*;
class A22{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter a number to check:");
        int num = Sc.nextInt();
        int flag = 0;
        for (int i = 2;i<num;i++)
        {
            if (num%i==0)
            {
                flag = 1;
                break;

            }
        }
        if (flag ==0)
        {
            System.out.print("It is a prime number:");
        }
        else{
            System.out.print("It is not a prime number:");
        }
    }
}