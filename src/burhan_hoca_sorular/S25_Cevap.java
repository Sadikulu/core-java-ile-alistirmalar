package burhan_hoca_sorular;

public class S25_Cevap {
    public static void main(String[] args) {
       // Bir banka hesabındaki mevcut miktar, her ay başında ödenen depozito ve yıllık
        // faiz oranları (yüzde olarak) verilmektedir. Faizin her ay işlediğini varsayarak
        // belirtilen ay miktarı sonunda hesapta ne kadar para olacaktır?
       // YILLIK_FAİZ_ORAN’ını 100’e (yüzdeyi desimale dönüştürmek için) ve 12’ye
        // (yıllık oranı aylık orana) bölerek AYLIK_FAİZ_ORAN’ını buluruz.
        // Daha sonra eğer MİKTAR bu ayın başındaki hesabı gösteriyorsa, bir sonraki
        // ayın başındaki miktar aşağıdaki gibi bulunur:
       // MİKTAR ← MİKTAR + DEPOZİTO
       // MİKTAR ← MİKTAR + AYLIK_FAİZ_ORAN * MİKTAR
    }
}
