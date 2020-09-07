class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums.length < 1) return 0;
		int start = 0; // Unique items will be inserted at the start of array
		for (int i = 1; i < nums.length; ++i)
			if (nums[start] != nums[i])
				nums[++start] = nums[i];
		return start + 1;
	}
}