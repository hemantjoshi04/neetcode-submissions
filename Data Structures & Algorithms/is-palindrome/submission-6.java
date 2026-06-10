class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int end = s.length() - 1;
        while (i <= end) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            } else
                if(s.charAt(i) != s.charAt(end)) {
                    return false;
                }

            i++;
            end--;
        }
        return true;
    }
}
