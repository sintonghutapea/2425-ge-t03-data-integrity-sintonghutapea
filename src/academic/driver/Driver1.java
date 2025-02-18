package academic.driver;

/**
 * @author 12S23029 - Sintong Hutapea
 * @author 12S23038 - Alya Triswani
 */

 import academic.model.Course;
 import academic.model.Student;
 import academic.model.Enrollment;
 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Driver1 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         ArrayList<Course> courses = new ArrayList<>();
         ArrayList<Student> students = new ArrayList<>();
         ArrayList<Enrollment> enrollments = new ArrayList<>();
 
         while (true) {
             String input = scanner.nextLine();
             if (input.equals("---")) break;
 
             String[] parts = input.split("#");
             if (parts.length > 1) {
                 switch (parts[0]) {
                     case "course-add":
                         if (parts.length == 5) {
                             if (courses.stream().noneMatch(c -> c.toString().startsWith(parts[1]))) {
                                 courses.add(new Course(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4]));
                             }
                         }
                         break;
                     case "student-add":
                         if (parts.length == 5) {
                             if (students.stream().noneMatch(s -> s.toString().startsWith(parts[1]))) {
                                 students.add(new Student(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4]));
                             }
                         }
                         break;
                     case "enrollment-add":
                         if (parts.length == 5) {
                             if (enrollments.stream().noneMatch(e -> e.toString().contains(parts[1]) && e.toString().contains(parts[2]))) {
                                 enrollments.add(new Enrollment(parts[1], parts[2], parts[3], parts[4]));
                             }
                         }
                         break;
                     default:
                         System.out.println("Unknown command!");
                 }
             }
         }
         courses.sort((c1, c2) -> c1.toString().compareTo(c2.toString()));
         students.sort((s1, s2) -> s1.toString().compareTo(s2.toString()));
         enrollments.sort((e1, e2) -> e1.toString().compareTo(e2.toString()));
 
         for (Course course : courses) {
             System.out.println(course);
         }
         for (Student student : students) {
             System.out.println(student);
         }
         for (Enrollment enrollment : enrollments) {
             System.out.println(enrollment);
         } 
     }
 }