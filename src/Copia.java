import java.util.concurrent.atomic.AtomicInteger;

public class Copia {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private Livro livro;

    public Copia(int id, Livro livro) {
        this.id = count.incrementAndGet();
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }


}
