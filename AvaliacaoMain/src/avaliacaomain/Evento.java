package avaliacaomain;

import java.util.ArrayList;
import java.util.List;

public class Evento {
   private int codigo;
   private String nome;
   private String periodo;
   private int capacidade;
   private Local local;
   private List<Ingresso> ingressos;

    public Evento(int codigo, String nome, String periodo, int capacidade, Local local) {
        this.codigo = codigo;
        this.nome = nome;
        this.periodo = periodo;
        this.capacidade = capacidade;
        this.local = local;
        this.ingressos = new ArrayList<>();
    }
    
    public void addIngresso(Ingresso i){
        if (this.ingressos.size() < this.capacidade) {
            this.ingressos.add(i);
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
   
    
}
