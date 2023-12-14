import java.util.Scanner;
public class ucgenAlan {
    public static void main(String[] args) {
       
        double kenar1 , kenar2 , kenar3 , alan;
        Scanner input = new Scanner(System.in);

        System.out.print("ilk kenarı giriniz : ");
        kenar1 = input.nextDouble();

        System.out.print(("ikinci kenarı giriniz : "));
        kenar2 = input.nextDouble();

        System.out.print("üçüncü kenarı giriniz : ");
        kenar3 = input.nextDouble();

        double u = (kenar1+kenar2+kenar3) /2;
        double a = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin alanı : " + a + " metre karedir.");

    }
}
