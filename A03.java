// Finding the table of the number 10.

class A03{
    public static void main (String args[]){
        int num = 10;
        System.out.println("The table of "+num+" is");
        for(int i = 1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}