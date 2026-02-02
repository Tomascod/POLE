package Priklady;

public class pr1 {
    public static void main(String[] args) {
        String[][] znacky = {
                {"A", "Praha"},
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

        String znacka = "1E5 4297";
        String pismeno = znacka.toString().substring(1,2);

        for (int i = 0; i < znacky.length; i++) {
            if (pismeno==znacky[i][0]){

            }

        }


    }
}
