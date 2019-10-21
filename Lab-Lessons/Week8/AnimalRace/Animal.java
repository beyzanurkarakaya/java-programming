import java.util.Random;

public class Animal {

    public int ID;
    public int position;
    public final static int finalDestination=70;
    Random  r; // Random nesnesi üretimi

    public Animal(int ID,int position)
    {
        this.ID=ID;
        this.position=position;
        r = new Random();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPosition() {
        return position;
    }

    public void changePosition(int amount) {
        this.position+= amount;
    }


    public void setPosition(int position) {
        this.position = position;
    }

    public void Display(String identifier) {  //Ekranda çıktıyı yazan metot.


        for (int i = 1; i <= finalDestination; i++) {
            if (i == getPosition()) {
                System.out.printf(identifier + this.ID);
            }
            System.out.printf("-");
        }
        System.out.printf("\n");
    }
}
