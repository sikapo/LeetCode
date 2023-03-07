package problem1;
class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0) return false;

        int origin = x;
        int reverce = 0;
        while (x > 0) {
            reverce = reverce * 10 + x % 10;
            x /= 10;
        }
        return origin == reverce;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(5445));
    }
}

