// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
// Return the single element that appears only once.
// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

import java.util.*;
class A13{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter the array with 10 elements: ");
        for (int i=0;i<10;i++)
        {
            arr[i] = Sc.nextInt();
        }
        for (int i=0;i<10;i=i+2)
        {
            if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                System.out.print(arr[i]);
                break;
            }

        }
    }
}