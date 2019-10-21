public class CarClassTester
{
    public static void main()
    {
        CarClass carObj1=new CarClass("2018","BMW X5",435000.0);
        CarClass carObj2=new CarClass("2017","VOLVO S80",200000.0);
        CarClass carObj3=new CarClass("2019","MERCEDES C180",250000.0);;

        System.out.println("Car object1 :"+carObj1.toString());
        System.out.println("Car object2 :"+carObj2);
        carObj3.setYear("2018");
        System.out.println("Car object3 :"+carObj3);
    }
}
