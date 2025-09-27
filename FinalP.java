/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FinalP {

    public static void main(String[] args) {
        Gezegen gezegen = null;
        int x=0;
        int y=0;
        int islem;
        Scanner input = new Scanner(System.in);
        Cisim[][] cisim = new Cisim[5][5];
        Galaksi galaksi = new Galaksi(cisim);
        Gemi gemi = new Gemi(100, 0, 50,0,0);
        galaksi.galaksiyiGoster();
        System.out.println("Uzay kesif oyununa hosgeldiniz!");
        System.out.println("Lutfen Baslangic yapmak icin galaksi uzerinden \nsectiginiz gezegenin kordinatlarini satir ve sutununa gore yaziniz ");

        int[] konum = {x, y};
        while (gemi.getYakıtMiktarı() > 0) {

            while (true) {
                //konum değerlerinin girildiği yer
                System.out.print("x:");
                konum[0] = input.nextInt();
                System.out.print("y:");
                konum[1] = input.nextInt();
                if (konum[0] < 5 && konum[0] > -1 && konum[1] < 5 && konum[1] > -1) {
                    break;
                } else {
                    System.out.println("Yeniden deger giriniz geçerli değer aralığı: 0<=x<=4");
                }

            }
            

            //Yolculuk işlemlerinin basladığı yer
            gezegen = (Gezegen) galaksi.getGezegenListesi()[konum[0]][konum[1]];   // Sadece gezegen dolar karadelik null kalır

            if (gezegen != null) {//karadelik null olduğundan gezegen için işlem yapılır
                if (gezegen.getYerÇekimi() / 2 + 10 > gemi.getYakıtMiktarı()) {
                    System.out.println("Yakit yetersiz gidebileceginiz yerler: \n");
                    boolean gidilecekGezegenVAR = false;
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            gezegen = (Gezegen) galaksi.getGezegenListesi()[i][j];

                            if (gezegen == null) {
                                System.out.print("K(" + i + "," + j + ") ");
                                gidilecekGezegenVAR = true;
                            } else {
                                if (gezegen.getYerÇekimi() + 10 < gemi.getYakıtMiktarı()) {   ////
                                    System.out.print("G(" + i + "," + j + ") ");
                                    gidilecekGezegenVAR = true;
                                }

                            }
                        }
                        System.out.println("");
                    }
                    if (!gidilecekGezegenVAR) {
                        System.out.println("Gidilebilecek gezegen yoktur");
                        break;
                    }
                    continue;

                }

                galaksi.GezegeneGit(konum);
                gemi.yakitKaybet(gezegen.getYerÇekimi() / 2 + 10);

            } else {       //gezegen classına dahil olmayanlar karadelik olduğu için karadelik işemi gerçekleşir

                galaksi.GezegeneGit(konum);
                double sans = Math.random() * 5;
                int malzemeSans = (int) (Math.random() * 5);
                int yakitSans = (sans < 2) ? 0 : (int) (Math.random() * 20);
                if (yakitSans == 0) {
                    malzemeSans = 0;
                    System.out.println("""
                                   ************************************************
                                   *Karadelik sizi hicbir sey kaybetmeden IsInladI*
                                   ************************************************
                                   """);

                }
                gemi.malzemeKaybet(malzemeSans);
                gemi.yakitKaybet(yakitSans);
                System.out.println("Bu kadar yakit kaybettiniz: " + (yakitSans));
                System.out.println("Konumunuz: " + konum[0] + "," + konum[1]);
                gezegen = (Gezegen) galaksi.getGezegenListesi()[konum[0]][konum[1]];
            }
            
            //Yolculuk işlemlerinin bittiği yer

            gezegen.kaynaklariGoster();
            while (true) {
                System.out.println("""
                                   
                               Yapmak istediginiz islem icin yanindaki sayiyi giriniz:
                               1-Kaynak Toplamak
                               2-Yakit Yenilemek
                               3-Gemi Gelistirme
                               4-Kaynaklarini Gor
                               5-Gezegenin Kaynaklarini Gor
                               6-Baska Gezegene Git
                               """);
                islem = input.nextInt();
                int gezegendeKalanMiktar = 0;
                switch (islem) {
                    case 1:

                        gemi.kaynakTopla(gezegen.getKaynakMiktarı(), gezegendeKalanMiktar);
                        System.out.println(gezegen.getKaynakMiktarı()[0].getMiktar() + " kadar metal toplandı");
                        gezegen.gKalanMETAL(gezegendeKalanMiktar);//Gezegendeki metali sıfırlar

                        break;

                    case 2:
                        gemi.yakitYenile(gezegen.getKaynakMiktarı(), gezegendeKalanMiktar);
                        System.out.println(gezegen.getKaynakMiktarı()[1].getMiktar() + " kadar yakıt yenilendi");
                        gezegen.gKalanENERJI(gezegendeKalanMiktar);//Gezegendeki enerjiyi sıfırlar

                        break;

                    case 3:
                        gemi.gemiGelistir();// Sadece malzeme deposu gelişir.
                        System.out.println("Tebrikler 10 metal kullanıp depo kapasitenizi 5 arttırdınız");
                        break;

                    case 4:
                        System.out.println("Malzeme miktari: " + gemi.getMalzemeMiktari());

                        System.out.println("Yakit miktari: " + gemi.getYakıtMiktarı());
                        break;
                    case 5:
                        System.out.println("Gezegende kalan kaynaklar: ");
                        gezegen.kaynaklariGoster();
                    case 6:

                        break;
                    default:
                        System.out.println("Geçersiz sayi");
                        break;

                }
                if (islem == 6) {
                    break;
                }
            }
            
        }
        System.out.println("Oyun bitti.");

    }

}
