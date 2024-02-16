package _03_array;

import java.sql.Array;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요");

        int[] arr = new int[5];
        double result=0.0 ;
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            result+=arr[i];
        }

        System.out.println("평균은 "+result/5);
    }



}
