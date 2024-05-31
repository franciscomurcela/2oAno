package Exame2;

public class WarehouseStorage extends StorageUnit{

    
    WarehouseStorage(String Loc, int[] Dim, int PPD){
        super(Loc, Dim, PPD);
    }
    
    public String getType(){
        return "WAREHOUSE";
    }
}
