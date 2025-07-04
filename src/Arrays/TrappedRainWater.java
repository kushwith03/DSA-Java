package Arrays;

public class TrappedRainWater {
    public static void calculate() {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        rightMax[rightMax.length - 1] = height[height.length - 1];
        for (int i = rightMax.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater = trappedWater + (waterLevel - height[i]);
        }
        System.out.println("Total trapped water : " + trappedWater);
    }

    public static void better() {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        int trappedWater = 0;
        int[] rightMax = new int[height.length];
        int leftMax = height[0];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 1; i < height.length - 1; i++) {
            leftMax = Math.max(leftMax, height[i]);
            trappedWater += ((Math.min(leftMax, rightMax[i])) - height[i]);
        }
        System.out.println("Total trapped water : " + trappedWater);
    }

    public static void optimal() {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        int leftMax = 0, rightMax = 0, trappedWater = 0;
        int left = 0;
        int right = height.length - 1;
        while (left <= right) {
            if (leftMax <= rightMax) {
                if (leftMax > height[left]) {
                    trappedWater += leftMax - height[left];
                } else {
                    leftMax = height[left];
                }
                left++;
            } else {
                if (rightMax > height[right]) {
                    trappedWater += rightMax - height[right];
                } else {
                    rightMax = height[right];
                }
                right--;
            }
        }
        System.out.println("Total trapped water : " + trappedWater);
    }
}
