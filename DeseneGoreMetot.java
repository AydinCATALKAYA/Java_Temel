import java.util.Scanner;

public class DeseneGoreMetot {
    public static void  islemyap(int sayi){
        System.out.print(sayi + " ");

        if(sayi<= 0 ){
            return;
        }
        islemyap(sayi-5);

        if(sayi> 0 ){

            System.out.print(sayi + " ");

        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();

        islemyap(n);

    }
}
