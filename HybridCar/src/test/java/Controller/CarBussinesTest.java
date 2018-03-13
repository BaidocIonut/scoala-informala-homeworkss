package Controller;

import Model.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CarBussinesTest {
   public CarBussines carBussines = new CarBussines();

    @Before
    public void init(){
    CarBussines carBussines = new CarBussines();
    List<Vehicle> vehicles = new ArrayList();
    vehicles = carBussines.addVehicle();
   
}
    @Test
    public void cehckList(){

    int nrCars = carBussines.filterList();
    assertEquals(1,nrCars);

    }


}