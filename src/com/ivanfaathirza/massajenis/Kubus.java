package com.ivanfaathirza.massajenis;

public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi(){
        return sisi;
    }

    public void setSisi(int sisi){
        this.sisi = sisi;
    }

    public int getMassa(){
        return massa;
    }

    public void setMassa(int massa){
        this.massa = massa;
    }

    public int hitungVolume(int parSisi){
        return (int) Math.pow(parSisi, 3);
    }

    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa / volume;
    }
}
