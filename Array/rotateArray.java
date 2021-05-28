class Solution {
	public void rotate(int[] nums, int k) {
		final int LENGTH = nums.length;
		int output[] = new int[LENGTH];
		
		for (int i = 0; i < LENGTH; ++i)
			output[(i + k) % LENGTH] = nums[i];

		for (int i = 0; i < LENGTH; ++i)
			nums[i] = output[i];
	}
}