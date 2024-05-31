package aula08.ex1;

public class Main {
    public static void main(String[] args){

        
        EmpresaDeAlugerDeViaturas EmpresaDeAlugerDeViaturas = new EmpresaDeAlugerDeViaturas("Lima-Company", "companylima@ua.pt", "3720-608");

        Motociclo motociclo1 = new Motociclo("12345", "Suzuki", "GSX", 125,TipoDeMotociclo.estrada);
        motociclo1.trajeto(25);
        Motociclo motociclo2 = new Motociclo("12346", "Honda", "GSX", 125, TipoDeMotociclo.estrada);
        motociclo2.trajeto(30);
        Motociclo motociclo3 = new Motociclo("12347", "Honda", "GSX", 125, TipoDeMotociclo.desportivo);
        motociclo3.trajeto(40);

        AutomovelLigeiro AutomovelLigeiro1 = new AutomovelLigeiro("12348", "Fiat", "500", 125, 12345, 5);
        AutomovelLigeiro1.trajeto(20);
        AutomovelLigeiro AutomovelLigeiro2 = new AutomovelLigeiro("12349", "Fiat", "500", 125, 12345, 5);
        AutomovelLigeiro2.trajeto(25);

        Taxi taxi1 = new Taxi("12350", "Peugeot", "308", 125, 12345, 5, 123456789);
        taxi1.trajeto(20);
        Taxi taxi2 = new Taxi("12351", "Peugeot", "308", 125, 12345, 5, 123456789);
        taxi2.trajeto(25);

        PesadoDeMercadorias PesadoDeMercadorias1 = new PesadoDeMercadorias("12352", "Fiat", "Palio", 125, 12345, 5, 150);
        PesadoDeMercadorias1.trajeto(20);
        PesadoDeMercadorias PesadoDeMercadorias2 = new PesadoDeMercadorias("12353", "Fiat", "Palio", 125, 12345, 5, 150);
        PesadoDeMercadorias2.trajeto(25);

        PesadoDePassageiros PesadoDePassageiros1 = new PesadoDePassageiros("12354", "Peugeot", "308", 125, 12345, 5, 30);
        PesadoDePassageiros1.trajeto(20);
        PesadoDePassageiros PesadoDePassageiros2 = new PesadoDePassageiros("12355", "Peugeot", "308", 125, 12345, 5, 30);
        PesadoDePassageiros2.trajeto(25);

        AutomovelLigeiroEletrico AutomovelLigeiroEletrico1= new AutomovelLigeiroEletrico("AA-44-BB", "Tesla", "X", 100, 12348, 5, 90, 50);
        AutomovelLigeiroEletrico1.trajeto(25);
        AutomovelLigeiroEletrico AutomovelLigeiroEletrico2= new AutomovelLigeiroEletrico("AA-44-BB", "Tesla", "X", 100, 12348, 5, 90, 50);
        AutomovelLigeiroEletrico2.trajeto(25);

        PesadoDePassageirosEletrico PesadoDePassageirosEletrico1= new PesadoDePassageirosEletrico("87280", "BMW", "bmfut", 130, 12592, 10, 10, 200, 20);
        PesadoDePassageirosEletrico1.trajeto(55);
        PesadoDePassageirosEletrico PesadoDePassageirosEletrico2= new PesadoDePassageirosEletrico("87282", "BMW", "bmfut", 130, 12598, 10, 12, 200, 40);
        PesadoDePassageirosEletrico1.trajeto(60);

        EmpresaDeAlugerDeViaturas.addVeiculos(motociclo1, motociclo2, motociclo3);
        EmpresaDeAlugerDeViaturas.addVeiculos(AutomovelLigeiro1, AutomovelLigeiro2);
        EmpresaDeAlugerDeViaturas.addVeiculos(taxi1, taxi2);
        EmpresaDeAlugerDeViaturas.addVeiculos(PesadoDeMercadorias1, PesadoDeMercadorias2);
        EmpresaDeAlugerDeViaturas.addVeiculos(PesadoDePassageiros1, PesadoDePassageiros2);
        EmpresaDeAlugerDeViaturas.addVeiculos(AutomovelLigeiroEletrico1, AutomovelLigeiroEletrico2);
        EmpresaDeAlugerDeViaturas.addVeiculos(PesadoDePassageirosEletrico1, PesadoDePassageirosEletrico2);

        System.out.println("\n");

        for ( Veiculo veiculo : EmpresaDeAlugerDeViaturas.getVeiculos() ) {
            System.out.println(veiculo.toString());
        }

        System.out.println("\n\n");

        Veiculo veiculoComMaiorDistancia = null;
        for ( Veiculo veiculo : EmpresaDeAlugerDeViaturas.getVeiculos() ) {
            if (veiculoComMaiorDistancia == null) {
                veiculoComMaiorDistancia = veiculo;
            } else if (veiculo.distanciaTotal() > veiculoComMaiorDistancia.distanciaTotal()) {
                veiculoComMaiorDistancia = veiculo;
            }
        }

        System.out.println("O Veiculo que percorreu maior distância foi o veiculo com: "+ veiculoComMaiorDistancia.toString()+ "\n e percorreu "+ veiculoComMaiorDistancia.distanciaTotal()+ "km.");

        comparar(motociclo1, motociclo2, motociclo3, AutomovelLigeiro1, AutomovelLigeiro2, taxi1, taxi2, PesadoDeMercadorias1, PesadoDeMercadorias2, PesadoDePassageiros1, PesadoDePassageiros2, AutomovelLigeiroEletrico1, AutomovelLigeiroEletrico2, PesadoDePassageirosEletrico1, PesadoDePassageirosEletrico2);
    }

