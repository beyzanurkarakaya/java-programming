/*
@author beyzanurkarakaya
*/

public class CargoShip extends Ship
{
    private double totalWeight;

    public CargoShip(String name, String year, double totalWeight)
    {
        super(name, year);
        this.totalWeight = totalWeight;
    }

    public double getTotalWeight() { return totalWeight; }
    public void setTotalWeight(double totalWeight) { this.totalWeight = totalWeight; }

    @Override
    public String toString()
    {
        return super.toString()+" Maximum Cargo Capasity: "+String.format("%.1f", this.totalWeight);
    }
}
