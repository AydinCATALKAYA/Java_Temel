import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String [] args){
        double n;
        double result = 0 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz :");
        n = input.nextDouble();

        for(double i=1; i<=n ; i++){
            result += 1/i;
            System.out.println(result);
        }
        System.out.println(result);
    }
}
