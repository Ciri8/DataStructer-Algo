public class pairsofgivenarray {
    public static void main(String[] args) {
        //create function which prints to the console the pairs from gibven array.
        // 11 12 13 14 15, 21 22 23 24 25, ect...
        int[] array = {1,3,4,5};
        pairs(array);

    }

    public static void pairs(int[] arr){
        for (int i =0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.println(arr[i] +", " + arr[j]);
            }
        }

    }

}
