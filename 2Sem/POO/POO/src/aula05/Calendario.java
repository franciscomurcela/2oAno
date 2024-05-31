package aula05;

public class Calendario {

    private int dia, year;

    Calendario(int dia, int year) {
        this.dia = dia;
        this.year = year;
    }

    public int getdia(){
        return dia;
    }
          
    public void setdia(int dia){
        this.dia = dia;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }



    private int diaMes(int mes) {
        DateYMD data = new DateYMD(1,1,this.year);
        int firstWeekdayOfMonth = this.dia;
        while(data.getMes() < mes) {
            data.incrementDay();
            if (firstWeekdayOfMonth == 7) {
                firstWeekdayOfMonth = 1;
            }else firstWeekdayOfMonth++;
        }
        return firstWeekdayOfMonth;
    }


    public String desenharCalendario(int mes) {
        final String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return "\n" +"     "+ (meses[mes - 1]) + "\n" + "Su Mo Tu We Th Fr Sa" + "\n" + construtorDeString(mes) + "\n";
    }


    private String construtorDeString(int mes) {
        int dias = DateYMD.monthDays(mes, year);
        int inicio_do_mes = this.diaMes(mes);
        int dia_semana = this.diaMes(mes);
        String dias_espacos = new String("   ".repeat(inicio_do_mes));

        for (int i = 1; i <= dias; i++) {
            if (dia_semana == 1) {
                dias_espacos += String.format("%2d ", i);
                dia_semana++;
            } else if (dia_semana == 7) {
                dias_espacos += String.format("%2d\n", i);
                dia_semana = 1;
            } else {
                dias_espacos += String.format("%2d ", i);
                dia_semana++;
            }
        }
        return dias_espacos;
    }

    public String toString() {
        String calendAno = "";
        for (int i=1; i<=12; i++) {
            calendAno += this.desenharCalendario(i);
        }
        return calendAno;
    }
}
