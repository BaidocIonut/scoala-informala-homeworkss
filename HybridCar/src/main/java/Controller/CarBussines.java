package Controller;

import Model.Vehicle;

import java.util.ArrayList;
import java.util.List;


public class CarBussines {


    public static List<Vehicle> addVehicle() {

        List<Vehicle> Cars = new ArrayList<Vehicle>();

        Vehicle car = new Vehicle();
        car.setYear(2017);
        car.setModel("e-Up");
        car.setConsumption(8);
        car.setFastCharging(true);
        car.setConsumption(25000);
        car.setTyp("new");
        car.setStock(8);

        Cars.add(car);

        Vehicle car1 = new Vehicle();
        car1.setYear(2018);
        car1.setModel("e-Golf");
        car1.setConsumption(7);
        car1.setFastCharging(false);
        car1.setTyp("used");
        car1.setConsumption(38000);
        car1.setStock(0);

        Cars.add(car1);

        return Cars;
    }

    public int filterList() {
        List<Vehicle> cars = new ArrayList<Vehicle>();
        cars = addVehicle();

        for (int i = 0; i <= cars.size() - 1; i++) {
            if (cars.get(i).isFastCharging() && cars.get(i).getStock() > 0) {
                System.out.println("The model " + cars.get(i).getModel() + "\n" +
                        "Has fastCharging " + "\n" +
                        "Stock number : " + cars.get(i).getStock());
            }
            else {
                cars.remove(cars.get(i));
            }
        }
        return cars.size();
    }

}
