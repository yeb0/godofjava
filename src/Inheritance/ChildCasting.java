package Inheritance;

public class ChildCasting extends ParentCasting{
    public ChildCasting() {

    }
    public ChildCasting(String name){

    }
    public void printName() {
        System.out.println("printName() - Child");
    }
    public void printAge() {
        System.out.println("printAge() - 18 month");
    }

    public static void main(String[] args) {
        ParentCasting test = new ChildCasting(); // 가능
//        ChildCasting test2 = new ParentCasting(); // 불가능... -> 자식 객체를 생성할 때, 부모 생성자를 사용하면 안 된다.
    }
}
