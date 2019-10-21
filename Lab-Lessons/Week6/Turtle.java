import java.util.Scanner;
import java.awt.Point;

public class Turtle {

    static YON yön = YON.YUKARI;
    static KALEM kalem = KALEM.DOWN;
    static int harita[][] = new int[20][20];
    static Point coordinates=new Point(0,0);
    enum YON{YUKARI, SAG, ASAGI, SOL}
    enum KALEM{UP, DOWN}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen seçiminizi giriniz");
        int girdi = scanner.nextInt();
        while(girdi != 9){
            int birim;
            switch(girdi){
                case 1:
                    kalem = KALEM.UP;
                    break;
                case 2:
                    kalem = KALEM.DOWN;
                    break;
                case 3:
                    yonel(true);
                    break;
                case 4:
                    yonel(false);
                    break;
                case 5:
                    System.out.println("Atlama miktarını giriniz");
                    birim = scanner.nextInt();
                    ilerle(birim);
                    break;
                case 6 :
                    for(int a = 0 ; a < 19 ; a++) {
                        for (int b = 0; b < 19; b++)
                            System.out.print(harita[a][b] + " ");
                        System.out.println();
                    }
                    System.out.println( coordinates.x + " " +  coordinates.y);
                    break;
            }
            System.out.println("Lütfen seçiminizi giriniz");
            girdi = scanner.nextInt();
        }
    }

    public static void yonel(boolean sag){
        if(sag){
            switch(yön){
                case YUKARI:
                    yön = YON.SAG;
                    break;
                case SAG:
                    yön = YON.ASAGI;
                    break;
                case ASAGI:
                    yön = YON.SOL;
                    break;
                case SOL:
                    yön = YON.YUKARI;
                    break;
            }
        } else {
            switch(yön){
                case YUKARI:
                    yön = YON.SOL;
                    break;
                case SAG:
                    yön = YON.YUKARI;
                    break;
                case ASAGI:
                    yön = YON.SAG;
                    break;
                case SOL:
                    yön = YON.ASAGI;
                    break;
            }
        }
    }

    public static void ilerle(int birim){
        if(yön == YON.SAG){
            int bitis = coordinates.x + birim;
            if(bitis>= 19)
                bitis = 19;

            if(kalem == KALEM.DOWN){
                for(int i = coordinates.x; i < bitis; i++){
                    harita[coordinates.y][i] = 1;
                }
            }
            coordinates.x = bitis;
        } else if(yön == YON.SOL) {
            int bitis = coordinates.x - birim;
            if(coordinates.x - birim < 20)
                bitis = 0;

            if(kalem == KALEM.DOWN){
                for(int i =  coordinates.x; i >= bitis; i--){
                    harita[coordinates.y][i] = 1;
                }
            }
            coordinates.x = bitis;
        }
        else if(yön == YON.YUKARI) {
            int bitis = coordinates.y - birim;
            if(bitis < 20)
                bitis = 0;

            if(kalem == KALEM.DOWN){
                for(int i = bitis; i >= bitis; i--){
                    harita[i][ coordinates.x] = 1;
                }
            }
            coordinates.y = bitis;
        }
        else if(yön == YON.ASAGI) {
            int bitis = coordinates.y + birim;
            if(bitis >= 19)
                bitis = 19;

            if(kalem == KALEM.DOWN){
                for(int i = coordinates.y; i < bitis; i++){
                    harita[i][coordinates.x] = 1;
                }
            }
            coordinates.y = bitis;
        }
    }
}
