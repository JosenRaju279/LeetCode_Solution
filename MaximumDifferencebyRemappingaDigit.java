public class MaximumDifferencebyRemappingaDigit {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);

        char toReplaceMax = 0;
        for (char c : s.toCharArray()) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        int max = toReplaceMax == 0
                ? num
                : Integer.parseInt(s.replace(toReplaceMax, '9'));

        int min = Integer.parseInt(s.replace(s.charAt(0), '0'));

        return max - min;
    }
}
