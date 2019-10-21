public class CarClass
{
    // instance variables - replace the example below with your own
    private String year;
    private String model;
    private double price;

    public CarClass(String year, String model,double price)
    {
        this.year=year;
        this.model=model;
        this.price=price;
    }

    public  String getYear()
    {
      return year;
    }

    public void setYear(String year)
    {
        this.year=year;
    }

    public String getModel()
    {
      return model;
    }

    public void setModel(String model)
    {
        this.model=model;
    }

    public double getPrice()
    {
      return price;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

    public String toString()
    {
       return  "Model: "+this.model+"\tYear:"+this.year+"\tPrice:"+this.price;
    }
}
