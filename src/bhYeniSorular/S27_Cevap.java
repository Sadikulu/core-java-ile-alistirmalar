package bhYeniSorular;

import java.util.Scanner;

public class S27_Cevap {
    public static void main(String[] args) {
        // 27-----
        //    Kullanıcının yazdığı metni, 'hacker'ların konuşma
        //    diline çevirip return eden bir method
        //    (method ismi hackerDili) yazınız.

        //    Hackerlar bazı harfleri sayılara çevirerek
        //    yazışabiliyorlar. Genellikle çevirdikleri
        //    harfler şu şekilde:
        //    s -> 5
        //    a -> 4
        //    e -> 3
        //    i -> 1
        //    o -> 0

        //    Test data
        //    hackerDili("javayı severim")
        //    j4v4yı 53v3r1m

        //    İpucu harfleri değiştirin ve ekrana yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String metin=scan.nextLine();
        String hackerDili=degiştir(metin);
        System.out.println("girilen metnin hacker dili karşılığı : "+hackerDili);

    }

    public static String degiştir(String metin) {

        metin=metin.replace('s','5').replace('a','4').
                replace('e','3').replace('i','1').replace('o','0');
        return metin;
    }
}
