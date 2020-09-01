class Solution {
	public void moveZeroes(int[] A) {
		int start = 0; // Index where non-zero items will be inserted
		for (int i = 0; i < A.length; ++i)
			if (i != 0)
				A[start++] = A[i];
		// Fill the rest of the array with zeroes
		while (start++ < A.length)
			A[i] = 0;
	}
}