import java.util.*;

class A05{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int x,y,z;
        calcs obj = new calcs();
        calcd ob = new calcd();
        System.out.print("Enter the first number:");
        x = Sc.nextInt();
        System.out.print("Enter the second number:");
        y = Sc.nextInt();
        obj.sum(x,y);
        ob.diff(x,y);
    }
}