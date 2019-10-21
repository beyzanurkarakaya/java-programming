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
         double distance = Math.sqrt(Math.pow((p.getX())-0,2)+Math.pow((p.getY()-0),2));
         return distance;
     }

    public Point findClosest(Point[] pointArray) // find closest distance and point from the another random point
    {
        Point p = new Point(5,6);
        double min = 1000;
        int indexOfMin = 0;
        if(pointArray.length == 0){
            return null;
        }
        else{
            for (int i = 0; i < pointArray.length; i++) {
                for (int j = 0; j < pointArray.length; j++) {
                    double distanceI = Math.sqrt(Math.pow(Math.abs(pointArray[i].getX()-p.getX()),2)+Math.pow(Math.abs(pointArray[i].getY()-p.getY()),2));
                    double distanceJ = Math.sqrt(Math.pow(Math.abs(pointArray[j].getX()-p.getX()),2)+Math.pow(Math.abs(pointArray[j].getY()-p.getY()),2));
                    if(distanceJ < distanceI && distanceJ <= min) {
                        min = distanceJ;
                        break;
                    }
                    else if(distanceI <= distanceJ && distanceI <= min) {
                        min = distanceI;
                        break;
                    }
                }
                for (int j = 0; j < pointArray.length; j++) {
                    double distance = Math.sqrt(Math.pow(Math.abs(pointArray[j].getX()-p.getX()),2)+Math.pow(Math.abs(pointArray[j].getY()-p.getY()),2));
                    if(distance == min){
                        indexOfMin = j;
                        break;
                    }
                }
            }
        }
        System.out.printf("Closest Distance to"+p+" Point: %.2f\n",min);
        System.out.println("Closest Point in Array to"+p+" Point: Point "+(indexOfMin+1)+pointArray[indexOfMin]);
        return pointArray[pointArray.length-1];
    }

     public static Point findFurthest(Point[] pointArray) // find furthest distance from the origin
     {
         double max = 0;
         int indexOfMax = 0;
         if(pointArray.length == 0){
             return null;
         }
         else{
             for (int i = 0; i < pointArray.length; i++) {
                 for (int j = 0; j < pointArray.length; j++) {
                     double distanceI = Math.sqrt(Math.pow(Math.abs(pointArray[i].getX()-0),2)+Math.pow(Math.abs(pointArray[i].getY()-0),2));
                     double distanceJ = Math.sqrt(Math.pow(Math.abs(pointArray[j].getX()-0),2)+Math.pow(Math.abs(pointArray[j].getY()-0),2));
                     if(distanceJ > distanceI && distanceJ > max) {
                         max = distanceJ;
                         break;
                     }
                     else if(distanceI >= distanceJ && distanceI >= max) {
                         max = distanceI;
                         break;
                     }
                 }
                 for (int j = 0; j < pointArray.length; j++) {
                     double distance = Math.sqrt(Math.pow(Math.abs(pointArray[j].getX()-0),2)+Math.pow(Math.abs(pointArray[j].getY()-0),2));
                     if(distance == max){
                         indexOfMax = j;
                         break;
                     }
                 }
             }
             System.out.printf("Furthest Distance to Origin: %.2f\n",max);
             System.out.println("Furthest Point in Array to Origin: Point "+(indexOfMax+1)+pointArray[indexOfMax]);
         }
         return pointArray[pointArray.length-1];
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
