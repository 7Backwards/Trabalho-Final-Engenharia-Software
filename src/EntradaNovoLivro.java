import java.time.LocalDate;

public class EntradaNovoLivro {

    private LocalDate data;
    private Encomenda encomenda;
    private Copia copia;

    public EntradaNovoLivro(LocalDate data, Encomenda encomenda, Copia copia) {
        this.data = data;
        this.encomenda = encomenda;
        this.copia = copia;
    }

    public LocalDate getData() {
        return data;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public Copia getCopia() {
        return copia;
    }
}
