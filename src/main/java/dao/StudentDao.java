package dao;

import object.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;




public class StudentDao {

    public void delete(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
        session.close();
    }

    public void save(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }

    public List<Student> findAll() {
        return (List<Student>) HibernateUtil.getSessionFactory().openSession().createQuery("FROM student").list();
    }

    public List<Student> findName(String name) {
        List<Student> students = new ArrayList<>();
        for (Student student : findAll()) {
            if (student.getFullname().equals(name)) {
                students.add(student);
            }
        }
        return students;
    }


    public Student findId(int id) {
        return (Student) HibernateUtil.getSessionFactory().openSession().get(Student.class, id);
    }
}