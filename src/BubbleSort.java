import java.util.Scanner;

/**
 * Created by Engineer on 6/4/2017.
 */


public class BubbleSort {
    public static void main(String [] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] theArray=new int [n];
        for (int i=0; i<n; i++){
            theArray[i]=in.nextInt();
        }
        int [] sortedArray=bubblesort(theArray);
        for(int i=0; i<sortedArray.length; i++){
            System.out.print(sortedArray[i]);
        }

    }
    public static int [] bubblesort(int [] array){
        boolean isSorted=false;
        int lastSorted=array.length-1;
        while(!isSorted){
            isSorted=true;
            for (int i=0;i<array.length-1;i++){
                if (array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    isSorted=false;
                }
            }
            lastSorted--;
        }
        return array;
    }
}
