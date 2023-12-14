import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar,kdvOrani;

        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplanacak tutarı giriniz : ");

        tutar = input.nextDouble();
        kdvOrani = tutar < 1000 ? 0.18 : 0.8;
        double kdvTutar = tutar * kdvOrani;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("Girilen tutar : " + tutar);
        System.out.println("Kdv Oranı : " + kdvOrani);
        System.out.println("Kdv turatı : "+ kdvTutar);
        System.out.println("Kdv' li tutar : " + kdvliTutar);
