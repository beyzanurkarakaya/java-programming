public class CakeTester
{
    public  static void main()
    {
        Cake cakeObj1=new Cake(3.0,1.0,1.0,1.0,"Ice Cream");
        Cake cakeObj2=new Cake(2.0,1.5,1.0,1.0,"Cheese");
        Cake cakeObj3=new Cake(4.0,1.0,0.1,1.0,"Stone");

        System.out.println(cakeObj1);
        System.out.println(cakeObj2);
        System.out.println(cakeObj3);

        Cake cakeObj4=new Cake(4.0,1.0,"Diet Stone");
        System.out.println(cakeObj4);
        System.out.println("cakeObj4 has oil: "+cakeObj4.getOil()+" sugar:"+cakeObj4.getSugar());
    }
}
