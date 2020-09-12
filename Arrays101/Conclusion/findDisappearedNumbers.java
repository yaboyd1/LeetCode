class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		HashSet<Integer> map = new HashSet<Integer>();
		for (int i : nums)
			map.add(i);
		List<Integer> output = new LinkedList<Integer>();
		for (int i = 1; i < nums.length + 1; ++i)
			if (!map.contains(i))
				output.add(i);
		return output;
	}
}