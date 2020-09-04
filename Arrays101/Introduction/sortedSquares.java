class Solution {
	public int[] sortedSquares(int[] A) {
		// New array to store the squares
		int answer[] = new int[A.length];

		int left_index = 0; // Possibly largest square from left portion (Larger magnitude negative)
		int right_index = A.length - 1; // Possibly largest square from right portion
		int i = A.length - 1; // New items will be inserted at the end of the array

		// Larger magnitude's square will be added to the new array
		while (left_index <= right_index) {
			if (Math.abs(A[left_index]) > Math.abs(A[right_index])) 
				answer[i--] = (int)Math.pow(A[left_index++], 2);
			else
				answer[i--] = (int)Math.pow(A[right_index--], 2);
		}

		return answer;
	}
}