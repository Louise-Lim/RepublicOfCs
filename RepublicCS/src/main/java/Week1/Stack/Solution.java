package main.java.Week1.Stack;

import java.util.Stack;

// M 1001 - Asteroid Collision
public class Solution {
    /**
     * @param asteroids: a list of integers
     * @return: return a list of integers
     */
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        int j = 0;
        while (j < n) {
            if (st.size() == 0 || asteroids[j] > 0 || st.peek() < 0) {
                st.push(asteroids[j]);
                j++;
            } else if (-asteroids[j] < st.peek()) {
                if (st.peek() < -asteroids[j]) {
                    st.pop();
                    j++;
                }
            }
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
