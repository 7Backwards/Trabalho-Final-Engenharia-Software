public class Professor extends Docente {
    private Disciplina disciplina;

    public Professor( String nome, Disciplina disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
