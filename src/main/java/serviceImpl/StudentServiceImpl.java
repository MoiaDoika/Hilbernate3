package serviceImpl;

import dao.StudentDao;
import object.Student;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao DAO = new StudentDao();

    public StudentServiceImpl() {
    }

    public Student findStudentById(int id) {
        return DAO.findId(id);
    }

    public List<Student> findStudentByName(String name) {
        return DAO.findName(name);
    }

    public void saveStudent(Student student) {
        DAO.save(student);
    }

    public void deleteStudent(Student student) {
        DAO.delete(student);
    }

    public List<Student> findAllStudents() {
        return DAO.findAll();
    }

}
