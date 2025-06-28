package Arrays;

public class ContainerWithMostWater {
    public static void bruteForce() {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 2, 7};
        int maxWater = 0;
        int breadth;
        int height;
        int area;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                height = Math.min(heights[i], heights[j]);
                breadth = j - i;
                area = breadth * height;
                if (area > maxWater) {
                    maxWater = area;
                }
            }
        }
        System.out.println("Maximum water that can be contained: " + maxWater);
    }

    public static void optimal() {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 2, 7};
        int maxWater = 0;
        int breadth;
        int height;
        int area;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            height = Math.min(heights[left], heights[right]);
            breadth = right - left;
            area = breadth * height;
            if (area > maxWater) {
                maxWater = area;
            }
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Maximum water that can be contained: " + maxWater);

    }
}
