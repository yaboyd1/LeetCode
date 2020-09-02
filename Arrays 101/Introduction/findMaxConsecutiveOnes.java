class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int i : nums) {
        	// Count consecutive ones
            if (i == 1) 
                ++count;
            else 
                count = 0;
            // Update maximum
            if (count > max)
                max = count;
        }
        return max;
    }
}