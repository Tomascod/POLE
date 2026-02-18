package test;

import java.util.ArrayList;
import java.util.Scanner;

public class PR1 {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Zadejte jméno (až nebude chtít, tak zadejte konec) ");
        while(true){
            String input = sc.nextLine();
            if(input.equals("konec")){
                break;
            }else al1.add(input);
        }

        System.out.println(al1.toString());
    }
}
