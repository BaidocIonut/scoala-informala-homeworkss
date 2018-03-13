package Model;

public class Manufacturer extends Vehicle{

    private String numeM;

    public Manufacturer(){
        super();
    }

    public Manufacturer(String numeM) {
        this.numeM = numeM;
    }

    public String getNumeM() {
        return numeM;
    }

    public void setNumeM(String numeM) {
        this.numeM = numeM;
    }
}

