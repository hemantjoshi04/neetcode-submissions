class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        int left=0;
        int right=arr.length-k;
        while(left<right){
            int mid=left+(right-left)/2;
            if(x-arr[mid]<=arr[mid+k]-x){
                right=mid;
            }else left=mid+1;
        }
        while(k-->0)ans.add(arr[left++]);
        return ans;
    }
}