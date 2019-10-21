/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CENG102_PROJE_2019_OTEL;

/**
 *
 * @author beyza
 */
public class Musteri {
    private String musteriAd;
    private int musteriYas;
    private int musteriTc;
    private int musteriNumara;
    private String musteriMeslek;

    public Musteri() { }

    public Musteri(String musteriAd, int musteriYas, int musteriTc, int musteriNumara, String musteriMeslek) {
        this.musteriAd = musteriAd;
        this.musteriYas = musteriYas;
        this.musteriTc = musteriTc;
        this.musteriNumara = musteriNumara;
        this.musteriMeslek = musteriMeslek;
    }

    public String getMusteriAd() { return musteriAd; }
    public void setMusteriAd(String musteriAd) { this.musteriAd = musteriAd; }

    public int getMusteriYas() { return musteriYas; }
    public void setMusteriYas(int musteriYas) { this.musteriYas = musteriYas; }

    public int getMusteriTc() { return musteriTc; }
    public void setMusteriTc(int musteriTc) { this.musteriTc = musteriTc; }

    public int getMusteriNumara() { return musteriNumara; }
    public void setMusteriNumara(int musteriNumara) { this.musteriNumara = musteriNumara; }

    public String getMusteriMeslek() { return musteriMeslek; }
    public void setMusteriMeslek(String musteriMeslek) { this.musteriMeslek = musteriMeslek; }

    @Override
    public String toString()
    {
        return "Müşteri: "+musteriAd;
    }
}
