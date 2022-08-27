package day23_ArrayList;

import java.util.Arrays;

public class S01_Cevap {
    public static void main(String[] args) {
        /*
         Soru 1) Verilen bir array'deki tekrar eden elementleri yazdirin.
         */
        int[] arr = {1, 2, 3, 5, 6, 4, 2, 6, 8, 9, 1, 6, 4, 5, 10, 11, 10};
        String tekrar="";
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]) {
                    if (!tekrar.contains(""+arr[i])){
                        tekrar+=arr[i]+" ";
                    }
                }
            }
        }
        System.out.println(tekrar);

    }
}
