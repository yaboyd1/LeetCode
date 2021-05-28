class Solution {
	public int pivotIndex(int[] nums) {
		// Calculate the sum of whole array
		int leftsum = 0;
		for (int i : nums)
			leftsum += i;

		int rightsum = 0;
		for (int i = 1; i < nums.length; ++i) {
			rightsum += nums[i];
			leftsum -= nums[i];
			if (rightsum == leftsum)
				return i;
		}
		return -1;
	}
}