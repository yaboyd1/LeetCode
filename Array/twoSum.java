class Solution {
    public int[] twoSum(int[] nums, int target) {
    	// HashMap containing the index of each number
    	HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
    	int[] result = new int[2];
    	// Check if (target - number) exists
    	for (int i = 0; i < nums.length; ++i) {
    		if (index.containsKey(target - nums[i])) {
    			result[0] = i;
    			result[1] = index.get(target - nums[i]);
    			return result;
    		}
    		index.put(nums[i], i);
    	}
    	return result;
    }
}