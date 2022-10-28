/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroEscolar;

import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public class DataBase {
    
    private ArrayList<Professor> professores;  
    private ArrayList<Estudante> estudantes;

    public DataBase(){
        estudantes = new ArrayList<Estudante>();
        professores = new ArrayList<Professor>();
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void newProfessores(Professor novoProf) {
        professores.add(novoProf);
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void newEstudantes(Estudante novoEst) {
        estudantes.add(novoEst);
    }
    
}
