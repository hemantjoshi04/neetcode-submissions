class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int x : nums) {
            total += x;
        }
        if (total % 2 != 0) {
            return false;
        }
        int target = total / 2;
        boolean[][] t = new boolean[nums.length + 1][target + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            t[i][0] = true;
        }
        for (int i = 1; i < nums.length + 1; i++) {
            for (int j = 1; j <= target; j++) {
                if(nums[i-1]<=j){
                    t[i][j]=t[i-1][j]||t[i-1][j-nums[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[nums.length][target];
    }
}
