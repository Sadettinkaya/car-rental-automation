public class BireyselMusteri implements Musteri{
    private String ad;
    private String tel;
    private String tcKimlikNumarasi;

    public BireyselMusteri(String ad,String tel,String tcKimlikNumarasi){
        this.ad=ad;
        this.tel=tel;
        this.tcKimlikNumarasi = tcKimlikNumarasi;
    }
    @Override
    public String getAdi() {
        return ad;
    }

    @Override
    public String getTel() {
        return tel;
    }

    @Override
    public String getKimlikBilgsi() {
        return tcKimlikNumarasi;
    }
}
