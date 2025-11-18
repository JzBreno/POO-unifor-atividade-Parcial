package model;

import model.abstractClass.Pessoa;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String cpf, LocalDate dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matriculao) {
        this.matricula = matriculao;
    }

    public void pagarMensaldade(){
        System.out.println("Mensalidade paga com sucesso! pelo Aluno");
    }


}
