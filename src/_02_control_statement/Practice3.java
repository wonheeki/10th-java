package _02_control_statement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i +" ");
        }

        System.out.println("숫자 두 개를 입력하세요");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("덧셈 결과 : " +( x+y));
        System.out.println("뺄셈 결과 : " + (x-y));
        System.out.println("나눗셈 결과 : " + (x/y));
        System.out.println("곱셈 결과 : " + (x*y));

        System.out.printf("반지름이 %d인 원의 넓이 : %f\n", 5,Area(5));
        System.out.printf("가로 %d, 세로 %d인 직사각형의 넓이 : %.1f\n", 4,7,Area(4,7));
        System.out.printf("밑변 %d, 높이 %d인 삼각형의 넓이 : %.1f\n", 6,3,Area(6.0,3.0));

    }
    public static double Area(int r){
        return r*r*Math.PI;
    }
    public static double Area(int x,int y){
        return x*y;
    }
    public static double Area(double w, double h){
        return(w * h)/2;
    }
}
