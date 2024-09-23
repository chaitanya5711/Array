// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      int arr[]={2,3,4,5,6,7,8};
      int st=arr[0];
      int end=arr.length-1;
      for(int i=0; i<=arr.length; i++){
         int s=st+end/2;
         System.out.println(""+s);
      }
     
    }
}
