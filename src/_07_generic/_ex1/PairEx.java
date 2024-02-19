package _07_generic._ex1;

public class PairEx {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("One",1);
        System.out.println(p1.toString());

        Pair<Integer,String> p2 = new Pair<>(2,"Two");
        System.out.println(p2.toString());

    }
}
