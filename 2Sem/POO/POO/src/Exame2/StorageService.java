package Exame2;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;


public class StorageService implements StorageServiceInterface {

    String nome, endereco;
    
    StorageService(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    Collection<StorageUnit> storageUnits = new HashSet<StorageUnit>();
    HashMap<Integer, HashMap<String, ClientType>> clients = new HashMap<Integer, HashMap<String, ClientType>>();
    List<String> rentals = new ArrayList<>();



    public boolean registerClient(int taxId, String name, ClientType type){
        if(clients.containsKey(taxId)){
            return false;
        }
        else{
            HashMap<String, ClientType> InfoClient = new HashMap<String, ClientType>();
            InfoClient.put(name, type);
            clients.put(taxId, InfoClient);
            return true;
        }
    }

    public Client getClient(int taxId){

        if(clients.containsKey(taxId)){
            HashMap<String, ClientType> mapa2 = clients.get(taxId);
            Set<Entry<String, ClientType>> set = mapa2.entrySet();
            for (Entry<String, ClientType> ele: set){
                return new Client(taxId,ele.getKey(),ele.getValue());
            }
        } else {
            return null;
        }
    }

    public Collection<StorageUnit> getStorageUnits(){
        return storageUnits;
    }

    public Collection<StorageUnit> getStorageUnits(UnitType unitType){
        for (StorageUnit storageUnit : storageUnits) {
            if(storageUnit.getType().equals(unitType.toString())){
                Collection<StorageUnit> storageUnits = new Collection<StorageUnit>();
                return storageUnits;
            }
        }
    }

    public Collection<StorageUnit> getStorageUnits(int[] minDimensions){
        for (StorageUnit storageUnit : storageUnits) {
            if(storageUnit.getDim()[0] >= minDimensions[0] && storageUnit.getDim()[1] >= minDimensions[1]){
                Collection<StorageUnit> storageUnits = new Collection<StorageUnit>();
                return storageUnits;
            }
        }
    }

    public Collection<StorageUnit> getStorageUnits(int[] minDimensions, UnitType unitType){
        for (StorageUnit storageUnit : storageUnits) {
            if(storageUnit.getDim()[0] >= minDimensions[0] && storageUnit.getDim()[1] >= minDimensions[1] && storageUnit.getType().equals(unitType.toString())){
                Collection<StorageUnit> storageUnits = new Collection<StorageUnit>();
                return storageUnits;
            }
        }
    }

    public Collection<StorageUnit> getStorageUnits(String location){
        for (StorageUnit storageUnit : storageUnits) {
            if(storageUnit.getLoc().equals(location)){
                Collection<StorageUnit> storageUnits = new Collection<StorageUnit>();
                return storageUnits;
            }
        }
    }

    public Collection<StorageUnit> getStorageUnits(String location, UnitType unitType){
        for (StorageUnit storageUnit : storageUnits) {
            if(storageUnit.getLoc().equals(location) && storageUnit.getType().equals(unitType.toString())){
                Collection<StorageUnit> storageUnits = new Collection<StorageUnit>();
                return storageUnits;
            }
        }
    }

    public Collection<StorageUnit> getStorageUnits(String location, int[] minDimensions){
        for (StorageUnit storageUnit : storageUnits) {
            if(storageUnit.getLoc().equals(location) && storageUnit.getDim()[0] >= minDimensions[0] && storageUnit.getDim()[1] >= minDimensions[1]){
                Collection<StorageUnit> storageUnits = new Collection<StorageUnit>();
                return storageUnits;
            }
        }
    }

    public void addStorageUnit(StorageUnit storageUnit){
        storageUnits.add(storageUnit);
    }

    public void addStorageUnits(Collection<StorageUnit> storageUnits){
        for (StorageUnit storageUnit : storageUnits) {
            storageUnits.add(storageUnit);
        }
    }

    public boolean checkAvailable(StorageUnit storageUnit, LocalDate startDate, LocalDate endDate){
    }

    public List<StorageUnit> findAvailableUnits(UnitType unitType, LocalDate fromDate, int duration, int[] minDimensions){
        for (StorageUnit storageUnit : storageUnits) {
            if(storageUnit.getType().equals(unitType.toString()) && storageUnit.getDim()[0] >= minDimensions[0] && storageUnit.getDim()[1] >= minDimensions[1]){
                List<StorageUnit> storageUnits = new ArrayList<StorageUnit>();
                return storageUnits;
            }
        }
    }

    public boolean rentStorageUnit(Client client, StorageUnit unit, LocalDate startDate, int duration){
        if(unit.getType().equals("WAREHOUSE")){
            if(client.getType().equals("ENTERPRISE")){
                rentals.add(unit.getType());
                return true;
                } else {
                    return false;
                }
            } else {
                rentals.add(unit.getType());
                return true;
            }
        }
    public double calculateTotalCost(StorageUnit unit, int duration){
        double c = 0;
        c = unit.getPPD()*duration;
        return c;
    }

    public List<String> listRentals(){
        return rentals;
    }

    public List<String> listRentals(UnitType unitType){
        for (String rental : rentals) {
            if(rental.equals(unitType.toString())){
                List<String> rentals = new ArrayList<String>();
                return rentals;
            }
        }
    }

}
