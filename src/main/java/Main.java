import object.Student;
import serviceImpl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        StudentServiceImpl service = new StudentServiceImpl();
        service.saveStudent(new Student("Mackul_I.O.",1999));
        System.out.println(service.findAllStudents());
        System.out.println(service.findStudentByName("Ermolaeva_N.V."));
        System.out.println(service.findStudentById(2));
        System.out.println(service.findStudentById(6));
    }
}
