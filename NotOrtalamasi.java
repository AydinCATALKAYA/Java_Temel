import java.util.Scanner;
public class NotOrtalamasi {
        public static void main (String[] args) {
            // Değişkenleri oluştur.
            int mat, fizik,kimya,turkce,tarih,muzik;
            // Scanner sınıfımızı tanımladık
            Scanner inp =  new Scanner(System.in);

            System.out.print("Matematik Notunuz :  ");
            mat = inp.nextInt();
            System.out.println(mat);

            System.out.print("Fizik notunuz :  ");
            fizik = inp.nextInt();
            System.out.println(fizik);

            System.out.print("Kimya Notunuz : ");
            kimya = inp.nextInt();
            System.out.println(kimya);

            System.out.print("türkce notunuz : ");
            turkce = inp.nextInt();
            System.out.println(turkce);

            System.out.print("tarih notunuz : ");
            tarih = inp.nextInt();
            System.out.println(tarih);

            System.out.print("müzik notunuz : ");
            muzik = inp.nextInt();
            System.out.println(muzik);

            int toplam = (mat + fizik + kimya + turkce + tarih + muzik) ;
            double sonuc = toplam / 6 ;
            String gecti = (sonuc >= 60) ? "Sınıfı geçtiniz." : "Sınıfı geçemediniz.";

            System.out.println(gecti + sonuc);


        }
    }


