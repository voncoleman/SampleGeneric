public class Inventory {
    private int id;
    private String name;
    private double price;
    private String sku;
    private int onHand;

/**
 * Constructors for the generic map interface
 * @param id
 * @param name
 * @param price
 * @param sku
 * @param onHand
 */
    public Inventory(int id, String name, double price, String sku, int onHand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sku = sku;
        this.onHand = onHand;
    }


    public Inventory() {
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public String getSku() {
        return sku;
    }


    public int getOnHand() {
        return onHand;
    }
    
}
