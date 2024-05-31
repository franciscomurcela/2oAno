import java.time.LocalDate;

public class Order{
    private int id;
    private static int nextId = 1;
    private Item[] item;
    private String storeId;
    private String clientId;
    private LocalDate orderDateTime;
    private boolean expresso;

    Order(Item[] item, String storeId, String clienteId, LocalDate orderDateTime, boolean expresso) {
        id = nextId;
        nextId++;
        this.item = item;
        this.storeId = storeId;
        this.clientId = clienteId;
        this.orderDateTime = orderDateTime;
        this.expresso = expresso;
    }


    public int getId() {
        return id;
    }

    public Item[] getItem() {
        return item;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getClientId() {
        return clientId;
    }

    public LocalDate getOrderDateTime() {
        return orderDateTime;
    }

    public boolean isExpresso() {
        return expresso;
    }


    public void setItem(Item[] item) {
        this.item = item;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setOrderDateTime(LocalDate orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public void setExpresso(boolean expresso) {
        this.expresso = expresso;
    }

    public double getPrice() {
        double price = 0;
        for (Item item : this.item) {
            price += item.getPrice();
        }
        return price;
    }

    public String toString() {
        String str = "Order: " + id + "\n";
        str += "Store: " + storeId + "\n";
        str += "Client: " + clientId + "\n";
        str += "Date: " + orderDateTime + "\n";
        str += "Expresso: " + expresso + "\n";
        str += "Items: \n";
        for (Item item : this.item) {
            str += item + "\n";
        }
        return str;
    }
}
