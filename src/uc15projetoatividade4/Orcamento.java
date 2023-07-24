
package uc15projetoatividade4;


public class Orcamento {
    
    private String id;
    private String Cliente;
    private String Produto;
    private String Quant;
    private String ValorUnitario;
    private String CondPagamento;
    private String Frete;
    private String Vendedor;
    private String PrazoEntrega;
    
    public Orcamento(){
    
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public String getQuant() {
        return Quant;
    }

    public void setQuant(String Quant) {
        this.Quant = Quant;
    }

    public String getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(String ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public String getCondPagamento() {
        return CondPagamento;
    }

    public void setCondPagamento(String CondPagamento) {
        this.CondPagamento = CondPagamento;
    }

    public String getFrete() {
        return Frete;
    }

    public void setFrete(String Frete) {
        this.Frete = Frete;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getPrazoEntrega() {
        return PrazoEntrega;
    }

    public void setPrazoEntrega(String PrazoEntrega) {
        this.PrazoEntrega = PrazoEntrega;
    }

    public Orcamento(String id, String Cliente, String Produto, String Quant, String ValorUnitario, String CondPagamento, String Frete, String Vendedor, String PrazoEntrega) {
        this.id = id;
        this.Cliente = Cliente;
        this.Produto = Produto;
        this.Quant = Quant;
        this.ValorUnitario = ValorUnitario;
        this.CondPagamento = CondPagamento;
        this.Frete = Frete;
        this.Vendedor = Vendedor;
        this.PrazoEntrega = PrazoEntrega;
    }

    
}
