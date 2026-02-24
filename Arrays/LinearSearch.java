package Arrays;
public class LinearSearch {
    public static void search() {
        int[] array={1,2,3,4,5,6};
        int key=5;
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.println("Found key at index "+i);
                return;
            }
        }
        System.out.println("Key not found");
    }
}
