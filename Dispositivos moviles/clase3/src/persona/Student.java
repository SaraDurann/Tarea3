package persona;


public class Student extends Person {

    private String school;

    Student(
            String name,
            String lastName,
            int age,
            boolean isAMan,
            String school
    ){
        super(name, lastName, age, isAMan);
        this.school = school;
    }

    @Override
    public void speak(){

        String message = "I study " + school;
        System.out.println(message);
    }
}