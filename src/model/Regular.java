package model;

import java.time.LocalDate;

public class Regular extends Aluno{

    public Regular(String nome, String cpf, LocalDate dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    @Override
    public void pagarMensaldade() {
        System.out.println("Mensalidade paga com sucesso! pelo Regular");
        super.pagarMensaldade();
    }
}
