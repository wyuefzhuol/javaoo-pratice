package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if ("0".equals(String.valueOf(this.klass)) || "null".equals(String.valueOf(this.klass))) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class " + this.klass + ".";
        }
    }
}
