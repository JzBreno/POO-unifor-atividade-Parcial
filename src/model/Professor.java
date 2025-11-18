package model;

import model.abstractClass.Pessoa;

import java.time.LocalDate;

public class Professor extends Pessoa {

    private String centro;

    public Professor(String nome, String cpf, LocalDate dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public void darAula(){
        System.out.println("Professor esta dando Aula");
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }


}
