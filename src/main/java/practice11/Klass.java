package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<Student>();
    private List<Teacher> teachers = new ArrayList<Teacher>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void assignLeader(Student student) {
        if (this.members.contains(student)) {
            this.leader = student;
            for (Teacher teacher:this.teachers) {
                teacher.update(student);
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        this.members.add(student);
        student.updateKlass(this);
        for (Teacher teacher:this.teachers) {
            teacher.update(student);
        }
    }

    public boolean isIn(Student student) {
        if (this.members.contains(student)) {
            return true;
        } else {
            return false;
        }
    }
}
