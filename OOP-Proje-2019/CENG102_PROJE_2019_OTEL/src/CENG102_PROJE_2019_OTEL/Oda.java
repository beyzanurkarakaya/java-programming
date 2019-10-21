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
public class Oda {
    protected int odaNumarasi;
    protected String odaAdi;
    protected String kapasite;
    protected int yatakSayisi;
    protected int büyüklük;
    protected String banyo;
    protected String manzara;

    public Oda() { }
    public Oda(int odaNumarasi, String odaAdi, String kapasite, int yatakSayisi, int büyüklük, String banyo, String manzara)
    {
        this.odaNumarasi = odaNumarasi;
        this.odaAdi = odaAdi;
        this.kapasite = kapasite;
        this.yatakSayisi = yatakSayisi;
        this.büyüklük = büyüklük;
        this.banyo = banyo;
        this.manzara = manzara;
    }

    public String getOdaAdi() { return odaAdi; }
    public void setOdaAdi(String odaAdi) { this.odaAdi = odaAdi; }

    public int getOdaNumarasi() { return odaNumarasi; }
    public void setOdaNumarasi(int odaNumarasi) { this.odaNumarasi = odaNumarasi; }

    public int getBüyüklük() { return büyüklük; }
    public void setBüyüklük(int büyüklük) { this.büyüklük = büyüklük; }

    public int getYatakSayisi() { return yatakSayisi; }
    public void setYatakSayisi(int yatakSayisi) { this.yatakSayisi = yatakSayisi; }

    public String getBanyo() { return banyo; }
    public void setBanyo(String banyo) { this.banyo = banyo; }

    public String getManzara() { return manzara; }
    public void setManzara(String manzara) { this.manzara = manzara; }

    @Override
    public String toString()
    {
        return ", Yatak Sayısı: "+yatakSayisi+", Banyo Türü: "+banyo+", Büyüklük: "+büyüklük+" metrekare, Manzara: "+manzara;
    }
}