class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// Items will be inserted at the end of nums1
		int index = m-- + n-- - 1; 
		
		// Put the larger item in the next available spot
		while (m >= 0 && n >= 0) {
			if (nums1[m] > nums2[n])
				nums1[index--] = nums1[m--];
			else
				nums1[index--] = nums2[n--];
		}

		// Finish the other array if they are not the same size
		while(m >= 0)
			nums1[index--] = nums1[m--];

		while(n >= 0)
			nums1[index--] = nums2[n--];
	}
}