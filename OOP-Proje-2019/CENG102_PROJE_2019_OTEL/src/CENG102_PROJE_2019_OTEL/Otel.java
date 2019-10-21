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
public class Otel {
    protected String otelAdi;
    protected String otelSahibi;
    protected int yildiz;
    protected String otelAdresi;
    protected int odaSayisi = 43;

    public Otel() { }
    public Otel(String otelAdi, String otelSahibi, int yildiz, String otelAdresi, int odaSayisi) {
        this.otelAdi = otelAdi;
        this.otelSahibi = otelSahibi;
        this.yildiz = yildiz;
        this.otelAdresi = otelAdresi;
    }

    public String getOtelAdi() { return otelAdi; }

    public String getOtelSahibi() { return otelSahibi; }

    public int getYildiz() { return yildiz; }

    public String getOtelAdresi() { return otelAdresi; }
    public void setOtelAdresi(String otelAdresi) { this.otelAdresi = otelAdresi; }

    public int getOdaSayisi() { return odaSayisi; }
    public void setOdaSayisi(int odaSayisi) { this.odaSayisi = odaSayisi; }
}
