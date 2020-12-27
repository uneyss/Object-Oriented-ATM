public class Main {
    public static void main(String[] args) {
   // Object Oriented(Nesne Yönelimli) ATM Projesi
   // Login Class'ı Hesap İşlemlerini Yaparak.
   // Hesap Class'ı Hesap İşlemlerini Yaparak.
   // ATM ise atmmizi çalıştıracak.
   
   ATM atm = new ATM();
   
   Hesap hesap = new Hesap("Uneys","12345",2000);
   atm.calis(hesap);
   System.out.println("Programdan Çıkılıyor...");
}
}
