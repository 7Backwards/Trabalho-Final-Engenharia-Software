public class FeedbackFichas {
    private Utilizador aluno;
    private int Avaliacao;
    private Fichas ficha;

    public FeedbackFichas(Utilizador aluno, Fichas ficha, int avaliacao) {
        this.aluno = aluno;
        this.ficha = ficha;
        Avaliacao = avaliacao;
    }

    public Utilizador getAluno() {
        return aluno;
    }

    public void setAluno(Utilizador aluno) {
        this.aluno = aluno;
    }

    public Fichas getFicha() {
        return ficha;
    }

    public void setFicha(Fichas ficha) {
        this.ficha = ficha;
    }

    public int getAvaliacao() {
        return Avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        Avaliacao = avaliacao;
    }
}
