public class KiralamaHesaplayici {
    public static double kiralamaBedeliHesapla(Kiralama kiralama) {
        Arac arac = kiralama.getArac();
        int sure = kiralama.getSure();
        return arac.aylikKiralamaBedeliHesapla(sure);
    }
}
