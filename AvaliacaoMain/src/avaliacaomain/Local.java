package avaliacaomain;

public class Local {
    private String cidade;
    private String uf;
    private String endereco;
    private String complemento;

    public Local(String cidade, String uf, String endereco, String complemento) {
        this.cidade = cidade;
        this.uf = uf;
        this.endereco = endereco;
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
}
