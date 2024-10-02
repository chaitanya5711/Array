import java.util.Arrays;  // Import the Arrays class

class HelloWorld {
    
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2};
        
        // Sort the array using Arrays.sort
        Arrays.sort(arr);  // Sort the array in ascending order
        
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[]-1) + " ");  // Added space for better readability
            
        }
    }
}

//or 
// this is the best optimal solution with good time complexity o(n)
/*
class HelloWorld {
    
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2};
int largest=arr[0];
for(int i=1; i<arr.length; i++){
    if(largest<arr[i]){
        largest=arr[i];
       
        }
        
        
}
System.out.println("largest element:"+largest);

}
}*/

