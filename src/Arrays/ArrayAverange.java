package Arrays;

public class ArrayAverange {
    public static void main(String[] args){

        int[] arr = {1,2,4};
        double sum = 0.0;

        for(int i = 0 ; i< arr.length ; i++){
            sum += 1.0 / arr[i];
        }

        double average = arr.length / sum ;

        System.out.println("Ortalama:" + average);

    }
}
