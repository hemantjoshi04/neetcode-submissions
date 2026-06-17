class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int right=m*n-1;
        int left=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int r=mid/m;
            int c=mid%m;
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                right=mid-1;
            }
            else left=mid+1;
        }
        return false;
    }
}
