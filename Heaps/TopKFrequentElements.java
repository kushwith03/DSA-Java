package Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static class Element implements Comparable<Element> {
        int val;
        int freq;

        public Element(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }

        public int compareTo(Element e2) {
            return this.freq - e2.freq;
        }

    }

    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Element> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[k];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Element(entry.getKey(), entry.getValue()));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int idx = 0;
        while (!pq.isEmpty()) {
            ans[idx++] = pq.poll().val;
        }
        return ans;

    }
}
