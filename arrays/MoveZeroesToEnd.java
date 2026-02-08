package arrays;

import java.util.Arrays;

/*
given an unsorted array arr[], move all the zeroes to the end of the array while maintaining the relative order of the non-zero elements.:
Input :[1,2,0,4,3,0,5,0]
Output: [1,2,4,3,5,0,0,0]
Logic:
1) Take a pointer say count to track where the next non-zero element should be placed.
2)If we encounter a non zero element instead of directly placing non zero element at arr[count], we will swap non zero element with arr[count] and then increment count. This way we can maintain the relative order of non zero elements.
3) After the loop, all non zero elements will be at the beginning of the array and count will be pointing to the first zero element. We can fill the remaining elements with zeroes.

*/
public class MoveZeroesToEnd {
    public static void setZeroToEnd(int arr[]){
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                
                count++;
                }
            }



        
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,4,3,0,5,0};
        System.out.println("Original: " + Arrays.toString(arr));
        MoveZeroesToEnd.setZeroToEnd(arr);
        System.out.println("After moving zeros: " + Arrays.toString(arr));
        
    }
    
}
