
package uc15projetoatividade4;


public class Fornecedor {
    
    private String id;
    private String NomeFornecedor;
    private String CNPJFornecedor;
    private String EnderecoFornecedor;

    public Fornecedor() {
    }

    public Fornecedor(String id, String NomeFornecedor, String CNPJFornecedor, String EnderecoFornecedor) {
        this.id = id;
        this.NomeFornecedor = NomeFornecedor;
        this.CNPJFornecedor = CNPJFornecedor;
        this.EnderecoFornecedor = EnderecoFornecedor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeFornecedor() {
        return NomeFornecedor;
    }

    public void setNomeFornecedor(String NomeFornecedor) {
        this.NomeFornecedor = NomeFornecedor;
    }

    public String getCNPJFornecedor() {
        return CNPJFornecedor;
    }

    public void setCNPJFornecedor(String CNPJFornecedor) {
        this.CNPJFornecedor = CNPJFornecedor;
    }

    public String getEnderecoFornecedor() {
        return EnderecoFornecedor;
    }

    public void setEnderecoFornecedor(String EnderecoFornecedor) {
        this.EnderecoFornecedor = EnderecoFornecedor;
    }

    
    
}
