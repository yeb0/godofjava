package part1.ch01;

public class PrimtiveTypes {
    public static void main(String[] args) {
        PrimtiveTypes types = new PrimtiveTypes();
        types.checkByte();
        types.checkChar();
        int intDefault1;

    }
    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin is : " + byteMin);
        System.out.println("byteMax is : " + byteMax);
    }

    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin = " + charMin);
        System.out.println("charMax = " + charMax);
        int intValue = 'a';
        System.out.println("intValue = " + intValue);
    }
    public void defaultValues() {
        int intDefault2= 2;
        System.out.println("intDefault2 = " + intDefault2);
    }
}
