package secondsession.firstmodul.secondtask;

public class Person {
    //TODO 1: declare instance variables
    String name;
    int age;
    double weight;

    //TODO 2: complete the constructor
    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
