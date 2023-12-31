import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String[] args){

        int n1,total = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n1 = input.nextInt();

        for (int i = 1; i<n1; i++){
            if (n1%i == 0){
                total += i;
            }
        }

        if (total == n1){
            System.out.println(n1 +" Mükemmel bir sayıdır.");
        }else {
            System.out.println(n1 + " Mükemmel sayı değildir.");
        }
    }
}
