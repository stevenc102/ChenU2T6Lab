public class LabRunner {
    public static void main(String[] args) {
        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());
        String str = "0";

        str += str + 0 + 8;

        System.out.println(str);

    }
}
