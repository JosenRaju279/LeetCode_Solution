import java.util.HashMap;
import java.util.Map;

public class Roman_To_int {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanMap.get(s.charAt(i));

            // Subtract if smaller value comes before a larger one (e.g. IV)
            if (current < prevValue) {
                total -= current;
            } else {
                total += current;
            }

            prevValue = current;
        }

        return total;
    }

}
