class Solution {
	public int heightChecker(int[] heights) {
		int LENGTH = heights.length;

		// Sort a copy of array
		int[] sorted = new int[LENGTH];
		for (int i = 0; i < LENGTH; ++i)
			sorted[i] = heights[i];
		Arrays.sort(sorted);

		// Find differences between original and sorted array
		int count = 0;
		for (int i = 0; i < LENGTH; ++i)
			if (sorted[i] != heights[i])
				++count;
		return count;
	}
}