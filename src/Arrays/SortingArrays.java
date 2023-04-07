package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz:");
        int i = inp.nextInt();
        int[] arr = new int[i];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int j = 0 ; j < arr.length ; j++){
            System.out.print(j+1 +". Elaman : ");
            arr[j] = inp.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sıralama : " + Arrays.toString(arr) + " ");

    }
}
