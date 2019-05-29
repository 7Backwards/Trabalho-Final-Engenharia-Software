import java.util.concurrent.atomic.AtomicInteger;

public class Disciplina {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int nDisciplina;
    private String nome;

    public Disciplina( String nome) {
        this.nDisciplina = count.incrementAndGet();
        this.nome = nome;
    }

    public int getnDisciplina() {
        return nDisciplina;
    }

    public void setnDisciplina(int nDisciplina) {
        this.nDisciplina = nDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
