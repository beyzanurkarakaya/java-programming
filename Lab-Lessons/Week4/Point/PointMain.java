public class PointMain {

    public static void main(String[] args) {

        Point pointObj1=new Point();
        System.out.println("Number of points in the system "+Point.count);
        Point pointObj2=new Point(6.7,9.8);
        System.out.println("Number of points in the system "+Point.count);
        Point pointObj3=new Point(pointObj2);
        System.out.println("Number of points in the system "+Point.count);
        System.out.println("pointObj1 "+pointObj1);
        System.out.println("pointObj2 "+pointObj2);
        System.out.println("pointObj3 "+pointObj3);

        double dist=pointObj3.distance(6.7,13);
        System.out.println("Distance between points is :"+dist);

        double dist2=pointObj3.distance(pointObj2);
        System.out.println("Distance between points is :"+dist2);
        pointObj3.setY(10);

        double dist3=pointObj3.distance(pointObj2);
        System.out.println("Distance between points is :"+dist3);

        System.out.println("Quick distance between points is "+Point.distance(4.0,3.4,6.7,9));
    }
}
