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
public class CiftKisilikOda extends Oda{
    public int ckoNumAdet = 10;
    public int[] ckoNumarasi = {201,202,203,204,205,206,207,208,209,210};
    private String yatakTuru = "Çift Kişilik";
    String odaAdi = "Suit Oda";

    public CiftKisilikOda(int ckoNumarasi)
    {
        super(ckoNumarasi, "Suit Oda", "2 yatişkin", 1, 30, "Duş", "Deniz veya Orman");
    }

    public String getYatakTuru() { return yatakTuru; }

    @Override
    public String toString()
    {
        return "Oda Adı: "+odaAdi+", Oda Numarası: "+ckoNumarasi+", "+"Yatak Türü: "+yatakTuru+super.toString();
    }
}
