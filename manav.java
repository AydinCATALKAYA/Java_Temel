import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double armutKilo, elmaKilo , domatesKilo , muzKilo , patlicanKilo;
        double armutFiyat = 2.14 , elmaFiyat = 3.67 , domatesFiyat = 1.11 , muzFiyat = 0.95, patlicanFiyat = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut almak istiyorsunuz : ");
        armutKilo = input.nextDouble();

        System.out.print("Kaç kilo elma almak istiyorsunuz : ");
        elmaKilo = input.nextDouble();

        System.out.print("Kaç kilo domates almak istiyorsunuz : ");
        domatesKilo = input.nextDouble();

        System.out.print("Kaç kilo muz almak istiyorsunuz : ");
        muzKilo = input.nextDouble();

        System.out.print("Kaç kilo patlıcan almak istiyorsunuz : ");
        patlicanKilo = input.nextDouble();

        double toplamFiyat = (armutFiyat*armutKilo) + (elmaFiyat*elmaKilo) + (domatesFiyat*domatesKilo)
                + (muzFiyat*muzKilo) + (patlicanFiyat*patlicanKilo);

        System.out.println("Toplam fiyat : " + toplamFiyat);
    }
}
