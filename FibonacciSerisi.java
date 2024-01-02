import java.util.Scanner;

public class fibonacciSerisi {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kacıncı değere kadar gidilsin : ");
        int n = input.nextInt();

        int first = 0  , second = 1;
        for(int i = 0; i<n ; i++){
            System.out.print(first + " ");
            int total = first+second;
            first = second;
            second = total;
        }

    }
}
