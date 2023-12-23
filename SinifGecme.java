import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args){
        int mat, fizik, turkce, kimya, muzik, sum, count;
        count = 0;



        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if (0 > mat || mat > 100){
            mat = 0;
            System.out.println("Matematik Notunuz yanlış girilmiştir. Notunuz : " +mat);
        }
        else {
            count ++;
        }

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        if (0 > fizik || fizik > 100){
            fizik = 0;
            System.out.println("Fizik Notunuz yanlış girilmiştir. Notunuz : " +fizik);
        }
        else {
            count ++;
        }

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        if (0 > turkce || turkce > 100){
            turkce = 0;
            System.out.println("Türkçe Notunuz yanlış girilmiştir. Notunuz : " + turkce);
        }
        else {
            count ++;
        }

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        if (0 > kimya || kimya > 100){
            kimya = 0;
            System.out.println("Kimya Notunuz yanlış girilmiştir. Notunuz : " + kimya);
        }
        else {
            count ++;
        }

        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();
        if (0 > muzik || muzik > 100){
            muzik = 0;

            System.out.println("Müzik Notunuz yanlış girilmiştir. Notunuz : " + muzik);
        }
        else {
            count ++;
        }

        System.out.println("Yanlış girilen ders notlarınız ortalama hesaplamaya dahil edilmemiştir.");


        double avarege;
        avarege = (mat+fizik+turkce+kimya+muzik) / count;
        if (avarege>60){
            System.out.println("Sınıfı geçtiniz.");
        }
        else {
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere!.");
        }
        System.out.println("Ortamalanız : " + avarege);

    }
}
