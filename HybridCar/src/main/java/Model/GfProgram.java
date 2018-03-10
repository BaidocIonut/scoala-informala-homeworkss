package Model;

public class GfProgram {

    private int budget;
    private String listPurchase;

    public GfProgram(int budget, String listPurchase) {
        this.budget = budget;
        this.listPurchase = listPurchase;
    }

    public String getListPurchase() {
        return listPurchase;
    }

    public int getBudget() {
        return budget;

    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setListPurchase(String listPurchase) {
        this.listPurchase = listPurchase;
    }
}
