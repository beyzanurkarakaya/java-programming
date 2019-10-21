public class Cake
{
   // instance variables - replace the example below with your own
   private double flour;
   private double sugar;
   private double oil;
   private double milk;
   private String various;

   /**
    * Constructor for objects of class Cake
    */
   public Cake(double flour, double sugar,double oil, double milk, String various)
   {
       this.flour=flour;
       this.sugar=sugar;
       this.oil=oil;
       this.milk=milk;
       this.various=various;
   }

   public Cake(double flour, double milk, String various)
   {
       this.flour=flour;
       this.milk=milk;
       this.various=various;
   }

   public double getFlour()
   {
     return flour;
   }

   public void setFlour(double flour)
   {
      this.flour=flour;
   }

   public double getSugar()
   {
     return sugar;
   }

   public void setSugar(double sugar)
   {
      this.sugar=sugar;
   }

   public double getMilk()
   {
     return milk;
   }

 public void setmilk(double milk)
   {
      this.milk=milk;
   }

   public double getOil()
   {
     return oil;
   }

   public void setOil(double oil)
   {
      this.oil=oil;
   }

   public String getVarious()
   {
     return various;
   }

   public void setVarious(String various)
   {
      this.various=various;
   }

   public String toString()
   {
     return this.various+" Cake, good appetite!";
   }
}
