package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle{
    private int width;
    private int height;
    static int count=0;
    
    public Rectangle(int width){
        // 지역 변수와 필드 변수명이 동일하기 때문에 this를 사용해서 필드 값에 접근
        this.width= width;
        count ++; // 새로운 Rectangle 인스턴스가 생상될 때마다 개수 증가
    }

    public int area(){
        return width*height;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public static void main(String[] args) {
        // Rectangle 객체를 담는 ArrayList 생성
        ArrayList<Rectangle> rect = new ArrayList<>();
        
        // 사용자에게 안내 메세지 출력
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요.");
            int w =sc.nextInt();
            int h = sc.nextInt();

            // 0이 입력되면 종료
            if(w ==0 && h==0){
                break;
            }

            Rectangle r = new Rectangle(w);
            // 세로 길이 설정
            r.setHeight(h);
            
            // ArrayList에 Rectangle 객체 추가
            rect.add(r);

            // count 확인
            System.out.println("인스턴스 개수 : "+Rectangle.count);
        }
        
        // 입력된 Rectangle 객체들의 정보 출력
        for(Rectangle a : rect){
            System.out.println("가로 길이는 : "+a.getWidth());
            System.out.println("세로 길이는 : "+a.getHeight());
            System.out.println("넓이는 : "+ a.area());
            System.out.println("__________________________________");
        }
        
        // Rectangle 인스턴스의 개수 출력
        System.out.println("Rectangle 인스턴스의 개수는 : "+Rectangle.count);

        sc.close();
    }

}