
import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        String kullancı_adi;
        String parola;
        
        System.out.println("Kullanıcı Adı: ");
        kullancı_adi = scanner.nextLine();
        System.out.println("Parola : ");
        parola = scanner.nextLine();
        
        if(hesap.getKullanıcı_adı().equals(kullancı_adi) && hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }
    }
}
