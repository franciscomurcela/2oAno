package aula11;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class EnergyUsageReport {

    private int customerId;
    private int month;
    private double consumption;

    public EnergyUsageReport(int customerId, int month, double consumption) {
        this.customerId = customerId;
        this.month = month;
        this.consumption = consumption;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getMonth() {
        return month;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void load(String str){
        String[] parts = str.split(" - ");
        this.customerId = Integer.parseInt(parts[0]);
        this.month = Integer.parseInt(parts[1]);
        this.consumption = Double.parseDouble(parts[2]);
    }

    public String save(){
        return this.customerId + " - " + this.month + " - " + this.consumption;
    }
    
    public double calculateTotalUsage(double usage) {
        return this.consumption;
    }

    public void addCustomer(Customer customer) {
        this.customerId = customer.getCustomerId();
        this.consumption = customer.getMeterReadings().get(month-1);
    }

    public void removeCustomer(int customerId) {
        this.customerId = 0;
        this.consumption = 0;
    }

    public void generateReport(String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename, true); 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(this.customerId + " - " + this.month + " - " + this.consumption);
            bufferedWriter.newLine(); 
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        }
            catch (IOException e) {
                System.err.println("Error exporting data to file: " + e.getMessage());
            }
    }
    


    public String toString() {
        return this.customerId + " - " + this.month + " - " + this.consumption;
    }

    
    
    
}
