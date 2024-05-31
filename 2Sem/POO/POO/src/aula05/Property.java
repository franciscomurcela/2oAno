package aula05;

public class Property {
    private String location;
    private int nRooms, price, id;
    private boolean sold;
    private Auction auction;

    Property(String location, int nRooms, int price){
        this.location = " ";
        this.nRooms = 0;
        this.price = 0;
        this.id = 0;
        this.sold = false;
        this.auction = null;
    }

    public int getId() {
        return id;
    }

    public void sell(){
        this.sold = true;
    }

    public void setAuction(DateYMD date, int duration){
        this.auction = new Auction(date, duration);
    }

    public boolean isAvailable(int id) {
        if (this.sold == true) return false; return true;
    }

    public String toString() {
        return "Imóvel: "+id+"; quartos: "+nRooms+"; localidade: "+location+"; preço: "+price+"; disponível: "+isAvailable(id)+"; leilão: "+auction+"\n";
    }
    
    

}
