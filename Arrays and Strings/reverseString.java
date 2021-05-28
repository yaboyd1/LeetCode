class Solution {
	public void reverseString(char[] s) {
		// Swap start with end
		for (int i = 0; i < s.length / 2; ++i) {
			char temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
	}
}