/*
@author beyzanurkarakaya
*/

public class TouristShip extends Ship
{
    private int passengerCount;

    public TouristShip(String name, String year, int passengerCount)
    {
        super(name, year);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() { return passengerCount; }
    public void setPassengerCount(int passengerCount) { this.passengerCount = passengerCount; }

    @Override
    public String toString()
    {
        return super.toString()+" Maximum Passenger Capasity: "+this.passengerCount;
    }
}
