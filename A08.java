// Program to find the area and the perimeter of the circle

import java.util.*;
class A08{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner (System.in);
        {
            System.out.print("Enter the radius: ");
            double r = Sc.nextDouble();
            System.out.printf("The area of the circle is: %.2f",(3.14*r*r));
            System.out.printf("\nThe perimeter of the circle is: %.2f",(3.14*r*2));
        }
    }
}