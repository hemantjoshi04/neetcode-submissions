class Solution {
    public int[] asteroidCollision(int[] asteriods) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteriods.length; i++) {
            boolean alive = true;
            int curr=asteriods[i];
            while (!st.isEmpty() && st.peek() > 0 && curr<0&&alive==true) {
                if (Math.abs(st.peek()) == Math.abs(curr)) {
                    st.pop();
                    alive=false;
                } else if (Math.abs(st.peek()) < Math.abs(curr)) {
                    st.pop();
                } else {
                    alive=false;
                }
            }
            if(alive)st.push(curr);
        }
        int[]ans =new int [st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}