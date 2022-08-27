package day10_Stringmanu;

public class S03_Cevap {
    public static void main(String[] args) {
        // Soru 1) String methodlarini kullanarak
        // " Java ogrenmek123 Cok guzel@ " String'ini
        // "Java ogrenmek cok guzel." sekline getirin.

        String str=" Java ogrenmek123 Cok guzel@ ";
        str=str.trim();
        str=str.replace("@",".");
        str=str.replaceAll("\\d","");
        str=str.replace("C","c");
        System.out.println(str);
    }
}
