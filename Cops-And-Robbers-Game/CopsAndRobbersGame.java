/*
@author beyzanurkarakaya
This project is a cops and robbers game.
 */

import java.util.*;

class CopsAndRobbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Prison's Line: ");
        int N = s.nextInt(); // prison array's line
        System.out.print("Enter Prison's Column: ");
        int M = s.nextInt(); // prison array's column
        System.out.print("Enter 'How many cells can the cop go?': ");
        int k = s.nextInt(); // how many cells can the cop(police) go
        System.out.println();
        int[][] prison = new int[N][M];

        // "0" is empty cell, "1" is cop, "2" is robber
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int random = new Random().nextInt(3);
                prison[i][j] = random;

                System.out.print(prison[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(prison[i][j]==1){
                    for(int p = k; p >= 0; p--) {
                        int place = p+j;
                        if (place < M) {
                            if (prison[i][place] == 2) {
                                prison[i][place] = 3; // after catching the robber "2" turns to "3"
                                break;
                            }
                        }
                        int place2 = j-p;
                        if(place2 >= 0){
                            if(prison[i][place2]==2){
                                prison[i][place2]=3;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(prison[i][j]==3){
                    count++;
                }
            }
        }

        System.out.println(count + " Robber Caught!\n");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(prison[i][j]+" ");
            }
            System.out.println();
        }
    }
}
