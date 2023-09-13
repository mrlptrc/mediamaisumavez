public class Resultado {
    private Aluno aluno;
    private NotaDisciplina[] notaDisciplina;

    private String situacao;
    private int qtdAprovacao;
    private int qtdReprovacao;



    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public NotaDisciplina[] getNotaDisciplina() {
        return notaDisciplina;
    }

    public void setNotaDisciplina(NotaDisciplina[] notaDisciplina) {
        this.notaDisciplina = notaDisciplina;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getQtdAprovacao() {
        return qtdAprovacao;
    }

    public void setQtdAprovacao(int qtdAprovacao) {
        this.qtdAprovacao = qtdAprovacao;
    }

    public int getQtdReprovacao() {
        return qtdReprovacao;
    }

    public void setQtdReprovacao(int qtdReprovacao) {
        this.qtdReprovacao = qtdReprovacao;
    }
}
