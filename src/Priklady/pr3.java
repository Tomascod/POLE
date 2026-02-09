package Priklady;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class pr3 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> tabulka = new ArrayList<>();
        ArrayList<String> pridavani = new ArrayList<>();
        pridavani.add("česky");
        pridavani.add("anglicky");
        tabulka.add(pridavani);

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Chcete přidat novou barvu, jazyk nebo vypsat seznam? (barva/jazyk/vypis/konec)");
            String rozhodnuti =  input.nextLine();
            if (rozhodnuti.equals("barva")){
                System.out.println("zadejte název barvy: ");
                String barva = input.nextLine();
                ArrayList<String> newcolor = new ArrayList<>();

                for (int i = 0; i < tabulka.get(0).size(); i++) {
                    String AktualniJazyk = tabulka.get(0).get(i);
                    System.out.println("Zadejte název barvy "+AktualniJazyk+ ":");
                    String color = input.nextLine();
                    newcolor.add(color);
                }

                tabulka.add(newcolor);

            } else if (rozhodnuti.equals("jazyk")) {
                System.out.println("Zadejte název nového jazyku: ");
                String language = input.nextLine();
                pridavani.add(language);


                for (int i = 1; i < tabulka.size(); i++) {
                    System.out.println("Zadejte překlad pro "+ tabulka.get(i).get(0));
                    tabulka.get(i).add(input.nextLine());

                }
            } else if (rozhodnuti.equals("vypis")){
                System.out.println(Arrays.deepToString(tabulka.toArray()));
            }else {break;}
        }
    }
}
