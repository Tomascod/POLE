package Priklady;
import java.util.Arrays;
public class pr6 {
    public static void main(String[] args) {
        Integer[][] pole = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };

        System.out.println(Arrays.deepToString(pole));

        Integer rows = pole.length;
        Integer column = pole[0].length;

        Integer[][] pole2 = new Integer[column][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                pole2[j][i] = pole[i][j];
            }
        }
        System.out.println(Arrays.deepToString(pole2));
    }
}
