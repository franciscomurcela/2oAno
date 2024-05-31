package aula05;

public class Auction {
    private DateYMD date;
    private int duration;

    Auction(DateYMD date, int duration){
        this.date = date;
        this.duration = duration;
    }

    public DateYMD getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public String toString() {
        return "Auction [date=" + date + ", duration=" + duration + "]";
    }
    
}
