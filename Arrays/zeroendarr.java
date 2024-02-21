public class zeroendarr {
        public static void main(String[] args) {
            int[] OgArray = {1, 2, 0, 3, 0, 45, 0};
            int zeroindex = 0;
            for (int i = 0; i < OgArray.length; i++){
                if (OgArray[i] != 0){
                    OgArray[zeroindex++] = OgArray[i];
                }
            }
            while (zeroindex < OgArray.length){
                OgArray[zeroindex++] = 0;
            }
            for (int num : OgArray){
                System.out.println(num);
            }
        }
    }


