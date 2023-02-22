// Printing the squares of the number.

import java.util.*;
class A19{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner (System.in);
        {
            System.out.print("Enter the number till where you find the squares:");
            int len = Sc.nextInt();
            System.out.println(" The squares are:\n Number   Sqaures\n------------------");
            for(int i=1;i<=len;i++)
            {
                System.out.println("   "+i+"         "+(i*i));
            }
            System.out.println("------------------");
        }
    }
}