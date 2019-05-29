import java.util.concurrent.atomic.AtomicInteger;

public class Livro {

    private String titulo;
    private String editora;
    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Livro(String titulo, String editora) {
        this.titulo = titulo;
        this.editora = editora;
        this.id= count.incrementAndGet();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

}
