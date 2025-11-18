package model;

import model.abstractClass.Pessoa;

import java.time.LocalDate;

public class Visitante extends Pessoa {


    public Visitante(String cpf,String nome,  LocalDate dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

}
