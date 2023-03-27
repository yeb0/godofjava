package part1.string;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods text = new UseStringMethods();
//                "The String class represents character strings";
        text.printWords("The String class represents character strings");
        text.findString("The String class represents character strings", "string");
        text.findAnyCaseString("The String class represents character strings", "string");
        text.countChar("The String class represents character strings", 's');
        text.printContainWords("The String class represents character strings", "ss");
    }
    public void printWords(String str) {
        String[] split = str.split(" ");
        for (String word : split) {
            System.out.println(word);
        }
    }
    public void findString(String str, String findStr) {
        int index = str.indexOf(findStr);
        System.out.println(findStr + " is appeared at " + index);
    }
    public void findAnyCaseString(String str, String findStr) {
        int i = str.toLowerCase().indexOf(findStr);
        System.out.println(findStr + " is appeared at " + i);
    }
    public void countChar(String str,char c) {
        char[] toCharArray = str.toCharArray();
        int charCount = 0;
        for (char arr : toCharArray) {
            if (arr == c) {
                charCount = charCount + 1;
            }
        }
        System.out.println("char '" + c + "' count is " + charCount);
    }
    public void printContainWords(String str, String findStr) {
        String[] split = str.split(" ");
        for (String find : split) {
            if (find.contains(findStr)) {
                System.out.println(find + " contains " + findStr);
            }
        }
    }
}
