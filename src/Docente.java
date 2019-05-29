import java.util.concurrent.atomic.AtomicInteger;

public abstract class Docente {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int nDocente;
    private String nome;

    public Docente(String nome) {
        this.nDocente = count.incrementAndGet();
        this.nome = nome;
    }

    public int getnDocente() {
        return nDocente;
    }

    public void setnDocente(int nDocente) {
        this.nDocente = nDocente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
