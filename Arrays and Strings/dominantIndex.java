class Solution {
	public int dominantIndex(int[] nums) {
		int maxIndex = getMaxIndex(nums);
		final int MAX = nums[maxIndex];
		for (int i = 0; i < nums.length; ++i)
			// Find a doubled number that is greater than max element
			if (i != maxIndex && nums[i] * 2 > MAX)
				return -1;
		return maxIndex;
	}

	// Finds index of first max element
	public int getMaxIndex(int[] nums) {
		int maxIndex = 0;
		for (int i = 1; i < nums.length; ++i)
			if (nums[i] > nums[maxIndex])
				maxIndex = i;
		return maxIndex;
	}
}