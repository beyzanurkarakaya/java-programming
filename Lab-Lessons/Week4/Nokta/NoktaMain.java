public class NoktaMain {

    public static void main(String[] args) {
        Nokta p1 = new Nokta(5,6);
        Nokta p2 = new Nokta();
        Nokta p3 = new Nokta(p1);
        Nokta p4 = new Nokta(8,9);
        System.out.println("x: " + p3.getX() + " y: " + p3.getY());
        p2.distance(5,6);
        p3.distance(p4);
    }
}
