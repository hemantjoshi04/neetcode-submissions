class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] frequency=new int[26];
        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-97]++;
            frequency[t.charAt(i)-97]--;
        }
      
       
        return Arrays.equals(frequency,new int[26]);
    }
}
