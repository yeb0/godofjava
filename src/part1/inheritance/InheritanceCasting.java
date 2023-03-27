package part1.inheritance;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
//        inheritance.objectCast();
    }
    /*
    public void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
//        ChildCasting child2 = (ChildCasting) parent; // java: incompatible types: Inheritance.ParentCasting cannot be converted to Inheritance.ChildCasting
        // parent 객체는 부모이며, 자식 클래스에 있는 메서드나 변수를 온전히 사용이 불가능하기에 이렇다.
    }
     */

    public void objectCast2() {
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting) parent2;
    }

}
