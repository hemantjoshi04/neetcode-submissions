class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet();
        int ans = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.contains(s.charAt(i))) {
                while (map.contains(s.charAt(i))) {
                    map.remove(s.charAt(start++));
                }
            }
            map.add(s.charAt(i));
            ans = Math.max(ans, i - start + 1);
        }
        return ans;
    }
}
