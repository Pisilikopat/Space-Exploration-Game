/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fo;

/**
 *
 * @author HP
 */
public class Galaksi {

    private Cisim[][] gezegenListesi;

    public Galaksi(Cisim[][] gezegenListesi) {
        this.gezegenListesi = gezegenListesi;
    }

    public Cisim[][] getGezegenListesi() {
        return gezegenListesi;
    }

    public void setGezegenListesi(Cisim[][] gezegenListesi) {
        this.gezegenListesi = gezegenListesi;
    }
    

    public void galaksiyiGoster() {
        galaksiUret();
        Gezegen gezegen;
        for (int i = 0; i < gezegenListesi.length; i++) {
            for (int j = 0; j < gezegenListesi[i].length; j++) {
                if (gezegenListesi[i][j] instanceof Gezegen) {
                     gezegen = (Gezegen)gezegenListesi[i][j];
                    System.out.print("["+gezegen.getAd().charAt(0)+"]");
                    //gezegen ise gezegene cast etmek ve 
                } else {
                    System.out.print("[K]");
                }
                
            }
            System.out.println("");

        }
    }
public void GezegeneGit(int konum[]){

             
      Gezegen gezegen = (Gezegen)gezegenListesi[konum[0]][konum[1]];
    while(true){
         
    if(gezegen!=null){
        System.out.println("Bulundugunuz gezegen: "+gezegen.getAd()+"\n Atmosfer Durumu: "+gezegen.getAtmosferTipi());
        
       break;
    }
    else{
        konum[0]=(int)(Math.random()*5);
        konum[1]=(int)(Math.random()*5);
        System.out.println("Karadelik sizi IsInladI.");
        gezegen = (Gezegen)gezegenListesi[konum[0]][konum[1]];
        
            
        
    }
        
    }
}
    public void galaksiUret() {
        String isim1 = "Yaşanabilir Gezegen";
        String isim2 = "Gaz Devi";
        String isim3 = "Buzul Gezegen";
        String isim4 = "Col Gezegeni";
        String isim5 = "Metalik Gezegen";
        String isim6 = "Volkanik Gezegen";
        // gezegenlerin isimleri

        for (int i = 0; i < gezegenListesi.length; i++) {
            for (int j = 0; j < gezegenListesi[i].length; j++) {
                int a = (int) (Math.random() * 5);
                int b = (int) (Math.random() * 6+3);
                int c = (int) (Math.random() * 6+3);
                //sonradan kullanabilmek için yazılmış ve her döngüde farklı değer döndüren 3 rastgele 0-6 arası sayı
                
               
                Kaynaklar metal = new Kaynaklar("Metal", 0);
                Kaynaklar enerji = new Kaynaklar("Enerji", 0);
                //başta 3 adet kaynak objesi oluşturdum
                

                
                //her döngüde gezegeni galaksideki yerine yerleştiren kod

                int gezegenBelirleme = (int) (Math.random() * 7);
                
                switch (gezegenBelirleme) {
                    case 0: {
                        
                        
                        metal.setMiktar(b);
                        enerji.setMiktar((int)(c*1.5));
                     //gezegenin türüne göre daha fazla veya az olan özelliği 
                        
                    Kaynaklar[] kaynaklar = {metal,enerji};
                    Cisim gezegen = new Gezegen(isim1, kaynaklar , "Yasanabilir", a+5, i, j);
                    
                    //case e göre isimlendirip değerlerle yeni bir gezegen oluşturuyorum
                    gezegenListesi[i][j]= gezegen;
                    //gezegene cast edilen Cisim objesini matrix'e atıyorum
                    //diğer caselerde bunun aynısı sadece farklı bir tür gezegen için
              
                        break;
                    }
                    case 1: {
                        
                        
                        metal.setMiktar(b);
                        enerji.setMiktar((int)(c*2.5));
                        
                    Kaynaklar[] kaynaklar = {metal,enerji};
                    Cisim gezegen = new Gezegen(isim2, kaynaklar , "Yogun", (int)(a*0.5+15), i, j);
                    //15-20 arası yerçekimi
                    gezegenListesi[i][j]= gezegen;

                        break;
                    }
                    case 2: {
                        
                        
                        
                        metal.setMiktar(b);
                        enerji.setMiktar((int)(c*1));
                        
                    Kaynaklar[] kaynaklar = {metal,enerji};
                    Cisim gezegen = new Gezegen(isim3, kaynaklar , "Soguk", (int)(a*0.5+5), i, j);
                    //5-10 arası yerçekimi
                    gezegenListesi[i][j]= gezegen;

                        break;
                    }
                    case 3: {
                        
                        
                        metal.setMiktar(b);
                        enerji.setMiktar((int)(c*1.5));
                        
                    Kaynaklar[] kaynaklar = {metal,enerji};
                    Cisim gezegen = new Gezegen(isim4, kaynaklar , "Kurak", (int)(a*0.7+5), i, j);
                    //5 ile 12 arası yerçekimi
                    gezegenListesi[i][j]= gezegen;

                        break;
                    }
                    case 4: {
                        
                        
                        
                        metal.setMiktar(b);
                        enerji.setMiktar((int)(c*1.5));
                        
                    Kaynaklar[] kaynaklar = {metal,enerji};
                    Cisim gezegen = new Gezegen(isim5, kaynaklar , "Yogun", (int)(a*0.6+10), i, j);
                    //10-16 arası yerçekimi
                    
                    gezegenListesi[i][j]= gezegen;

                        break;
                    }
                    case 5: {
                        
                        
                        
                        metal.setMiktar(b*3);
                        enerji.setMiktar((int)(c*1.5));
                        
                    Kaynaklar[] kaynaklar = {metal,enerji};
                    Cisim gezegen = new Gezegen(isim6, kaynaklar , "Zehirli", (int)(a*0.6+10), i, j);
                    //10-16 arası yerçekimi
                    gezegenListesi[i][j]= gezegen;

                        break;
                    }
                    
                    case 6:{
                        Karadelik karadelik = new Karadelik(i, j);
                        gezegenListesi[i][j] = karadelik;
                        
                    }

                    default:
                        Karadelik karadelik = new Karadelik(i, j);
                        gezegenListesi[i][j]=karadelik;
                        
                }
            }
        }

    }
}