import java.sql.SQLOutput;

public class Hare  extends Animal   {

    public Hare(int hID) {
        super(hID, 1,"H");
    }

    @Override
    public String toString() {
        return "Hare" + ID + '.';
    }

    public void move(int rnum) { //Gelen random sayılara göre ilerleme ve ya gerilemeyi sağlayan metot

        if (rnum >= 1 && rnum <= 2) {
            changePosition(0);
        } else if (rnum >= 3 && rnum <= 4) {
            changePosition(9);
        } else if (rnum == 5) {
            changePosition(-12);
        } else if (rnum >= 6 && rnum <= 8) {
            changePosition(1);
        } else {
            changePosition(-2);
        }

        if (getPosition() < 1) { //Geri geldiğinde position 1 den küçükse tekrar 1 yapan metot
            setPosition(1);
        }
        if (getPosition() >= finalDestination) { //position 70'den büyük gelirse tekrar 70 yapan metot
            setPosition(finalDestination);
        }
    }
}
