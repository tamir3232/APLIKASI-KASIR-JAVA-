package com.mycompany.peojekuas;

import java.util.concurrent.RunnableFuture;

public class minuman extends menu{
    
    private int totalharga;

    minuman(String nama, int harga, int jumlah){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    @Override
    public void setharga() {
        // TODO Auto-generated method stub
        totalharga= this.harga*this.jumlah;
        
    }

    @Override
    public int getharga() {
        // TODO Auto-generated method stub
        return totalharga;
        
    }
    


}

