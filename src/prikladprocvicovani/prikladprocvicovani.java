package prikladprocvicovani;

import java.util.Scanner;

public class prikladprocvicovani {
    public static void main(String[] args) {
        String[][] kraje = {
                {"A", "Hlavní město Praha"},
                {"B", "Jihomoravský kraj"},
                {"C", "Jihočeský kraj"},
                {"E", "Pardubický kraj"},
                {"H", "Královéhradecký kraj"},
                {"J", "Kraj Vysočina"},
                {"K", "Karlovarský kraj"},
                {"L", "Liberecký kraj"},
                {"M", "Olomoucký kraj"},
                {"P", "Plzeňský kraj"},
                {"S", "Středočeský kraj"},
                {"T", "Moravskoslezský kraj"},
                {"U", "Ústecký kraj"},
                {"Z", "Zlínský kraj"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte poznávací značku ve formátu: XYX XXXX");
        String kraj = sc.nextLine();

        for (int i = 0; i <= kraje.length-1; i++) {
            if (kraje[i][0].equals(kraj.substring(1,2))){
                System.out.println(kraje[i][1]);
            }
        }
    }
}
