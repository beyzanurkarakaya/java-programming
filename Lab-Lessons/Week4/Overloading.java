public class Overloading {

    public static void main(String[] args) {
	    Overloading mainobj = new Overloading();
	    System.out.println("5*5="+mainobj.square(5));
        System.out.println("6.6*6.6="+mainobj.square(6.6));
    }

    public int square (int val)
    {
        return val*val;
    }

    public double square (double val) // public float square (double val) yaparsak hata verir, önemli olan parametredeki değeri değiştirmek -> overloading
    {
        return val*val;
    }
}
