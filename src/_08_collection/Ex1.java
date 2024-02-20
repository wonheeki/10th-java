package _08_collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> hash =new HashSet<>();
        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
        while (true){
            System.out.print("정수 입력 : ");
            int num = sc.nextInt();
            if(num ==-1){
                break;
            }

            hash.add(num) ;
        }
        System.out.println("중복 제거된 정수 목록 : "+hash.toString());
    }
}
