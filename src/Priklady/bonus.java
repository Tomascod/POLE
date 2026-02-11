package Priklady;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Zadejte velikost hrací plochy");
        Integer velikost = input.nextInt();
        Integer l =0;

        Integer[][] hra = new Integer[velikost][velikost];

        for (int i = 0; i < hra.length; i++) {
            for (int j = 0; j <hra[i].length ; j++) {
                hra[i][j] = 0;
            }
        }

        System.out.println(Arrays.deepToString(hra));

        System.out.println("Zadejte množství pokladů");
        Integer poklad = input.nextInt();

        while(true){

            int idk=0;

boolean jedna=false;
            for (int k = 0; k < hra.length-1; k++) {
                for (int d = 0; d < hra[k].length-1 ; d++) {
                    if (hra[k][d]==1){
                        idk++;
                        if (idk>=poklad){
                             jedna=true;
                        }
                    }
                }
            }

            Integer ok = random.nextInt(0, hra.length-1);

            for (int h = 0; h < poklad; h++) {
                hra[ok][ok] =1;
            }

            if (jedna){
                System.out.println(Arrays.deepToString(hra));
                break;
            }
        }
    }
}
