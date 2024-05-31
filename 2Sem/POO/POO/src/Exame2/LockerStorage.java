package Exame2;

public class LockerStorage extends StorageUnit{

    LockerStorage(String Loc, int[] Dim, int PPD) {
        super(Loc, Dim, PPD);
    }

    public String getType(){
        return "LOCKER";
    }
    
}
