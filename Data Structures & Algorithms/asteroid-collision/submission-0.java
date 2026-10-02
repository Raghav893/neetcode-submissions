class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;

        while (i < asteroids.length) {
            if (stack.isEmpty()) {
                stack.push(asteroids[i]);
                i++;
            }
            else if (stack.peekFirst() > 0 && asteroids[i] < 0) {
                if (stack.peekFirst() < Math.abs(asteroids[i])) {
                    stack.pop();
                }

                else if (stack.peekFirst() == Math.abs(asteroids[i])) {
                    stack.pop();
                    i++;
                }

                else {
                    i++;
                }
            }

            else {
                stack.push(asteroids[i]);
                i++;
            }
        }

        int[] result = new int[stack.size()];

        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }

        return result;
    }
}