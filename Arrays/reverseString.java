public class reverseString {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,5,6};
        int i = 0;
        int j = arr.length - 1;
        int temp;
        while (i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k]);
        }
    }
}
