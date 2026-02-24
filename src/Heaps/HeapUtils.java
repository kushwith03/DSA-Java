package Heaps;

import java.util.ArrayList;

public class HeapUtils {
    public static class MyHeap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (x > 0 && arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;
            if (left < arr.size() && arr.get(minIdx) > arr.get(left))
                minIdx = left;
            if (right < arr.size() && arr.get(minIdx) > arr.get(right))
                minIdx = right;
            if (minIdx != idx) {
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);
            if (arr.size() == 1) {
                return arr.remove(0);
            }
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            arr.remove(arr.size() - 1);
            heapify(0);
            return data;
        }
    }

    public static void main(String[] args) {
        MyHeap pq = new MyHeap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(2);
        while (!pq.arr.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}