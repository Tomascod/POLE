package prikladprocvicovani;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        ArrayList<Integer> pole=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("zadejte počet prvků");
        Integer p=sc.nextInt();

        Random rand=new Random();

        for (int i=0;i<p;i++) {
            pole.add(rand.nextInt(10));
        }
        System.out.println(pole.toString());
    }

}
