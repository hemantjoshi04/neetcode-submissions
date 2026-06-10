class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        int end=s.length()-1;
        while(i<end){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(end)){
                return false;
            }
            else {
                i++;
                end--;
            }
        }
        return true;
    }
}
