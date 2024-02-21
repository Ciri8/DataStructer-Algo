import java.sql.SQLOutput;

public class removeevennum {
    //remove even numbers and display them
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 7, 9, 11, 12};
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                count++;
            }
            }
        int[] evennum = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                evennum[index++] = arr[i];
            }
        }
        for (int i = 0; i < evennum.length; i++){
            System.out.println("Even nums are " + evennum[i]);
        }
        }
        }



