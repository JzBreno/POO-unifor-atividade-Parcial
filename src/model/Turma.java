package model;

import java.util.ArrayList;

public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();


    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codigo='" + codigo + '\'' +
                ", disciplina=" + disciplina +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> listarAlunos() {
        return alunos;
    }

    public Aluno getAluno(int indice){
        return this.alunos.get(indice);
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void adicionarAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
