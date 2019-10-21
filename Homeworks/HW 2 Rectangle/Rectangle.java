/*
Without main method.
@author beyzanurkarakaya
 */

import java.util.Scanner;

public class Rectangle
{
    // instance variables
    private double kisa; // short edge
    private double uzun; // long edge
    private double x; // left bottom corner x
    private double y; // left bottom corner y

    public Rectangle(double kisa, double uzun, double x, double y) // constructor for rectangle object
    {
        this.uzun = uzun;
        this.kisa = kisa;
        this.x = x;
        this.y = y;
    }
    public Rectangle() // default constructor for rectangle object
    {
    }

    // get - set methods
    public void setKisa(double S) { this.kisa = S; }
    public double getKisa() { return this.kisa; }

    public void setUzun(double L) { this.uzun = L; }
    public double getUzun() { return this.uzun; }

    public void setX(double S) { this.x = S; }
    public double getX() { return this.x; }

    public void setY(double L) { this.y = L; }
    public double getY() { return this.y; }

    // toString method for print to screen
    public String toString() { return "Rectangle's Long Edge: "+uzun+" Short Edge: "+kisa+" Lower left corner [x="+x+", y= "+y+"]"; }

    public void move(double deltaX, double deltaY)
    {
        setX(x+deltaX);
        setY(y+deltaY);
        setKisa(kisa-deltaX);
        setUzun(uzun-deltaY);
    }

    public double getPerimeter(double aKisa, double aUzun) // find rectangle's perimeter
    {
        double result = 2*(aKisa + aUzun);
        System.out.printf("%.2f",result);

        return result;
    }

    public double getArea(double S1, double L1) // find rectangle's area
    {
        double result = S1 * L1;
        System.out.printf("%.2f",result);

        return result;
    }

    public static void main(String[] args)
    {
        Scanner  scan = new Scanner(System.in);
        double deltaX;
        double deltaY;

        Rectangle rectangle1 = new Rectangle(12.4,20.7,3.2,5.6);

        System.out.println(rectangle1);

        System.out.print("Rectangle's perimeter is: ");
        rectangle1.getPerimeter(rectangle1.getKisa(), rectangle1.getUzun());
        System.out.print("\nRectangle's area is: ");
        rectangle1.getArea(rectangle1.getKisa(), rectangle1.getUzun());

        System.out.println("\n");
        System.out.print("X'i sağa doğru kaç birim ilerletmek istediğinizi giriniz: ");
        deltaX = scan.nextDouble();
        System.out.print("Y'i yukarı doğru kaç birim ilerletmek istediğinizi giriniz: ");
        deltaY = scan.nextDouble();

        System.out.println();
        System.out.print("New ");
        rectangle1.move(deltaX, deltaY);
        System.out.println(rectangle1);

        System.out.print("New rectangle's perimeter is: ");
        rectangle1.getPerimeter(rectangle1.getKisa(), rectangle1.getUzun());
        System.out.print("\nNew rectangle's area is: ");
        rectangle1.getArea(rectangle1.getKisa(), rectangle1.getUzun());
    }
}
