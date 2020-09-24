class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		ArrayList<Integer> intersections = new ArrayList<Integer>();

		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			// If equal, add to the array
			if (nums1[i] == nums2[j]) {
				intersections.add(nums1[i]);
				++i;
				++j;
			}
			// Update the pointers if not equal
			else if (nums1[i] < nums2[j])
				++i;
			else 
				++j;
		}

		// Converting ArrayList<Integer> -> int[]
		int output[] = new int[intersections.size()];
		for (int k = 0; k < intersections.size(); ++k)
			output[k] = intersections.get(k);

		return output;
	}
}