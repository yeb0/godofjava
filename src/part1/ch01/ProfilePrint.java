package part1.ch01;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;
    public static void main(String[] args) {
        ProfilePrint test = new ProfilePrint();
        test.setAge((byte) 20);
        test.setName("우상훈");
        test.setMarried(false);
        System.out.println(test.age + test.name + test.isMarried);
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public byte getAge(byte age) {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name) {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean flag) {
        this.isMarried = flag;
    }
}
