class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> check=new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            check.add(nums[i]);
        }
        if(nums.length==check.size()){
            return false;
        }
        return true;
    }
}