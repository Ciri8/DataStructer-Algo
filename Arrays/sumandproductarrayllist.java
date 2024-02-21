public class sumandproductarrayllist {
    public static void main(String[] args) {
        int[] arraynum = {1, 2, 3, 5, 6, 6};
        spofArray(arraynum); // Correctly calling spofArray
    }

    public static void spofArray(int[] arr){
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            product *= arr[i];
        }
        System.out.println("Your sum is: " + sum + " and Your product is: " + product);
    }
}
