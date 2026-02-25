package Heaps;

import java.util.PriorityQueue;

public class KWeakestRows {
    public static class Row implements Comparable<Row> {
        int idx;
        int soldiers;

        public Row(int idx, int soldiers) {
            this.idx = idx;
            this.soldiers = soldiers;
        }

        public int compareTo(Row r2) {
            if (r2.soldiers == this.soldiers) {
                return r2.idx - this.idx;
            }
            return r2.soldiers - this.soldiers;
        }
    }

    public static int bs(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            int soldiers = bs(mat[i]);
            pq.add(new Row(i, soldiers));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = pq.poll().idx;
        }
        return ans;
    }
}
