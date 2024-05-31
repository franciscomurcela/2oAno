package aula05;

public class RealEstate {
    public Property[] properties;
    public int nProperties;

    RealEstate(){
        this.properties = new Property[100];
        this.nProperties = 0;
    }

    public void newProperty(String location, int nRooms, int price){
        this.properties[this.nProperties] = new Property(location, nRooms, price);
        this.nProperties++;
    }

    public void sell(int id){
        for (int i = 0; i < this.nProperties; i++) {
            if (this.properties[i].getId() == id) {
                this.properties[i].sell();
            }
        }
    }

    public void setAuction(int id, DateYMD date, int duration){
        for (int i = 0; i < this.nProperties; i++) {
            if (this.properties[i].getId() == id) {
                this.properties[i].setAuction(date, duration);
            }
        }
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < this.nProperties; i++) {
            s += this.properties[i].toString() + "";
        } return s;
    }
    

    // Os valores do Ex3.java não são guardados. Não consegui fazer.


}
