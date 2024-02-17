package _05_class._07_interface;

public class RemoteControlEx {
    public static void main(String[] args) {
        // interface도 하나의 타입이므로 변수의 타입으로 사용 가능
        // - interface는 참조 타입 -> null 대입 가능
        RemoteControl rc; // 넣은 값이 없기 때문에 null 참조

        // rc 변수에 Television 객체 대입
        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(22);
        
        // rc 변수에 Audio 객체를 대입(교체)
        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
