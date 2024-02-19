package _07_generic;

import java.util.ArrayList;

// 일반 클래스
class CustomList{
    ArrayList<String> list = new ArrayList<>();

    public void addElement(String element){
        list.add(element);
    }
    public void removeElement(String element){
        list.remove(element);
    }

    public String get(int i){
        return list.get(i);
    }

    @Override
    public String toString(){
        return "CustomList = " +list;
    }
}

// 제네릭 클래스
class CustomListGeneric<T>{
    ArrayList<T> list = new ArrayList<T>();

    public void addElement(T element){
        list.add(element);
    }
    public void removeElement(T element){
        list.remove(element);
    }

    public T get(int i){
        return list.get(i);
    }

    // 리턴타입이 항상 String이기 때문에 바꾸지 않음
    @Override
    public String toString(){
        return "CustomList = " +list;
    }
    public static void main(String[] args) {
        // not using generic;
        CustomList li = new CustomList();
        li.addElement("fisrt element");
        li.addElement("second element");
        li.addElement("third element");
        System.out.println(li.toString());

        li.removeElement("second element");
        System.out.println(li.toString());

        String str = li.get(1);
        System.out.println(str);

        // using generic;
        CustomListGeneric<Integer> genericLi = new CustomListGeneric();
        genericLi.addElement(1);
        genericLi.addElement(2);
        genericLi.addElement(3);
        System.out.println(genericLi.toString());

        genericLi.removeElement(2);
        System.out.println(genericLi.toString());

        Integer num = genericLi.get(1);
        System.out.println(num);


        CustomListGeneric<Character> genericLi2 = new CustomListGeneric();
        genericLi2.addElement('A');
        System.out.println(genericLi2.toString());

    }
}
public class GenericEx1 {
}
