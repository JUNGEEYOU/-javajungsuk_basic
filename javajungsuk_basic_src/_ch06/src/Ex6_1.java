public class Ex6_1 {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Tv tv2 = new Tv();
        tv.channel = 7;
        tv.channelDown();
        System.out.println(tv.channel);

        tv2 = tv;     // 참조변수를 저장 (서로 같은 곳을 참조)
        System.out.println(tv2.channel);   // tv2는 세팅 안했지만, tv와 동일한 값을 가짐

    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}