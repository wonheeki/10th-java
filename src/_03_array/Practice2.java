package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> str= new ArrayList<>();

        while(true){

            System.out.println("문자를 입력해주세요. : ");
            String input = sc.next();
            if(input.equals("exit")){
                break;
            }else{
                str.add(input);
            }

        }
        for(String word : str){
            System.out.println(word);
        }
//        System.out.println(str);
    }


}
