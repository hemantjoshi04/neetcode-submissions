class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int[] frequency=new int[26];
        for(int i=0;i<s1.length();i++){
            frequency[s1.charAt(i)-'a']++;
        }
        int[] fs=new int[26];
        int left=0;
        for(int right=0;right<s2.length();right++){
            fs[s2.charAt(right)-'a']+=1;
            if(right-left+1>s1.length()){
                fs[s2.charAt(left++)-'a']-=1;
            }
            if(Arrays.equals(frequency,fs))return true;
        }
        return false;
    }
}
