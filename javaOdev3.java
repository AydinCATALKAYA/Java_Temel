import java.util.Scanner;
public class javaOdev3 {
    public static void main(String[] args){
        int n,numbers,max=0,min=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();

        int i = 1;
        while(i<= n){
            System.out.println(i+". Sayıyı giriniz : ");
            numbers  = input.nextInt();

            if (i== 1){
                max = numbers;
                min = numbers;
            }else{
                if (numbers<min){
                    min = numbers;
                } else if (numbers>max){
                    max = numbers;

                }
            }
            i++;
        }
        System.out.println("Girilen en küçük sayı : " + min  );
        System.out.println("Girilen en büyük sayı :"+max);
    }
}
