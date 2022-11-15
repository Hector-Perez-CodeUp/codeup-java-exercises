public class Person {
    private String name;
    private int age;

    // Main
    public static void main(String[] args) {
        Person rick = new Person("Rick", 50);
        System.out.println(rick.getName());
        rick.setName("Rick Sanchez");
        System.out.println(rick.getName());
        System.out.println(rick.getAge());
        rick.setAge(51);
        System.out.println(rick.getAge());

        Person morty = new Person("Morty", 16);
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
    public Person(String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
    }

    // Name Getter
    public String getName() {
        return this.name;
    }

    // Name Setter
    public void setName(String personName) {
        this.name = personName;
    }

    // Age Getter
    public int getAge() {
        return this.age;
    }

    // Age Setter
    public void setAge(int personAge) {
        this.age = personAge;
    }


    public void sayHello() {
        System.out.println("Hello " + this.name + ".  You are " + this.age + " years old.");
    }
}