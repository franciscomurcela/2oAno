package aula07.Ex2;

    public class DateYMD extends Date{
        private int dia, mes, ano;

        public DateYMD(int dia, int mes, int ano) {
            super(dia, mes, ano);
        }

        public int decrementDay(){
            if (this.dia == 1) {
                this.dia = monthDays(this.mes, this.ano);
                if (this.mes == 1) {
                    this.mes = 12;
                    this.ano--;
                }else this.mes--;
            }else this.dia--;
            return this.dia;
        }

        public int decrementMonth(){
            if (this.mes == 1) {
                this.mes = 12;
                this.ano--;
            }else this.mes--;
            return this.mes;
        }

        public int decrementYear(){
            this.ano--;
            return this.ano;
        }

        public int incrementDay(){
            if (this.dia == monthDays(this.mes, this.ano)) {
                this.dia = 1;
                if (this.mes == 12) {
                    this.mes = 1;
                    this.ano++;
                }else this.mes++;
            }else this.dia++;
            return this.dia;
        }

        public int incrementMonth(){
            if (this.mes == 12) {
                this.mes = 1;
                this.ano++;
            }else this.mes++;
            return this.mes;
        }

        public int incrementYear(){
            this.ano++;
            return this.ano;
        }

        public boolean validDate(int dia, int mes, int ano){
            if (validDay(dia) && validMonth(mes) && validYear(ano)) {
                if (dia <= monthDays(mes, ano)) {
                    return true;
                }else return false;
            }else return false;
        }
    }
