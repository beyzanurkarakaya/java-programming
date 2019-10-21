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
public class KralDairesi extends Oda {
    public int kdNumAdet = 1;
    public int[] kdNumarasi = {501};
    private String yatakTuru = "Çift Kişilik";
    String odaAdi = "Kral Dairesi";

    public KralDairesi(int kdNumarasi)
    {
        super(kdNumarasi, "Kral Dairesi", "6 yetişkin veya 2 yetişkin 4 çocuk", 1, 60, "Duş ve Jakuzi", "Deniz ve Orman");
    }

    public String getYatakTuru() { return yatakTuru; }

    @Override
    public String toString()
    {
        return "Oda Adı: "+odaAdi+", Oda Numarası: "+kdNumarasi+", "+"Yatak Türü: "+yatakTuru+super.toString();
    }
}
