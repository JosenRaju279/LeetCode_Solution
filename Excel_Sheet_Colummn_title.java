public class Excel_Sheet_Colummn_title {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int reminder = columnNumber % 26;
            result.append((char) ('A' + reminder));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}
