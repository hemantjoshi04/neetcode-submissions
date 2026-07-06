class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxFreq=0;
        int ans=0;
        int[] arr=new int[26];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            arr[ch-65]++;
            maxFreq=Math.max(maxFreq,arr[ch-65]);
            while(right-left+1-maxFreq>k){
                arr[s.charAt(left)-65]--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
