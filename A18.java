// Program to print the following series.
// 1
// 0
// 1
// 0
// 1
// .
// .
// .

import java.util.*;
class A18{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the length of the pattern:");
        int len = Sc.nextInt();
        int x;
        for (int i = 1;i<=len;i++)
        {
            x = (i%2==0)?0:1;
            System.out.println(x);
        }
            
    }
}