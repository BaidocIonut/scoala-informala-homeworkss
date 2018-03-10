package Model;

public class Vehicle {


    private String model;
    private int year;
    private int price;
    private int consumption;
    private String typ;
    private int stock;
    private boolean fastCharging;


    public Vehicle(String model, int year, int price, int consumption, int stock, boolean fastCharging, String typ) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.consumption = consumption;
        this.stock = stock;
        this.fastCharging = fastCharging;
        this.typ = typ;
    }

    public Vehicle() {
        super();
    }

    public int getStock() {
        return stock;
    }

    public boolean isFastCharging() {
        return fastCharging;
    }

    public void setFastCharging(boolean fastCharging) {
        this.fastCharging = fastCharging;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        typ = typ;
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

    public int getConsumption() {
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

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", consumption=" + consumption +
                ", typ='" + typ + '\'' +
                ", stock=" + stock +
                ", fastCharging=" + fastCharging +
                '}';
    }
}
