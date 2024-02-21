public class Missingnum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,10};
        int n = 10;
        int sumofn = n*(n+1)/2;
        int sum = 0;
        for (int i =0; i < arr.length; i++){
            sum += arr[i];
        }
        int missingnum = sumofn - sum;
        System.out.println("Your missing number is: " + missingnum);
    }
}