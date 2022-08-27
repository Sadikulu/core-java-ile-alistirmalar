package internet_Ornekler;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S08_Cevap {
    public static void main(String[] args) {
        /*
Örnek: Java’daki bir dizideki öğeyi silme
         */
        int[] sayilar={5,3,4,6,9,10,25,12,15,8,7};
        int silinecek=6;
        List<Integer> yeniSayilar=new ArrayList<>();
        for (int i = 0; i < sayilar.length ; i++) {
            yeniSayilar.add(sayilar[i]);
        }
        yeniSayilar.remove(5);
        int[] yeniArr = new int[sayilar.length-1];
        for (int i = 0; i < yeniArr.length ; i++) {
            yeniArr[i]=yeniSayilar.get(i);
        }
        sayilar=yeniArr;
        System.out.println(Arrays.toString(sayilar));
    }
}
