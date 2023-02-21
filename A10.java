// Program to find the sum of digits of an integer.

import java.util.*;
class A10{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter a number to find its digit's sum: ");
        int num = Sc.nextInt();
        int temp = num;
        int sum =0,x;
        while (temp>0){
            x = temp%10;
            sum = sum + x;
            temp =temp/10;
        }
        System.out.print("The sum of the digits is: "+sum);
    }
}