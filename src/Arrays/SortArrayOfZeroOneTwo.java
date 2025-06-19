package Arrays;

public class SortArrayOfZeroOneTwo {
    public static void bruteForce() {
        int[] nums={2,0,1,0,2,2,1,0,1};
        int[] map=new int[3];
        for(int i=0;i<nums.length;i++){
            map[nums[i]]++;
        }
        int i=0;
        int k=0;
        while(k<3){
            while(map[k]!=0){
                nums[i++]=k;
                map[k]--;
            }
            k++;
        }
        ArraysUtils.printArray(nums);
    }
    public static void optimal() {
        //Dutch National Flag
        int[] nums={2,0,1,0,2,2,1,0,1};
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                ArraysUtils.swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                ArraysUtils.swap(nums,mid,high);
                high--;
            }
        }
        ArraysUtils.printArray(nums);
    }
}
