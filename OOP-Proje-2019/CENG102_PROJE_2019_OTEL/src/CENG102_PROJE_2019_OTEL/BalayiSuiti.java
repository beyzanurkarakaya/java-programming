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
public class BalayiSuiti extends Oda{
    public int bsNumAdet = 2;
    public int[] bsNumarasi = {401,402};
    private String yatakTuru = "Çift Kişilik";
    String odaAdi = "Balayı Suiti";

    public BalayiSuiti(int bsNumarasi)
    {
        super(bsNumarasi, "Balayı Suiti", "2 yetişkin", 1, 40, "Duş ve Küvet", "Deniz");
    }

    public String getYatakTuru() { return yatakTuru; }

    @Override
    public String toString()
    {
        return "Oda Adı: "+odaAdi+", Oda Numarası: "+bsNumarasi+", "+"Yatak Türü: "+yatakTuru+super.toString();
    }
}
