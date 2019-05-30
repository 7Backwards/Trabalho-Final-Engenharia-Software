import java.time.LocalDate;

public class PropostaAquisicao {
    private LocalDate data;
    private Utilizador Utilizador;
    private String infoLivro;

    public PropostaAquisicao(LocalDate data, Utilizador Utilizador, String infoLivro) {
        this.data = data;
        this.Utilizador = Utilizador;
        this.infoLivro = infoLivro;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return Utilizador;
    }

    public String getInfoLivro() {
        return infoLivro;
    }
}
