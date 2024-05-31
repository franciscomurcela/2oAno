import java.util.ArrayList;
public class OrderManager{
    private ArrayList<Order> orders = new ArrayList<Order>(100);
    private OrderCostCalculator orderCostCalculator;

    public void addOrder(Order order){
        orders.add(order); 
    }

    public void removeOrder(int id){
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                orders.remove(i);
            }
        }
    }
    
    public void searchOrder(int id){
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                System.out.println(orders.get(i));
            }
        }
    }

    public void calculateOrderCost(int id){
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                System.out.println(orderCostCalculator.calculateOrderCost(orders.get(i)));
            }
        }

    }

    public void printAllOrders(){
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }
    }

}
