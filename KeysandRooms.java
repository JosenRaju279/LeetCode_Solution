import java.util.List;

public class KeysandRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        dfs(0, rooms, visited);
        for (boolean room : visited) {
            if (!room) {
                return false;
            }
        }
        return true;
    }

    private void dfs(int rooms, List<List<Integer>> room, boolean[] visited) {
        if (visited[rooms]) {
            return;
        }
        visited[rooms] = true;

        for (int key : room.get(rooms)) {
            dfs(key, room, visited);
        }
    }
}
