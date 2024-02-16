package _05_class._01_class;

import java.util.Scanner;

public class Rectangle{
    int width;
    int height;

    public Rectangle(int width, int height){
        this.width= width;
        this.height=height;
    }

    public int area(){
        return width*height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요.");
        int w = sc.nextInt();
        int h = sc.nextInt();
        Rectangle rec = new Rectangle(w,h);
        System.out.println(rec.area());
//        rec.area();

    }

}