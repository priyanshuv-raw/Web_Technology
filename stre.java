import java.io.*;
class stre{
    public static void main(String args[]) throws IOException
    {
        int x,y,z;
        calc obj= new calc();
        DataInputStream d = new DataInputStream(System.in);
        x = Integer.parseInt(d.readLine());
        y = Integer.parseInt(d.readLine());
        obj.sum(x,y);
    }
}