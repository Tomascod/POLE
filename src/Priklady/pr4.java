package Priklady;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kolik prvků mí mít pole?");
        Integer number = sc.nextInt();

        ArrayList<Integer> pole = new ArrayList<>(number);

        Random rand = new Random();


        for (int i = 0; i < number; i++) {
            Integer r = rand.nextInt(1,1001);
            pole.add(r);
        }

        for (Integer no : pole) {
            System.out.print(no + " | ");
        }

    }
}
