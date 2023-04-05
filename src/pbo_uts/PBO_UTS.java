/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_uts;
public class PBO_UTS {
public class haltePorong {
    private int jmlPenumpang;
    private int maxP;
    private int waitP;

    public haltePorong(int jumlahP, int maxPenumpang, int nunggu_passanger) {
        this.jmlPenumpang = jumlahP;
        this.maxP = maxPenumpang;
        this.waitP = nunggu_passanger;
    }

    public haltePorong(int jumlahP, int maxPenumpang) {
        this (jumlahP, maxPenumpang, 2);
    }

    public int getPenumpang () {
        return jmlPenumpang;
    }

    public void setPenumpang (int penumpang) {
        this.jmlPenumpang = penumpang;
    }

    public int getMax () {
        return maxP;
    }

    public void setMax (int max_penumpang) {
        this.maxP = max_penumpang;
    }

    public int getWait () {
        return waitP;
    }

    public void setWait (int tunggu) {
        this.waitP = tunggu;
    }
}
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
