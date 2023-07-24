package uc15projetoatividade4;

public class Produto {

    private String id;
    private String Descricao;
    private String UnMedida;
    private String ValorUnitario;
     private String Fornecedor;
    private String Estoque;

 public Produto() {
    }

    public Produto(String id, String Descricao, String UnMedida, String ValorUnitario, String Fornecedor, String Estoque) {
        this.id = id;
        this.Descricao = Descricao;
        this.UnMedida = UnMedida;
        this.ValorUnitario = ValorUnitario;
        this.Fornecedor = Fornecedor;
        this.Estoque = Estoque;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getUnMedida() {
        return UnMedida;
    }

    public void setUnMedida(String UnMedida) {
        this.UnMedida = UnMedida;
    }

    public String getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(String ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public String getEstoque() {
        return Estoque;
    }

    public void setEstoque(String Estoque) {
        this.Estoque = Estoque;
    }

 
 
 
 
}
