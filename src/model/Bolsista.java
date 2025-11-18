package model;

import java.time.LocalDate;

public class Bolsista extends Aluno{

    public Bolsista( String cpf,String nome, LocalDate dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    @Override
    public void pagarMensaldade() {
        System.out.println("Mensalidade paga com sucesso! pelo Bolsista");
        super.pagarMensaldade();
    }
}
