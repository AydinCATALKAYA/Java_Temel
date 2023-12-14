import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        int km;
        double preKm = 2.20 ,total = 10.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz :");
        km = input.nextInt();

        total += (km * preKm);
        double min = total < 20 ? 20 : total;

        System.out.println("Toplam ödenecek tutar : " +min);
    }
}
