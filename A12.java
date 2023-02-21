// Program to convert seconds into hour:minute:seconds

import java.util.*;
class A12{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter the time: ");
        int sec = Sc.nextInt();
        System.out.print("The time in sec is: "+sec);
        System.out.print("\nThe time in hh:mm:ss is: ");
        int hour = sec/3600;
        int ht = sec - (hour*3600);
        int minute=ht/60;
        int sec1 = ht-(minute*60);
        System.out.print(hour+":"+minute+":"+sec1);
    }
}