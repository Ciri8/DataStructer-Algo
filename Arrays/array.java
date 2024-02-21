import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        int[] arrays = new int[3];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;

        char[] characters = new char[3];
        characters[0] = 'a';
        characters[1] = 'b';
        characters[2] = 'c';

        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.toString(characters));
        for (int num : arrays){
            System.out.println(num);
        }
        for (char letters : characters){
            System.out.println(letters);
        }
        System.out.println(Arrays.stream(arrays).min().getAsInt());

            int value = 2;
            try {
                for (int i = 0; i < arrays.length; i++){
                    if(arrays[i] == value){
                        System.out.println(arrays[i] + " ");
                        break;

                    }
                    else {
                        System.out.println("Try a different index");
                    }
            }

            }catch (Exception e){
                System.out.println("Your value is not found");
            }



    }

}
