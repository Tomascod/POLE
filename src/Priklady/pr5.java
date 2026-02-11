package Priklady;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean ano = true;

        System.out.println("Zadejte číslo (až nebude chtít, tak zadejte -1) ");
        while(true){
            int input = sc.nextInt();
            if(input==-1){
                break;
            }else al1.add(input);
        }

        System.out.println(al1.toString());
    }
}
