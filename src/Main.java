import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayıyı girin: ");
        int sayi=scanner.nextInt();
        System.out.println("Basamak Sayısı:");
        int basamakSayisi=scanner.nextInt();
        int geciciSayi=sayi;
        int toplam=0;
        do {
            int basamakDegeri=geciciSayi%10;
            geciciSayi=geciciSayi/10;
            toplam+=Math.pow(basamakDegeri,basamakSayisi);

        }
        while (geciciSayi>0);
        if (sayi==toplam){
            System.out.println("Bu Sayı Amstrong sayısıdır.");
        }
        else {
            System.out.println("Bu Sayı bir Amstarong sayısı değildir.");
        }
    }

}
