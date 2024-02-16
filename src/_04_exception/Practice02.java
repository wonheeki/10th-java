package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

            for(int i = 0; i<size; i++){
                System.out.print("정수 "+(i+1)+": ");
                arr[i] = sc.nextInt();
            }

            // 중복된 요소 찾기
            ArrayList<Integer> duplicates = findDuplicate(arr);

            // 중복된 요소 출력
            if(duplicates.isEmpty()){
                System.out.println("중복된 요소가 없습니다."  );
            }else{
                System.out.println("중복된 요소 : " + duplicates);
            }

        }catch(InputMismatchException e){
            System.out.println("정수를 입력해야함");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }

    // 중복된 요소를 찾는 메서드
    public static ArrayList<Integer> findDuplicate (int[] arr){
        ArrayList<Integer> duplicates = new ArrayList<>();

        // ex. arr:[1,2,3,2,1]
        // index
        // 0에 대해서 1,2,3,4 => i = 0, j= 1 ~ length -1
        // 1에 대해서 2,3,4 중복확인
        // 2에 대해서 3,4
        // 3에 대해서 4
        for(int i =0;i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j] && !duplicates.contains(arr[i])){
                    // 중복된 요소가 한 번만 추가되도록
                    duplicates.add(arr[i]);
                }
            }

        }
        System.out.println(duplicates);
        return duplicates;
    }
}
