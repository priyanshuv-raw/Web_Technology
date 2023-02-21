// Finding the sum using the child class and parent class.

import java.util.*;

class A05{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int x,y,z;
        A06 obj = new A06();
        System.out.print("Enter the first number:");
        x = Sc.nextInt();
        System.out.print("Enter the second number:");
        y = Sc.nextInt();
        obj.sum(x,y);
    }
}