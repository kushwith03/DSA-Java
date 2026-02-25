package Heaps;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static class Element implements Comparable<Element> {
        int idx;
        int val;

        public Element(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }

        public int compareTo(Element e2) {
            return e2.val - this.val;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(new Element(i, nums[i]));
        }
        ans[0] = pq.peek().val;
        for (int i = k; i < nums.length; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= i - k) {
                pq.poll();
            }
            pq.add(new Element(i, nums[i]));
            ans[i - k + 1] = pq.peek().val;
        }
        return ans;
    }
}
