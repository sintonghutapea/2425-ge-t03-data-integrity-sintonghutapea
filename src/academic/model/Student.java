package academic.model;

/**
 * @author 12S23029 - Sintong Hutapea
 * @author 12S23038 - Alya Triswani
 */

 public class Student {
    private String studentId;
    private String studentName;
    private int year;
    private String major;

    public Student(String studentId, String studentName, int year, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.year = year;
        this.major = major;
    }

    @Override
    public String toString() {
        return studentId + "|" + studentName + "|" + year + "|" + major;
    }
}