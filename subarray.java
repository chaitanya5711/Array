// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        int curr=2;
       for(int i=0; i<numbers.length; i++){
            curr=numbers[i];
        
       for(int j=1; j<numbers.length; j++){
           System.out.print("("+curr+","+numbers[j]+")");
       }
       System.out.println();
       
       }
       
         }
}
