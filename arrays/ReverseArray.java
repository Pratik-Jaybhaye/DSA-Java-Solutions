package arrays;

import java.util.Arrays;

/*
logic : 1) just take two pointers start ,end 
2)run while loop until left<right and swap the array elements 
*/
public class ReverseArray {
    public static void reverseArray(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left <right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,5,8,79,7,55,64,9};
        System.out.println("original array :"+ Arrays.toString(arr));
        ReverseArray.reverseArray(arr);
        System.out.println("reversed array :" + Arrays.toString(arr));
    }

}
