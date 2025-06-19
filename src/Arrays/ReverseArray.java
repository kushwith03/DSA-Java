package Arrays;

public class ReverseArray {
    public static void reverse() {
        int[] array={1,2,3,4,5};
        int low=0;
        int high=array.length-1;
        int temp;
        while(low<high){
            ArraysUtils.swap(array,low,high);
            low++;
            high--;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
