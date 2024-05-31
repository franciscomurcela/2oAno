package aula07.Ex2;

public abstract class Date {
    private int dia, mes, ano;

    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract int decrementDay();

    public abstract int decrementMonth();

    public abstract int decrementYear();

    public abstract int incrementDay();

    public abstract int incrementMonth();

    public abstract int incrementYear();

    public static boolean leapYear(int ano){
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true;
        }else return false;
    }

    public static int monthDays(int mes, int ano){
        int dias = 0;
        if (validMonth(mes)){
        switch (mes) {
            case 1: dias = 31; break;
            case 2: dias = 28; break;
            case 3: dias = 31; break;
            case 4: dias = 30; break;
            case 5: dias = 31; break;
            case 6: dias = 30; break;
            case 7: dias = 31; break;
            case 8: dias = 31; break;
            case 9: dias = 30; break;
            case 10: dias = 31; break;
            case 11: dias = 30; break;
            case 12: dias = 31; break;
        }
        if (mes == 2 && leapYear(ano)) {
            dias = 29;
        }
    }
        return dias;
    
    }

    public abstract boolean validDate(int dia, int mes, int ano);

    public static boolean validMonth(int mes){
        if (mes < 1 || mes > 12) {
            return false;
        }else return true;
    }
    public static boolean validYear(int ano){
        if (ano < 1 || ano > 9999) {
            return false;
        }else return true;
    }
    public static boolean validDay(int dia){
        if (dia < 1 || dia > 31) {
            return false;
        }else return true;
    }


}
