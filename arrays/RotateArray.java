package arrays;
import java.util.Arrays;
/*
Problem: Rotate Array
Given an  unsorted array arr[], rotate the array to the left by d steps, where d is non-negative integer.:
Input: [1,2,3,4,5] and d = 2
Output: [3,4,5,1,2] 
Explanation:
1) Reverse the subarray containing the first d elements: [2,1,3,4,5]
2) Reverse the subarray containing the remaining n-d elements: [2,1,5,4,3]
3) Reverse the whole array: [3,4,5,1,2]
 */
public class RotateArray {
    static void rotateArr(int arr[],int d){
        int n=arr.length;
        d=d%n;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

       

    }
    
    static void reverse(int arr[],int start,int end){
         while(start<end ){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
         }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
       int d=2;
       System.out.println("Original: " + Arrays.toString(arr));
       RotateArray.rotateArr(arr,d);
       System.out.println("Rotated by " + d + ": " + Arrays.toString(arr));
    }
}
