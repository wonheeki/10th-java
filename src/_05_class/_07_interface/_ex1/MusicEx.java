package _05_class._07_interface._ex1;

public class MusicEx {
    public static void main(String[] args) {
        Music m;
        m = new Mp3Player("아이유 블루밍");
        m.play();
        m.stop();
        m = new CdPlayer("아이유 블루밍");
        m.play();
        m.stop();
    }
}
