
class HelloWorld {
    
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2};
int largest=arr[0];
for(int i=1; i<arr.length; i++){
    if(largest<arr[i]){
        largest=arr[i]-1;
       
        }
        
        
}
System.out.println("largest element:"+largest);

}
}
