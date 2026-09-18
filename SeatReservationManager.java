import java.util.PriorityQueue;

public class SeatReservationManager {
    PriorityQueue<Integer> unreserve;

    public SeatManager(int n) {
        unreserve = new PriorityQueue<>();

        for(int i = 1; i <= n; i++){
            unreserve.offer(i);
        }
    }

    public int reserve() {
        return unreserve.poll();
    }

    public void unreserve(int seatNumber) {
        unreserve.offer(seatNumber);
    }
}
