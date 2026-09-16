class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        // 1. Count the frequency of each number
        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }

        // 2. Check if any frequency is greater than 1
        for (int value : hmap.values()) {
            if (value > 1) {
                return true; // Found a duplicate
            }
        }
        
        return false; // No duplicates found
    }
}