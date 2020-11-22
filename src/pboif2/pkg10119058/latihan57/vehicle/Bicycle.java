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
public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle() {
       System.out.println("Bicycle"); 
    }
    public int getGearCount() {
        return myGearCount;
    }
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}
