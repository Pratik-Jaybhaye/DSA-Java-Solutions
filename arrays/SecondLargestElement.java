package arrays;
/*given an unsorted array arr[], find the second largest element in the array.:
Input: [1,2,3,4,5]
Output: 4   
logic:
1) keep track of the largest and second largest elements while iterating through the array.
2) Initialize largest ans second largest as -1;
3) if arr[i]>largest, update second largest to largest and largest to arr[i]
4) else if arr[i]<largest and arr[i]>second largest, update second largest to arr[i]
*/
public class SecondLargestElement {
    public static int secondLargest(int arr[]){
        int n=arr.length;
        int largest=-1;
        int secondLargest=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if (arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];

            }
        }
            return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
          
        System.out.println(SecondLargestElement.secondLargest(arr) );
    }
}
