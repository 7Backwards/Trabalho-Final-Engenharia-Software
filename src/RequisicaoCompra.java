import java.time.LocalDate;

public abstract class RequisicaoCompra {
    private String estado;
    private LocalDate data;
    private String oficio;
    private Livro livro;
    private Funcionario funcionario;

    public RequisicaoCompra(String estado, LocalDate data, String oficio, Livro livro, Funcionario funcionario) {
        this.estado = estado;
        this.data = data;
        this.oficio = oficio;
        this.livro = livro;
        this.funcionario = funcionario;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }
}
