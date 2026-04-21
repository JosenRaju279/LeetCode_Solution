public class Excel_Sheet_Column_number {
    public int titleToNumber(String columnTitle) {
        int column = 0;
        int level = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            column += (columnTitle.charAt(i) - 64) * level;
            level *= 26;
        }
        return column;
    }

}
