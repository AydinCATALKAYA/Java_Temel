import java.util.Scanner;
public class ortamalaBolum {
    public static void main(String[] args){
        int sayi , dongu = 0, toplam = 0, sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        for (int i=1; i<= sayi; i++){
            if (i%3 == 0 && i%4== 0){
                toplam += i;
                dongu ++;
            }
        }
        sonuc = toplam/dongu;

        System.out.println("3 ve 4 e bölünen sayıların toplamının ortalaması : " + sonuc);

    }
}
