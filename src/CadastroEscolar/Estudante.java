/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroEscolar;

/**
 *
 * @author Usuário
 */
public class Estudante extends Pessoa {
    
    public String disciplinasCursadas;

    public Estudante(String login, String nome, String cpf, int idade, String senha, String disciplinasCursadas) {
        super(nome, cpf, idade, senha, login);
        this.disciplinasCursadas = disciplinasCursadas;
    }

    public String getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public void setDisciplinasCursadas(String disciplinasCursadas) {
        this.disciplinasCursadas = disciplinasCursadas;
    }
    
}
