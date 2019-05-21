import java.time.LocalDate;

public class PropostaAquisicao {
    private LocalDate data;
    private Funcionario funcionario;
    private String infoLivro;

    public PropostaAquisicao(LocalDate data, Funcionario funcionario, String infoLivro) {
        this.data = data;
        this.funcionario = funcionario;
        this.infoLivro = infoLivro;
    }

    public LocalDate getData() {
        return data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public String getInfoLivro() {
        return infoLivro;
    }
}
