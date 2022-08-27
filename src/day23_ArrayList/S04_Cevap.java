package day23_ArrayList;

import java.util.Arrays;

public class S04_Cevap {
    public static void main(String[] args) {
        /*
         Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
         kalan elementleri yeni bir array yapin
         */
        String[] arr = {"Ali", "Mehmet", "Veli", "Cem", "Can", "Tarık", "Selim"};
        String istenmeyen = "a";
        int al = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].contains(istenmeyen)) {
                al++;
            }
        }
        String[] yeniArr = new String[al];
        int yeniInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].contains(istenmeyen)) {
                yeniArr[yeniInd] = arr[i];
                yeniInd++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
