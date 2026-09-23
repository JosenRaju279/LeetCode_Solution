public class MatchstickstoSquare {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;

        for(int sticks : matchsticks){
            sum += sticks;
        }

        if(sum % 4 != 0){
            return false;
        }

        int side = sum / 4;

        Arrays.sort(matchsticks);

        if(matchsticks[matchsticks.length - 1] > side){
            return false;
        }
        
        int[] sides = new int[4];

        return Backtrack(matchsticks, matchsticks.length - 1, sides, side);
    }

    private boolean Backtrack(int[] matchstick, int index, int[] sides, int target){

        if(index < 0){
            return sides[0] == target &&
            sides[1] == target &&
            sides[2] == target &&
            sides[3] == target;
        }

        int stick = matchstick[index];

        for(int i = 0; i < 4; i++){

            if(sides[i] + stick > target) continue;

            boolean dup = false;

            for(int j = 0; j < i; j++){
                if(sides[j] == sides[i]){
                    dup = true;
                    break;
                }
            }

            if(dup) continue;

            sides[i] += stick;

            if(Backtrack(matchstick, index - 1, sides, target)) return true;

            sides[i] -= stick;
        }
        return false;
    }
}
