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
public class AileOdasi extends Oda{
    public int aoNumAdet = 5;
    public int[] aoNumarasi = {301,302,303,304,305};
    private String yatakTuru = "Çift Kişilik";
    private String ekYatak;
    String odaAdi = "Aile Odası";

    public AileOdasi(int aoNumarasi, String ekYatak)
    {
        super(aoNumarasi, "Aile Odası", "4 yetişkin veya 2 yetişkin 2 çocuk", 1, 50, "Duş ve Küvet", "Deniz veya Orman");
        this.ekYatak = ekYatak;
    }

    public String getEkYatak() { return ekYatak; }
    public void setEkYatak(String ekYatak) { this.ekYatak = ekYatak; }

    public String getYatakTuru() { return yatakTuru; }

    @Override
    public String toString()
    {
        return "Oda Adı: "+odaAdi+", Oda Numarası: "+aoNumarasi+", "+"Yatak Türü: "+yatakTuru+super.toString();
    }
}
