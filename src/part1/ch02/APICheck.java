package part1.ch02;

import java.util.Objects;

public class APICheck {
    String name;
    public APICheck() {
    }

    public APICheck(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        APICheck test = new APICheck("sang");
        APICheck test2 = new APICheck("sang");
        System.out.println(test == test2);
        System.out.println(test.equals(test2));
        System.out.println(test.hashCode());
        System.out.println(test2.hashCode());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        APICheck apiCheck = (APICheck) o;
        return Objects.equals(name, apiCheck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

