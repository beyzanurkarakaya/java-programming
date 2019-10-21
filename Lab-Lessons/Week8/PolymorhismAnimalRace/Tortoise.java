public class Tortoise extends Animal {

    public Tortoise(int ID) { // ID için oluşturduğumuz constructor
        super(ID, 1,"T");
    }

    @Override
    public String toString() {
        return "Tortoise" + ID + '.';
    }

    public void move(int rnum) { //Gelen random sayılara göre ilerleme ve ya gerilemeyi sağlayan metot
        if (rnum >= 1 && rnum <= 5) {
            changePosition(3);
        } else if (rnum >= 6 && rnum <= 7) {
            changePosition(-6);
        } else {
            changePosition(1);
        }

        if (getPosition() <= 0) { //Geri geldiğinde position 1 den küçükse tekrar 1 yapan metot
            setPosition(1);
        }
        if (getPosition() >= finalDestination) { //position 70'den büyük gelirse tekrar 70 yapan metot
            setPosition(finalDestination);
        }
    }
}
