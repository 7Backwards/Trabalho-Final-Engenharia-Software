public class Professor extends Docente {
    private Disciplina disciplina;

    public Professor(int nDocente, String nome, Disciplina disciplina) {
        super(nDocente, nome);
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
