package Heaps;

import java.util.PriorityQueue;

public class KClosestPoints {
    class Point implements Comparable<Point> {
        int x;
        int y;
        int distance;

        public Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        public int compareTo(Point p2) {
            return p2.distance - this.distance;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int dist = x * x + y * y;
            pq.add(new Point(points[i][0], points[i][1], dist));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            Point curr = pq.poll();
            ans[i][0] = curr.x;
            ans[i][1] = curr.y;
        }
        return ans;
    }
}
