public class Lexus350 extends Lexus{

    private int motorNumber;

    public void setMotorNumber(int motorNumber) {
        this.motorNumber = motorNumber;
    }

    @Override
    public String toString() {
        return "Lexus350 " +
                "motorNumber = " + motorNumber +
                "Method"
                + super.toString();
    }
}
