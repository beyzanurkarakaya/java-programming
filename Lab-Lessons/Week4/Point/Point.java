public class Point {

    private double x;
    private double y;
    public static int count=0; //static field

    public Point(double x, double y)
	  {
        this.x=x;
        this.y=y;
        count++;
    }

    public Point()
    {
        this.x=0;
        this.y=0;
        count++;
    }

    public Point(Point p)
    {
        this.setX(p.x);
        this.setY(p.getY());
        count++;
    }

    public void setX(double x)
	  {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getX()

        return x;
    }

    public double getY()
    {
        return y;
    }

    public double distance(double x2, double y2)
    {
        return Math.sqrt(Math.pow((this.x-x2),2)+Math.pow((this.y-y2),2));
    }

    public double distance(Point p)
    {
        //return Math.sqrt(Math.pow((this.x-p.getX()),2)+Math.pow((this.y-p.getY()),2));
        return distance(p.getX(),p.getY());
    }

    public static double distance(double x1,double y1, double x2,double y2)
    {
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
