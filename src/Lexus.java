public class Lexus {

    private String brand;

    private String model;

    private int year;



    public Lexus (){};


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }






    public String  method (){
        String soz = "This is Car!";
        return soz;

    }

    @Override
    public String toString() {
        return " Lexus: " +
                "brand = " + brand + '\'' +
                " model =" + model + '\'' +
                " year = " + year + "\n" + method()

                ;
    }
}
