import model.*;
import model.abstractClass.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. Instanciando Disciplinas ---");
        Disciplina poo = new Disciplina("D001", "Programação Orientada a Objetos", "2025.1");
        Disciplina calculo = new Disciplina("D002", "Cálculo I", "2025.1");
        Disciplina bd = new Disciplina("D003", "Banco de Dados", "2025.1");
        System.out.println("Disciplinas criadas: " + poo.getNome() + ", " + calculo.getNome() + ", " + bd.getNome());
        System.out.println("------------------------------------");

        LocalDate hoje = LocalDate.now();

        System.out.println("\n--- 2. Instanciando Alunos ---");

        Regular regular1 = new Regular("Maria Silva", "98765432101", hoje.minusYears(20));
        regular1.setMatricula("2024001");

        Regular regular2 = new Regular("João Pereira", "12345678902", hoje.minusYears(21));
        regular2.setMatricula("2024002");

        Bolsista bolsista1 = new Bolsista("Pedro Souza", "11223344550", hoje.minusYears(22));
        bolsista1.setMatricula("2024003");

        System.out.println("Alunos criados:");
        System.out.println("Regular 1: " + regular1.getNome() + " (Matrícula: " + regular1.getMatricula() + ")");
        System.out.println("Regular 2: " + regular2.getNome() + " (Matrícula: " + regular2.getMatricula() + ")");
        System.out.println("Bolsista 1: " + bolsista1.getNome() + " (Matrícula: " + bolsista1.getMatricula() + ")");

        regular1.pagarMensaldade();
        bolsista1.pagarMensaldade();
        System.out.println("------------------------------------");

        System.out.println("\n--- 3. Instanciando Professor ---");
        Professor profJava = new Professor("Dr. Alex Green", "54321098765", hoje.minusYears(45));
        profJava.setCentro("Tecnologia");
        System.out.println("Professor criado: " + profJava.getNome() + " (Centro: " + profJava.getCentro() + ")");
        profJava.darAula();
        System.out.println("------------------------------------");

        System.out.println("\n--- 4. Instanciando Visitantes ---");
        Visitante vis1 = new Visitante("Ana Turista", "00011122233", hoje.minusYears(30));
        Visitante vis2 = new Visitante("Bob Curioso", "99988877766", hoje.minusYears(25));
        System.out.println("Visitantes criados: " + vis1.getNome() + " e " + vis2.getNome());
        System.out.println("------------------------------------");


        ArrayList<Aluno> todosAlunos = new ArrayList<>();
        todosAlunos.add(regular1);
        todosAlunos.add(regular2);
        todosAlunos.add(bolsista1);

        System.out.println("\n--- 5. Instanciando Turmas (Associação e Composição) ---");

        Turma t1 = new Turma("T01", poo, profJava);
        for (Aluno a : todosAlunos) {
            t1.adicionarAluno(a);
        }

        Turma t2 = new Turma("T02", calculo, profJava);
        for (Aluno a : todosAlunos) {
            t2.adicionarAluno(a);
        }

        Turma t3 = new Turma("T03", bd, profJava);
        for (Aluno a : todosAlunos) {
            t3.adicionarAluno(a);
        }

        System.out.println("3 Turmas criadas com 1 Professor e todos os 3 Alunos em cada.");
        System.out.println("------------------------------------");

        System.out.println("\n====================================");
        System.out.println("6. IMPRESSÃO DAS INFORMAÇÕES DAS TURMAS");
        System.out.println("====================================\n");

        imprimirInformacoesTurma(t1);
        imprimirInformacoesTurma(t2);
        imprimirInformacoesTurma(t3);
    }

    private static void imprimirInformacoesTurma(Turma turma) {
        System.out.println("### Turma: " + turma.getCodigo() + " ###");
        System.out.println("Disciplina: " + turma.getDisciplina().getNome() + " (" + turma.getDisciplina().getCodigo() + ")");
        System.out.println("Professor: " + turma.getProfessor().getNome());
        System.out.println("Alunos Matriculados:");

        ArrayList<Aluno> alunosNaTurma = turma.listarAlunos();
        if (alunosNaTurma != null && !alunosNaTurma.isEmpty()) {
            for (int i = 0; i < alunosNaTurma.size(); i++) {
                Aluno aluno = alunosNaTurma.get(i);
                String tipo = aluno instanceof Bolsista ? "Bolsista" : "Regular";
                System.out.println("  " + (i + 1) + ". " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + " - Tipo: " + tipo + ")");
            }
        } else {
            System.out.println("  Nenhum aluno matriculado.");
        }

        System.out.println("------------------------------------\n");
    }
}