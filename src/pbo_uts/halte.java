/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_uts;

public class halte {
   private String nama;
    private int banyakOrg;
    
    halte(int x, String nama){
        this.banyakOrg = x;
        this.nama = nama;
    }
    
    halte(String nama){
        this.nama = nama;
    }
    
    public int berkurang(int x){
        int y = this.banyakOrg - x;
        return this.banyakOrg = y;
    }
    
    public void statusHalte(){
        System.out.println("Halte "+nama+": "+this.banyakOrg+" Penumpang menunggu Bis Datang");
    }
    
} 

