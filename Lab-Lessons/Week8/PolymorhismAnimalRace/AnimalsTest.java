import java.util.ArrayList;
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
        Animal[] animalArray=new Animal[tCount+hCount];
        // Tavşan tipinde oluşturulan dizi ve ID'lerinin set edilmesi
        for (int i = 0; i < hCount; i++) {
            animalArray[i]=new Hare(i);//hArray[i];
        }
        for (int i = 0; i < tCount; i++) {
            animalArray[i+hCount]=new Tortoise(i);
        }

        System.out.print("\nLets Goooo\n----------------------------------------------------------------------\n");
        System.out.print("\nStart Race\n----------------------------------------------------------------------\n\n");
        int flag = 0;

        while (true) { // Yarış için oluşturulan döngü
            System.out.printf("\n%35s\n\n", "Next");
            for (int i = 0; i < hCount+tCount; i++) { //Kaplumbağa için
                rnum = animalArray[i].r.nextInt(10) + 1; // random sayı üretimi
                animalArray[i].move(rnum); // hareket metodunun çağrılması
                animalArray[i].Display(); // Görüntüleme metodunun çağrılması
                if (animalArray[i].getPosition() >= Animal.finalDestination) { // Pozisyonu 70 veya 70'den büyük olunca döngüden çıkabilmesi için
                    flag++;
                }
            }

            if (flag >= 1) {
                break;
            }
        }
        System.out.printf("\n%40s\n", "THE WINNER");

        ArrayList<String> bt = new ArrayList<String>(); // Kazanaları eklediğimiz ArrayList

        for (int j = 0; j < tCount+hCount; j++) {
            if (animalArray[j].getPosition() >= Animal.finalDestination) { //Kaplumbağa kazanırsa kazananı yazdır ve arrayliste ekle

                if(animalArray[j] instanceof  Tortoise)
                    System.out.println("Tortoise" + animalArray[j].getID()  + ". WINS!!! YAY!!");
                else
                    System.out.println("Hare" + animalArray[j].getID() + ". wins. Yuch");

                bt.add(animalArray[j].toString());
            }
        }
        if (bt.size() > 1) { //Beraberlik durumunu kontrol etme
            System.out.printf("\n%40s\n", "IT'S TIE A BETWEEN");
            for (int i = 0; i < bt.size(); i++) {
                System.out.println(bt.get(i));
            }
        }

        for (int j = 0; j < tCount+hCount; j++)
        {
            animalArray[j].talk();

        }
    }
}