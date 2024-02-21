public class Minnum {
    public static void main(String[] args){
        int[] arr = {10,23, 3838, 2, 383,7, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
    System.out.println("Your max number is " + max);
        System.out.print("Your min number is " + min);
    }
}
