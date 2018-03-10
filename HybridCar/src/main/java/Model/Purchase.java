package Model;

public class Purchase {

        private  String nameD;
        private String nameC;
        private String carModel;

    public Purchase(String nameD, String nameC, String carModel) {
        this.nameD = nameD;
        this.nameC = nameC;
        this.carModel = carModel;
    }

    public String getNameD() {
        return nameD;
    }

    public String getNameC() {
        return nameC;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
