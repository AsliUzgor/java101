package Loops;

public class WhileLoops {
    public static void main(String[] args){
        int i = 1 ;

        while(i<=5){
            System.out.println(i + " , ");
            i++;
        }

        int left = 100 , right = 200;

        while(++left < --right );
        System.out.println(left);



    }
}
