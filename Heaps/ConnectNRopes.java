package Heaps;

import java.util.PriorityQueue;

public class ConnectNRopes {
    public static int connectSticks(int[] sticks) {
        int totalCost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < sticks.length; i++) {
            pq.add(sticks[i]);
        }
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int cost = first + second;
            totalCost += cost;
            pq.add(cost);
        }
        return totalCost;
    }
}