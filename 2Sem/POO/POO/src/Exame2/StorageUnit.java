package Exame2;
public class StorageUnit {

    String Loc;
    int[] Dim;
    int PPD;
    UnitType tipo;

    StorageUnit(String Loc, int[] Dim, int PPD) {
        this.Loc = Loc;
        this.Dim = Dim;
        this.PPD = PPD;
    }

    public String getLoc() {
        return Loc;
    }

    public int[] getDim() {
        return Dim;
    }

    public int getPPD() {
        return PPD;
    }

    public void setLoc(String Loc) {
        this.Loc = Loc;
    }

    public void setDim(int[] Dim) {
        this.Dim = Dim;
    }

    public void setPPD(int PPD) {
        this.PPD = PPD;
    }

    public String getType(){
        return tipo.toString();
    }


    
    



    
}
