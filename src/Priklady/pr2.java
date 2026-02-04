package Priklady;
import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        String[][] pole = {
                {"28","10","Den vzniku samostatného československého státu"},
                {"28","9","Den české státnosti"},
                {"17","11","Den boje za svobodu a demokracii"},
                {"5","7","Den slovanských věrozvěstů Cyrila a Metoděje"},
                {"6","7","Den upálení mistra Jana Husa"}
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Zadejte den (1-31)");
        String den = input.next();

        input.nextLine();

        System.out.print("Zadejte měsíc (1-12)");
        String mesic = input.next();

        for (int i = 0; i <= pole.length-1; i++) {
            if ((pole[i][0].equals(den))&&(pole[i][1].equals(mesic))) {
                System.out.println("Svátek: "+pole[i][2]);
            }
        }


    }
}
