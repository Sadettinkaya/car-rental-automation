public class Suv implements  Arac{

    private String marka;
    private String model;
    private String segment;
    private String vitesTipi;
    private int bagajKapasitesi;
    private String renk;
    private int yas;
    private String yakitTipi;
    private double gunlukKiralamaBedeli;

    public Suv(String marka, String model, String segment, String vitesTipi,
               int bagajKapasitesi, String renk, int yas, String yakitTipi,
               double gunlukKiralamaBedeli) {
        this.marka = marka;
        this.model = model;
        this.segment = segment;
        this.vitesTipi = vitesTipi;
        this.bagajKapasitesi = bagajKapasitesi;
        this.renk = renk;
        this.yas = yas;
        this.yakitTipi = yakitTipi;
        this.gunlukKiralamaBedeli = gunlukKiralamaBedeli;
    }

    @Override
    public String getMarka() {
        return marka;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getSegment() {
        return segment;
    }

    @Override
    public String getVitesTipi() {
        return vitesTipi;
    }

    @Override
    public int getBagajKapasitesi() {
        return bagajKapasitesi;
    }

    @Override
    public String getRenk() {
        return renk;
    }

    @Override
    public int getYas() {
        return yas;
    }

    @Override
    public String getYakitTipi() {
        return yakitTipi;
    }

    @Override
    public double getGunlukKiralamaBedeli() {
        return gunlukKiralamaBedeli;
    }

    @Override
    public double aylikKiralamaBedeliHesapla(int sure) {
        return getGunlukKiralamaBedeli() * sure;    }
}
