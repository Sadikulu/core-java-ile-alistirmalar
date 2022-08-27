package alistirma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A18_Cevap {
    public static void main(String[] args) {
        /*
        Java'da ArrayList'ten tekrarlanan öğeleri
        kaldırmak için Java Programı yazınız.
        input : [2, 2, 3, 5, 7, 7, 11]
        list of primes without duplicates : [2, 3, 5, 7, 11]
         */
        int arr[]={2,2,3,5,7,7,11};
        List<Integer> list1=new ArrayList<>();
        for (int each:arr) {
            list1.add(each);
        }
        System.out.println("list1 : " + list1);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size() ; i++) {
            if (!list.contains(list1.get(i))) {
                list.add(list1.get(i));
            }
        }
        System.out.println("list : "+list);
        Arrays.stream(arr).distinct().forEach(t->System.out.print(t+" "));
    }
}
