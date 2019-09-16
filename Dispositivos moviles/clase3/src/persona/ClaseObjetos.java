package persona;



public class ClaseObjetos {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Mario", "Guillermo", 20, true);

        //person2.speak();

        person1.speak();
        person1.setName("Raul");
        person1.setLastName("Gomez");
        person1.setAge(30);
        System.out.println(person1.getName());
        person1.speak();

        Student student = new Student("Luis", "Gomez", 24, true, "Diseño");
        student.speak();


        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }

}