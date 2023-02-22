// Find the largest digit of a number.

import java.util.*;
class A20{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = Sc.nextInt();
        int max = 0;
        int d = 0;
        while(num>0)
        {
            d = num%10;
            if (max<d){
                max = d;
            }
            num = num/10;
        }
        System.out.print("The largest digit in the number is: "+max);
    }
}