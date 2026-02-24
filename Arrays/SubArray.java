package Arrays;

public class SubArray {
    public static void printSubArray(){
        int[] array={1,2,3,4,5,6};
        for(int start=0;start<array.length;start++){
            for(int end=start;end<array.length;end++){
                for(int i=start;i<=end;i++){
                    System.out.print(array[i]+" ");
                }
                System.out.println();
            }

        }

    }
}
