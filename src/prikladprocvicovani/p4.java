package prikladprocvicovani;

import java.util.ArrayList;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        ArrayList pole = new ArrayList();

        Scanner input = new Scanner(System.in);
        System.out.println("zadejte číslo (pro ukončení zadejte -1)");
        while (true) {
            Integer i = input.nextInt();

            if (i==-1) {
                break;
            }else  {
                pole.add(i);
            }
        }
        System.out.println(pole.toString());
    }
}
