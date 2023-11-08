package taskFromLesson10;

public class Person {

    private String name;

    private String designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String learnMethod(){
        return "Оз кесибини уйронот.";

    } public String walkMethod(){
        return "15км Жоо басат";

    } public String eatMethod(){
        return "Жырный тамак жейт.";

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}' + learnMethod() + "\n" + walkMethod() + "\n" + eatMethod();
    }
}
