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
public class Skateboard extends Vehicle {
    private double myBoardLength;
    
    public Skateboard() {
        System.out.println("SkateBoard");
    }
    public double getBoardLength() {
        return myBoardLength;
    }
    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
}
