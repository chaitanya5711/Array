class HelloWorld {
    public static void main(String[] args) {
       int marks[] = {2, 3, 4, 6, 8};
       int key = 8;
       for (int i = 0; i < marks.length; i++) { // Change condition to i < marks.length
           if (key == marks[i]) {
              System.out.println("Found key: " +i); // Corrected to just print the key
           }
       }
    }
}
