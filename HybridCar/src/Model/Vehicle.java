package Model;

public class Vehicle {


    private String model;
    private int year;
    private int price;
    private long consumption;
    private String Typ;

    public Vehicle(String model, int year, int price, long consumption) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.consumption = consumption;
    }

    public Vehicle() {
        super();
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public long getConsumption() {
        return consumption;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setConsumption(long consumption) {
        this.consumption = consumption;
    }
}