    private static void comparar(Motociclo motociclo1, Motociclo motociclo2, Motociclo motociclo3, AutomovelLigeiro AutomovelLigeiro1, AutomovelLigeiro AutomovelLigeiro2, Taxi taxi1, Taxi taxi2, PesadoDeMercadorias PesadoDeMercadorias1, PesadoDeMercadorias PesadoDeMercadorias2, PesadoDePassageiros PesadoDePassageiros1, PesadoDePassageiros PesadoDePassageiros2, AutomovelLigeiroEletrico AutomovelLigeiroEletrico1, AutomovelLigeiroEletrico AutomovelLigeiroEletrico2,  PesadoDePassageirosEletrico PesadoDePassageirosEletrico1,  PesadoDePassageirosEletrico PesadoDePassageirosEletrico2){
        System.out.println("\nMotociclo1 == Motociclo2: "+ motociclo1.equals(motociclo2));
        System.out.println("Motociclo1 == Motociclo3: "+ motociclo1.equals(motociclo3));
        System.out.println("Motociclo2 == Motociclo3: "+ motociclo2.equals(motociclo3));
        System.out.println("AutomovelLigeiro1 == AutomovelLigeiro2: "+ AutomovelLigeiro1.equals(AutomovelLigeiro2));
        System.out.println("Taxi1 == Taxi2: "+ taxi1.equals(taxi2));
        System.out.println("PesadoDeMercadorias1 == PesadoDeMercadorias2: "+ PesadoDeMercadorias1.equals(PesadoDeMercadorias2));
        System.out.println("PesadoDePassageiros1 == PesadoDePassageiros2: "+ PesadoDePassageiros1.equals(PesadoDePassageiros2));
        System.out.println("AutomovelLigeiroEletrico1 == AutomovelLigeiroEletrico2: "+ AutomovelLigeiroEletrico1.equals(AutomovelLigeiroEletrico2));
        System.out.println("PesadoDePassageirosEletrico1 == PesadoDePassageirosEletrico2: "+ PesadoDePassageirosEletrico1.equals(PesadoDePassageirosEletrico2));
    }
       
}

