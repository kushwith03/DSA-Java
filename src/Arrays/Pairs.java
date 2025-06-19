package Arrays;

public class Pairs {
    public static void printPairs() {
        int[] array={1,2,3,4,5,6};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+array[i]+","+array[j]+") ");
            }
            System.out.println();
        }
    }
}
