package string;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
//        sample.checkString();
        sample.checkCompare();
    }

    public void checkCompare() {
        String text = "Check Value";
        String text2 = "Check Value";
        if (text == text2) {
            System.out.println("text == text2 is result true");
        } else {
            System.out.println("text == text2 is result false");
        }
        if (text.equals("Check Value")) {
            System.out.println("text.equals(text2) is result true");
        }
    }

    public void checkString() {
        String text = "You must know String class.";
        String korText = "한글";
        System.out.println(korText.length());
        System.out.println(korText.isEmpty());
    }
}
