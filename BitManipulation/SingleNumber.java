package BitManipulation;


public class SingleNumber {
    public static void singleNumber() {
        int[] nums = {1, 6, 5, 2, 3, 1, 4, 3, 4, 5};
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        System.out.println("Number which appeared only once is : " + xor);
    }
}
