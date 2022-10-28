
package CadastroEscolar;

public class Pessoa {
    public String nome;
    public String cpf;
    public int idade;
    public String senha;
    public String login;

    public Pessoa(String nome, String cpf, int idade, String senha, String login) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.senha = senha;
        this.login = login;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
}
