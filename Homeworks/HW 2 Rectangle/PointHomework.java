/*
@author beyzanurkarakaya
 */

public class Point {
    // instance variables
    private double x;
    private double y;


    public Point(double x, double y) // constructor for point object
    {
        this.x = x;
        this.y = y;
    }
    public Point() // default constructor for point object
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(Point obj)
    {
        this.setX(obj.x);
        this.setY(obj.y);
    }

    // get - set methods
    public double getX() { return this.x; }
    public void setX(double x1) { this.x = x1; }

    public double getY() { return this.y; }
    public void setY(double y1) { this.y = y1; }

    // toString method for print to screen
    public String toString() { return "(x="+String.format("%.2f",this.x)+", y="+String.format("%.2f",this.y)+")"; }

    public double distance(Point p)
    {
        double distance = Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
        return distance;
    }

    public Point findClosest(Point[] pointArray) // find closest distance and point from the another random point
    {
        double nearestDistance;
        int a = 0;
        nearestDistance = distance(pointArray[0]);
        for(int i = 0; i < pointArray.length; i++){
            double nearestDistance1 = distance(pointArray[i]);
            if(nearestDistance > nearestDistance1){
                nearestDistance = nearestDistance1;
                a = i;
            }
        }
        return pointArray[a];
    }

    public static Point findFurthest(Point[] pointArray) // find furthest distance from the origin
    {
        double farthestDistance;
        int a = 0;
        farthestDistance = Math.sqrt(Math.pow(pointArray[0].x,2)+Math.pow(pointArray[0].y,2));
        for(int i = 0; i < pointArray.length; i++){
            double tempFarthestDistance = Math.sqrt(Math.pow(pointArray[i].x,2)+Math.pow(pointArray[i].y,2));
            if(farthestDistance < tempFarthestDistance){
                farthestDistance = tempFarthestDistance;
                a = i;
            }
        }
        return pointArray[a];
    }

     public static void main(String[] args)
     {
         int capacity = 6;
         Point[] pointArray = new Point[capacity];
         pointArray[0] = new Point(3,4);
         pointArray[1] = new Point(8,15);
         pointArray[2] = new Point(5,12);
         pointArray[3] = new Point(pointArray[1]);
         pointArray[4] = new Point();
         pointArray[5] = new Point(2,8);

         for (int i = 0; i < pointArray.length; i++) {
             System.out.println("Point "+(i+1)+pointArray[i]);
         }

         System.out.println();
         System.out.println("Point 7's Distance is: "+String.format("%.2f",pointArray[pointArray.length-1].distance(pointArray[0])));

         System.out.println();
         pointArray[pointArray.length-1].findClosest(pointArray);

         System.out.println();
         findFurthest(pointArray);
     }
}
