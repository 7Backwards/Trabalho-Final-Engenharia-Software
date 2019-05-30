import java.time.LocalDate;

public class Requisicao {

    private LocalDate data;
    private Utilizador Utilizador;
    private Copia copia;

    public Requisicao(LocalDate data, Utilizador Utilizador, Copia copia) {
        this.data = data;
        this.Utilizador = Utilizador;
        this.copia = copia;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return Utilizador;
    }

    public Copia getCopia() {
        return copia;
    }


}
