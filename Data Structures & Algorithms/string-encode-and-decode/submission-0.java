class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
        sb.append(str.length()).append(',');
        }
        sb.append('#');
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
    List<String> ans = new ArrayList<>();

    if (s.isEmpty())
        return ans;

    List<Integer> lengths = new ArrayList<>();

    int i = 0;
    int num = 0;

    while (s.charAt(i) != '#') {
        if (s.charAt(i) == ',') {
            lengths.add(num);
            num = 0;
        } else {
            num = num * 10 + (s.charAt(i) - '0');
        }
        i++;
    }

    i++; // skip '#'

    for (int len : lengths) {
        ans.add(s.substring(i, i + len));
        i += len;
    }

    return ans;
}
}
