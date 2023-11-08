package taskFromLesson10;

public class Singer extends  Person {

    private String bandName;

    private String singing;

    private String playGuitar;

    public Singer(String name, String designation, String bandName, String singing, String playGuitar) {
        super(name, designation);
        this.bandName = bandName;
        this.singing = singing;
        this.playGuitar = playGuitar;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                ", singing='" + singing + '\'' +
                ", playGuitar='" + playGuitar + '\'' +
                '}' + super.learnMethod() + " " + super.walkMethod() + " " + super.eatMethod();
    }
}
