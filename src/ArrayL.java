import java.util.ArrayList;
import java.util.List;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10); // to číslo v závorce je předpoklad kolik tam bude hodnot
        numbers.add(10);
        numbers.add(20);
        int delka = numbers.size();
        //numbers.set(0,120); - to první je index a to druhý na co to změníme
        //numbers.remove(0);
        //numbers.clear();

        System.out.println (numbers.get(0));

        System.out.println();

        for (Integer number:numbers){
            System.out.println(number);
        }

        System.out.println();

        Integer[] pole = {1,2,3};
        ArrayList<Integer> al10 = new ArrayList<>(List.of(pole));

        for (Integer idk:al10){
            System.out.println(idk);
        }


    }
}
