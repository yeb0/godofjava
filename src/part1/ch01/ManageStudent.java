package part1.ch01;

public class ManageStudent {
    public static void main(String[] args) {
        Student[] student;
        ManageStudent st = new ManageStudent();
        student = st.addStudent();
        st.printStudents(student);
    }
    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@naver.com");
        return student;
    }
    public void printStudents(Student[] student) {
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }
    }
}
