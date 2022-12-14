package util;

public class Customer {
    private String name;
    private int age;
    private String description;
    public Customer(String name, int age, String description){
        this.setName(name);
        this.setAge(age);
        this.setDescription(description);
    }
    public void write(){
        System.out.println(getDescription());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
