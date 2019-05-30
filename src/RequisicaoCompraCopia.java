import java.time.LocalDate;

public class RequisicaoCompraCopia extends  RequisicaoCompra {

    public RequisicaoCompraCopia(String estado, LocalDate data, String oficio, Livro livro, Utilizador Utilizador) {
        super(estado, data, oficio, livro, Utilizador);
    }
}
