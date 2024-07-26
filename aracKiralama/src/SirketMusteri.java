public class SirketMusteri implements Musteri {
    private String ad;
    private String tel;
    private String vergiNumarasi;
    public SirketMusteri(String ad, String tel, String vergiNumarasi) {
        this.ad = ad;
        this.tel = tel;
        this.vergiNumarasi = vergiNumarasi;
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
        return vergiNumarasi;
    }
}
