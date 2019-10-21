import java.util.Random;

public abstract class Animal implements Arayuz {

    public int ID;
    public int position;
    public String identifier;
    public final static int finalDestination=70;
    Random  r; // Random nesnesi üretimi

    public Animal(int ID,int position,String identifier)
    {
        this.ID=ID;
        this.position=position;
        this.identifier=identifier;
        r = new Random();
    }

    public void talk()
    {
        System.out.println(this+" "+"isTalking");

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

    public abstract void move(int rNum);

    public void Display() {  //Ekranda çıktıyı yazan metot.


        for (int i = 1; i <= finalDestination; i++) {
            if (i == getPosition()) {
                System.out.printf(identifier + this.ID);
            }
            System.out.printf("-");
        }
        System.out.printf("\n");
    }
}