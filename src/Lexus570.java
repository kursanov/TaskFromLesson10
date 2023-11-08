public class Lexus570 extends Lexus{



    private int motorNumber;

    public void setMotorNumber(int motorNumber) {
        this.motorNumber = motorNumber;
    }

    @Override
    public String toString() {
        return "Lexus570 " +
                "motorNumber = " + motorNumber + super.toString();
    }
}
