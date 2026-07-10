class Solution {
    public String minWindow(String s, String t) {
        int[] tArray=new int[128];
        int[] sArray=new int[128];
        int need=0;
        for(int i=0;i<t.length();i++){
            tArray[t.charAt(i)]++;
            if(tArray[t.charAt(i)]==1)need++;
        }
        int formed=0;
        int a=0,b=0;
        int min=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            sArray[c]++;
            if(sArray[c]==tArray[c]){
                formed++;
            }
            while(formed==need){
                if(min>right-left+1){
                    min=right-left+1;
                    a=right;
                    b=left;
                }
                char ch=s.charAt(left);
                sArray[ch]--;
                if(sArray[ch]<tArray[ch])formed--;
                left++;
            }
        }
        if(min==Integer.MAX_VALUE){return "";}
        else return s.substring(b,a+1);
    }
}
