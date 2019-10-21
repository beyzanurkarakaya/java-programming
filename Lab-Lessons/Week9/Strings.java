/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class Strings
{
    // Reads in an array of integers, sorts them, // then prints them in sorted order.
    // -------------
    public static void main (String[] args)
    {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many integers do you want to sort? "); size = scan.nextInt();
        stringList = new String[size];
        System.out.println ("\nEnter the numbers..."); for (int i = 0; i < size; i++)
        stringList[i] = scan.next();
        System.out.println ("\nYour numbers in sorted order...");
        Sorting.insertionSort(stringList);
        for (int i = 0; i < size; i++)
            System.out.print(stringList[i] + "  ");
        System.out.println ();
    }
}
