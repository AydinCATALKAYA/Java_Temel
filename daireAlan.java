import java.util.Scanner;
public class daireAlan {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double a;

        System.out.print("Daire yarıçapını giriniz : ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.print("alanı bulunması istenilen açı değerini yazın : ");
        a = input.nextDouble();

        double alan = ((r * r) * pi * a) / 360;

        System.out.println("Dairenin verilen a açısı içindeki alanı : " + alan);
    }
}
