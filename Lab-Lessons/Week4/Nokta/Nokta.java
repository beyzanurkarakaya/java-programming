public class Nokta
{
    private int x;
    private int y;

    public Nokta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Nokta() {
        this.x = 0;
        this.y = 0;
    }

    public Nokta(Nokta p){
        this.x = p.x;
        this.y = p.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void distance (int x, int y) { // parametre içi (x1, y1) olabilir
        double myPoint = Math.pow((x-this.x),2) + Math.pow((y-this.y),2); // o zaman burası da Math.pow(x1-x),2 olur
        System.out.println("Distance = "+ Math.sqrt(myPoint));
    }

    public void distance (Nokta p){
        double myPoint = Math.pow((p.getX()-this.x),2) + Math.pow((p.getY()-this.y),2);
        System.out.println("Distance = "+ Math.sqrt(myPoint));
    }
}
