class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
       
        for (int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }
        Arrays.sort(position);
        int i = speed.length - 1;
        while (i >= 0) {
            if (stack.isEmpty()) {
                stack.push(position[i]);
            } else {
                double time1 = (double) (target - stack.peekFirst()) / map.get(stack.peekFirst());
                double time2 = (double)(target - position[i]) / map.get(position[i]);
                if (time2 > time1) {
                    stack.push(position[i]);
                } i--;
            }
        }
        return stack.size();
    }
}
