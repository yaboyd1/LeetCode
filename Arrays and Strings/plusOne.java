class Solution {
	public int[] plusOne(int[] digits) {
		boolean resize = false;
		for (int i = digits.length - 1; i >= 0; --i) {
			if (digits[i] == 9) {
				digits[i] = 0;
				if (i == 0)
					resize = true;
			}
			else {
				++digits[i];
				break;
			}
		}
		if (resize) {
			int[] output = new int[digits.length + 1];
			output[0] = 1;
			for (int i = 0; i < digits.length; ++i)
				output[i + 1] = digits[i];
			return output;
		}
		return digits;
	}
}