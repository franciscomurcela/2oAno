package aula05;

public class DateYMD{
    public int day, month, year;

    public DateYMD(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void getDate(){
        System.out.println("Dia: "+this.day);
        System.out.println("Mês: "+this.month);
        System.out.println("Ano: "+this.year);
    }

    public int getMes(){
        return this.month;
        
    }

    public int getDia(){
        return this.day;
    }

    public int getYear(){
        return this.year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int decrementDay(){
        if (this.day == 1) {
            this.day = monthDays(this.month, this.year);
            if (this.month == 1) {
                this.month = 12;
                this.year--;
            }else this.month--;
        }else this.day--;
        return this.day;
    }

    public int decrementMonth(){
        if (this.month == 1) {
            this.month = 12;
            this.year--;
        }else this.month--;
        return this.month;
    }

    public int decrementYear(){
        this.year--;
        return this.year;
    }

    public int incrementDay(){
        if (this.day == monthDays(this.month, this.year)) {
            this.day = 1;
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            }else this.month++;
        }else this.day++;
        return this.day;
    }

    public int incrementMonth(){
        if (this.month == 12) {
            this.month = 1;
            this.year++;
        }else this.month++;
        return this.month;
    }

    public int incrementYear(){
        this.year++;
        return this.year;
    }

    public static boolean validMonth(int month){
        if (month < 1 || month > 12) {
            return false;
        }else return true;
    }
    public static boolean validYear(int year){
        if (year < 1 || year > 9999) {
            return false;
        }else return true;
    }
    public static boolean validDay(int day){
        if (day < 1 || day > 31) {
            return false;
        }else return true;
    }

    public static boolean leapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }else return false;
    }

    public static int monthDays(int month, int year){
        int days = 0;
        if (validMonth(month)){
        switch (month) {
            case 1: days = 31; break;
            case 2: days = 28; break;
            case 3: days = 31; break;
            case 4: days = 30; break;
            case 5: days = 31; break;
            case 6: days = 30; break;
            case 7: days = 31; break;
            case 8: days = 31; break;
            case 9: days = 30; break;
            case 10: days = 31; break;
            case 11: days = 30; break;
            case 12: days = 31; break;
        }
        if (month == 2 && leapYear(year)) {
            days = 29;
        }
    }
        return days;
    
    }

    public boolean validDate(int day, int month, int year){
        if (validDay(day) && validMonth(month) && validYear(year)) {
            if (day <= monthDays(month, year)) {
                return true;
            }else return false;
        }else return false;
    }

    public String toString(){
        return this.year+"-"+this.month+"-"+this.day;
    }

}