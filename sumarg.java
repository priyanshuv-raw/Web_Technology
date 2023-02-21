// In this program i am adding two integers taken by the user using argument input;

class sumarg{
    public static void main(String args[]){
        int x,y,z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = x+y;
        System.out.print("Sum is "+z);
    }
}