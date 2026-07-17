class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack=new Stack<>();
        Stack<StringBuilder> stringStack=new Stack<>();
        int num=0;
        StringBuilder curr=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                countStack.push(num);
                stringStack.push(curr);
                curr=new StringBuilder();
                num=0;
            }
            else if(c==']'){
                int repeat=countStack.pop();
                StringBuilder prev=stringStack.pop();
                for(int i=0;i<repeat;i++){
                    prev.append(curr);
                }
                curr=prev;
            }
            else{
                curr.append(c);
            }
        }
        return curr.toString();
    }
}