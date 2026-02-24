package Arrays;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static void bruteForce() {
        int[] nums={1,4,2,6,8};
        int target=8;
        int[] ans={-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    System.out.println("Index are "+ans[0]+" and "+ans[1]);
                    return;
                }
            }
        }
        System.out.println("Index not found");
    }
    public static void better() {
        int[] nums={1,4,2,6,8};
        int target=8;
        int[] ans={-1,-1};
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<nums.length;i++){
             if(map.containsKey(target-nums[i])){
                 ans[0]=map.get(target-nums[i]);
                 ans[1]=i;
                 System.out.println("Index are "+ans[0]+" and "+ans[1]);
                 return;
             }
             map.put(nums[i],i);
         }
        System.out.println("Index not found");
    }
    public static void optimal() {
        //no duplicates
        int[] nums={1,4,2,6,8};
        int target=8;
        int[] ans={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        int lptr=0;
        int rptr=nums.length-1;
        while(lptr<rptr){
            if(nums[lptr]+nums[rptr]==target){
                ans[0]=map.get(nums[lptr]);
                ans[1]=map.get(nums[rptr]);
                System.out.println("Index are "+ans[0]+" and "+ans[1]);
                return;
            }else if(nums[lptr]+nums[rptr]<target){
                lptr++;
            }else{
                rptr--;
            }
        }
        System.out.println("Index not found");
    }

}
