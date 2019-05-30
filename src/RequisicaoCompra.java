import java.time.LocalDate;

public abstract class RequisicaoCompra {
    private String estado;
    private LocalDate data;
    private String oficio;
    private Livro livro;
    private Utilizador Utilizador;

    public RequisicaoCompra(String estado, LocalDate data, String oficio, Livro livro, Utilizador Utilizador) {
        this.estado = estado;
        this.data = data;
        this.oficio = oficio;
        this.livro = livro;
        this.Utilizador = Utilizador;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getData() {
        return data;
    }

    public String getOficio() {
        return oficio;
    }

    public Livro getLivro() {
        return livro;
    }

    public Utilizador getUtilizador() {
        return Utilizador;
    }
}
