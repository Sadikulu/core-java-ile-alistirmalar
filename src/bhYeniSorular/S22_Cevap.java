package bhYeniSorular;

public class S22_Cevap {
    public static void main(String[] args) {
        // 22----
        //    Bir String değişkeni cümlesi verildiğinde,
        //    her sözcüğü almak için kod yazın ve tersine
        //    ters çevrilmiş String'e atayın.

        //    Test Data:
        //    sentence -> "Java is fun"
        //    reversed -> "fun is Java"
        String cumle="Java is fun";
        String tersCumle="";
        int bosluk=cumle.indexOf(" ");
        int sonBosluk=cumle.lastIndexOf(" ");
        tersCumle+=cumle.substring(sonBosluk,cumle.length())
                +cumle.substring(bosluk,sonBosluk)
                +" "+cumle.substring(0,bosluk);
        System.out.println("tersCumle =" + tersCumle);

    }
}
