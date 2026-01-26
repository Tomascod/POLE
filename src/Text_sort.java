import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Text_sort {
    public static void main(String[] args) {
        String[] name = {"Čína","Chile","Ceylon","Dánsko"};
        System.out.println(Arrays.toString(name));

        Collator csCo1 = Collator.getInstance(new Locale("cs","CZ"));
        Arrays.sort(name,csCo1);
        System.out.println(Arrays.toString(name));

        Arrays.sort(name, Collections.reverseOrder(csCo1));
        System.out.println(Arrays.toString(name));
    }
}
