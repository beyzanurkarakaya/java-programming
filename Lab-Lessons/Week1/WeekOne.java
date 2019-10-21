import java.util.Scanner;

public class WeekOne {

    // Yorum Satırı

    /*
       İkinci Yorum
     */

    /**
     *
     * @param args
     * deneme
     */

    public static void main(String[] args) {

     /*
	   // EKRANA ÇIKTI YAZDIRMA
	   System.out.println("Hello World");
     System.out.print("Object Oriented ");
     System.out.print("Programming \nClass\n");
     System.out.println("My first argument is "+args[0]);
     */

     /*
	   // FIBONACCI DİZİSİ
	   int first=0;
     int second=1;

     for (int i = 0; i <10 ; i++) {
        System.out.print(first+" ");
        int temp=first+second;
        first=second;
        second=temp;
    }
    */

    /*
	  // KULLANICIDAN GİRDİ ALMA
	  Scanner scanObject=new Scanner(System.in);
    System.out.print("Enter a number:");
    int number=scanObject.nextInt();
    System.out.printf("Entered number is %d \n",number);
    //System.out.println("Entered number is "+number);
   */

    /*
		// ÜÇGEN YAZDIRMA
		int number=8;
    for (int i = 0; i <number ; i++) {
        for (int j = 0; j < ((2*number-1)-(2*(i+1)-1))/2 ; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j <(2*(i+1)-1) ; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
		*/

		// GİRİLEN SAYILAR ARMSTRONG SAYISI MI
    Scanner scObj=new Scanner(System.in);
    System.out.print("Enter the possible Armstrong Number:");
    int number=scObj.nextInt();
    int t=1;
    int temp=number;

    while (temp!=0) {
        temp=temp/10;
        if(temp>=1)
        t++;
    }
    System.out.println("The entered number "+number+" has "+t+" digits");

    int top=0;
    temp=number;
    for (int i = 0; i <t ; i++) {
        int digit=temp%10;
        top+=Math.pow(digit,t);
        temp=temp/10;
    }

    if(top==number)
        System.out.println("The number is an Armstrong Number");
    else
        System.out.println("The number is not an Armstrong Number");
    }
}
