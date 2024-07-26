public class Kiralama {

    private int sure; // gün sayısı
    private Arac arac;
    private Musteri musteri;

    public Kiralama(int sure, Arac arac, Musteri musteri) {
        this.sure = sure;
        this.arac = arac;
        this.musteri = musteri;
    }

    public int getSure() {
        return sure;
    }

    public Arac getArac() {
        return arac;
    }

    public Musteri getMusteri() {
        return musteri;
    }
}
