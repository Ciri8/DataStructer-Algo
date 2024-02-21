import java.util.Arrays;
public class twodArray {
    public static void main(String[] args) {
    twodArray sda = new twodArray(3,3);
    sda.InsertArray(0,0,10);
    sda.InsertArray(0,1,20);
    sda.InsertArray(0,2,30);
    sda.InsertArray(1,0,100);
    sda.InsertArray(1,1,200);
    sda.InsertArray(1,2,300);
    sda.InsertArray(2,0,1000);

        System.out.println(Arrays.deepToString(sda.arr));
        sda.AccessCell(0,1);
        sda.Traverse2dArray();
        sda.SearchingArray(30);
        sda.DeletefromArray(0,0);
        sda.Traverse2dArray();

    }
    int[][] arr = null;
    public twodArray(int NumberOfRows, int NumberOfColumns){
        this.arr = new int[NumberOfRows][NumberOfColumns];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void InsertArray(int row, int col, int value){
        try{
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("Value Succesfully inserted");
            }else {
                System.out.println("Cell already occupied");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }

    }

    public void AccessCell(int row, int col){
        System.out.println("Your row# is: " + row + ", and your Col# is " + col);
        try{
            System.out.println("Cell values are: " + arr[row][col]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");

        }
    }

    public void Traverse2dArray(){
        for (int rows = 0; rows < arr.length; rows++){
            for(int col = 0; col < arr[0].length; col++){
                System.out.println(arr[rows][col]);
            }

        }
    }

    public void SearchingArray(int value){
        for (int rows = 0; rows < arr.length; rows++){
            for (int col = 0; col < arr[0].length; col++){
                if (arr[rows][col] == value){
                    System.out.println("Value has been found at row: " + rows + " and col: " + col );
                    return;
                }
            }
        }
        System.out.println("Value has not been found");
        }

        public void DeletefromArray(int row, int col){
        try{
            System.out.println("Succecfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This index is not valid for array");

        }

        }
    }


