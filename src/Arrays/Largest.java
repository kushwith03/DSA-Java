package Arrays;
public class Largest {
    public static void findLargest() {
        int[] array={1,2,3,4,5,6};
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Largest in array : "+max);
    }

}
