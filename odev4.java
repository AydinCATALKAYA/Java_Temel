import java.util.Scanner;
public class odev4 {
    static int isAsal(int n, int i){
        if (i == 1){
            return 1;
        }else{
            if(n%i==0){
                return 0;
            }
            else{
                return isAsal(n,i-1);
            }
        }
    }

    public static void main(String [] args) {
        int sayi,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        sonuc = isAsal(sayi,sayi/2);

        if(sonuc==1){
            System.out.println(sayi + " sayısı asal bir sayıdır.");
        }else{
            System.out.println(sayi + " sayısı asal bir sayı değildir.");
        }

    }
}
