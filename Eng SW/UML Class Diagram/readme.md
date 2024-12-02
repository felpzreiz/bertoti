### Diagrama de Classes UML: Código de sistema de avaliação de alunos

![image](https://github.com/user-attachments/assets/0072ffc8-c144-4e4e-ac07-f0b4edf0a3d3)

Utilizando as classes representadas no diagrama UML, a imagem acima descreve o design de um sistema de autoavaliação para alunos de uma faculdade. O sistema permite que alunos, organizados em grupos, avaliem uns aos outros com base em critérios pré-definidos.

---

## Estrutura do Sistema

### **Classe Aluno**
Representa os estudantes participantes do sistema.

- **Atributos**:
  - `nome: String` - Nome completo do aluno.
  - `email: String` - Endereço de e-mail do aluno.
  - `grupo: String` - Nome do grupo ao qual o aluno pertence.
  - `grupo: Repo` - Relação com a classe `Grupo`.
  - `nota: Double` - Nota final atribuída ao aluno.

- **Métodos**:
  - `getNome()`: Retorna o nome do aluno.
  - `setNome(String)`: Define o nome do aluno.
  - `getGrupo()`: Retorna o grupo ao qual o aluno pertence.

---

### **Classe Grupo**
Representa um grupo de alunos trabalhando juntos em um projeto.

- **Atributos**:
  - `nomeGrupo: String` - Nome identificador do grupo.

- **Métodos**:
  - `getNomeGrupo()`: Retorna o nome do grupo.

---

### **Classe Sprint**
Representa uma iteração de trabalho ou etapa do projeto.

- **Atributos**:
  - `sprint: Integer` - Número identificador da sprint.
  - `data_inicio: LocalDate` - Data de início da sprint.
  - `data_fim: LocalDate` - Data de término da sprint.
  - `fim_avaliacao: LocalDate` - Data limite para avaliação.
  - `pontos: Double` - Pontos atribuídos na sprint.

- **Métodos**:
  - `getSprint()`: Retorna o número da sprint.
  - `setSprint(Integer)`: Define o número da sprint.
  - `getData_Fim()`: Retorna a data de término da sprint.
  - `getFim_avaliacao()`: Retorna a data limite para avaliação.

---

### **Classe Notas**
Representa as avaliações realizadas entre alunos.

- **Atributos**:
  - `nota: Float` - Nota atribuída com base em um critério.
  - `criterio: String` - Nome do critério de avaliação.

- **Métodos**:
  - `getNota()`: Retorna a nota atribuída.
  - `setNota(Float)`: Define a nota atribuída.
  - `getCriterio()`: Retorna o critério associado à nota.

---

### **Classe Criterios**
Representa os critérios utilizados para avaliar os alunos.

- **Atributos**:
  - `nomeCriterio: String` - Nome do critério.

- **Métodos**:
  - `getNomeCriterio()`: Retorna o nome do critério.

---

## Propósito
Este design modular facilita:
- O gerenciamento de informações sobre alunos, grupos e sprints.
- A implementação de avaliações detalhadas e transparentes entre os estudantes.
- A organização das notas e dos critérios de avaliação.
