
package uc15projetoatividade4;


public class Cliente {
    private String id;
    private String NomeCliente;
    private String CNPJCliente;
    private String EnderecoCliente;

    public Cliente() {
    }

    public Cliente(String id, String NomeCliente, String CNPJCliente, String EnderecoCliente) {
        this.id = id;
        this.NomeCliente = NomeCliente;
        this.CNPJCliente = CNPJCliente;
        this.EnderecoCliente = EnderecoCliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public String getCNPJCliente() {
        return CNPJCliente;
    }

    public void setCNPJCliente(String CNPJCliente) {
        this.CNPJCliente = CNPJCliente;
    }

    public String getEnderecoCliente() {
        return EnderecoCliente;
    }

    public void setEnderecoCliente(String EnderecoCliente) {
        this.EnderecoCliente = EnderecoCliente;
    }

}