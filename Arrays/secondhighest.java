import java.util.Arrays;

public class secondhighest {
    public static void main(String[] args){
        int[] arr = {100,3,2,33,5,6,3,36,3};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Your max num is " + max);
    }
}
