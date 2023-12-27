import java.util.Scanner;

public class Elmas {
    public static void main(String [] args){
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for(int i = 1 ; i <= n ; i++ ){
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1 ; i >= 0 ; i--){
            for(int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for (int j = 0; j<(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
