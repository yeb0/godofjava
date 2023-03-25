package ch01;

public class PassTest {
    public static void main(String[] args) {
        PassTest test01 = new PassTest();
        test01.callPassByValue();
    }
    public void callPassByValue() {
        int a = 10;
        String b = "b";
        System.out.println("전의 패스값");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        passByValue(a, b);
        System.out.println("이후의 패스값");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("지금 패스값입니다.");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
