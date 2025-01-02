public class Main {
    public static void main(String args[]) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        
        // Start from the rightmost element
        int maxRight = arr[arr.length - 1]; // Initialize with the last element
        System.out.println(maxRight); // The rightmost element is always a leader
        
        // Traverse the array in reverse order
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                System.out.println(arr[i]); // If the current element is greater than or equal to maxRight, it's a leader
                maxRight = arr[i]; // Update maxRight to the current element
            }
        }
    }
}


OR
    //leaders question
public class Main{
    public static void main(String args[]){
        int arr[]= {16, 17 ,4 , 3 ,5 ,2};
        
        int max=arr[arr.length-1];
        
        for (int i=arr[arr.length-2]; i>=0; i--){
            if(arr[i]>=max){
                System.out.println(arr[i]);
                max=arr[i];
                
            }
        }
        
          }
}
