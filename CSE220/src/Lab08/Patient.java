package Lab08;

public class Patient {
    int id;
    String name;
    int age;
    String blood;

    public Patient(String name, int age,String blood) {
        this.name = name;
        this.age = age;
        this.blood=blood;
        id=++WRM.id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", blood='" + blood + '\'' +
                '}';
    }
}
