class Solution {
	public int thirdMax(int[] nums) {
		// Parse all values in array into a Tree Set
		TreeSet<Integer> max = new TreeSet<Integer>();
		for (int i : nums)
			max.add(i);

		// Return third max or absolute max if invalid
		if (max.size() < 3)
			return max.last();
		for (int i = 0; i < 2; ++i)
			max.pollLast();
		return max.last();
	}
}