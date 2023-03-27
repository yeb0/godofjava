package part1.string;

public class StringSample {
    public static void main(String[] args) throws Exception {
        StringSample sample = new StringSample();
        sample.convert();
    }

    public void convert() throws Exception {
            String korean = "자바의 신 최고 !!!";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);
    }

    public void printByteArray(byte[] array) {
        for (byte data : array) {
            System.out.println(data + " " + " <- byte 배열 데이터 입니다.");
        }
        System.out.println();
    }
}
