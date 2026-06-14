class Solution {
    public int calPoints(String[] operations) {
        int[] stack=new int[operations.length];
        int curr=0;
        for(String s:operations){
            switch(s){
                case("+"):{
                    stack[curr]=stack[curr-1]+stack[curr-2];
                    curr++;
                    break;
                }
                case("D"):{
                    stack[curr]=stack[curr-1]*2;
                    curr++;
                    break;
                }
                case("C"):{
                    curr--;
                    break;
                }
                default:{
                    stack[curr]=Integer.parseInt(s);
                    curr++;
                }

            }
        }
        int sum=0;
        for(int i=0;i<curr;i++){
            sum+=stack[i];
        }
        return sum;
        
    }
}