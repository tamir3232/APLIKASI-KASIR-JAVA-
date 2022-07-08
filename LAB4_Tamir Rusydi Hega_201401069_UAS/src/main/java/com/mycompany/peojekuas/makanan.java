package com.mycompany.peojekuas;

public class makanan extends menu {
    private int totalharga;
    makanan(String nama, int harga, int jumlah){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    @Override
    public void setharga() {
        // TODO Auto-generated method stub
        totalharga= this.harga*jumlah;
        
    }

    @Override
    public int getharga() {
        // TODO Auto-generated method stub
        return totalharga;
    }


}
