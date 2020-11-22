/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menampilkan spesifikasi 
 *                     dari Bicycle dan Skateboard.
 */
public class PBOIF210119058Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.setBrand("Trek Bike");
        b.setModel("7.4FX");
        b.setGearCount(23);
        System.out.println("Brand : " + b.getBrand());
        System.out.println("Model : " + b.getModel());
        System.out.println("Jumlah Gear : " + b.getGearCount());
        System.out.println();
        Skateboard s = new Skateboard();
        s.setBrand("Ally Skate");
        s.setModel("Rocket");
        s.setBoardLength(54.5);
        System.out.println("Brand : " + s.getBrand());
        System.out.println("Model : " + s.getModel());
        System.out.println("Panjangnya Board : " + s.getBoardLength());
    }
    
}
