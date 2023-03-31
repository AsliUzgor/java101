package Arrays;
public class ArrayMaxMin {
    public static void main(String[] args){

        int[] list = {56,34,1,8,101,-2,-33};
        int max = list[0];
        int min = list[0];

        for (int i: list) {
            if(i < min){
                min = i ;
            }
            if(i > max){
                max = i ;
            }
        }
        System.out.println("Max değer : " + max);
        System.out.println("Min değer : " + min);
    }
}
