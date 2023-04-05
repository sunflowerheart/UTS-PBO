/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_uts;

public class Main {

    public static void main(String[] args) {
     System.out.println("Bus berangkat dari PULL/Kantor");
        Bus BUS_ori = new Bus();
        BUS_ori.statusBUS();
        Bus[] BUS;
        BUS = new Bus[20];
        Bus[0] = new Bus(3, "PORONG");
        BUS[0].destinasi();
        BUS[1] = new bus(2, "GRESIK"); 
        BUS[1].destinasi();
        
        System.out.println("");
        halte porong = new halte(2, "PORONG");
        porong.statusHalte();
        BUS[0].datang();
        BUS[0].turun(3);
        BUS[0].naik(2);
        BUS_ori.kurang(3);
        BUS_ori.tambah(2);
        porong.berkurang(2);
        BUS[0].setDestinasi("SURABAYA");
        BUS_ori.statusBUS();
        porong.statusHalte();
        
        System.out.println("");
        halte surabaya = new halte(5, "SURABAYA");
        surabaya.statusHalte();
        BUS[0].datang();
        BUS[0].turun(1);
        BUS[0].naik(5);
        surabaya.berkurang(5);
        BUS[0].setDestinasi("GRESIK");
        BUS_ori.tambah(3);
        BUS_ori.statusBUS();
        surabaya.statusHalte();
        
        System.out.println("");
        halte gresik = new halte("GRESIK");
        gresik.statusHalte();
        BUS[0].datang();
        BUS[0].turun(8);
        BUS_ori.kurang(7);
        BUS_ori.statusBUS();
    }
    }   
    
    

