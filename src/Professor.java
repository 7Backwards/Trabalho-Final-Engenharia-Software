import java.util.concurrent.atomic.AtomicInteger;

public class Professor  {
    private static final AtomicInteger count = new AtomicInteger(0);
    private Disciplina disciplina;
    private String nome;
    private int nProfessor;

    public Professor( String nome, Disciplina disciplina) {
        this.nProfessor = count.incrementAndGet();
        this.nome= nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnProfessor() {
        return nProfessor;
    }

    public void setnProfessor(int nProfessor) {
        this.nProfessor = nProfessor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
