//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Collections;
import java.text.Collator;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Integer[] array = {1,5,3,4,2};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

        String[] name = {"Čína","Chile","Ceylon","Dánsko"};
        Collator csCo1 = Collator.getInstance(new Locale("cs","CZ"));
        Arrays.sort(name,csCo1);
        System.out.println(Arrays.toString(name));
    }
}