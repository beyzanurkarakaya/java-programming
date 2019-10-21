/*
@author beyzanurkarakaya
*/

public class ShipTest
{
    public static void main(String[] args)
    {
        Ship s1 = new Ship("Titanic", "02.04.1912");
        Ship t1 = new TouristShip("BlackPerl", "19.03.1950", 3000);
        Ship c1 = new CargoShip("Atlanta", "24.04.1926", 600000);

        Ship[] shipArray = new Ship[3];
        shipArray[0] = s1;
        shipArray[1] = t1;
        shipArray[2] = c1;

        for (int i = 0; i < shipArray.length; i++) {
            System.out.printf("%d.Ship = %s \n", i+1, shipArray[i]);
        }
    }
}
