package _05_class._07_interface;

// interface 선언
public interface RemoteControl {
    // 추상 메서드만 선언
    public abstract void turnOn();
    public void turnOff();

    public void setVolume(int volume);

    // 상수 필드
    // - 인터페이스에 선언된 필드는 모두 'public static final' 특징을 갖는다.
    // 생략하더라도 컴파일 과정에서 자동으로 붙음
    // - 상수형은 대문자로 작성, 언더바로 연결

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 1;
}
