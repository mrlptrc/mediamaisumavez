public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Aluno aluno = new Aluno();
        Boletim boletim = new Boletim();
        NotasAluno NA = new NotasAluno();
        aluno.setNome(ui.pedirTexto("Nome: "));
        aluno.setChamada(ui.pedirInt("Numero da chamada: "));
        aluno.setCurso(ui.pedirTexto("Nome do curso: "));
        aluno.setTurma(ui.pedirTexto("Identifique a turma: "));

        int qtd = ui.pedirInt("\nQuantas disciplinas: ");
        ui.pularLinha();

        NotaDisciplina[] disciplina = new NotaDisciplina[qtd];

        for (int i =0; i < disciplina.length; i++) {
            NotaDisciplina dDados = new NotaDisciplina();
            dDados.setDisciplina(ui.pedirTexto("Nome da disciplina: "));
            dDados.setFaltas(ui.pedirInt("Quantidade de faltas: "));
            dDados.setMedia(ui.pedirDouble("Valor da media: "));

            disciplina[i] = dDados;
            ui.pularLinha();
        }

        NA.setAluno(aluno);
        NA.setNotasDisciplina(disciplina);

        Resultado res = boletim.avaliar(NA);

        ui.exibirResultado(res);
    }
}
