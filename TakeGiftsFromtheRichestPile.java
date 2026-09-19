import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromtheRichestPile {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int gift : gifts) {
            maxHeap.offer(gift);
        }

        while (k-- > 0) {
            int max = maxHeap.poll();

            int rem = (int) Math.sqrt(max);

            maxHeap.offer(rem);
        }

        long answer = 0;

        while (!maxHeap.isEmpty()) {
            answer += maxHeap.poll();
        }
        return answer;
    }
}
