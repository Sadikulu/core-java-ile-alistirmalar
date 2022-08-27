package bhYeniSorular;

public class S18_Cevap {
    public static void main(String[] args) {
        //18----
        //    Girilen Stringdeki  tüm sesli harfleri saymak
        //    için bir Java Methodu yazınız.

        //    Test Data:
        //    java is fun
        //    Beklenen Çıktı:
        //    Stringdeki sesli harf sayısı: 4
        String sesliHarfler="aeiou";
        String cumle="java is fun";
        int toplam=0;
        for (int i = 0; i <sesliHarfler.length() ; i++) {
            for (int j = 0; j <cumle.length() ; j++) {
                if (sesliHarfler.charAt(i)==cumle.charAt(j)){
                    toplam++;
                }

            }

        }
        System.out.println("Stringdeki sesli harf sayısı: "+toplam);
    }
}
