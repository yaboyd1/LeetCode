class Solution {
	public boolean checkIfExist(int[] arr) {
		HashSet<Integer> map = new HashSet<Integer>();
		for (int i : arr) {
			// Check if a numbers's double or half exists, add to hashset if not
			if (map.contains(i * 2) || (i % 2 == 0 && map.contains(i / 2)))
				return true;
			map.add(i);
		}
		return false;
	}
}