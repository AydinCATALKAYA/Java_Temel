import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args){
        int n ;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n = input.nextInt();

        for(int i=1; i<= n; i*=4) {
            System.out.println("4 ' ün " +count +  ". katı : " + i);
            count ++;
        }
        count = 0;
        for (int j= 1 ; j <= n ; j*=5){
            System.out.println("5 ' in " + count + ". katı : " + j);
            count ++;
        }


    }
}
