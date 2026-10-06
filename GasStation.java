public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int curgas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];

            totalgas += gain;
            curgas += gain;

            if (curgas < 0) {
                start = i + 1;
                curgas = 0;
            }
        }
        return totalgas >= 0 ? start : -1;
    }
}
