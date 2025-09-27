/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fo;

/**
 *
 * @author HP
 */
public class Karadelik extends Cisim {
    private int sans;
    private String ad;
    public Karadelik(int xKonum, int yKonum) {
        super(xKonum, yKonum);
         this.sans =(int)(Math.random()*2);
         this.ad="Karadelik";
    }

    public int getSans() {
        return sans;
    }

    public void setSans(int sans) {
        this.sans = sans;
      
    }
    public void rastgeleIsınla(Gemi gemi){
         int a = (int) (Math.random()*5);
         int b = (int) (Math.random()*5);
         int k = (int) (Math.random()*2);
         
        
        gemi.gezegeneGit(a, b);
                  
        if(k==0){
            
           gemi.yakitKaybet((int)(a*4));
           gemi.malzemeKaybet((int)(b*4));
            System.out.println("Karadelik sizi "+a+","+b+" konumuna ışınladı ve "+(int)(a*4)+" metal ve "+(int)(b*4)+" enerji kaybettiniz");
        } else{
            System.out.println("Karadelik Sizi Yakıt Kaybetmeden "+a+","+b+" konumuna ışınladı");
        }
    }
    
    
    
  
    

    
    
}



















































































































































































































































































































