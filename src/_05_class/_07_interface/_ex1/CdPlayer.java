package _05_class._07_interface._ex1;

public class CdPlayer implements Music{
    String song;

    public CdPlayer(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    @Override
    public void play() {
        System.out.println("Cd 플레이어에서 "+song+"음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("Cd 플레이어에서 "+song+"음악을 정지합니다.");
    }
}
