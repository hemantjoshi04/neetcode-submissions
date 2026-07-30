class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] freq=new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(freq[value]==null){
                freq[value]=new ArrayList<>();
            }
            freq[value].add(key);
        }
        int[] ans=new int[k];
        int count=0;
        for(int i=freq.length-1;i>=0;i--){
            if(freq[i]!=null){
                for(int a:freq[i]){
                    ans[count++]=a;
                    if(count==k)return ans;
                }
            }
        }
        return ans;
        
    }
}
