/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Test{

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        Cisim[][] cisimList = new Cisim[5][5];
        Galaksi galaksi = new Galaksi(cisimList);
        galaksi.galaksiyiGoster();
        Gezegen gezegen;
        Gemi gemi = new Gemi(100, 0, 50, 0, 0);
        System.out.println("Uzay Keşif Oyununa Hoşgeldiniz");

        while (true) {
            System.out.println("Lütfen Gitmek İstediğiniz Gezegenin Kordinatlarını Giriniz");
            int x = input.nextInt();
            int y = input.nextInt();

            while (x > 4 || x < 0 || y > 4 || y < 0) {
                System.out.println("Girdiğiniz sayılar sınırların dışında lütfen 0 ile 4 arasında bir sayı giriniz \n0 ve 4 de dahildir");
                x = input.nextInt();
                y = input.nextInt();

                if (x < 5 && x >= 0 && y < 5 || y >= 0) {
                    gemi.setxKonum(x);
                    gemi.setyKonum(y);
                   
                    break;
                }
            }

            if (galaksi.getGezegenListesi()[x][y] instanceof Gezegen gezegen1) {
                gezegen = gezegen1;
                System.out.println(gezegen.getAd()+"\nAtmosfer tipi: " +gezegen.getAtmosferTipi()+" Yerçekimi Miktarı ise "+gezegen.getYerÇekimi());
                gezegen.kaynaklariGoster();
                gemi.yakitKaybet(gezegen);

            } if (galaksi.getGezegenListesi()[x][y] instanceof Karadelik karadelik) {
                karadelik.rastgeleIsınla(gemi);
                gezegen = (Gezegen)galaksi.getGezegenListesi()[gemi.getxKonum()][gemi.getyKonum()];
                System.out.println("Karadeliğin sizi ışınladığı gezegen: ");
                System.out.println(gezegen.getAd()+"\nAtmosfer tipi: " +gezegen.getAtmosferTipi()+" Yerçekimi Miktarı ise "+gezegen.getYerÇekimi());
            
            }
            
            System.out.println("Ne yapacaksın?");
            System.out.println("1-Malzeme Topla");
            System.out.println("2-Yakıt Yenile");
            System.out.println("3-Gezegenin Kaynaklarını Gör");
            System.out.println("4-");

        }

    }
}
