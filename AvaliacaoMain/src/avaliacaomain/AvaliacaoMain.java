package avaliacaomain;

public class AvaliacaoMain {

    public static void main(String[] args) {
        Local local = new Local("Capivari de baixo", "SC", "Rua Parque", "Parque Ambiental");
        Evento evento = new Evento(1, "Show", "25 de dezembro", 50, local);
        
        Portador portador = new Portador("Fulano", "1312312311", "(48)99999-9999");
        Ingresso ingresso = new Ingresso("25 de dezembro", 100, 1, portador);
        evento.addIngresso(ingresso);
        
        System.out.println(ingresso.calculaValorIgresso());
    }
    
}
