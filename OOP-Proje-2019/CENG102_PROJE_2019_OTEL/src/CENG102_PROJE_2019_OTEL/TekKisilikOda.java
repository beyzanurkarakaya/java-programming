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
public class TekKisilikOda extends Oda{
    public int tkoNumAdet = 25;
    public int[] tkoNumarasi = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125};
    private String yatakTuru = "Tek Kişilik";
    String odaAdi = "Standart Oda";

    public TekKisilikOda(int tkoNumarasi)
    {
        super(tkoNumarasi, "Standart Oda", "1 yetişkin", 1, 20, "Duş", "Orman");
    }

    public String getYatakTuru() { return yatakTuru; }

    public int getTkoNumAdet() { return tkoNumAdet; }

    @Override
    public String getOdaAdi() { return odaAdi; }

    @Override
    public String toString()
    {
        return "Oda Adı: "+odaAdi+", Oda Numarası: "+tkoNumarasi+", "+"Yatak Türü: "+yatakTuru+super.toString();
    }
}
