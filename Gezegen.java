/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fo;

/**
 *
 * @author HP
 */
public class Gezegen extends Cisim {

    private String ad;
    private Kaynaklar[] kaynakMiktarı;
    private String atmosferTipi;
    private int yerÇekimi;

    public Gezegen(String ad, Kaynaklar[] kaynakMiktarı, String atmosferTipi, int yerÇekimi, int xKonum, int yKonum) {
        super(xKonum, yKonum);
        this.ad = ad;
        this.kaynakMiktarı = kaynakMiktarı;
        
        this.atmosferTipi = atmosferTipi;
        this.yerÇekimi = yerÇekimi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Kaynaklar[] getKaynakMiktarı() {
        return kaynakMiktarı;
    }

    public void gKalanMETAL(int gezegendeKalanMiktar){
        this.kaynakMiktarı[0].setMiktar(gezegendeKalanMiktar);
      
    }
    public void gKalanENERJI(int gezegendeKalanMiktar){
        
        this.kaynakMiktarı[1].setMiktar(gezegendeKalanMiktar);
    }
    public void setKaynakMiktarı(Kaynaklar[] kaynakMiktarı) {
        this.kaynakMiktarı = kaynakMiktarı;
    }

    public String getAtmosferTipi() {
        return atmosferTipi;
    }

    public void setAtmosferTipi(String atmosferTipi) {
        this.atmosferTipi = atmosferTipi;
    }

    public int getYerÇekimi() {
        return yerÇekimi;
    }

    public void setYerÇekimi(int yerÇekimi) {
        this.yerÇekimi = yerÇekimi;
    }
    
    
    

    
    
    public void kaynaklariGoster() {
        for (int i = 0; i < kaynakMiktarı.length; i++) {
            System.out.println("Kaynak Tipi: " + kaynakMiktarı[i].getTip() + " Miktar: " + kaynakMiktarı[i].getMiktar());
        }
    }

    
    
    public int inisMaaliyetiHesapla() {
        int a = yerÇekimi * 2;

        return a;
    }

}