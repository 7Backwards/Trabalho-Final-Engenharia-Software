import java.util.concurrent.atomic.AtomicInteger;

public class Fichas {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int nFicha;
    private String titulo;
    private Disciplina disciplina;

    public Fichas(int nFicha, String titulo, Disciplina disciplina) {
        this.nFicha = count.incrementAndGet();
        this.titulo = titulo;
        this.disciplina = disciplina;
    }

    public int getnFicha() {
        return nFicha;
    }

    public void setnFicha(int nFicha) {
        this.nFicha = nFicha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
