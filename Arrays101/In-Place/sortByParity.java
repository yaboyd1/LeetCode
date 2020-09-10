class Solution {
	public int[] sortArrayByParity(int[] A) {
		int odd = A.length - 1; // Odd numbers will be inserted to the end of the array
		for (int i = A.length - 1; i >= 0; --i) {
			if (A[i] % 2 == 1) {
				int temp = A[i];
				A[i] = A[odd];
				A[odd--] = temp;
			}
		}
		return A;
	}
}