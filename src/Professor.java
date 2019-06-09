import java.util.concurrent.atomic.AtomicInteger;

public class Professor  {
    private static final AtomicInteger count = new AtomicInteger(0);
    private Disciplina disciplina;
    private String nome;
    private int nProfessor;
    private Horario horario = new Horario(null,null);



    public Professor(Disciplina disciplina , String nome) {
        this.disciplina = disciplina;
        this.nome = nome;
        this.nProfessor = count.incrementAndGet();
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
