package test;

public class PR2 {
    public static void main(String[] args) {
Integer[][] pole = {
        {3,100},
        {2,150},
        {5,200},
};

int cena = 0;
        for (int i = 0; i < pole.length; i++) {
            int pridat = pole[i][0]*pole[i][1];

            cena+=pridat;
        }

        System.out.println("finální cena = "+cena);
    }
}
