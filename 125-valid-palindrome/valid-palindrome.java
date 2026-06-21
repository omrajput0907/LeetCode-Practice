class Solution {
    public boolean isAlpha(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i <= j) {
            if (isAlpha(s.charAt(i)) && isAlpha(s.charAt(j))) {

                if (Character.toLowerCase(s.charAt(i))
                        == Character.toLowerCase(s.charAt(j))) {
                    i++;
                    j--;
                } else {
                    return false;
                }

            } else if (!isAlpha(s.charAt(i))) {
                i++;
            } else if (!isAlpha(s.charAt(j))) {
                j--;
            }
        }

        return true;
    }
}