package _05_class._07_interface._ex1;

public class Mp3Player implements Music{
    String song;

    public Mp3Player(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    @Override
    public void play() {
        System.out.println("MP3 플레이어에서 '"+song+"'음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 플레이어에서 '"+song+"'음악을 정지합니다.");
    }
}
