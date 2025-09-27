/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fo;

/**
 *
 * @author HP
 */
public abstract class Cisim {

    private int xKonum;
    private int yKonum;

    public Cisim(int xKonum, int yKonum) {
        this.xKonum = xKonum;
        this.yKonum = yKonum;
    }

    public int getxKonum() {
        return xKonum;
    }

    public void setxKonum(int xKonum) {
        this.xKonum = xKonum;
    }

    public int getyKonum() {
        return yKonum;
    }

    public void setyKonum(int yKonum) {
        this.yKonum = yKonum;
    }
    
    
   

}