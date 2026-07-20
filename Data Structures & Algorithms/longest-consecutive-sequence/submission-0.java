class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        int ans=0;
        int length=0;
        for(int curr:hs){
            if(!hs.contains(curr-1)){
                int current=curr;
                length=1;
                while(hs.contains(current+1)){
                    current++;
                    length++;
                }
                ans=Math.max(ans,length);
            }
            
        }
        return ans;
    }
}
