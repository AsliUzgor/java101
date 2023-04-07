package Arrays;
import java.util.Arrays;

public class RepeatingNumber {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] list = {1,2,3,5,6,3,4,4,3};
        int[] duplicate = new int[list.length];
        int startIndex = 0 ;
        for(int i = 0 ; i < list.length ; i++){
            //System.out.println(list[i]);
            for(int j = 0 ; j < list.length ; j++){
                if( i != j && list[i] == list[j] && list[i]%2 == 0){
                    if(!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
