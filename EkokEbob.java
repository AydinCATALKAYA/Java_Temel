import java.util.Scanner;

public class EkokEbob {
    public static void main(String[] args){
        int n1,n2;

        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısını giriniz :  ");
        n1 = input.nextInt();
        System.out.print("n2 Sayısını giriniz  : ");
        n2 = input.nextInt();

        int i = 1 ;
        int ebob = 1;
        while (i<= n1){
            if(n1 %i == 0 && n2%i == 0 ){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob : " + ebob);

        while (i<= ( n1*n2)){
            if(i%n1 == 0 && i%n2 == 0 ){
                System.out.println("Ekok : " + i);
                break;
            }
            i++;
        }

    }
}
