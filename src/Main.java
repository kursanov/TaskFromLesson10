

public class Main {
    public static void main(String[] args) {



        Lexus570 lexus570 = new Lexus570();

        lexus570.setBrand("Lexus");
        lexus570.setModel("Lexus570");
        lexus570.setYear(2022);
        lexus570.method();
        lexus570.setMotorNumber(1234567);

        System.out.println(lexus570);

        Lexus350 lexus350 = new Lexus350();
        lexus350.setBrand("Lexus");
        lexus350.setModel("Lexus350");
        lexus350.setYear(2019);
        lexus350.setMotorNumber(12345);
        lexus350.method();
        System.out.println(lexus350);





    }
}