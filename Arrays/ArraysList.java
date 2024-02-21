import java.util.ArrayList;
import java.util.Iterator;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(2,30);
        nums.add(40);
        nums.add(50);
        System.out.println(nums);


        if (nums.contains(10)){
            System.out.println("You are 10");
        }
        else{
            System.out.println("No");
        }

        ArrayList<String> string = new ArrayList<>();
        string.add("A");
        string.add("B");
        string.add("C");
        System.out.println(string);
        System.out.println(string.get(0));

        for (int i = 0; i < nums.size(); i++){
           int finalnum = nums.get(i);
            System.out.println(finalnum);

        }
        for (String str : string){
            System.out.println(str);
        }

        //you can use an itterator to traverse as well.
        Iterator<String> iterator = string.iterator();
        while (iterator.hasNext()){
            String letters = iterator.next();
            System.out.println(letters);
        }
        boolean found = false;
        for (int num : nums){
            if (num == 30){
                System.out.println("Element found at index of: " + nums.indexOf(num));
                found = true;
                break;


            }
            }
        if (!found){
            System.out.println("Element was not found");
        }


        //removing
        nums.remove(3);
        System.out.println(nums);
        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(3));



        }
    }


