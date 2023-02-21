import java.util.*;

class calcmain{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int x,y,z;
        calcs obj = new calcs();
        calcd ob = new calcd();
        x = Sc.nextInt();
        y = Sc.nextInt();
        obj.sum(x,y);
        ob.diff(x,y);
    }
}