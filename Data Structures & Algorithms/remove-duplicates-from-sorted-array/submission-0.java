class Solution {
    public int removeDuplicates(int[] nums) {
        int o=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[o]){
                nums[++o]=nums[i];
            }

        }
        return o+1;
    }
}