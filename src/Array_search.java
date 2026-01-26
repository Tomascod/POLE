import java.util.Arrays;

public class Array_search {
    public static void main(String[] args) {
        int[] pole = {10,2,8,15,7,36};
        Arrays.sort(pole);
        System.out.println(Arrays.binarySearch(pole,15)); //vrací index toho nalezeného čísla, když ho nenajde vrátí zápornou hodnotu
    }
}
