public class Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m)
            return false;

        int[] s1count = new int[26];
        int[] wincount = new int[26];

        for (int i = 0; i < n; i++) {
            s1count[s1.charAt(i) - 'a']++;
            wincount[s2.charAt(i) - 'a']++;
        }

        if (matches(s1count, wincount))
            return true;

        for (int right = n; right < m; right++) {
            wincount[s2.charAt(right) - 'a']++;
            wincount[s2.charAt(right - n) - 'a']--;

            if (matches(s1count, wincount))
                return true;
        }
        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}
