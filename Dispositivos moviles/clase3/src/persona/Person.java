package persona;


public class Person {

    protected String name;
    private String lastName;
    private int age;
    private boolean isAMan;

    Person(){
        name = "";
        lastName = "";
        age = 0;
        isAMan = true;
    }

    Person(
            String name,
            String lastName,
            int age,
            boolean isAMan
    ){
        this.name = name;
        this.lastName = lastName;
        this.isAMan = isAMan;
        this.age = age;
    }

    public void speak() {
        String message = "My name is: " + name
                + " " + lastName
                + " and I'm " + age + " years old";
        System.out.println(message);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsAMan() {
        return isAMan;
    }

    public void setIsAMan(boolean isAMan) {
        this.isAMan = isAMan;
    }

}