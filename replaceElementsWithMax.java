class Solution {
	public int[] replaceElements(int[] arr) {
		int TEMP = arr.length, max = arr[TEMP - 1];
		arr[TEMP - 1] = -1;
		for (int i = TEMP - 2; i >= 0; --i) {
			TEMP = max;
			if (arr[i] > max)
				max = arr[i];
			arr[i] = TEMP;
		}
		return arr;
	}
}