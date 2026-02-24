package Arrays;

public class MaxSubArraySum {
    public static void bruteForce() {
        int[] array={1,2,3,4,5,6};
        int cur;
        int max=Integer.MIN_VALUE;
        for(int start=0;start<array.length;start++){
            for(int end=start;end<array.length;end++){
                cur=0;
                for(int i=start;i<=end;i++){
                    cur+=array[i];
                }
                max=Math.max(cur,max);
            }
        }
        System.out.println("Max sub array sum : "+max);
    }
    public static void preSum() {
        int[] array={1,2,3,4,5,6};
        int cur;
        int max=Integer.MIN_VALUE;
        for(int start=0;start<array.length;start++){
            cur=0;
            for(int end=start;end<array.length;end++){
                cur+=array[end];
                max=Math.max(cur,max);
            }
        }
        System.out.println("Max sub array sum : "+max);
    }
    public static void kadane(){
        int[] array={1,2,3,4,5,6};
        int cur=array[0];
        int max=cur;
        for(int i=1;i<array.length;i++){
            cur=Math.max(array[i],array[i]+cur);
            max=Math.max(cur,max);
        }
        System.out.println("Max sub array sum : "+max);
    }
}
