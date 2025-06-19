package Arrays;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void bruteForce() {
        int[] array={1,2,3,4,5,6};
        int sum=9;
        int cur;
        int len=0;
        int maxLen=0;
        for(int start=0;start<array.length;start++){
            for(int end=start;end<array.length;end++){
                cur=0;
                for(int i=start;i<=end;i++){
                    cur+=array[i];
                }
                if(cur==sum){
                    len=end-start+1;
                    maxLen=Math.max(maxLen,len);
                }
            }
        }
        System.out.println("Max length of subarray with sum "+ sum+ " : "+maxLen);
    }
    public static void better() {
        int[] array={1,2,3,4,5,6};
        int sum=9;
        int cur;
        int len=0;
        int maxLen=0;
        for(int start=0;start<array.length;start++){
            cur=0;
            for(int end=start;end<array.length;end++){
                cur+=array[end];
                if(cur==sum){
                    len=end-start+1;
                    maxLen=Math.max(maxLen,len);
                }
            }
        }
        System.out.println("Max length of subarray with sum "+ sum+ " : "+maxLen);
    }
    public static void optimal() {
        int[] array={1,2,3,4,5,6};
        int sum=9;
        int cur=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLen=0;
        for(int i=0;i<array.length;i++){
            cur+=array[i];
            if(cur==sum){
                maxLen=i+1;
            }
            if(map.containsKey(cur-sum)){
                maxLen=Math.max(maxLen,i-map.get(cur-sum));
            }
            if(!map.containsKey(cur)){
                map.put(cur,i);
            }

        }
        System.out.println("Max length of subarray with sum "+ sum+ " : "+maxLen);
    }

    public static void forOnlyPositive(){
        int[] array={1,2,3,4,5,6};
        int sum=9;
        int cur=0;
        int maxLen=0;
        int lptr=0;
        int rptr=0;
        while(lptr<array.length && rptr<array.length){
            cur+=array[rptr++];
            while(lptr<rptr && cur>sum){
                cur-=array[lptr];
                lptr++;
            }
            if(cur==sum){
                maxLen=Math.max(maxLen,rptr-lptr);
            }
        }
        System.out.println("Max length of subarray with sum "+ sum+ " : "+maxLen);
    }
}
