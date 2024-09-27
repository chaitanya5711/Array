//LeetCode problem Solution
class Solution {
    public int removeDuplicates(int[] nums) {
        int uniquecount = 0;
        
        for (int i = 1; i < nums.length; i++) {  // Start from 1, since nums[0] is already unique
            if (nums[i] != nums[uniquecount]) {
                uniquecount++;
                nums[uniquecount] = nums[i];  // Correct the position of the unique element
            }
        }
        
        return uniquecount + 1;  // +1 because uniquecount is index-based, we need element count
    }
}

// 
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4,5};
        int uniquecount =0;
        for(int i=1; i<nums.length; i++){
            while(nums[i]!=nums[uniquecount]){
                uniquecount++;
                nums[uniquecount]=nums[i];
            }
           }
            System.out.println(" "+(uniquecount+1));
     }
}
