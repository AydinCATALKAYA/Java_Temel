import java.util.Scanner;
public class KombinasyonHesapla {
    public static void main(String[] args){
        int n1,n2, result;
        int total1 = 1;
        int total2 = 1;
        int total3 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1= input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        for(int i = 1 ; i<=n1 ; i++){
            total1 *= i;
        }
        for(int j = 1 ; j<=n2 ; j++){
            total2 *= j;
        }
        for (int k = 1 ; k<=(n1-n2); k++){
            total3 *= k;
        }
        result = total1 / (total2*total3);
        System.out.println(n1 + "'in " + n2 + "'li kombinasyonu : " + result);
    }
}
