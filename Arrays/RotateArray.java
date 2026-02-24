package Arrays;

public class RotateArray {
    public static void rotate() {
        int[] nums={1,2,3,4,5,6,7};;
        int k=3;
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        ArraysUtils.printArray(nums);

    }
    public static void reverse(int[] nums,int start,int end){
        int temp;
        while(start<end){
            ArraysUtils.swap(nums,start,end);
            start++;
            end--;
        }
    }
}
