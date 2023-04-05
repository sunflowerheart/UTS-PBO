/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_uts;

public class Bus {
    private int banyakOrg;
    private String destinasi;
    
    public void bus(int x, String y){
        this.banyakOrg = x;
        this.destinasi = y;
    }
    
    public void bus(int x){
        this.banyakOrg = x;
    }
    
    public void destinasi(){
        System.out.println(""+this.banyakOrg+" penumpang berangkat "+this.destinasi);
    }
    
    public String setDestinasi(String x){
        return this.destinasi = x;
    }
    
    public int tambah(int x){
        int t = this.banyakOrg + x;
        return this.banyakOrg = t;
    }
    
    public int kurang(int x){
        int k = this.banyakOrg - x;
        return this.banyakOrg = k;
    }
    
    public int naik(int x){
        int t = this.banyakOrg + x;
        System.out.println("Banyak penumpang yang naik: "+x);
        this.banyakOrg = t;
        return this.banyakOrg;
    }
    
    public int turun(int x){
        int t = this.banyakOrg - x;
        System.out.println("Banyak penumpang yang turun: "+x);
        this.banyakOrg = t;
        return this.banyakOrg;
    }
    
    public void datang(){
        System.out.println("Bus datang di Halte "+this.destinasi);
    }
    
    public void statusBUS(){
        System.out.println("Jumlah Penumpang saat ini adalah "+this.banyakOrg);
    }
    

}

