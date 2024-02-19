package _05_class._07_interface._ex1;

public class MusicEx {
    public static void main(String[] args) {
        Music m;
        m = new Mp3Player("아이유 블루밍");
        System.out.println("====MP3 PLAYER====");
        m.play();
        m.stop();
        System.out.println();
        m = new CdPlayer("아이유 블루밍");
        System.out.println("====CD PLAYER====");
        m.play();
        m.stop();
    }
}
