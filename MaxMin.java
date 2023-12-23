import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        a = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz : ");
        c = input.nextInt();

        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("a<b<c");
            }
            else {
                System.out.println("a<c<b");
            }
        } else if ((b<a) && (b<c)) {
            if(a<c){
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }

        } else  {
            if(b<a){
                System.out.println("c<b<a");
            } else {
                System.out.println("c<a<b");
            }
        }
    }
}
