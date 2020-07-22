package practice08;

public class Person {
    protected int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if (person.getId() == this.id) {
            return true;
        } else {
            return false;
        }
    }
}
