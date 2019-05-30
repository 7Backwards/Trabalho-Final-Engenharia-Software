import java.util.concurrent.atomic.AtomicInteger;

public class Utilizador {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int nUtilizador;
    private String nome;
    private TipoUtilizador tipoUtilizador;
    private String estado;

    public Utilizador(String nome,String estado) {
        this.nUtilizador = count.incrementAndGet();
        this.nome = nome;
        this.estado=estado;
    }

    public int getnUtilizador() {
        return nUtilizador;
    }

    public void setnUtilizador(int nDocente) {
        this.nUtilizador = nUtilizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
