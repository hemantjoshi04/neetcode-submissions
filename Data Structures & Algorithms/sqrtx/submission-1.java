class Solution {
    public int mySqrt(int x) {
        long lo=0,hi=x;
        long sqrt=0;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(mid*mid==x)return (int)mid;
            else if(mid*mid<x){sqrt=mid;lo=mid+1;}
            else hi=mid-1;
        }
        return (int)sqrt;
    }
}