package QLSP;

public class Product {
    private int id, cost;
    private String name;
    static int idNumber = 1;

    public Product(int cost, String name) {
        this.id = idNumber++;
        this.cost = cost;
        this.name = name;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                " cost = " + cost + " $" +
                ", name = '" + name + '\'' +
                " ,id=" + id +
                '}';
    }
}
