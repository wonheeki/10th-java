package _01_basic_syntax;

import java.util.Scanner;

// 입출력
public class InputOutput {
    public static void main(String[] args) {
        // 출력 
        System.out.println("안녕하세요"); // 줄바꿈
        System.out.print("잘부탁드립니다 \n"); // 줄바꿈 X

        // 입력
        // - Scanner 클래스 이용
        System.out.println("공백으로 구분하요 이름/나이/키/결혼여부를 입력해주세요 >>>");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // 공백 이전까지 문자열 읽기
        int age = scanner.nextInt(); // 공백 이전까지의 정수 읽기
        double height = scanner.nextDouble(); // 공백 이전까지의 실수 읽기
        boolean single = scanner.nextBoolean(); // 공백 이전까지의 불리언 읽기

        System.out.println("====입력 결과 출력====");
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("키 : "+height);
        System.out.println("결혼 여부 : "+single);


        scanner.close();
    }
}
