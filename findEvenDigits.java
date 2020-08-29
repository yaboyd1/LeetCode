class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums)
            if (getDigits(i) % 2 == 0)
                ++count;
        return count;
    }
    
    // Counts the number of digits a number has
    public int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        return count;
    }
}