import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a , int b ) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }
    static  int minus(int a , int b){
        int result = a -b;
        System.out.println("Çıkartma : " + result);
        return result;
    }

    static int times(int a , int b ){
        int result = a*b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a , int b){
        if(b == 0){
            return 0;
        }
        int result = a/b;
        System.out.println("Bölüm : " + result);
        return result;
    }

    static int power(int a , int b ){
        int result = 1;
        for(int i = 1; i<= b; i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a , int b ){
        return a%b;
    }

    static void calc(int a , int b ){
        System.out.println("Çevresi : " + (2*(a+b)));
        System.out.println("Alanı : " + (a*b));
    }

    static int factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = input.nextInt();
        int result = 1 ;

        for(int i= 1; i<=n ; i++){
            result *= i;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1 - Toplama işlemi\n"
                +"2- Çıkartma işlemi\n"
                +"3- Çarpma işlemi\n"
                +"4- Bölme işlemi\n"
                +"5- Üslü sayı hesaplama\n"
                +"6- Mod alma\n"
                +"7- Dikdörtgen Alan ve çevre hesabı\n"
                +"8- Faktoriyel Hesaplama\n"
                +"0- Çıkış yap";
        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seçiniz : ");
            select = input.nextInt();

            if(select == 0 ){
                break;
            }

            System.out.print("İlk sayıyı giriniz : ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2 :
                    minus(a,b);
                    break;
                case 3 :
                    times(a,b);
                    break;
                case 4 :
                    if(divided(a,b) == 0 ){
                        System.out.println("İkinci sayı sıfırdan farklı olmalı");
                    }
                    break;
                case 5 :
                    System.out.println("Üst hesabı : " + power(a,b));
                    break;
                case 6 :
                    System.out.println("Mod işlemi : " + mod(a,b));
                    break;
                case 7 :
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
                case 8 :
                    factorial();
                    break;
            }
        }
        System.out.println("Güle Güle!");
    }
}
