class Solution {
    public boolean validPalindrome(String s) {
        int del = 1;
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } 
            else if (del > 0) {
                del--;

                boolean left = true;
                int x = i + 1, y = j;

                while (x < y) {
                    if (s.charAt(x) != s.charAt(y)) {
                        left = false;
                        break;
                    }
                    x++;
                    y--;
                }

                boolean right = true;
                x = i;
                y = j - 1;     

                while (x < y) {
                    if (s.charAt(x) != s.charAt(y)) {
                        right = false;
                        break;
                    }
                    x++;
                    y--;
                }

                return left || right;
            } 
            else {
                return false;
            }
        }

        return true;
    }
}