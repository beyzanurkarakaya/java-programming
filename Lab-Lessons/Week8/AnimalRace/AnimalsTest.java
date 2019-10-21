import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AnimalsTest {

    public static void main(String[] args) {
        int rnum; // üretilecek random sayı değişkenleri
        int rnum2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of Hare to race:");
        int hCount = sc.nextInt(); //Yarıştıtılacak Tavşan sayısı
        System.out.println("Number of Tortoise to race");
        int tCount = sc.nextInt(); // Yarıştırılacak kaplumbağa sayısı

        Hare[] hArray = new Hare[hCount]; // Tavşan tipinde oluşturulan dizi ve ID'lerinin set edilmesi
        for (int i = 0; i < hCount; i++) {
            hArray[i] = new Hare(i);
        }

        Tortoise[] tArray = new Tortoise[tCount]; //Kaplumbağa tipinde oluşturulan dizi ve ID'lerinin set edilmesi
        for (int i = 0; i < tCount; i++) {
            tArray[i] = new Tortoise(i);
        }

        System.out.print("\nLets Goooo\n----------------------------------------------------------------------\n");
        System.out.print("\nStart Race\n----------------------------------------------------------------------\n\n");
        int flag = 0;

        while (true) { // Yarış için oluşturulan döngü
            System.out.printf("\n%35s\n\n", "Next");
            for (int i = 0; i < tCount; i++) { //Kaplumbağa için
                rnum = tArray[i].r.nextInt(10) + 1; // random sayı üretimi
                tArray[i].moveT(rnum); // hareket metodunun çağrılması
                tArray[i].Display("T"); // Görüntüleme metodunun çağrılması
                if (tArray[i].getPosition() >= Animal.finalDestination) { // Pozisyonu 70 veya 70'den büyük olunca döngüden çıkabilmesi için
                    flag++;
                }
            }
            for (int i = 0; i < hCount; i++) { //Tavşan için
                rnum2 = hArray[i].r.nextInt(10) + 1;
                hArray[i].moveH(rnum2);
                hArray[i].Display("H");
                if (hArray[i].getPosition() >= Animal.finalDestination) {
                    flag++;
                }
            }
            if (flag >= 1) {
                break;
            }
        }
        System.out.printf("\n%40s\n", "THE WINNER");

        ArrayList<String> bt = new ArrayList<String>(); // Kazanaları eklediğimiz ArrayList

        for (int j = 0; j < tCount; j++) {
            if (tArray[j].getPosition() >= Animal.finalDestination) { //Kaplumbağa kazanırsa kazananı yazdır ve arrayliste ekle
                System.out.println("Tortoise" + j + ". WINS!!! YAY!!");
                bt.add(tArray[j].toString());
            }
        }
        for (int i = 0; i < hCount; i++) { //Tavşan kazanırsa kazananı yazdır ve arrayliste ekle
            if (hArray[i].getPosition() >= Animal.finalDestination) {
                System.out.println("Hare" + i + ". wins. Yuch");
                bt.add(hArray[i].toString());
            }
        }
        
        if (bt.size() > 1) { //Beraberlik durumunu kontrol etme
            System.out.printf("\n%40s\n", "IT'S TIE A BETWEEN");
            for (int i = 0; i < bt.size(); i++) {
                System.out.println(bt.get(i));
            }
        }
    }
}