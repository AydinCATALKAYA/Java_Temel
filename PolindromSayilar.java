import java.util.Scanner;

public class PolindromSayilar {
    static boolean isPolindrom(int number){

        int temp = number, reverseNumber = 0, lastNumber;

        while (temp !=0 ){
            lastNumber = temp%10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp/= 10;

        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz : ");
        int n = input.nextInt();
        System.out.println(isPolindrom(n));

    }

}
