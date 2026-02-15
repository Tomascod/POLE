package prikladprocvicovani;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        String[][] svatky = {
                {"1",  "4",  "Hugo"},
                {"24", "4",  "Jiří"},
                {"12", "5",  "Pankrác"},
                {"13", "5",  "Servác"},
                {"14", "5",  "Bonifác"},
                {"13", "6",  "Antonín"},
                {"5",  "7",  "Cyril a Metoděj"},
                {"28", "9",  "Václav"},
                {"11", "11", "Martin"},
                {"24", "12", "Adam a Eva"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte den");
        String den = sc.nextLine();



        System.out.println("zadejte měsíc");
        String mesic = sc.nextLine();


        for (int i = 0; i <= svatky.length-1; i++){
            if (svatky[i][0].equals(den)&&svatky[i][1].equals(mesic)){
                System.out.println(svatky[i][2]);
            }
        };
    }
}
