import java.util.Scanner;

public class AsalSayi {
    public static void main(String [] args){
        int range1, range2;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir aralığı giriniz : ");
        range1 = input.nextInt();

        System.out.print("İkinci aralığı giriniz : ");
        range2 = input.nextInt();

        for (int i = 1 ; i>=range1 && i<= range2 ; i++){
            boolean isPrime = true;
            for(int k=2 ; k<=(i/2); k++){
                if(i%k == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i + " Bir asal sayıdır.");
            }
        }

    }
}
