package avaliacaomain;

public class Ingresso {
    private String dia;
    private float valor;
    private int numero;
    private boolean valido;
    private static float taxaServico = 10;
    private Portador portador;

    public Ingresso(String dia, float valor, int numero, Portador portador) {
        this.dia = dia;
        this.valor = valor;
        this.numero = numero;
        this.valido = true;
        this.portador = portador;
    }
    
     public float calculaValorIgresso(){
         return (this.valor+Ingresso.taxaServico);
     }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(float taxaServico) {
        this.taxaServico = taxaServico;
    }

    public Portador getPortador() {
        return portador;
    }

    public void setPortador(Portador portador) {
        this.portador = portador;
    }
    
    
}
