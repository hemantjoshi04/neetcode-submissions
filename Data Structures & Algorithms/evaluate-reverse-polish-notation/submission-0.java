class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];
            switch (ch) {
                case ("+"):
                    st.push(st.pop() + st.pop());
                    break;
                case ("*"):
                    st.push(st.pop() * st.pop());
                    break;
                case ("/"):
                    int b=st.pop();
                    int a=st.pop();
                    st.push(a/b);
                    break;
                case ("-"):
                    b=st.pop();
                    a=st.pop();
                    st.push(a-b);
                    break;
                default:
                    st.push(Integer.parseInt(ch));

            }
        }
        return st.peek();
    }
}
