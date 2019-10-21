/*
Without main method.
@author beyzanurkarakaya
 */

public class Complex
{
    // instance variables
    private double reel;
    private double imaginel;

    public Complex(double reel, double imaginel) // constructor for ComplexNumber object
    {
        this.reel = reel;
        this.imaginel = imaginel;
    }
    public Complex() // overload constructor for empty ComplexNumber object
    {
        this.reel = 0;
        this.imaginel = 0;
    }
    public Complex(Complex ComplexObj) // overload constructor for ComplexNumber object
    {
        this.setReel(ComplexObj.getReel());
        this.setImaginel(ComplexObj.getImaginel());
    }

    // get - set methods
    public double getReel() { return this.reel; }
    public void setReel(double reel) { this.reel = reel; }

    public double getImaginel() { return this.imaginel; }
    public void setImaginel(double imaginel) { this.imaginel = imaginel; }

    // toString method for print to screen
    public String toString()
    {
        if (imaginel == 0) return String.format("%.1f",reel) + "";
        if (reel == 0) return String.format("%.1f",imaginel) + "i";
        if (imaginel <  0) return String.format("%.1f",reel) + " - " + String.format("%.1f",(-imaginel)) + "i";
        return String.format("%.1f",reel) + " + " + String.format("%.1f",imaginel) + "i";
    }

    public void addComplex(double reel, double imaginel) // add method
    {
        setReel(getReel() + reel);
        setImaginel(getImaginel() + imaginel);
    }

    public void addComplex(Complex c) // overload add method
    {
        setReel(getReel() + c.getReel());
        setImaginel(getImaginel() + c.getImaginel());
    }

    public void subtractComplex(double reel, double imaginel) // subtract method
    {
        setReel(getReel() - reel);
        setImaginel(getImaginel() - imaginel);
    }

    public void subtractComplex(Complex c) // overload subtract method
    {
        setReel(getReel() - c.getReel());
        setImaginel(getImaginel() - c.getImaginel());
    }

    public void multiplyComplex(double reel, double imaginel) // multiply method
    {
        Complex multiply = new Complex();
        multiply.setImaginel((getImaginel() * reel) + (getReel() * imaginel));
        double im1 = getImaginel() * imaginel;
        double im2 = getReel() * reel;
        if(im1 > im2){
            multiply.setReel(-(im1-im2));
        }
        else if(im2 > im1){
            multiply.setReel(im2-im1);
        }
        setReel(multiply.getReel());
        setImaginel(multiply.getImaginel());
    }

    public void multiplyComplex(Complex c) // overload multiply method
    {
        Complex multiply = new Complex();
        multiply.setImaginel((getImaginel() * c.getReel()) + (getReel() * c.getImaginel()));
        double im1 = imaginel * c.getImaginel();
        double im2 = reel * c.getReel();
        if(im1 > im2){
            multiply.setReel(-(im1-im2));
        }
        else if(im2 > im1){
            multiply.setReel(im2-im1);
        }
        setReel(multiply.getReel());
        setImaginel(multiply.getImaginel());
    }

    public static void main(String[] args)
    {
        Complex cNumber1 = new Complex(3.4,30.6);
        Complex cNumber2 = new Complex(6.3,4.8);
        Complex cNumber3 = new Complex(7.6,8.9);
        Complex cNumber4 = new Complex(cNumber2);
        System.out.println("1. Complex Number: "+cNumber1+"\n2. Complex Number: "+cNumber2+"\n3. Complex Number: "+cNumber3+"\n4. Complex Number: "+cNumber4);

        cNumber1.addComplex(5.3,4.0);
        System.out.println("\nAfter Adding Numbers to Complex Number 1");
        System.out.println("1. Complex Number: "+cNumber1+"\n2. Complex Number: "+cNumber2+"\n3. Complex Number: "+cNumber3+"\n4. Complex Number: "+cNumber4);

        cNumber3.addComplex(cNumber4);
        System.out.println("\nAfter the Complex Number 4 Added to the Complex Number 3");
        System.out.println("1. Complex Number: "+cNumber1+"\n2. Complex Number: "+cNumber2+"\n3. Complex Number: "+cNumber3+"\n4. Complex Number: "+cNumber4);

        cNumber4.subtractComplex(2.4,3.5);
        System.out.println("\nAfter Subtracting Numbers to Complex Number 4");
        System.out.println("1. Complex Number: "+cNumber1+"\n2. Complex Number: "+cNumber2+"\n3. Complex Number: "+cNumber3+"\n4. Complex Number: "+cNumber4);

        cNumber1.subtractComplex(cNumber2);
        System.out.println("\nAfter the Complex Number 2 Subtracting from the Complex Number 1");
        System.out.println("1. Complex Number: "+cNumber1+"\n2. Complex Number: "+cNumber2+"\n3. Complex Number: "+cNumber3+"\n4. Complex Number: "+cNumber4);

        cNumber2.multiplyComplex(3.8,2.4);
        System.out.println("\nAfter the Complex Number 2 Multiplying with Numbers");
        System.out.println("1. Complex Number: "+cNumber1+"\n2. Complex Number: "+cNumber2+"\n3. Complex Number: "+cNumber3+"\n4. Complex Number: "+cNumber4);

        cNumber4.multiplyComplex(cNumber1);
        System.out.println("\nAfter the Complex Number 4 Multiplying with the Complex Number 1");
        System.out.println("1. Complex Number: "+cNumber1+"\n2. Complex Number: "+cNumber2+"\n3. Complex Number: "+cNumber3+"\n4. Complex Number: "+cNumber4);
    }
}
