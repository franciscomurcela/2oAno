package Exame2;

public class GarageStorage extends StorageUnit{


    GarageStorage(String Loc, int[] Dim, int PPD) {
        super(Loc, Dim, PPD);
    }

    public String getType(){
        return "GARAGE";
    }

    

}
