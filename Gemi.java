/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fo;

/**
 *
 * @author HP
 */
public class Gemi extends Cisim{
    private int yakıtMiktarı;//Enerji depolayıp gezegenler arası gidişte harcanır.
    private int malzemeMiktari;//metal depolar ve araç geliştirmede kullnılır
    private int kapasite;

    public Gemi(int yakıtMiktarı, int malzemeMiktari, int kapasite, int xKonum, int yKonum) {
        super(xKonum, yKonum);
        this.yakıtMiktarı = yakıtMiktarı;
        this.malzemeMiktari = malzemeMiktari;
        this.kapasite = kapasite;
    }
    

    public int getYakıtMiktarı() {
        return yakıtMiktarı;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }
    
    

    public void setYakıtMiktarı(int yakıtMiktarı) {
        this.yakıtMiktarı = yakıtMiktarı;
    }

    public int getMalzemeMiktari() {
        return malzemeMiktari;
    }

    public void setMalzemeMiktari(int malzemeMiktari) {
        this.malzemeMiktari = malzemeMiktari;
    }
    
   public void yakitKaybet(Gezegen gezegen){
       
       if((yakıtMiktarı-gezegen.getYerÇekimi())<0){
           yakıtMiktarı=0;
       }else{
       yakıtMiktarı-=gezegen.getYerÇekimi();
       }
   }
   
   public void yakitKaybet(int miktar){
       
       if((yakıtMiktarı-miktar)<0){
           yakıtMiktarı=0;
       }else{
       yakıtMiktarı-=miktar;
       }
   }
   public void malzemeKaybet(int miktar){
       if((malzemeMiktari-miktar)<0){
           malzemeMiktari=0;
       }else{
       malzemeMiktari-=miktar;
       }
   }
   public void kaynakTopla(Kaynaklar[] kaynaklar,int gezegendeKalanMiktar){
        //gezegendeki metali depoya malzemek olarak alır
            malzemeMiktari += kaynaklar[0].getMiktar();
            if(malzemeMiktari>kapasite){
                gezegendeKalanMiktar=malzemeMiktari-kapasite;
                malzemeMiktari=kapasite;
                
            }
        
   }
   public void yakitYenile(Kaynaklar[] kaynaklar,int gezegendeKalanMiktar){
        //gezegendeki enerjiyi direk yakıt deposuna yakıt olarak alır
            yakıtMiktarı += kaynaklar[1].getMiktar();
            if(yakıtMiktarı>100){
                gezegendeKalanMiktar=yakıtMiktarı-kapasite;
               
                yakıtMiktarı=100;
                
            
        }
            
   }
   public void gemiGelistir(){
       if(malzemeMiktari>=10){
                malzemeMiktari-=10;
                kapasite+=5;
       }else
        System.out.println("Yetersiz Metal");
            }
   
   
   public void gezegeneGit(int x,int y){
       this.setxKonum(x);
       this.setyKonum(y);
       
   }
}