public class Ucgen {

    public static void main(String[] args){

       char ilkHarf = 'A';
       int yukseklik = 7;

            for(int i = 0; i < yukseklik; i++){

                for(int j = 1; j < yukseklik - i ;j++)
				{
                    System.out.print(" ");
                }

                for(int k = 0; k < 1+2*i ;k++){

                    if(k < (1+i)){
                        System.out.print(ilkHarf);
                        ilkHarf++;
                    }

                    else if(k == (1+i)){
                        ilkHarf--;
                        ilkHarf--;
                        System.out.print(ilkHarf);
                    }

                    else{
                       ilkHarf--;
                       System.out.print(ilkHarf);
                    }
                }
                System.out.println();
                ilkHarf = 'A';
            }
    }
}
