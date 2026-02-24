package Arrays;

public class SecondLargest {
    public static void secLarge() {
        int[] array={1,2,4,7,5};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                smax=max;
                max=array[i];
            }else if(array[i]>smax && array[i]<max){
                smax=array[i];
            }
        }
        System.out.println("Second largest : "+smax);
    }
}
