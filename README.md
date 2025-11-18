## 🎓 POO-unifor-atividade-Parcial: Minha Universidade

Este projeto é uma implementação em Java, utilizando o paradigma de **Programação Orientada a Objetos (POO)**, que simula o cadastro e a organização básica de classes e entidades em um contexto universitário. [cite\_start]A atividade visa demonstrar a aplicação prática de conceitos fundamentais de POO, como classes e objetos, encapsulamento, herança, polimorfismo, associação e composição[cite: 16, 17].

[cite\_start]O projeto segue as quatro questões propostas na atividade final da disciplina de POO[cite: 16].

-----

## 🚀 Conceitos de POO Implementados

O projeto está estruturado em torno das seguintes classes e relações:

### [cite\_start]1. Classes e Herança [cite: 18, 23]

| Classe Principal | Abstrata | Derivadas | Descrição |
| :--- | :--- | :--- | :--- |
| **`Pessoa`** | [cite\_start]Sim [cite: 18] | [cite\_start]`Visitante`, `Aluno`, `Professor` [cite: 23] | [cite\_start]Classe base com atributos comuns (`nome`, `cpf`, `dataNascimento`)[cite: 19]. |
| **`Aluno`** | Não | [cite\_start]`Bolsista`, `Regular` [cite: 26] | [cite\_start]Classe derivada de `Pessoa`, contendo o atributo `matrícula`[cite: 24]. |
| **`Disciplina`** | Não | N/A | [cite\_start]Classe para representar uma matéria, com atributos como `codigo`, `nome` e `semestre`[cite: 20]. |

### [cite\_start]2. Encapsulamento e Métodos [cite: 19, 21]

  * [cite\_start]**`Pessoa`**: Implementa métodos de acesso (Getters e Setters) para seus atributos[cite: 19].
  * [cite\_start]**`Pessoa`**: Possui o método público **`fazerAniversario()`** para atualizar a idade da pessoa[cite: 22].
  * [cite\_start]**`Professor`**: Possui o método **`darAula()`**[cite: 25].

### [cite\_start]3. Polimorfismo (Sobrescrita) [cite: 26]

O método **`pagarMensaldade()`** (ou `pagarMensalidade` dependendo da implementação) é sobrescrito nas subclasses de `Aluno`:

  * **`Bolsista`**: Implementa uma lógica específica para o pagamento.
  * **`Regular`**: Implementa uma lógica específica para o pagamento.

### [cite\_start]4. Associação e Composição [cite: 30]

A classe **`Turma`** demonstra o conceito de composição ao agregar outras classes:

  * [cite\_start]**Atributos**: `codigo`, `disciplina` (`Disciplina`), `professor` (`Professor`), e uma lista (`ArrayList`) de `alunos` (`Aluno`)[cite: 31, 32].
  * [cite\_start]**Métodos**: Possui métodos para gerenciar a lista de alunos: **`adicionarAluno()`**, **`removerAluno()`**, e **`listarAlunos()`**[cite: 31].

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
[cite_start]└── Main.java  <-- Contém a lógica de instanciação e teste [cite: 33]
```

-----

## 🧪 Como Executar

A classe principal para execução e teste é a **`Main.java`**. [cite\_start]Ela contém toda a lógica de instanciação de objetos para validar a correta implementação dos modelos[cite: 33]:

1.  [cite\_start]Cria **3 Disciplinas**[cite: 33].
2.  [cite\_start]Cria **3 Alunos** (2 Regulares e 1 Bolsista)[cite: 36].
3.  [cite\_start]Cria **1 Professor** [cite: 37] [cite\_start]e **2 Visitantes**[cite: 38].
4.  [cite\_start]Cria **3 Turmas**, associando o Professor e as Disciplinas, e adicionando todos os Alunos a cada turma[cite: 39].
5.  [cite\_start]Imprime no console as informações detalhadas de cada turma (código, professor, disciplina e a lista de alunos matriculados)[cite: 40].

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

[cite\_start]*(Jose Breno Sousa Jacauna
Guilherme Bechtold
Joao Erick Alves Correia Rabelo
Letícia Monteiro Vidal)* [cite: 45]
