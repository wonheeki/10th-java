package _04_exception;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] arr = new int[5];
            for (int i=1;i<6;i++){
                arr[i]= i;
                System.out.println(arr[i]);
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }

        try{
            System.out.println("배열의 크기를 입력하세요.");
            int size = sc.nextInt();

            if(size <=0){
                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
            }
            // 배열 생성
            int[] arr = new int[size];
            // 배열 요소 입력
            System.out.println(size+"개의 정수를 입력하세요.");
            int sum = 0;

            for(int i = 0; i<size; i++){
                System.out.print("정수 "+(i+1)+": ");
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }
            double result= (double)sum/size;
            System.out.println("평균 값 >> "+result);
        }catch(InputMismatchException e){
            System.out.println("정수를 입력해야함");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }



    }
}
