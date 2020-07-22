package practice11;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    private List<Klass> classes = new LinkedList<Klass>();

    public List<Klass> getClasses() {
        return classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass:classes) {
            klass.addTeacher(this);
        }
    }

    public String introduce() {
        if (this.classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String klasses = "";
            for (int i = 0; i < classes.size(); i++) {
                if (i != classes.size()-1) {
                    klasses += (classes.get(i).getNumber() + ", ");
                } else {
                    klasses += (classes.get(i).getNumber());
                }
            }
            return super.introduce() + " I am a Teacher. I teach Class " + klasses + ".";
        }
    }

    public String introduceWith(Student student) {
        if (this.classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public boolean isTeaching(Student student) {
        if (this.classes.contains(student.getKlass())) {
            return true;
        } else {
            return false;
        }
    }

    public void update(Student student) {
        if (student.getKlass().getLeader() == null || !student.getKlass().getLeader().equals(student)) {
            System.out.print("I am " + this.name + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".\n");
        } else {
            System.out.print("I am " + this.name + ". I know " + student.getName() + " become Leader of Class " + student.getKlass().getNumber() + ".\n");
        }
    }
}
