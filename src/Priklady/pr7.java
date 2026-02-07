package Priklady;

import java.util.Arrays;
import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
Integer[][] pole = {
        {1,1,0,0,1},
        {0,1,0,1,1},
        {1,1,1,0,0}
};
        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte řadu (1-3) ");
        Integer row = sc.nextInt();
        row--;

        System.out.println("zadejte číslo sedadla (1-5) ");
        Integer sedadlo = sc.nextInt();
        sedadlo--;

        Integer misto = pole[row][sedadlo];


                if (pole[row][sedadlo]==1){
                    System.out.println("Místo je obsazeno");
                }else {
                    System.out.println("místo je zarezervováno");
                    pole[row][sedadlo] = 1;
                }

        System.out.println(Arrays.deepToString(pole));

                int obsazeni = 0;

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                if (pole[i][j]==1){
                    obsazeni++;
                }
            }
        }

        float procentualniObsazeni = (((100f/ (pole.length*pole[0].length))*obsazeni));
        System.out.println("je zaplněno "+procentualniObsazeni+"% míst");


    }
}
