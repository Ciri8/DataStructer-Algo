import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class reversearray {
    public static void main(String[] args) {
        int[] array2 = {1,2,3,4,5,6,7,8};
        Integer[] array = {1,3,4,5};
        Integer[] reversearr = reverse(array);
        System.out.println(Arrays.toString(reversearr));
        reverse2(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static Integer[] reverse(Integer[] arr){
        List<Integer> list = Arrays.asList(arr);

        Collections.reverse(list);

        return list.toArray(new Integer[0]);

    }

    public static void reverse2 (int[] arrays){
        int start = 0;
        int end = arrays.length - 1;
        int temp;

        while (start < end){
            temp = arrays[start];
            arrays[start] = arrays[end];
            arrays[end] = temp;

            start++;
            end--;
        }
    }
}
