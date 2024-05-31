import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.time.LocalDate;

public class OrderTester {
    public static void main(String[] args) {

        String path = "avaliacao2\\pedidos.txt";

        try {
            Scanner scanner = new Scanner(new FileReader(path));
            while (scanner.hasNext()) {
                String[] pedido = scanner.next().split(";");
                String clientId = pedido[0];
                String storeId = pedido[1];
                String[] p1 = pedido[2].split("\\|");
                String[] p2 = p1[0].split(":");
                String[] p3 = p1[1].split(":");
                Item item = new Item(p2[0], Double.parseDouble(p2[1]));
                Item item2 = new Item(p3[0], Double.parseDouble(p3[1]));
                Item[] items = {item, item2};

                LocalDate orderDateTime = LocalDate.parse(pedido[3]);
                boolean expresso = Boolean.parseBoolean(pedido[4]);
                Order order = new Order(items, storeId, clientId, orderDateTime, expresso);
                OrderManager orderManager = new OrderManager();
                orderManager.addOrder(order);
                orderManager.printAllOrders();
                orderManager.calculateOrderCost(1);
                orderManager.calculateOrderCost(2);
                orderManager.calculateOrderCost(3);
                orderManager.searchOrder(1);
                orderManager.removeOrder(1);
                orderManager.printAllOrders();
    }
                
            
           
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + path);
        }
        
    }
}
