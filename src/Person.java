public class Person {
    private String name;

    // Main
    public static void main(String[] args) {
        Person rick = new Person("Rick");
        System.out.println(rick.getName());
        rick.setName("Rick Sanchez");
        System.out.println(rick.getName());

        Person morty = new Person("Morty");
        System.out.println(morty.getName());
        morty.setName("Morty Sanchez");
        System.out.println(morty.getName());

        rick.sayHello();
        morty.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        System.out.println();
    }

    // Constructor
    public Person(String personName) {
        this.name = personName;
    }

    // Name Getter
    public String getName() {
        return this.name;
    }

    // Name Setter
    public void setName(String personName) {
        this.name = personName;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name);
    }
}