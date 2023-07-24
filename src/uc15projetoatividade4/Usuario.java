
package uc15projetoatividade4;


public class Usuario {
    
    private String id;
    private String Login;
    private String Senha;
    private String TipoLogin;

    public Usuario(){
        
    }

    public Usuario(String id, String Login, String Senha, String TipoLogin) {
        this.id = id;
        this.Login = Login;
        this.Senha = Senha;
        this.TipoLogin = TipoLogin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getTipoLogin() {
        return TipoLogin;
    }

    public void setTipoLogin(String TipoLogin) {
        this.TipoLogin = TipoLogin;
    }
    
    
}
