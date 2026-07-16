class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] dir = path.split("/");
        for (String dr : dir) {
            if (dr.equals(".") || dr.isEmpty()) {
                continue;
            } else if (dr.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(dr);
            }
        }
        return "/" + String.join("/", st);
    }
}