public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {

        String a = stringBuild(s);
        String b = stringBuild(t);

        return a.equals(b);
    }

    private String stringBuild(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
