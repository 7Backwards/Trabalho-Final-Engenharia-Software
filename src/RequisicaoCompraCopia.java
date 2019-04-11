import java.time.LocalDate;

public class RequisicaoCompraCopia extends  RequisicaoCompra {

    public RequisicaoCompraCopia(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador) {
        super(estado, data, oficio, livro, utilizador);
    }
}
