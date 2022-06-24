package alistirma;

import java.util.Scanner;

public class A09_Cevap {
    public static void main(String[] args) {
        //Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir ay numarası giriniz");
        int ay = scan.nextInt();
        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiğiniz ay 31 gündür");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiğiniz ay 30 gündür");
                break;
            case 2:
                System.out.println("lütfen yıl giriniz");
                int yil=scan.nextInt();
                if (yil%4==0){
                    System.out.println("girdiğiniz ay 29 gündür");
            }else{
                    System.out.println("girdiğiniz ay 28 gündür");
                }
                break;
            default:
                System.out.println("geçerli bir ay giriniz");
        }
    }
}
