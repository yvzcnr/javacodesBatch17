package udemy;

public class ArmstongNumber {

    //armstrong sayı ;sayının tüm basamak değerlerini basamak sayısı ile kuvvetini alıp toplarsak ve bu sayı kendi
    //değerine eşit olursa bu bir armstrong sayıdır.
    //1634=1^4+6^4+3^4+4^4;
    public static void main(String[] args) {
        int sayi=1634;
        int basamakSayisi=4;
        int geciciSayi=sayi;
        int toplam=0;
        do {
            int basamakDegeri = geciciSayi % 10;
            geciciSayi /= 10;
            toplam += Math.pow(basamakDegeri, basamakSayisi);

        }while (geciciSayi>0);
        if (sayi==toplam)
        {
            System.out.println("sayı armstrongdur");}
        else {
            System.out.println("değildir");
        }
    }
        }