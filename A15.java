// Read marks a student in P,C,M & calculate total & Percetnage.

import java.util.*;
class A15{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your marks in Physics:");
        float physics = Sc.nextFloat();
        System.out.print("Enter your marks in Chemistry:");
        float chemistry = Sc.nextFloat();
        System.out.print("Enter your marks in Maths:");
        float maths = Sc.nextFloat();
        float percentage = ((physics+chemistry+maths )/300)*100;
        System.out.println("Your total marks are: "+(physics+chemistry+maths));
        System.out.printf("Your total marks are: %.2f",(percentage));
    }
}