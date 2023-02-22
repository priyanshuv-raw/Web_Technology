// Check for Armstrong number.

import java.util.*;
class A21{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter a number to check for Armstrong Number: ");
        int num = Sc.nextInt();
        int d = 0;
        int temp = num;
        int sum = 0;
        while(temp>0)
        {
            d = temp%10;
            sum = sum + (d*d*d);
            temp = temp/10;
        }
        if(num==sum){
            System.out.print("It is an Armstrong Number:");
        }
        else{
            System.out.print("It is not an Armstrong Number:");
        }
    }
}