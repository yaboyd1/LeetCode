class Solution {
	public int removeElement(int[] nums, int target) {
		int start = 0; // Items not equal to target will be inserted to the start of the array
		for (int i = 0; i < nums.length; ++i)
			if (nums[i] != target)
				nums[start++] = nums[i];
		return start;
	}
}