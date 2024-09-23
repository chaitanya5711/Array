import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int marks[]= new int[50];
        Scanner sc=new Scanner(System.in);
        
     System.out.print("enter the marks of phy:");
      marks[0]=sc.nextInt();  //marks of physics
   
     System.out.print("enter the marks of Sci:");
      marks[1]=sc.nextInt();//marks os science
   
     System.out.print("enter the marks of His:");
     marks[2]=sc.nextInt();//marks of history
    
     System.out.print("enter the marks of Geo:");
      marks[3]=sc.nextInt();//marks of geo
      
      
    System.out.println("phy:"+marks[0]);
    System.out.println("Sci:"+marks[1]);
    System.out.println("His:"+marks[2]);
    System.out.println("Geo:"+marks[3]);
    
    // to update the marks of the science
    marks[2]=100;
    System.out.println("Scienec marks:"+marks[2]);
    
    //to increase the marks by 3 
    marks[3]=marks[3]+3;
    System.out.println("Geo marks:"+marks[3]);
        
           }
}
