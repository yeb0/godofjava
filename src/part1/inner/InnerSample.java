package part1.inner;

public class InnerSample {
    public static void main(String[] args) {
        InnerSample test = new InnerSample();
        test.makeInnerObject();
    }

    public void makeInnerObject() {
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();
        inner.setValue(3);
        System.out.println(inner.getValue());
    }
}
