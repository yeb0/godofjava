package part1.inner;

public class NestedValueReference {
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    protected int privateInt = 3;
    static int staticInt = 4;

    static class StaticNested {
        public void setValue() {
            staticInt = 14; // 감싸고 있는 클래스의 static 변수만 참조 가능, static 하기에 부모 class에 static 하지 않은 것은 X
        }
    }
    class Inner {
        public void setValue() {
            publicInt = 20;
            protectedInt = 21;
            justInt = 22;
            privateInt = 23;
            staticInt = 24;
        }
    }
    public void setValue() {
        EventListener linstener = new EventListener() {
            @Override
            public void onClick() {
                publicInt = 30;
                protectedInt = 31;
                justInt = 32;
                privateInt = 33;
                staticInt = 34;
            }
        };
    }
}
