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
public class Professor extends Pessoa{

    public String disciplinasMinistradas;
    
    public Professor(String login, String nome, String cpf, int idade, String senha, String disciplinasMinistradas) {
        super(nome, cpf, idade, senha, login);
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public String getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(String disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }
    
}
