package object;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_full_name")
    private String fullname;
    @Column(name = "year_of_admission")
    private int yearOfAdmission;

    public Student(){}

    public Student(String fullname, int yearOfAdmission) {
        this.fullname = fullname;
        this.yearOfAdmission = yearOfAdmission;
    }

    @Override
    public String toString() {
        return "student{" +
                "student_id=" + id +
                ", student_full_name='" + fullname + '\'' +
                ", year_of_admission=" + yearOfAdmission +
                '}';
    }
}
