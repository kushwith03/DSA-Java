package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashingUtils<K, V> {
    public class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static int n;
    private static int N;
    public LinkedList<Node> buckets[];

    public HashingUtils() {
        this.N = 4;
        buckets = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public int hashFunction(K key) {
        return Math.abs(key.hashCode() % N);
    }

    public int searchInLL(int bi, K key) {
        LinkedList<Node> ll = buckets[bi];
        int di = 0;
        for (Node node : ll) {
            if (node.key.equals(key)) {
                return di;
            }
            di++;
        }
        return -1;
    }

    public void rehash() {
        LinkedList<Node> oldBucket[] = buckets;
        buckets = new LinkedList[2 * N];
        N = 2 * N;
        n = 0;
        for (int i = 0; i < N; i++) {
            buckets[i] = new LinkedList<>();
        }
        for (int i = 0; i < oldBucket.length; i++) {
            LinkedList<Node> ll = oldBucket[i];
            for (Node node : ll) {
                put(node.key, node.value);
            }
        }
    }

    public void put(K key, V value) {
        int bi = hashFunction(key);
        int di = searchInLL(bi, key);
        if (di != -1) {
            Node node = buckets[bi].get(di);
            node.value = value;
        } else {
            buckets[bi].add(new Node(key, value));
            n++;
            double lambda = (double) n / N;
            if (lambda > 0.75) {
                rehash();
            }
        }

    }

    public boolean containsKey(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(bi, key);
        return di != -1;
    }

    public V get(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(bi, key);
        if (di != -1) {
            Node node = buckets[bi].get(di);
            return node.value;
        } else {
            return null;
        }
    }

    public K getKey(V value) {
        for (int i = 0; i < buckets.length; i++) {
            LinkedList<Node> ll = buckets[i];
            for (Node node : ll) {
                if (node.value.equals(value)) {
                    return node.key;
                }
            }
        }
        return null;
    }

    public V remove(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(bi, key);
        if (di != -1) {
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
        }
        return null;
    }

    public ArrayList<K> keySet() {
        ArrayList<K> keys = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            LinkedList<Node> ll = buckets[i];
            for (Node node : ll) {
                keys.add(node.key);
            }
        }
        return keys;
    }

    public boolean isEmpty() {
        return n == 0;
    }


    public static void main(String[] args) {
        HashingUtils<String, Integer> map = new HashingUtils();
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("UK", 30);
        map.put("Germany", 20);
        ArrayList<String> keys = map.keySet();
        System.out.println(keys);
    }
}
