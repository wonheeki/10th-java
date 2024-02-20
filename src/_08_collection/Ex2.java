package _08_collection;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
        while (true){
            System.out.print("이름 입력 : ");
            String key = sc.next();
            if(key.equals("종료")){
                break;
            }
            System.out.print("나이 입력 : ");
            int value = sc.nextInt();


            map.put(key,value) ;
        }

        System.out.println(map.toString());

        // 키와 값을 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아 리턴
        Set<Map.Entry<String,Integer>> entrySet =  map.entrySet();
        System.out.println("== 입력 받은 이름과 나이 목록 ==");
        Iterator<Map.Entry<String,Integer>> entryIterator= entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.printf("이름 : %s, 나이 : %d\n", k,v);
        }


    }
}
