//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Bireysel müşteri oluşturma
        BireyselMusteri bireyselMusteri = new BireyselMusteri("Ahmet Yılmaz", "05555555555", "12345678901");

        // Şirket müşteri oluşturma
        SirketMusteri sirketMusteri = new SirketMusteri("XYZ Ltd.", "02123456789", "9876543210");

        // Araç oluşturma
        Arac sedan = AracFabrikasi.aracOlustur("Toyota", "Camry", "C", "Otomatik", 500, "Beyaz", 2, "Benzin", 800, AracTipi.SEDAN);
        Arac hatchback = AracFabrikasi.aracOlustur("Volkswagen", "Golf", "B", "Manuel", 300, "Kırmızı", 1, "Dizel", 600, AracTipi.HATCHBACK);
        Arac suv = AracFabrikasi.aracOlustur("BMW", "X5", "C", "Otomatik", 700, "Siyah", 3, "Benzin", 1200, AracTipi.SUV);

        // Kiralama işlemleri
        Kiralama kiralama1 = new Kiralama(10, sedan, bireyselMusteri);
        Kiralama kiralama2 = new Kiralama(35, hatchback, bireyselMusteri);
        Kiralama kiralama3 = new Kiralama(5, suv, sirketMusteri);

        // Fiyat hesaplamaları
        double fiyat1 = KiralamaHesaplayici.kiralamaBedeliHesapla(kiralama1);
        double fiyat2 = KiralamaHesaplayici.kiralamaBedeliHesapla(kiralama2);
        double fiyat3 = KiralamaHesaplayici.kiralamaBedeliHesapla(kiralama3);

        // Sonuçları yazdırma
        System.out.println("Kiralama 1 Fiyatı: " + fiyat1);
        System.out.println("Kiralama 2 Fiyatı: " + fiyat2);
        System.out.println("Kiralama 3 Fiyatı: " + fiyat3);
    }
}