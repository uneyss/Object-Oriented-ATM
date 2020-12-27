public class Hesap {
    private String kullanıcı_adı;
    private String parola;
    private int bakiye;

    public Hesap(String kullanıcı_adı, String parola, int bakiye) {
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatır(int tutar){
        bakiye += tutar;
        System.out.println("Yeni Bakiyeniz: " + bakiye);
    }
    public void paraCek(int tutar){
        if((bakiye - tutar) < 0 ){
            System.out.println("Yeterli bakiyeniz yok...");
        }
        else{
            bakiye -=tutar;
            System.out.println("Yeni Bakiyeniz : " + bakiye);
        }
        
    }
}
