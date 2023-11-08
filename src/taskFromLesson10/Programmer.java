package taskFromLesson10;

public class Programmer extends  Person {

    private String companyName;

    private String coding;

    public Programmer(String name, String designation, String companyName, String coding) {
        super(name, designation);
        this.companyName = companyName;
        this.coding = coding;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                ", coding='" + coding + '\'' +
                '}' + super.learnMethod() + " " + super.walkMethod() + " " + super.eatMethod();
    }

}
