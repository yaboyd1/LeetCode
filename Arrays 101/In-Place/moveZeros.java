class Solution {
	public void moveZeroes(int[] nums) {
		int start = 0; // Index where non-zero items will be inserted
		for (int i = 0; i < nums.length; ++i)
			if (nums[i] != 0)
				nums[start++] = nums[i];
		// Fill the rest of the array with zeroes
		while (start < nums.length)
			nums[start++] = 0;
	}
}