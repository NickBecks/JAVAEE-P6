package ua.beloff.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Lectures")
public class Lecture {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    private String name;
    private double credits;
    @ManyToMany(mappedBy = "lectures")
    private List<Student> students;

    @ManyToOne
    private Teacher teacher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public List<Student> getStudents() {
        if (students == null){
            students = new ArrayList<Student>();
        }
        return students;
    }

    public void addStudent(Student student){
        List<Student> students = getStudents();
        students.add(student);
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", teacher=\'" + teacher.getFirstname() + ' ' + teacher.getLastname() + '\'' +
                '}';
    }
}
