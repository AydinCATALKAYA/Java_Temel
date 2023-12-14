import java.util.Scanner;
public class vucutKitle {
    public static void main(String[] args) {
        double boy, kilo, kitleIndeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :") ;
        kilo = input.nextDouble();

        kitleIndeks = kilo /(boy * boy);

        System.out.println("Vücüt kitle indeksiniz : " + kitleIndeks);
    }
}
