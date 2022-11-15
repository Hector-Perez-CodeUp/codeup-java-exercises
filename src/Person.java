public class Person {
    private String name;

    // Main
    public static void main(String[] args) {
        Person rick = new Person("Rick");
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

    // Constructor
    public Person(String personName) {
        this.name = personName;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return this.name;
    }


    public void sayHello() {

    }
}