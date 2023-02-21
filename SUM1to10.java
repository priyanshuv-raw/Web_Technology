// In this file we are trying to add all the numbers between 1 to 10;

class SUM1to10{
    public static void main(String args[]){
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum = sum + i;
        }
        System.out.print("The sum of numbers between 1 to 10 is "+ sum);
    }
}