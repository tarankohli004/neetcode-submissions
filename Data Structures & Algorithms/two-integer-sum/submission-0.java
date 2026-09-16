class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        int start = 0;
        
        // Loop start from the beginning up to the second-to-last element
        while (start < nums.length - 1) {
            // end always starts just ahead of start
            int end = start + 1;
            
            // Scan through the rest of the array
            while (end < nums.length) {
                if (nums[start] + nums[end] == target) {
                    result[0] = start;
                    result[1] = end;
                    return result; // 1. Return immediately to prevent an infinite loop
                }
                end++; // 2. Move end forward to check the next number
            }
            start++; // 3. Move start to the next base number
        }
        
        return result;
    }
}