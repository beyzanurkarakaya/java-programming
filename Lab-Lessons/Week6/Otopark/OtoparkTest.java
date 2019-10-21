public class OtoparkTest {

    public static void main(String[] args) {

        Arac arac1=new Arac("Şule","ASD");
        Arac arac2=new Arac("Hatice", "BNM");
        Arac arac3=new Arac("Enes","QWE");
        Arac arac4=new Arac("Engincan","JKL");

        Otopark otoparkObj=new Otopark(6,4);
        otoparkObj.parket(arac1);
        otoparkObj.parket(arac2);
        otoparkObj.parket(arac3);
        otoparkObj.parket(arac4);
        otoparkObj.listele();

        if(otoparkObj.parkCikar(arac4))
            System.out.println("Aracınız doğru bir şekilde çıkarıldı");
        else
            System.out.println("Aracınızı bulamadık");

         otoparkObj.listele();

        System.out.println();
        Arac arac5=new Arac("Ufuk","UWE");
        Arac arac6=new Arac("Mustafa","MKL");
        otoparkObj.parket(arac5);
        otoparkObj.parket(arac6);
        otoparkObj.parket(arac4);
        otoparkObj.listele();
        Arac arac7=new Arac("Emre","EWE");
        if(otoparkObj.parket(arac7))
            System.out.println("Aracınız başarı ile park edildi");
        else
            System.out.println("Otoparkımız dolu");
        //Arac arac4=new Arac("Engincan","JKL");

        Otopark otoparkObj2=new Otopark(otoparkObj);
        otoparkObj2.listele();
        otoparkObj2.parkCikar(arac4);
        otoparkObj2.listele();
        System.out.println();
        otoparkObj.listele();
    }
}
