package BinarySearch;

public class GasStation {
    public static void find() {
        //bruteForce
        int[] position = {1, 13, 17, 23};
        int k = 5;
        int[] howMany = new int[position.length - 1];
        for (int i = 1; i <= k; i++) {
            int maxDistance = -1;
            int maxIndex = -1;
            for (int j = 0; j < position.length - 1; j++) {
                int difference = position[j + 1] - position[j];
                int length = difference / (howMany[j] + 1);
                if (maxDistance < length) {
                    maxDistance = length;
                    maxIndex = j;
                }
            }
            howMany[maxIndex]++;
        }
        int maxAns = 0;
        for (int i = 0; i < position.length - 1; i++) {
            int difference = position[i + 1] - position[i];
            int length = difference / (howMany[i] + 1);
            maxAns = Math.max(maxAns, length);
        }
        System.out.println("Maximum distance between two adjacent gas station : " + maxAns);
    }
}
