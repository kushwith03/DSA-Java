package Arrays;

public class MissingNumber {
    public static void  value() {
        int[] nums={0,1,2,3,4,6,7};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n=nums.length;
        System.out.println("Missing Value : "+ (((n*(n+1))/2)-sum));
    }
}
