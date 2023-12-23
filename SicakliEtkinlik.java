import java.util.Scanner;
public class SicakliEtkinlik {
    public static void main(String[] args) {
        int heat ;
        Scanner input = new Scanner(System.in);

        System.out.print("Mevcut hava sıcaklığını giriniz : ");
        heat = input.nextInt();

        if (5 >= heat){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (5 < heat &&  heat<= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (15< heat && heat<=25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else if (heat>25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
