public class Person {
    private int age;
    private String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void info(){
        System.out.println("Name: " + name + " Age: " + age);
    }
    public static void main(){
        Person person = new Person(18, "James");
        person.info();
    }
}
