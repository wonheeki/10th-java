package _05_class._04_final;

import java.util.Scanner;

public class Circle {
    private final int radius;
    private static final float PI = 3.141592f;

    public Circle(int radius){
        this.radius = radius;
    }

    public float calculateArea(){
        return radius*radius*PI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요 : ");
        int r = sc.nextInt();
        Circle c = new Circle(r);
        System.out.printf("원의 반지름 : %.1f\n",(float)c.radius);
        System.out.printf("원의 넓이 : %f\n",c.calculateArea());
    }
}
