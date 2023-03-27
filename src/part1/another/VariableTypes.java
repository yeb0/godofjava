package part1.another;

public class VariableTypes {
    int instanceVariable; // 인스턴스 변수 -> 객체가 생성될 때 생명주기 시작, 객체를 참조하고 있는 다른 객체가 없다면 소멸
    static int classVariable; // 클래스 변수 -> 클래스가 생성될 때 생명주기 시작, 프로그램이 끝날 떄 소멸 (static 이 있어야함. static이라 끝날 때 소멸하는 것, 시작도 마찬가지)
    public void method(int parameter) { // 매개 변수 -> 메소드 호출될 때 시작, 메소드가 끝나면 소멸 ( 호출한 메서드에서 넘겨준 참조 자료형(ex)String)은 그대로 살아있다.)
        int localVariable;  // 지역 변수 -> 지역 변수를 선언한 곳에서부터 시작, 지역 변수를 선언한 중괄호가 끝나면 소멸
    }
}
