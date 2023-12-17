import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName, password,reply,newpassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        }else {
            System.out.println("Bilgileriniz yanlış !");
            System.out.print("Şifrenizi Sıfırkamak ister misiniz ? E/H ");
            reply = input.nextLine();
            if(reply.equals("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newpassword = input.nextLine();
                if(newpassword.equals("java123")){
                    System.out.print("Yeni şifre eski şifre ile aynı olamaz.");
                }else{
                    System.out.print("Şifreniz başarı ile değiştirildi. Yeniden giriş yapabilirsiniz.");
                }
            }else{
                System.out.print("Lütfen bilgilerinizi kontrol edip tekrar giriş yapınız.");
            }
        }

    }
}
