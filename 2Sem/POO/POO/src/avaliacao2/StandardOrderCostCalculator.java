public class StandardOrderCostCalculator implements OrderCostCalculator {

    public double calculateOrderCost(Order order) {
        double cost = order.getPrice();
        if (order.isExpresso()) cost = cost*0.3; return cost;
    }
    
}
