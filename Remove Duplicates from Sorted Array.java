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
