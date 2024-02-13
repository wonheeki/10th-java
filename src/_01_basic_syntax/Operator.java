package _01_basic_syntax;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a,b;

        // 대입 연산자 (=)
        x = 10;
        y = 20;
        a =  5.0f;
        b = 10.0f;

        // 산술 연산자 : 숫자형 데이터에 대해서 산술 연산 가능
        System.out.println("==== x, y ====");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("x + y = "+(x+y));
        System.out.println("x - y = "+(x-y));
        System.out.println("x * y = "+(x*y));
        System.out.println("x / y = "+(y/x));
        System.out.println("x % y = "+(x%y));

        System.out.println("==== a, b ====");
        System.out.printf("a = %f\n",a);
        System.out.printf("b = %f\n",b);
        System.out.printf("a + b =  %f\n",(a+b));
        System.out.printf("a - b = %f\n",(a-b));
        System.out.printf("a * b = %f\n",(a*b));
        System.out.printf("a / b = %f\n",(a/b));
        System.out.printf("a %% b = %f\n",(a%b));

        // 증가, 감소 연산자
        System.out.println("====증감 연산자 ====");
        System.out.println("x++ = "+ x++ + " "+x); // 후위 증가
        System.out.println("++x = "+ ++x + " "+x); // 전위 증가
        System.out.println("x-- = "+ x-- + " "+x);
        System.out.println("--x = "+ --x + " "+x);

        // 산술적인 대입 연산자
        System.out.println("==== 산술적인 대입 연산자 ====");
        System.out.println(x);
        System.out.println("x += 5 >>" + (x += 5));
        System.out.println("x -= 5 >>" + (x -= 5));
        System.out.println("x *= 5 >>" + (x *= 5));
        System.out.println("x /= 5 >>" + (x /= 5));
        System.out.println("x %= 5 >>" + (x %= 5));

        // 비교 연산자 : 연산 결과 불리언(true/false)
        System.out.println("==== 비교 연산자 ====");
        System.out.println("a > b >>" + (a > b));
        System.out.println("a < b >>" + (a < b));
        System.out.println("a >= b >>" + (a >= b));
        System.out.println("a <= b >>" + (a <= b));
        System.out.println("a == b >>" + (a == b));
        System.out.println("a != b >>" + (a != b));

        // 논리 연산자 : 연산결과 불리언
        boolean j = true;
        boolean k = false;
        boolean l = true;
        
        System.out.println("==== 논리연산자 ====");
        System.out.println("j && k >>"+ (j&&k)); // and : j와 k 모두 참이어야 참
        System.out.println("j && l >>" +(j&&l));
        System.out.println("j || k >>" +(j||k)); // or : j,k 둘 중 하나라도 참이면 참
        System.out.println("!j >>" +(!j)); // not : 부정

        // 삼항 연산자 
        System.out.println("==== 삼항 연산자 ====");
        System.out.println(x>y ? "x는 y보다 큼" : "x는 y보다 크지 않음");


    }
}
