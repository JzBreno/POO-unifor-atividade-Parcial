## 🎓 POO-unifor-atividade-Parcial: Minha Universidade

Este projeto é uma implementação em Java, utilizando o paradigma de **Programação Orientada a Objetos (POO)**, que simula o cadastro e a organização básica de classes e entidades em um contexto universitário. A atividade visa demonstrar a aplicação prática de conceitos fundamentais de POO, como classes e objetos, encapsulamento, herança, polimorfismo, associação e composição.

O projeto segue as quatro questões propostas na atividade final da disciplina de POO.

-----

## 🚀 Conceitos de POO Implementados

O projeto está estruturado em torno das seguintes classes e relações:

### 1\. Classes e Herança

| Classe Principal | Abstrata | Derivadas | Descrição |
| :--- | :--- | :--- | :--- |
| **`Pessoa`** | Sim | `Visitante`, `Aluno`, `Professor` | Classe base com atributos comuns (`nome`, `cpf`, `dataNascimento`). |
| **`Aluno`** | Não | `Bolsista`, `Regular` | Classe derivada de `Pessoa`, contendo o atributo `matrícula`. |
| **`Disciplina`** | Não | N/A | Classe para representar uma matéria, com atributos como `codigo`, `nome` e `semestre`. |

### 2\. Encapsulamento e Métodos

  * **`Pessoa`**: Implementa métodos de acesso (Getters e Setters) para seus atributos.
  * **`Pessoa`**: Possui o método público **`fazerAniversario()`** para atualizar a idade da pessoa.
  * **`Professor`**: Possui o método **`darAula()`**.

### 3\. Polimorfismo (Sobrescrita)

O método **`pagarMensaldade()`** é sobrescrito nas subclasses de `Aluno`:

  * **`Bolsista`**: Implementa uma lógica específica para o pagamento.
  * **`Regular`**: Implementa uma lógica específica para o pagamento.

### 4\. Associação e Composição

A classe **`Turma`** demonstra o conceito de composição ao agregar outras classes:

  * **Atributos**: `codigo`, `disciplina` (`Disciplina`), `professor` (`Professor`), e uma lista (`ArrayList`) de `alunos` (`Aluno`).
  * **Métodos**: Possui métodos para gerenciar a lista de alunos: **`adicionarAluno()`**, **`removerAluno()`**, e **`listarAlunos()`**.

-----

## ⚙️ Estrutura do Projeto

O projeto é organizado em pacotes:

```
src/
├── model/
│   ├── Turma.java
│   ├── Disciplina.java
│   ├── Professor.java
│   ├── Aluno.java
│   ├── Visitante.java
│   ├── Regular.java
│   └── Bolsista.java
└── model/abstractClass/
    └── Pessoa.java
└── Main.java  <-- Contém a lógica de instanciação e teste
```

-----

## 🧪 Como Executar

A classe principal para execução e teste é a **`Main.java`**. Ela contém toda a lógica de instanciação de objetos para validar a correta implementação dos modelos:

1.  Cria **3 Disciplinas**.
2.  Cria **3 Alunos** (2 Regulares e 1 Bolsista).
3.  Cria **1 Professor** e **2 Visitantes**.
4.  Cria **3 Turmas**, associando o Professor e as Disciplinas, e adicionando todos os Alunos a cada turma.
5.  Imprime no console as informações detalhadas de cada turma (código, professor, disciplina e a lista de alunos matriculados).

### Passos:

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/JzBreno/POO-unifor-atividade-Parcial.git
    ```
2.  **Abra o projeto** em sua IDE preferida (IntelliJ IDEA, Eclipse, VS Code).
3.  **Execute a classe `Main.java`**. O resultado será exibido no console.

-----

## 🎨 Visualização JavaFX (Opcional)

Uma classe adicional (`UniversidadeApp.java`, se implementada no seu repositório) pode ser usada para visualizar os dados de forma gráfica, utilizando o **JavaFX**. Esta aplicação demonstra a listagem das turmas e a exibição dos detalhes de cada turma, professor e alunos matriculados em uma interface de usuário.

  * **Requisito:** Necessita que o **JavaFX SDK** esteja configurado no ambiente de execução.

-----

## 👥 Integrantes da Equipe

*(Jose Breno Sousa Jacauna
Guilherme Bechtold
Joao Erick Alves Correia Rabelo
Letícia Monteiro Vidal)*
