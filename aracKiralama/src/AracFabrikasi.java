public class AracFabrikasi {
    public static Arac aracOlustur(String marka, String model, String segment, String vitesTipi,
                                   int bagajKapasitesi, String renk, int yas, String yakitTipi,
                                   double gunlukKiralamaBedeli, AracTipi tip) {
        switch (tip) {
            case SEDAN:
                return new Sedan(marka, model, segment, vitesTipi, bagajKapasitesi, renk, yas, yakitTipi, gunlukKiralamaBedeli);
            case HATCHBACK:
                return new Hatchback(marka, model, segment, vitesTipi, bagajKapasitesi, renk, yas, yakitTipi, gunlukKiralamaBedeli);
            case SUV:
                return new Suv(marka, model, segment, vitesTipi, bagajKapasitesi, renk, yas, yakitTipi, gunlukKiralamaBedeli);
            default:
                throw new IllegalArgumentException("Geçersiz araç tipi: " + tip);
        }
    }
}
