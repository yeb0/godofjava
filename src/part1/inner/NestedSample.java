package part1.inner;

public class NestedSample {
    public static void main(String[] args) {
        NestedSample test = new NestedSample();
        test.makeStaticNestedObject();
    }

    public void makeStaticNestedObject() {
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }
}
