class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;
		int answer[] = new int[2];
		while(start < end) {
			// If too large, decrease end
			if (numbers[start] + numbers[end] > target) {
				--end;
			}
			// If too small, increase start
			else if (numbers[start] + numbers[end] < target) {
				++start;
			}
			else if (numbers[start] + numbers[end] == target) {
				answer[0] = start;
				answer[1] = end;
				break;
			}
		}
		return answer;
	}
}